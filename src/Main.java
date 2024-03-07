import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static boolean isTooMuchAlc(Drink[] drinks){
        int alc_drinks = 0;
        int fruit_drinks = 0;
        for (int i = 0; i < drinks.length; i++){
            Drink currect = drinks[i];
            if(currect.is_alc())alc_drinks++; else fruit_drinks++;
        }
        return alc_drinks > fruit_drinks;
    }
    public static ArrayList<Drink> drinksForKids(Drink[] drinks){
        ArrayList<Drink> kidsDrinks = new ArrayList<>();
        for (int i = 0; i < drinks.length; i++){
            Drink currect = drinks[i];
            if(currect.getVodka() == 0) kidsDrinks.add(currect);
        }

        return kidsDrinks;
    }


    public static void main(String[] args) {

        //first mission
        Drink drink = new Drink(200,300,100);
        System.out.println("is alc first: "+drink.is_alc());
        drink = drink.blend(new Drink(200,200,1200));
        System.out.println("is alc second: "+drink.is_alc());
        System.out.println("apple first: "+drink.getApple());
        drink.change("apple",500);
        System.out.println("apple second: "+drink.getApple());

        //second mission
        //need to return that too much alc drinks 0_0
        Drink[] drinks = {
                new Drink(200,200,500),
                new Drink(100,200,900),
                new Drink(200,100,400),
                new Drink(100,900,200),
                new Drink(100,200,0),
        };
        System.out.println("Is too much alc drinks: "+ isTooMuchAlc(drinks) );
        System.out.println("drinks for kids: " + drinksForKids(drinks));


    }
}