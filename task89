import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader write = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            list.add(write.readLine());
        }

        String minStr = list.get(0);
        String maxStr = list.get(0);

        int min = 0;
        int max = 0;

        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() < minStr.length()) {
                minStr = list.get(i);
                min = i;
            } else if (list.get(i).length() > maxStr.length()) {
                maxStr = list.get(i);
                max = i;
            }
        }
            
        if (min < max) {
                System.out.println(minStr);
        } else {
                System.out.println(maxStr);
        }
    }
}
