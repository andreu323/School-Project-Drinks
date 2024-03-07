public class Drink {
    private double apple = 0;
    private double orange = 0;
    private double vodka = 0;

    public boolean is_alc(){
        return (vodka>(orange+apple));
    }

    public double getVodka() {
        return vodka;
    }

    public double getApple() {
        return apple;
    }

    public double getOrange() {
        return orange;
    }

    public Drink() {
    }

    public Drink(double apple, double orange, double vodka) {
        this.orange = orange;
        this.apple = apple;
        this.vodka = vodka;
    }

    public Drink(Drink drink){
        this.orange = drink.getOrange();
        this.apple = drink.getApple();
        this.vodka = drink.getVodka();
    }

    public Drink blend(Drink drink_to_mix ){
        return new Drink( apple+drink_to_mix.getApple(),orange+ drink_to_mix.getOrange(),vodka+drink_to_mix.getVodka());
    }
    public void change(String picked,double to_add){
        picked = picked.toLowerCase();
        switch (picked){
            case "apple":
                apple += to_add;
                if(apple < 0) apple = 0;
                break;
            case "orange":
                orange += to_add;
                if(orange < 0) orange = 0;
                break;
            case "vodka":
                vodka += to_add;
                if(vodka < 0) vodka = 0;
                break;

        }
    }
    public String toString(){
        return "{ vodka: " + vodka + ", apple: " + apple + ", orange: " + orange + "}";
    }


}
