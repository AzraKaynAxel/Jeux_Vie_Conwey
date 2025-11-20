package fr.diginamic.automatesCellulaire;

import fr.diginamic.automatesCellulaire.entites.Automate;
import fr.diginamic.automatesCellulaire.entites.Grid;

import java.util.ArrayList;
import java.util.List;

public class TestAutomateCellulaire {
    public static void main(String[] args) {

        int maxHeight = 10;
        int maxWidth = 10;


        List<List<Automate>> grid = new ArrayList<>();

        for (int i =0; i < maxHeight; i++) {
            List<Automate> rowAutomate = new ArrayList<>();
            for (int j = 0; j < maxWidth; j++) {
                rowAutomate.add(new Automate(false));
            }
            grid.add(rowAutomate);
        }

        grid.get(4).get(4).setState(true);
        grid.get(4).get(5).setState(true);
        grid.get(4).get(3).setState(true);

        grid.get(1).get(3).setState(true);
        grid.get(2).get(3).setState(true);
        grid.get(3).get(3).setState(true);

        grid.get(9).get(7).setState(true);
        grid.get(9).get(8).setState(true);
        grid.get(9).get(9).setState(true);

        Grid myGrid = new Grid(maxHeight, maxWidth, grid);
        myGrid.afficher();
        myGrid.nextGeneration();

        System.out.println("------------------------------------------------------");
        myGrid.afficher();
        myGrid.nextGeneration();

        System.out.println("------------------------------------------------------");
        myGrid.afficher();
        myGrid.nextGeneration();

        System.out.println("------------------------------------------------------");
        myGrid.afficher();
    }
}
