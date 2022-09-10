class Rectangle{
        void area(int length,int breadth){
        System.out.println("Area of Rectangle:" +length*breadth);
        }
    }
class Area extends Rectangle{
        void area(float diagonal1, float diagonal2){
        System.out.println("Area of Rhombus:" + (diagonal1*diagonal2)/2);
        }
    }
public class Rhombus{
public static void main(String args []){
        Area x =new Area();
        x.area(12,13);
        x.area(20.5f,30.5f);
        }
    }

