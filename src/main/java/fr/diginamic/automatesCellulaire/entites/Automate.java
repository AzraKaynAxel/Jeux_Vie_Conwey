package fr.diginamic.automatesCellulaire.entites;

public class Automate {

    private boolean isAlive;

    public Automate(boolean isAlive) {
        this.isAlive = isAlive;

    }

    public boolean getState() {
        return isAlive;
    }

    public void setState(boolean vivant) {
        this.isAlive = vivant;
    }

    @Override
    public String toString() {
        return getState() ? "X" : "_";

        /*
            Simplification de la méthode en dessous et permet donc de supprimer l'attribut content


            public String automateDeadOrLifeContent(){
                if (getState()) {
                    setContent(this.content = "X");
                } else {
                    setContent(this.content = "_");
                }
                return this.content;
            }
         */
    }
}
