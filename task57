import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        int sr = 0;

        while (true) {
            int num = Integer.parseInt(reader.readLine());

            if (num == -1){
                System.out.println(sum / sr);
                return;
            }
            sr++;
            sum += num;
        }

    }
}
