import java.util.ArrayList;

/* 
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву "р"
2.2. удваивать все слова содержащие букву "л".
2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {

        ArrayList<String> result = new ArrayList<>();
        for (String s: strings ) {
            result.add(s);

            if (s.contains("р") && !s.contains("л")) {
                result.remove(s);
            }

            if (s.contains("л") && !s.contains("р")) {
                result.add(s);
            }
        }

        return result;
    }
}
