import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       
       int num1 = Integer.parseInt(reader.readLine());
       int num2 = Integer.parseInt(reader.readLine());
       
       if(num1 == num2)
            System.out.println(num1);
       if(num1 < num2)
            System.out.println(num1);
       if (num1 > num2)
            System.out.println(num2);
    }
}
