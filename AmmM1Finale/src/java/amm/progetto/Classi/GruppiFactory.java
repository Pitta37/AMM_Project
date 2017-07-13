package amm.progetto.Classi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class GruppiFactory 
{
    
    private static GruppiFactory singleton;
    
    public static GruppiFactory getInstance() 
    {
        if (singleton == null) 
            singleton = new GruppiFactory();
        
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
    
    private ArrayList<Gruppi> listGroup = new ArrayList<Gruppi>();
    
    public Gruppi getGroupId(int id) 
    {
        try 
        {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "ammdb", "ammdb");
            String query = 
                      "select * from gruppi "
                    + "where nome = ?";
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            // Si associano i valori
            stmt.setInt(1, id);
            // Esecuzione query
            ResultSet res = stmt.executeQuery();
            // ciclo sulle righe restituite
            if (res.next()) {
                Gruppi current = new Gruppi();
                current.setId(res.getInt("gruppo_id"));
                current.setNome(res.getString("name"));

                stmt.close();
                conn.close();
                return current;
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<String> getGruppiName()
    {
        List<String> elencoNomi = null;
        try 
        {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "ammdb", "ammdb");
            
            String query ="select nome from gruppi LIMIT 0, 10;";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet res = stmt.executeQuery();
            // ciclo sulle righe restituite
            while (res.next()) 
                elencoNomi.add(res.getString("nome"));
             
            stmt.close();
            conn.close();
            return elencoNomi;
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
