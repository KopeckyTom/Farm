import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Farm {

    private int area = 1000000;

    private List growingFlowers = new ArrayList();
    private List flowersHarvested = new ArrayList<>();
    private List animalsBig = new ArrayList<>();
    private List animalsSmall = new ArrayList<>();
    public void watering(Flower flower) {

        flower.chanceOfGrowth += 20;
        System.out.println(flower.getName() + " byl zalit: " + flower.getChanceOfGrowth());

    }
    public void plant(Flower flower,int amount) {

        growingFlowers.add(flower);
        flower.amount = amount;

        System.out.println(flower.getName() + " byl zasazen");
    }

    public void harvest(Flower flower) {


        growingFlowers.remove(growingFlowers.indexOf(flower));
        flowersHarvested.add(flower);

        System.out.println(flower.getName() + " byl odstraněn");

    }

    public void buyAnimal(Animal animal) {
        try {
            if (animal.getSize().equals(Size.SMALL)&& animalsSmall.size() < 10){
                animalsSmall.add(animal);
            }
            if (animal.getSize().equals(Size.BIG) && animalsBig.size() < 10){
                animalsBig.add(animal);
            }
        }catch (Exception e){
            new Exception("Chyba");
        }




    }


    public List getGrowingFlowers() {
        return growingFlowers;
    }

    public List getFlowersHarvested() {
        return flowersHarvested;
    }
}
