package HS;

import org.junit.Test;

public class demo1_FibonacciTest {

    @Test
    public void main() {
        for (int i = 1; i <= 100; ++i) {
            if (i % 3 == 0) {
                if(i % 5 == 0)  System.out.println("FizzBuzz");
                else System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}