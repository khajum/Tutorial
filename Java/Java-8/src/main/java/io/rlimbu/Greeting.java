
package io.rlimbu;
/**
 * @author Ram Limbu
 * @version 1.0
 * @since 2020-05-17
 */
public class Greeting {

    public static void main(String[] args) {
        
        // Greeting using Object
        Greeting greeter = new Greeting();
        greeter.greet();
        
        //Greeting using Interface
        HelloWorldGreeter greeting = new HelloWorldGreeter();
        greeter.greet(greeting);
    }
    
    public void greet() {
        System.out.println("Hello World!");
    }

    public void greet(Greeter greeting) {
        greeting.perform();
    }
    
}

