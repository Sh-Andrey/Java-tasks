/* 
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
Вывести на экран полученную сумму.

Подсказка: реализовать считывание с клавиатуры, пока не будет введена определенная строка, например "exit", можно с помощью следующей конструкции:
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        while (true) {
            String s = reader.readLine();
                if (s.equals("сумма")) {
                    System.out.println(sum);
                    return;
                }
            int num = Integer.parseInt(s);
            sum += num;
        }
    }
}
