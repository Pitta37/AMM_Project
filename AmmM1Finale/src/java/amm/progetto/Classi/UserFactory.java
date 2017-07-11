/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.progetto.Classi;

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
    
    private ArrayList<User> listUser = new ArrayList<User>();
    
    private UserFactory()
    {
        //Creazione utenti
        User user1 = new User();
        user1.setId(0);
        user1.setNome("Mario");
        user1.setCognome("Rossi");
        user1.setUsername("marietto");
        user1.setFrase("Bella giornata");
        user1.setPassword("12345");
        user1.setFotoProfilo("Img/icon.jpg");
        
        
        User user2 = new User();
        user2.setId(1);
        user2.setNome("Luigi");
        user2.setCognome("Serra");
        user2.setUsername("gigietto");
        user2.setFrase("Brutta giornata");
        user2.setPassword("beccaccia");
        user2.setFotoProfilo("Img/icon2.ico");
        
        
        User user3 = new User();
        user3.setId(2);
        user3.setNome("Franco");
        user3.setCognome("Pau");
        user3.setUsername("paulinho99");
        user3.setFrase("Ho sete");
        user3.setPassword("levissimapurissima");
        user3.setFotoProfilo("Img/icon3.png");
       
        
        listUser.add(user1);
        listUser.add(user2);
        listUser.add(user3);
    }
    
    public User getUserId(int id)
    {
        for (User user : this.listUser)
            if (user.getId() == id)
                return user;
        return null;
    }
    
    public int getIdUserAndPassword(String user, String password)
    {
        for(User utente : this.listUser)
            if(utente.getNome().equals(user) && utente.getPassword().equals(password))
                return utente.getId();
        return -1;
    }
    public List<String> getUsersName()
    {
        List<String> elencoNomi = null;
        for(User user : this.listUser)
            elencoNomi.add(user.getNome());
        return elencoNomi;
    }
    
}
