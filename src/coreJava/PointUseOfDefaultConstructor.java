package coreJava;
//if we write our own parametrized constructor then Java compiler doesn’t create the default constructor. So there are following two changes to Point class that can fix the above program.
//1) Remove the parametrized constructor.
//2) Add a constructor without any parameter.
public class PointUseOfDefaultConstructor {
    protected int x, y;

    public PointUseOfDefaultConstructor(int _x, int _y) {
        x = _x;
        y = _y;
    }
}

class Main{
    public static void main(String[] args) {
        //PointUseOfDefaultConstructor p = new PointUseOfDefaultConstructor();   //Error over here
       // System.out.println("x = " + p.x + ", y = " + p.y);
    }
}


