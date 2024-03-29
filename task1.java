import java.io.BufferedReader;
import java.io.InputStreamReader;


/* 
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
       int num1 = Integer.parseInt(reader.readLine());
       int num2 = Integer.parseInt(reader.readLine());
       int num3 = Integer.parseInt(reader.readLine());
        
       int max1 = Math.max(num1, Math.max(num2, num3));
            System.out.print(max1);
        
       int min1 = Math.max(num1, Math.min(num2, num3));
            System.out.print(" " + min1 + " ");        
            
       int min2 = Math.min(num1, Math.min(num2, num3)); 
            System.out.print(min2);
    }
}
