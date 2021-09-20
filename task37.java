import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе, в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б",
где а, б - искомые значения.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        
        int countO = 0;
        int countP = 0;
        

        if (num1 <= -1)   countO++;
        if (num2 <= -1)   countO++;
        if (num3 <= -1)   countO++;
        System.out.println("количество отрицательных чисел: " + countO);

        if (num1 >= 1)   countP++;
        if (num2 >= 1)   countP++;
        if (num3 >= 1)   countP++;
        System.out.println("количество положительных чисел: " + countP);
        
        

    }
}
