class MyThread extends Thread {
    
    // Override run() method
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
            
            try {
                Thread.sleep(500); // pause for 500ms
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        
        // Create thread object
        MyThread t1 = new MyThread();
        
        // Start thread
        t1.start();
        
        // Main thread work
        for(int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
        }
    }
}