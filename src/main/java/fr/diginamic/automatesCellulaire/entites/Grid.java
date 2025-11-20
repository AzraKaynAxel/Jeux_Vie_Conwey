package fr.diginamic.automatesCellulaire.entites;

import java.util.ArrayList;
import java.util.List;

public class Grid {

    private int height;
    private int width;
    List<List<Automate>> myGrid = new ArrayList<>();
    private int nbGeneration;

    public Grid (int height, int width, List<List<Automate>> grid) {
        this.height = height;
        this.width = width;
        this.myGrid = grid;
    }

    public Grid (int height, int width, List<List<Automate>> grid, int nbGeneration) {
        this.height = height;
        this.width = width;
        this.myGrid = grid;
        this.nbGeneration = nbGeneration;
    }

    public int getHeight() {
        return height;
    }


    public int getWidth() {
        return width;
    }

    public List<List<Automate>> getMyGrid() {
        return myGrid;
    }

    public void setMyGrid(List<List<Automate>> myGrid) {
        this.myGrid = myGrid;
    }

    public int getNbGeneration() {
        return nbGeneration;
    }

    public void setNbGeneration(int nbGeneration) {
        this.nbGeneration = nbGeneration;
    }

    public void afficher() {

//        for (int i = 0; i < getMyGrid().size(); i++) {
//            for (int j = 0; j < getMyGrid().get(i).size(); j++) {
//                System.out.print(getMyGrid().get(i).get(j));
//            }
//            System.out.println();
//        }

        for (List<Automate> automateList : getMyGrid()) {
            for (Automate automate : automateList) {
                System.out.print(automate);
            }
            System.out.println();
        }
    }

    public int compterVoisin (int x,  int y) {
        int count = 0;
        int[][] offsets = {
                {-1, -1}, {-1, 0}, {-1, 1},
                { 0, -1},          { 0, 1},
                { 1, -1}, { 1, 0}, { 1, 1}
        };

        // L'idée est de parcourir tout les offset pour ensuite vérifier si la case est valide ou non
        for (int[] offset : offsets) {

            int dx = offset[0]; // Correspond au décalage sur l'axe x
            int dy = offset[1]; // Correspond au décalage sur l'axe y

            int nx = x + dx; // Pour une nouvelle ligne
            int ny = y + dy; // Pour une nouvelle colonne

            //maintenant on vérifie si la case est valide ou en dehors des limites
            if (nx >=0 && nx < getHeight() && ny >= 0 && ny < getWidth()) {
                // Accède à la cellule et vérifie son état en utilisant les index
                if (getMyGrid().get(nx).get(ny).getState()) {
                    count++;
                }
            }
        }
        return count;
    }
}
