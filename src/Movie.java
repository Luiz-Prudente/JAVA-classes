public class Movie {
    String name;
    int releaseYear;
    boolean includeInPlan;
    double avaliationsSum = 0;
    double rate = 0;
    int totalAvaliations = 0;
    int durationInMinutes;

    void showDataSheet(){
        System.out.println("Nome do filme: " + this.name);
        System.out.println("Lançamento: " + this.releaseYear);
        System.out.println("Avaliação: " + this.rate);
    }

    void assess(double grade){
        this.avaliationsSum += grade;
        this.totalAvaliations++;
    }

    void averageAssess(){
         this.rate = this.avaliationsSum / this.totalAvaliations;
    }
}
