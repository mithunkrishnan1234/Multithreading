public class Main {
    public static void main(String[] args) {
        for(int i=0;i<=3;i++) {
            MultithreadThing mything = new MultithreadThing(i);
            Thread mythread = new Thread(mything);
            mythread.start();
        }
       //mythread.join() for waiting until one thread is executed uses try catch
        //mythread.isAlive() for checking the status of thread
    }
}