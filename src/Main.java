//Is main function is private of public?

// The main function is public thats why when running it is able to be accessed by main function.

//Syntax of Main function and its parent class?
public class Main{
    public static void main(String[] args){
        System.out.println("Hello World");
        Box b1 = new Box(5, 3, 6);
        System.out.println(b1);
        // Prints address
        b1.DisplayBox();
        System.out.println(Box.getcount()); // Getting using class instance
//        System.out.println(cb.getcount()); Can be done but not recommended as you are accessing the static.
        Box b2 = new Box(15, 4, 23);
        Box b3 = new Box(6, 2, 17);
        System.out.println(b2); // Second object address should be different from first
        System.out.println(Box.getcount());
        b2.DisplayBox();
    }
}


//Collections?

// Collections refer to a group of objects treated as single unit.
// The framework consists of : interfaces, classes, algorithms.
// I have learnt this as containers, stl in CPP.
// Predefine algorithms, datastructures, methods, that are very dynamic, malleable.
// These collections are very cohesive and can be interchangeably used.

//Is constructor mandatory?

// Defining a constructor is not mandatory for a class, if no constructor present, java provides default constructor.
// If I have one instance of any type of constructor, java won't provide default constructor.
