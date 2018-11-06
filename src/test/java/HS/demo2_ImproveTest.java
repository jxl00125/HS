package HS;

import org.junit.Test;

public class demo2_ImproveTest {
// 100以内斐波那契数列变种: 能被3整除或该数含有数字3(比如13,30等)输出Buzz,能被5整除或该数含5输出Fizz,上面两种情况都包含输出FizzBuzz
    @Test
    public void main() {
        for (int i = 1; i <= 100; i++) {
            if (i%15 ==0 || ( i/10 == 5 || i%10 ==5 && i/10 == 3 || i%10 ==3 ) ){
                System.out.println("FizzBuzz");
            }
            else if (i%5 == 0 ) System.out.println("Buzz");
            else if (i%3 == 0) System.out.println("Fizz");
            else{
                System.out.println(i);
            }
        }
    }
}
