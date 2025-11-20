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
}
