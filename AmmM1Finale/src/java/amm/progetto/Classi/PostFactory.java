package amm.progetto.Classi;

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
    
    private ArrayList<Post> listPost = new ArrayList<Post>();
    
    private PostFactory()
    {
        
        UserFactory userFactory = UserFactory.getInstance();
        
        //Creazione Post
        Post post1 = new Post();
        post1.setContenuto("Oggi è una bellissima giornata! Giocherò a calcio al pc!");
        post1.setId(0);
        post1.setUser(userFactory.getUserId(0));
        post1.setTipoPost(Post.Type.TEXT);
        
        Post post2 = new Post();
        post2.setContenuto("Foto scattata durante una gita in montagna. 27/03/2017");
        post2.setId(1);
        post2.setUser(userFactory.getUserId(1));
        post2.setTipoPost(Post.Type.TEXT);
        
        
        Post post3 = new Post();
        post3.setContenuto("Img/img.jpg");
        post3.setId(2);
        post3.setUser(userFactory.getUserId(1));
        post3.setTipoPost(Post.Type.IMAGE);
        
        Post post4 = new Post();
        post4.setContenuto("Che bel motore di ricerca! Altro che Yahoo! Provalo!");
        post4.setId(3);
        post4.setUser(userFactory.getUserId(2));
        post4.setTipoPost(Post.Type.TEXT);
        
        
        Post post5 = new Post();
        post3.setContenuto("http://www.google.it");
        post3.setId(4);
        post3.setUser(userFactory.getUserId(2));
        post3.setTipoPost(Post.Type.LINK);
        
        listPost.add(post1);
        listPost.add(post2);
        listPost.add(post3);
        listPost.add(post4);
        listPost.add(post5);
    }
    
    public Post getPostById(int id) 
    {
        for (Post post : this.listPost)
            if (post.getId() == id)
                return post;
        return null;
    }

    public List getPostList(User utente) 
    {
        List<Post> listPost = new ArrayList<Post>();
        for (Post post : this.listPost) 
            if (post.getUser().equals(utente)) 
                listPost.add(post);
        return listPost;
    }
}
