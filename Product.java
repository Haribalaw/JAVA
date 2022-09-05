abstract class Electronics{
abstract void tv();
abstract void lap();
abstract void mobiles();
}
class Details extends Electronics{

void tv(){
String brand="sony";
int cost=75000;
System.out.println("The brand of the T.V is " + brand + " and cost is " + cost);
}
void lap(){
String brand="Apple";
int cost=150000;
System.out.println("The brand of the Lap is " + brand +" and cost is " + cost);
}
void mobiles(){
String brand="Apple";
int cost=60000;
System.out.println("The brand of the Mobile is " + brand + " and cost is " + cost);
}
}
class Product{
public static void main(String args []){
Electronics p1=new Details();
p1.tv();
p1.lap();
p1.mobiles();
}
}



