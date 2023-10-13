package screen.match.modelo;

public class Titulo implements  Comparable<Titulo> {
    private String name;
    private int releaseYear;
    private boolean includeInPlan;
    private double avaliationsSum = 0;
    private double rate = 0;
    private int totalAvaliations = 0;
    private int durationInMinutes;

    public Titulo(String name, int releaseYear, int durationInMinutes) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.durationInMinutes = durationInMinutes;
    }

    //Getters e Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }


    public boolean isIncludeInPlan() {
        return includeInPlan;
    }

    public void setIncludeInPlan(boolean includeInPlan) {
        this.includeInPlan = includeInPlan;
    }
    public double getAvaliationsSum() {
        return avaliationsSum;
    }
    public void setAvaliationsSum(double avaliationsSum) {
        this.avaliationsSum = avaliationsSum;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }


    public int getTotalAvaliations() {
        return totalAvaliations;
    }
    public void setTotalAvaliations(int totalAvaliations) {
        this.totalAvaliations = totalAvaliations;
    }


    public int getDurationInMinutes() {
        return durationInMinutes;
    }
    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    //Métodos Gerais
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

    public double averageAssess(){
        return rate = avaliationsSum / totalAvaliations;
    }

    @Override
    public int compareTo(Titulo otherTitle) {
        return this.getName().compareTo(otherTitle.getName());

    }
}
