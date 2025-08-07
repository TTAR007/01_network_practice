public class ThreadExtends extends Thread{

    // now the Main class is a subclass of Thread class
    /// have to override run() from Thread class
    
    public static void main(String[] args) {

        ThreadExtends server1 = new ThreadExtends();
        server1.start();
        System.out.println("this is main");
    }

    public void run() {
        System.out.println("The thread is running.");
    }
}