import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Kytka extends Flower {

    private Random r = new Random();


    public Kytka(String name, double price, double neededArea, double chanceOfGrowth) {
        super(name, price, neededArea, chanceOfGrowth);
    }


    @Override
    public void grow() {


        for (int i = 0; i <amount;i++){
            int chance = r.nextInt(100)+1;

            if (chanceOfGrowth < chance) {
                kaput++;
            }

        }

        amount -= kaput;
        deadArea = kaput * 5;
        neededArea -= deadArea;


        System.out.println(growString());
    }

    public String growString(){

        return "Celkem odeslo ze sveta " + kaput + " kvetinek"+'\n'+
                "Novy pocet rostlinek je "+amount+ '\n'+
                "Nova zabrana plocha je " + neededArea+ '\n';


    }

}
