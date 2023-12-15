//Runnable is functional interface we can create thread using runnable also
public class RunnableThreads {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for (int i = 0; i <= 100; i++) {
                try {
                    Thread.sleep(30);
                    System.out.println("Showing show in obj1 " + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i <= 100; i++) {
                try {
                    Thread.sleep(30);
                    System.out.println("Showing show in obj2 " + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

    }
}
