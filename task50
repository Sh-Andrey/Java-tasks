import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
       int sum = 0;
 
        while (true) {
            int num = Integer.parseInt(reader.readLine());
            sum += num;
                   
              if (num == -1){
                break;
              }
        }
        System.out.println(sum);
    }
}
