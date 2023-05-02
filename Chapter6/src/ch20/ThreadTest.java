package ch20;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 201; i++) {
            System.out.print("MyThread.run" + i);
        }
    }
}

class MyThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 201; i++) {
            System.out.print("MyThread.run" + i + '\t');
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {

        // multi Thread
//        System.out.println(Thread.currentThread() + "Start");
//        MyThread th1 = new MyThread();
//        MyThread th2 = new MyThread();
//
//        th1.start();
//        th2.start();
//
//        System.out.println(Thread.currentThread() + "end");

        System.out.println(Thread.currentThread() + "Start");

        MyThread2 runnable = new MyThread2();
        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable);

        th1.start();
        th2.start();

        System.out.println(Thread.currentThread() + "end");
    }
}
