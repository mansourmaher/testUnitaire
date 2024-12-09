package group;

import java.util.HashSet;
import java.util.Set;

public class Commend {

    private Set<String> definedTables = new HashSet<>();
    private Set<String> occupiedTables = new HashSet<>(); // Tables occupées

    public Commend() {
        // Ajouter des tables définies pour simuler un environnement réel
        definedTables.add("1");
        definedTables.add("2");
        definedTables.add("99");
        occupiedTables.add("99");
    }

    public void add(String tableNumber) {
        if (isNotdefined(tableNumber)) {
            System.out.println("3zouza");
        }

        else if (isOcuuper(tableNumber)) {
            System.out.println("acopuer");

        } else
            addCommendtodatabase(tableNumber);

    }

    private void addCommendtodatabase(String tableNumber) {
        // TODO Auto-generated method stub

    }

    private boolean isNotdefined(String tableNumber) {
        // TODO Auto-generated method stub
        return(!definedTables.contains(tableNumber));
    }

    private boolean isOcuuper(String tableNumber) {
        // TODO Auto-generated method stub
        if (occupiedTables.contains(tableNumber)) {
            return true;
        } else
            return false;
    }

}
