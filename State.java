class One extends Thread{
    public void run(){
      System.out.println("start thread 1..");
      for(int i=1;i<=5;i++){
      if(i==1)yield();
       System.out.println("From thread 1: i= " + i);
       }
       System.out.println("..Exit Thread 1");
       }
       }
    class Two extends Thread{
    public void run(){
      System.out.println("start thread 2..");
      for(int j=1;j<=5;j++){
      System.out.println("From thread 2: i= " + j);
      if(j==2)stop();
      }
      System.out.println("Exit Thread 2");
      }
      }
    class Three extends Thread{
    public void run(){
      System.out.println("start thread 3..");
      for(int k=1;k<=5;k++){
        System.out.println("From Thread 3: j= " + k);
      if(k==3){
         try{
         sleep(1000);
         }catch(Exception e){}
      }
      }
      System.out.println("..Exit Thread 3");
      }
      }
      public class State{
      public static void main(String args []){
      One x =new One();
      Two y =new Two();
      Three z =new Three();
      x.start();
      y.start();
      z.start();
      System.out.println("...End of execution");
      }
      }