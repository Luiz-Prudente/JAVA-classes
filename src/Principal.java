public class Principal {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "Pantera Negra";
        myMovie.releaseYear = 2018;
        myMovie.durationInMinutes = 114;


        myMovie.assess(8);
        myMovie.assess(9.5);
        myMovie.assess(7.2);

        myMovie.averageAssess();

        myMovie.showDataSheet();
    }
}
