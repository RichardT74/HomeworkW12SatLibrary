package items;




public abstract class Item {

    private String name;
    private String colour;
    private String type;

    public Item(String name, String colour, String type) {
        this.name = name;
        this.colour = colour;
        this.type = type;
    }


    public String getName() { return name; }

    public String getColour() {return colour; }

    public String gettype() {return type; }

}
