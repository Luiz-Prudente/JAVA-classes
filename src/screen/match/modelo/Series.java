package screen.match.modelo;

import screen.match.calc.Classification;

public class Series extends Titulo implements Classification {
    private int seasons;
    private int episodesPerSeason;
    private boolean active;
    private int minPerEpisode;

    public Series(String name, int releaseYear, int durationInMinutes) {
        super(name, releaseYear, durationInMinutes);
    }


    public int getSeasons() {
        return seasons;
    }
    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }


    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }
    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }


    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }


    public int getMinPerEpisode() {
        return minPerEpisode;
    }
    public void setMinPerEpisode(int minPerEpisode) {
        this.minPerEpisode = minPerEpisode;
    }

    @Override
    public int getDurationInMinutes() {
        return seasons * episodesPerSeason * minPerEpisode;
    }

    @Override
    public void showDataSheet() {
        System.out.println("Nome da série: " + getName());
        System.out.println("Lançamento: " + getReleaseYear());
        System.out.println("Avaliação: " + getRate());
        System.out.println("Total de avaliações: " + getTotalAvaliations());
        System.out.println("Temporadas: " + seasons);
    }

    @Override
    public int getRate() {
        return 0;
    }

    @Override
    public String toString() {
        return "Série: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}
