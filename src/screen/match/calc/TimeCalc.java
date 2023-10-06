package screen.match.calc;

import screen.match.modelo.Titulo;

public class TimeCalc {
    private int totalTime = 0;

    public int getTotalTime() {
        return totalTime;
    }

    public void include(Titulo titulo){
        totalTime += titulo.getDurationInMinutes();
    }


}
