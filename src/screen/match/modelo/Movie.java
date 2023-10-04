package screen.match.modelo;

public class Movie {
    private String name;
    private int releaseYear;
    private boolean includeInPlan;
    private double avaliationsSum = 0;
    private double rate = 0;
    private int totalAvaliations = 0;
    private int durationInMinutes;

    public void setName(String name) {
        this.name = name;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getTotalAvaliations(){
        return totalAvaliations;
    }

    public void showDataSheet(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Lançamento: " + releaseYear);
        System.out.println("Avaliação: " + rate);
        System.out.println("Total de avaliações: " + totalAvaliations);
    }

    public void assess(double grade){
        avaliationsSum += grade;
        totalAvaliations++;
    }

    public void averageAssess(){
         rate = avaliationsSum / totalAvaliations;
    }
}
