package inheritence;


public class Box{
    double l;
    double w;
    double h;
    Box(){
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }

    //cube
    public Box(double side) {
        this.w =side;
        this.h =side;
        this.l =side;
    }

    public Box(double l, double w, double h) { //Parameterized Constructor
        this.l = l;
        this.w = w;
        this.h = h;
    }
    

    Box(Box old){
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;
    }
    public void information(){
        System.out.println("Running the box");
        System.out.println("length="+l);
        System.out.println("width="+w);
        System.out.println("height="+h);
    }
    
}