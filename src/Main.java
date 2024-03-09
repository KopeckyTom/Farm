public class Main {
    public static void main(String[] args) {

        Flower corn = new Kytka("Pepa", 150, 50000,50);
        Flower weat = new Kytka("Fred", 120, 200000,40);
        Flower ruze = new Kytka("Majkl", 300, 10000,65);
        Farm farm = new Farm();

        System.out.println();
        farm.plant(corn,10000);
        farm.plant(ruze, 2000);
        farm.plant(weat, 40000);
        System.out.println();
        farm.watering(corn);
        farm.watering(ruze);
        farm.watering(weat);
        System.out.println();
        corn.grow();
        ruze.grow();
        weat.grow();

        farm.harvest(corn);
        farm.harvest(weat);
        farm.harvest(ruze);
        System.out.println();
        System.out.println("Kytky vysazeny: " + farm.getFlowersHarvested());


    }


    /*
Naklonujte si projekt z Githubu a vytvořte si z něj svůj vlastní projekt. Vytvořte funkční systém pro farmáře pro správu dobytka a rostlin.

Farmář může rostliny zasadit, zavlažovat a sklízet. Na svém pozemku může pěstovat maximálně 5 druhů rostlin naráz a jeho pozemek činí 100ha.

Abstraktní třída Rostlina má jako vlastnosti název, cenu, potřebnou plochu pro růst a šanci na to, že rostlina vůbec vyroste. Vytvořte další druhy rostlin a doplňte je o potřebné metody.
Pokud rostlinu zavlaží, zvýší se rostlině šance, že rostlina vyroste.

Pro svůj dobytek má farmář jednu velkou stodolu, do které může umístit maximálně 20 zvířat. 10 velkých a 10 malých. Třída Zvíře má jako vlastnosti druh, jméno velikost a informaci o speciální péči.
Farmář může zvířata kupovat, pohladit nebo prodat. Vytvořte si různé druhy zvířat a doplňte je o potřebné metody.

Farmář si budeme moci vybrat mezi správou dobytka a rostlin. Umožněte mu přidávat, odebírat rostliny/zvířata a veškerou další práci s nimi. Pokud budete mít toto hotové, přidejte do projektu i správu jeho financí a majetku.
Umožněte mu nakupovat pozemky a nové místa ve stodole. Nezapomeňte vše řádně propojit.

Veškeré metody, které dopíšete, budou mít patřičnou dokumentaci.

Na konci odevzdejte odkaz na váš repozitář s vaší vypracovanou prací.
*/
}