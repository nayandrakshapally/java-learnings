public class Threads {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();

        obj1.setPriority(1);
        obj.start();
        obj1.start();
    }
}

class A extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(30);
                System.out.println("Showing show in A " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(30);
                System.out.println("Showing show in B " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}