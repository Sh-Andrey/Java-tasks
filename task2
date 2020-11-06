import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      int num1 = Integer.parseInt(reader.readLine());
      int num2 = Integer.parseInt(reader.readLine());
      int num3 = Integer.parseInt(reader.readLine());
      int num4 = Integer.parseInt(reader.readLine());

      num1 = max(num1, num2);
      num1 = max(num1, num3);
      num1 = max(num1, num4);

      System.out.println(num1);

    }
   public static int max(int a, int b) {
            if (a <= b) a = b; 
            return a;
        }   
}
