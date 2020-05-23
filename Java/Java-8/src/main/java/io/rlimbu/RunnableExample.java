
package io.rlimbu;
/**
 * @author Ram Limbu
 * @version 1.0
 * @since 2020-05-17
 */
public class RunnableExample {
    
    public static void main(String[] args) {
        
        Thread thread = new Thread(new Runnable() {
            
            @Override
            public void run() {
                System.out.println("Thread implementation using Runnable");
                
            }
        });
        
        thread.run();
        
        Thread myLamda = new Thread(() -> System.out.println("Thread implementation using Runnable lambda."));
        myLamda.run();
    }

}

