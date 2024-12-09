package group;

import org.junit.Test;

public class Serveur2 {


    @Test
    public void AddCommend(){
     
        Commend cmnd=new Commend();
    
                cmnd.add("tableNumber");
    }
    @Test
    public void testAddCommandForUndefinedTable() {
        Commend commend = new Commend();

        // Essayer d'ajouter une commande pour une table non définie
        commend.add("99"); // Cela devrait afficher "Table non définie"
    }
    @Test
    public void mahjpouzaTest() {
        Commend commend = new Commend();

        // Essayer d'ajouter une commande pour une table non définie
        commend.add("99"); // Cela devrait afficher "Table non définie"
    }


    
}
