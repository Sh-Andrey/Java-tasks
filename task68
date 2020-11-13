import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int maximum = Integer.MIN_VALUE;;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(reader.readLine());
                if (a > maximum) {
                    maximum = a;
                }
            }
            System.out.println(maximum);
        }

    }
}
