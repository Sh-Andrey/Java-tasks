import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой. Вывести на экран порядковый номер числа, отличного от остальных.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        if(num1 == num2)
            System.out.println(3);
        else if(num1 == num3)
            System.out.println(2);
        else if(num2 == num3)
            System.out.println(1);
    }
}
