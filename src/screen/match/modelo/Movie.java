package screen.match.modelo;

import screen.match.calc.Classification;

public class Movie extends Titulo implements Classification {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getRate() {
        return (int) averageAssess() / 2;
    }

    //Metodo toString Reescrito para mostrar não o endereço de momória, e sim as informações desejadas
    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}
