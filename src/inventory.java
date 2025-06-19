import java.util.ArrayList;
public class inventory {
    // This is going to hold the instances of the items added to item.
    // I am using an array to save the inventory items.
    private ArrayList<item> items;

    public inventory(){
        items = new ArrayList<>();
    }

    public void addItem(item item){
        items.add(item);
    }

    public void display(){
        for (item item : items){
            System.out.println(item.toString());
            // ToString is recommended to be overriden at the inherited types.
        }
    }

    public void display(int rating){
        for(item item : items){
            if(item instanceof tool && rating > 50){
                System.out.println(item.toString());
            }else if(item instanceof valuable && ((valuable)item).getValue() > 50){
                System.out.println(item.toString());
            }
        }
    }

}
