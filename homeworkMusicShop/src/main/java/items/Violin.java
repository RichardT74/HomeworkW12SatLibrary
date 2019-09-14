package items;

import behaviours.IPlay;
import behaviours.ISell;

public class Violin extends Item implements IPlay, ISell {
    private String sound;
    private int cost;

    public Violin(String name, String colour, String type, String sound, int cost) {
        super(name, colour, type);
        this.sound = sound;
        this.cost = cost;

    }
    public String getSound() {return sound; }

    public double GetBuyPrice() { return cost; }

    public double GetSellPrice() {return cost * 3.5; }

    public double GetMarkUp() {
        return this.GetSellPrice() - cost;
    }
}




//    public double defaultPrice() {
//        return 2.80;
//    }

//    public double defaultPrice() {
//        return 8.40;
//    }