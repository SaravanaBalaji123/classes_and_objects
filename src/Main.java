import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        inventory inventory = new inventory();
        item it1 = new valuable("gold", 5, 90000); // Inheritance
        item it2 = new item("rocks", 21);
        item it3 = new item("water", 30);
        item it4 = new tool("hammer", 3, 500, 4000);
        Integer i = 0;
        inventory.addItem(it1);
        inventory.addItem(it2);
        inventory.addItem(it3);
        inventory.addItem(it4);
        inventory.display();
    }
}
// Any collections or also known as collectives is using a polymorphism called Parametric Polymorphism.
// This abstracts they type passed accomodating wide range of objects to pass through as parameters.

