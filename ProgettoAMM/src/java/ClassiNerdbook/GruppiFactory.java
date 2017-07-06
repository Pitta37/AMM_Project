/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassiNerdbook;

import java.util.ArrayList;
import java.util.List;


public class GruppiFactory {
    
    private static GruppiFactory singleton;
    
    public static GruppiFactory getInstance() {
        if (singleton == null) {
            singleton = new GruppiFactory();
        }
        return singleton;
    }
    
    
    private ArrayList<Gruppi> listGroup = new ArrayList<Gruppi>();
    
    private GruppiFactory()
    {
        Gruppi gruppo1 = new Gruppi();
        gruppo1.setId(0);
        gruppo1.setNome("Quando c'era lui");
        gruppo1.setFotoGruppo("Img/group.png");
        
        Gruppi gruppo2 = new Gruppi();
        gruppo2.setId(1);
        gruppo2.setNome("Le mantisse");
        gruppo2.setFotoGruppo("Img/group.png");
        
        Gruppi gruppo3 = new Gruppi();
        gruppo3.setId(2);
        gruppo3.setNome("Le divinità");
        gruppo3.setFotoGruppo("Img/group.png");
        
        listGroup.add(gruppo1);
        listGroup.add(gruppo2);
        listGroup.add(gruppo3);
    }
    
    public Gruppi getGroupId(int id) 
    {
        for (Gruppi gruppo : this.listGroup)
            if (gruppo.getId() == id)
                return gruppo;
        return null;
    }
    
    
}
