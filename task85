import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        for (int i = 0; i < 5; i++)
        {
            String s = reader.readLine();
            strings.add(s);
        }

        Collections.sort(strings, (s1, s2) -> s2.length() - s1.length());

        int length = strings.get(0).length();
        for (String string : strings)
            if (length == string.length()) {
                System.out.println(string);
            } else {
                break;
            }
    }
}
