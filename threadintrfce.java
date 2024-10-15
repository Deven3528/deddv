
class A implements Runnable{
        public void run(){
            for(int i=1; i<=30; i++){
                System.out.println("A thread = "+i);
            }
            System.out.println("Exit from A thread");
        }
    }
    
    class B implements Runnable{
        public void run(){
            for(int j=1; j<=30; j++){
                System.out.println("B thread = "+j);
            }
            System.out.println("Exit from B thread");
        }
    }
    
    class C implements Runnable{
        public void run(){
            for(int k=1; k<=30; k++){
                System.out.println("C thread = "+k);
            }
            System.out.println("Exit from C thread");
        }
    }
    public class threadintrfce {
    public static void main(String[] args) {
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());
        Thread t3 = new Thread(new C());

        t1.start();
        t2.start();
        t3.start();
    }
    }
