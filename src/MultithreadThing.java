import java.sql.SQLOutput;

public class MultithreadThing implements Runnable{
    //public class MultithreadThing extends Thread
    private int threadnumber;

    public MultithreadThing(int threadnumber) {
        this.threadnumber=threadnumber;
    }

    @Override
    public void run(){
     for (int i=0;i<=5;i++)
     {
         System.out.println(i +" from thread "+threadnumber);
     /*    if(threadnumber==3)
         {
             throw new RuntimeException();
         }*/
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
     }
    }
}
