package screen.match.calc;

import screen.match.modelo.Movie;

public class TimeCalc {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void include(Movie f){
        totalTime += f.getDurationInMinutes();
    }
}
