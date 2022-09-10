abstract class Student{
        abstract void data();
        abstract void data1();
    }
class Studentdata extends Student{
       void data(){
        int ID = 1001;
        String name = "Surya.R";
        System.out.println("Student ID: "+ ID);
        System.out.println("Student Name: "+ name);
} 
    void data1(){
           int m1 = 58;
           System.out.println("m1="+m1);
           int m2 = 65;
           System.out.println("m2="+m2);
           int m3 = 70;
           System.out.println("m3="+m3);
           int total= m1+m2+m3;
           System.out.println("Total="+total);
           float per = total/3f;
           System.out.println("Percentage="+per);
           if(per>60){
               System.out.println("Grage = A");
           }else{
               System.out.println("Invaild");
           }
       }
    }
    public class Grade{
        public static void main(String arg[]){
            Student a = new Studentdata();
            a.data();
            a.data1();
        }
}
