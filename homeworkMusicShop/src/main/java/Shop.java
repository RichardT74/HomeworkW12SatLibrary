import behaviours.ISell;
import items.Item;

import java.util.ArrayList;


public class Shop {

    private ArrayList<Item> items;

    public Shop() {
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {this.items.add(item); }

    public void removeItem(Item item) {this.items.remove(item); }


    public int getItemCount(){ return this.items.size(); }



}




//    public void addAttraction(Attraction attraction){
//        this.attractions.add(attraction);
//    }
//
//    public void addStall(Stall stall){
//        this.stalls.add(stall);
//    }
//
//    public int getAttractionCount() {return this.attractions.size();