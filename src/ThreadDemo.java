class hi extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hi");
            try{Thread.sleep(500);
            }catch(Exception obj){}
        }
    }
}
class hello extends Thread{
    public void run()
    {
        for(int i=0;i<5;i++) {
            System.out.println("hello");

            try {
                Thread.sleep(500);
            } catch (Exception obj) {}

        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
hi obj1=new hi();
hello obj2=new hello();
obj1.start();
//obj2.start();
obj1.run();
obj1.join();
obj2.run();
        for (int i = 0; i <10 ; i++) {
            System.out.println("neeraj");
        }
    }
}
