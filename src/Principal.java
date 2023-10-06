import screen.match.calc.RecomendationFilter;
import screen.match.calc.TimeCalc;
import screen.match.modelo.Movie;
import screen.match.modelo.Series;

public class Principal {
    public static void main(String[] args) {
        //Filme
        Movie blackPanther = new Movie();
        blackPanther.setName("Pantera Negra");
        blackPanther.setReleaseYear(2018);
        blackPanther.setDurationInMinutes(114);

        Movie fastAndFurious = new Movie();
        fastAndFurious.setName("Velozes e Furiosos");
        fastAndFurious.setReleaseYear(2023);
        fastAndFurious.setDurationInMinutes(129);

        blackPanther.assess(8);
        blackPanther.assess(9.5);
        blackPanther.assess(7.2);

        blackPanther.averageAssess();
        blackPanther.showDataSheet();

        //Série
        Series mySerie = new Series();
        mySerie.setName("The Boys");
        mySerie.setReleaseYear(2021);
        mySerie.setSeasons(4);
        mySerie.setEpisodesPerSeason(8);
        mySerie.setMinPerEpisode(48);
        mySerie.setTotalAvaliations(150);

        mySerie.assess(10);

        mySerie.assess(9);
        mySerie.assess(7);
        mySerie.assess(6);

        mySerie.averageAssess();
        mySerie.showDataSheet();


        // Uso do classe TimeCal
        TimeCalc calculator = new TimeCalc();
        calculator.include(blackPanther);
        calculator.include(fastAndFurious);
        calculator.include(mySerie);
        System.out.println(calculator.getTotalTime());

        //USando o filtro de classificação
        RecomendationFilter filtered = new RecomendationFilter();
        filtered.filter(blackPanther);
        filtered.filter(mySerie);
    }
}
