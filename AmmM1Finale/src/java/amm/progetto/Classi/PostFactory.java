package amm.progetto.Classi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PostFactory {
    
    private static PostFactory singleton;

    public static PostFactory getInstance() 
    {
        if (singleton == null) 
            singleton = new PostFactory();
        return singleton;
    }
    
    private String connectionString;
    
    public void setConnectionString(String s)
    {
    	this.connectionString = s;
    }

    public String getConnectionString()
    {
    	return this.connectionString;
    }
    private ArrayList<Post> listPost = new ArrayList<Post>();
    
    public List getPostList(User utente) {
        List<Post> listaPost = new ArrayList<Post>();
        
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "ammdb", "ammdb");
           
            String query = 
                      "select * from posts "
                    + "join posttype on posts.type = posttype.posttype_id "
                    + "where author = ?";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // Si associano i valori
            stmt.setInt(1, utente.getId());
            
            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            while (res.next()) 
            {
                Post current = new Post();
                //imposto id del post
                current.setId(res.getInt("post_id"));
                
                //impost il contenuto del post
                current.setContenuto(res.getString("content"));
                //imposto il tipo del post
                current.setTipoPost(this.postTypeFromString(res.getString("posttype_name")));

                //imposto l'autore del post
                current.setUser(utente);
                
                listaPost.add(current);
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaPost;
    }
    
    public Post getPostById(int id) 
    {
        for (Post post : this.listPost)
            if (post.getId() == id)
                return post;
        return null;
    }
    private Post.Type postTypeFromString(String type)
    {
        
        switch(type)
        {
            case "IMAGE":
                return Post.Type.IMAGE;
            
            
            case "TEXT":
                return Post.Type.TEXT;
            
            
            case "LINK":
                return Post.Type.LINK;
        }
        return null;
    }
    private int postTypeFromEnum(Post.Type type)
    {
        if(type == Post.Type.TEXT)
            return 1;
        else
            if(type == Post.Type.IMAGE)
                return 2;
            else
                return 3;
    }
    
    public void addNewPost(Post post){
        try
        {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "ammdb", "ammdb");
            
            String query = 
                      "insert into posts (post_id, content, type, author) "
                    + "values (default, ? , ? , ? )";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // Si associano i valori
            stmt.setString(1, post.getContenuto());

            stmt.setInt(2, this.postTypeFromEnum(post.getTipoPost()));
            
            stmt.setInt(3, post.getUser().getId());
            
            // Esecuzione query
            stmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

}
