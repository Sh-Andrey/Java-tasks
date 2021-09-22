import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[15];
        for (int i = 0; i < num.length; i++){
            num[i] = Integer.parseInt(reader.readLine());
        }
        int chnum = 0;
        int nnum = 0;
        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 0) {
                chnum += num[i];
            } else {
                nnum += num[i];
            }
        }
        if(chnum < nnum) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }else {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }


    }
}
