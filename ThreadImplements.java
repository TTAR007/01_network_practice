public class ThreadImplements implements Runnable {

    public static void main(String[] args) {
        
        ThreadImplements server2 = new ThreadImplements();
        
        // have to pass the obj to thread obj constructor 
        // in order to call the run() method in Thread class.
        Thread myThread = new Thread(server2);

        myThread.start();
        System.out.println("This is main");
    }
    
    // override run() method from Runnable interface
    public void run() {
        System.out.println("The Thread is running");
    }
}
