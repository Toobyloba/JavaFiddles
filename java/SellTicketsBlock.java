import java.util.Random;
import java.util.concurrent.ThreadPoolExecutor;
import java.lang.Thread;
public class SellTicketsBlock {
  public static void main(String[] args) {
      // Start 4 ticket windows
      Thread t1 = new Thread(new SellThread(), "Ticket Window 1");
      Thread t2 = new Thread(new SellThread(), "Ticket Window 2");
      Thread t3 = new Thread(new SellThread(), "Ticket Window 3");
      Thread t4 = new Thread(new SellThread(), "Ticket Window 4");

      t1.start();
      t2.start();
      t3.start();
      t4.start();
  }
}

class SellThread implements Runnable {
  private static int tickets = 100; // Shared variable representing the number of tickets
  private static final Object lock = new Object(); // Object used for synchronization
  Random sleep = new Random();

  @Override
  public void run() {
      while (true) {
          synchronized (lock) { // Synchronized block to ensure thread safety
              if (tickets > 0) { // Check if there are tickets available
                  int ticketNumber = tickets; // Assign the current ticket number to a local variable
                  tickets--; // Decrement the ticket count
                  System.out.println(Thread.currentThread().getName() + " Ticket Number:" + ticketNumber);
                  // Print the thread name and ticket number
              } else {
                  break; // Exit the loop if all tickets are sold
              }
          }
      }
      try {
        Thread.sleep(1000 * sleep.nextInt());
      } catch (Exception e) {
        //TODO: handle exception
      }
  }
}