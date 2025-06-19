public class valuable extends item {
     private int value;

     public valuable(String name, int qty, int value){
         super(name, qty);
         this.value = value;
     }

     public int getValue(){
         return value;
     }

    @Override
    public String toString(){
        return ("Item: " + getName() + ",Quantity " + getQuantity() + ",value" + value);
    }// Polymorphism happening only depending on the object time allocated, requries runtime
    // Runtime polymorphism.
}
