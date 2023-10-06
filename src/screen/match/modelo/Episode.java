package screen.match.modelo;

import screen.match.calc.Classification;

public class Episode implements Classification {
    private int number;
    private String nome;
    private Series serie;
    private int totalViews;

    public int getTotalViews() {
        return totalViews;
    }
    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    @Override
    public int getRate() {
        if (totalViews > 100){
            return 4;
        } else {
            return 2;
        }
    }
}
