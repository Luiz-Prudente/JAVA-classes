import screen.match.calc.RecomendationFilter;
import screen.match.calc.TimeCalc;
import screen.match.modelo.Movie;
import screen.match.modelo.Series;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //Filme
        Movie blackPanther = new Movie("Pantera Negra",2018,114);
        //blackPanther.setName("Pantera Negra");
        //blackPanther.setReleaseYear(2018);
        //blackPanther.setDurationInMinutes(114);

        Movie fastAndFurious = new Movie("Velozes e Furiosos",2023,129);
        //fastAndFurious.setName("Velozes e Furiosos");
        //fastAndFurious.setReleaseYear(2023);
        //fastAndFurious.setDurationInMinutes(129);

        Movie toyStory = new Movie("Toy Story",2003,94);
        //toyStory.setName("Toy Story");
        //toyStory.setReleaseYear(2003);
        //toyStory.setDurationInMinutes(94);

        blackPanther.assess(8);
        blackPanther.assess(9.5);
        blackPanther.assess(7.2);

        blackPanther.averageAssess();
        blackPanther.showDataSheet();

        //Série
        Series mySerie = new Series("The Boys",2021,48);
        //mySerie.setName("The Boys");
        //mySerie.setReleaseYear(2021);
        mySerie.setSeasons(4);
        mySerie.setEpisodesPerSeason(8);
        //mySerie.setMinPerEpisode(48);
        mySerie.setTotalAvaliations(150);

        mySerie.assess(10);

        mySerie.assess(9);
        mySerie.assess(7);
        mySerie.assess(6);

        mySerie.averageAssess();
        mySerie.showDataSheet();


        // Uso do classe TimeCal
        TimeCalc calculator = new TimeCalc();
        calculator.include(fastAndFurious);
        calculator.include(fastAndFurious);
        calculator.include(mySerie);
        System.out.println(calculator.getTotalTime());

        //Usando o filtro de classificação
        RecomendationFilter filtered = new RecomendationFilter();
        filtered.filter(blackPanther);
        filtered.filter(mySerie);

        //Incluindo o uso de Arrays
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(blackPanther);
        movies.add(fastAndFurious);
        movies.add(toyStory);

        System.out.println(movies);
        /*int size = movies.size();
        for (int i = 0; i < size; i++){
            System.out.println(movies.get(i).getName());
        }*/

    }
}
