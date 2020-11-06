import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        
        if ( num1 == num2 && num2 == num3 && num1 == num3){ 
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if (num1 == num2){
            System.out.println(num1 + " " + num2);
        } else if (num1 == num3){
            System.out.println(num1 + " " + num3);
        } else if (num3 == num2){
            System.out.println(num3 + " " + num2);
        }
    }
}
