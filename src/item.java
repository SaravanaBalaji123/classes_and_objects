public class item {
    private String name;
    private int quantity; // Private variable accessed by public method in the same class.
    {
        name = "John Doe";
        quantity = 0;
    } // Instance initiator, only run once when the class is initiated for defaults

    // Consructor is run for every object that is created.
    public item (String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public String getName(){ return name;}
    public int getQuantity(){ return quantity;}// Ties down access to specific variable
    // Encapsulation.

    public String toString(){
        return ("Item: " + name + ",Quantity " + quantity);
    }

    public int getValue(){
        return 0;
    }
}
