package screen.match.principal;

import screen.match.modelo.Movie;
import screen.match.modelo.Series;
import screen.match.modelo.Titulo;

import java.util.ArrayList;

public class PrincipalComLista {
    public static void main(String[] args) {
        Movie blackPanther = new Movie("Pantera Negra",2018,114);
        Movie fastAndFurious = new Movie("Velozes e Furiosos",2023,129);
        Movie toyStory = new Movie("Toy Story",2003,94);
        blackPanther.assess(8);
        toyStory.assess(10);
        fastAndFurious.assess(5);

        Series mySerie = new Series("The Boys",2021,48);

        ArrayList<Titulo> assistidos = new ArrayList<>();
        assistidos.add(blackPanther);
        assistidos.add(fastAndFurious);
        assistidos.add(toyStory);
        assistidos.add(mySerie);

        for (Titulo item: assistidos) {
            System.out.println(item.getName());
            if (item instanceof Movie movie) {
                System.out.println(((Movie) item).getRate());
            }
        }
    }
}
