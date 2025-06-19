public class tool extends item{
    private int rating;
    private int damage = 0;
    {
        rating = 0;
    }


    public tool(String name, int qnty, int rating, int damage){
        super(name, qnty);
        this.rating = rating;
        this.damage = damage;
    }
    // Constructor overloading this can be done for any method depeding on the type of arguments
    // This is a from of compile time overloading.
    public tool(String name, int qnty){super(name, qnty);}

    public int getRating(){return rating;}
    public int getDamage(){return damage;}

    @Override
    public String toString(){
        return ("Item: " + getName() + ",Quantity " + getQuantity() + ",rating " + rating + ",damage " + damage);
    }
    // Polymorphism happening only depending on the object time allocated, requries runtime
    // Runtime polymorphism.
}
