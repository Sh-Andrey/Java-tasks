import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        
        int max = Math.max(num1, Math.max(num2,num3));      
        int min = Math.min(num1, Math.min(num2,num3));
        System.out.println(num1 + num2 + num3 - max - min);
    }
}
