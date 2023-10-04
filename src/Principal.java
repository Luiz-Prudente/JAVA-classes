import screen.match.modelo.Movie;

public class Principal {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Pantera Negra");
        myMovie.setReleaseYear(2018);
        myMovie.setDurationInMinutes(114);


        myMovie.assess(8);
        myMovie.assess(9.5);
        myMovie.assess(7.2);

        myMovie.averageAssess();

        myMovie.showDataSheet();
    }
}
