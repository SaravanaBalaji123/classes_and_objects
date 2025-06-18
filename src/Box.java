import java.util.ArrayList;

public class Box {
    private int h;
    private int w;
    private int l;
    private static int count = 0;
    private int use = 0;
    private ArrayList<Integer>userec;
    // Common to all boxes
    Box(int h, int w, int l){
        this.h = h;
        this.w = w;
        this.l = l;
        this.use = 0;
        count++;
        this.userec = new ArrayList<>();
        this.userec.add(0);
    }

    Box(int h, int w, int l, int use){
        this.h = h;
        this.w = w;
        this.l = l;
        this.use = use;
        count++;
        this.userec = new ArrayList<>();
        this.userec.add(use);
    }

    public int area(){
        return 2*( w * l + l * h + w * h);
    }

    public int perimeter(){
        return 4*(w + l + h);
    }

    public int volume(){
        return w * l * h;
    }



    public int geth(){return h; }// The height is private hence a separate method
    public void seth(int h) {this.h = h;}// This ensures height is updated for only the object calling set h
    public int getw(){return w; }
    public void setw(int w) {this.w = w;}
    public int getl(){return l; }
    public void setl(int l) {this.l = l;}
    public int getuse(){return use;}
    public void setuse(int use) {
        this.userec.add(use);
        this.use = use;
    }
    public static int getcount(){
        return count;
    }

    public ArrayList<Integer> getuserrec(){
        return new ArrayList<>(userec);
    }

    public void printuserec(){
        for(Integer i : userec){
            System.out.println(i);
        }
    }
    void DisplayBox(){
        System.out.println("Box dimensions are " + w + " x " + l + " x " + h);
        System.out.println("Area of the box is " + volume());
        System.out.println("Perimeter of the box is " + perimeter());

    }
}
