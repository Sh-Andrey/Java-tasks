import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int count = 0;

        if (num1 >= 1)   count++;
        if (num2 >= 1)   count++;
        if (num3 >= 1)   count++;
        
        System.out.println(count);
    }
}
