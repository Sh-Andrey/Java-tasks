import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
количество дней в году: x, где
х - 366 для високосного года,
х - 365 для обычного года.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int igod = Integer.parseInt(reader.readLine());
        
        if (igod % 400 == 0){
            System.out.println("количество дней в году: " + 366);
        }
        else if (igod % 100 == 0){
            System.out.println("количество дней в году: " + 365);
        }
        else if (igod % 4 == 0){
            System.out.println("количество дней в году: " + 366);
        }
        else 
            System.out.println("количество дней в году: " + 365);
    }
}
