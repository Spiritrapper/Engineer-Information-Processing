package soojebi_;
class T_Soojebi extends Thread{
    public void run() {
        System.out.println("Run");
    }
    
}


public class Soojebi_6_120_Thread {
    
    public static void main(String[] args) {
        Thread t1 = new T_Soojebi();
        Thread t2 = new Thread(new T_Soojebi());

        t1.start(); // 스레드변수.start()를 통해 스레드의 run()메서드를 실행
        t2.start();
        System.out.println("Main");
    }
}


