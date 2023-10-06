package screen.match.calc;

public class RecomendationFilter {

    public void filter(Classification classification){
        if (classification.getRate() >= 4){
            System.out.println("Está entre os preferidos do momento");
        } else if (classification.getRate() >=2){
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para assitir depois");
        }
    }
}
