
package io.rlimbu;
/**
 * @author Ram Limbu
 * @version 1.0
 * @since 2020-05-17
 */
public class LambdaBasicExample {

    public static void main(String[] args) {
      /*  
        methodReference = () -> System.out.println("Hello World");
        
        doubleNumberFunction = (int a) -> a*2
        
        addFunction = (int a, int b) -> a+b;        
        
        safeDivideFunction = (int a, int b) -> {
            if (b == 0) return 0
            return a/b;
        }
              
        strLength = (String s) -> s.legth();
        
       */
        // Lambda Basics-8
        /*
        MyLambda myLambdaFunction = () -> System.out.println();
        LambdaAdd lambdaAddFunction = (int a, int b) -> a + b;
        
        // use already availble interface
        Greeter myLambdaFunction1 = () -> System.out.println();
        
        */
        
        // Lambda Basics-9
        
        HelloWorldGreeter helloWorldGreeter = new HelloWorldGreeter();
        Greeter lambdaGreet = () -> System.out.println("Greeting from Lambda.");
        lambdaGreet.perform();
        
        helloWorldGreeter.perform();

        
        Greeter innerClassGreeting = new Greeter() {
            public void perform() {
                System.out.println("Inner class Greet.");
            }
        };
        
        innerClassGreeting.perform();       
                
    }

}

interface MyLambda {
    void foo();
}

interface LambdaAdd {
    int add(int a, int b);
}

