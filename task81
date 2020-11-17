import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[10];
        for (int i = 0; i < num.length; i++){
            num[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = num.length - 1; i >= 0; i--){
            System.out.println(num[i]);
        }

    }
}
