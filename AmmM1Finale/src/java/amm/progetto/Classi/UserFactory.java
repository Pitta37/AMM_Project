/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.progetto.Classi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserFactory
{
    private static UserFactory singleton;
    
    public static UserFactory getInstance() {
        if (singleton == null) {
            singleton = new UserFactory();
        }
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
    private ArrayList<User> listUser = new ArrayList<User>();
   
    public User getUserId(int id) {

        try 
        {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "ammdb", "ammdb");
            
            String query = 
                      "select * from utenti "
                    + "where utente_id = ?";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // Si associano i valori
            stmt.setInt(1, id);
            
            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            if (res.next()) {
                User current = new User();
                current.setId(res.getInt("utente_id"));
                current.setNome(res.getString("name"));
                current.setCognome(res.getString("cognome"));
                current.setPassword(res.getString("password"));
                current.setFotoProfilo(res.getString("urlFotoProfilo"));

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
    
     public int getIdUserAndPassword(String user, String password)
     {
        try 
        {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "ammdb", "ammdb");
            
            String query = 
                      "select utente_id from utenti "
                    + "where name = ? and password = ?";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // Si associano i valori
            stmt.setString(1, user);
            stmt.setString(2, password);
            
            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            if (res.next()) {
                int id = res.getInt("utente_id");

                stmt.close();
                conn.close();
                return id;
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
    public List<String> getUsersName()
    {
        List<String> elencoNomi = null;
        try 
        {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "ammdb", "ammdb");
            
            String query ="select nome from utenti LIMIT 0, 10;";
            
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
    public void deleteUser(User u)
    {
         try 
        {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "ammdb", "ammdb");
            
            String query = "DELETE FROM post "
                    + "join utenti.utente_id=posts.author WHERE author="+ u.getId();
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            // Esecuzione query
            ResultSet res = stmt.executeQuery();
            query = "DELETE FROM utenti WHERE id = "+ u.getId();
            stmt = conn.prepareStatement(query);
            // Esecuzione query
            res = stmt.executeQuery();
            stmt.close();
            conn.close();
        } catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
}
