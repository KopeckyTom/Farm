import java.util.ArrayList;
import java.util.List;

public class Kytka extends Flower {




    private List growingFlowers = new ArrayList();





    @Override
    public void watering() {

            //chanceOfGrowth += 20;

        System.out.println("zalito");

    }

    @Override
    public void plant(Flower flower) {
        try{
            if (growingFlowers.size() < 5){
                growingFlowers.add(flower);
            }
        }catch (Exception e){
            new Exception("Can't plant - full area");
        }
    }

    @Override
    public void harvest(Flower flower) {
        try{
            if (growingFlowers.size() > 1){

                growingFlowers.remove(growingFlowers.indexOf(flower));
            }
        }catch (Exception e){
            new Exception("Can't harvest - no flowers");
        }
    }
}
