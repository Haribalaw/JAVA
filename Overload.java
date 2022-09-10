public class Overload {
    public static void talk()
    {
    System.out.println("Hai");
    }
    public static void talk(String name){
        System.out.println("Hello " + name);
    }
    public static void main(String[] args){
        talk("Akash...");
    }
}
