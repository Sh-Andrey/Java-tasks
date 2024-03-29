/* 
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numBig = new ArrayList<Integer>();
        ArrayList<Integer> num2 = new ArrayList<Integer>();
        ArrayList<Integer> num3 = new ArrayList<Integer>();
        ArrayList<Integer> num4 = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 20; i++) {
            numBig.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < 20; i++) {
            int number = numBig.get(i);

            if ((number % 3 == 0) || (number % 2 == 0)) {
                if (number % 3 == 0) {
                    num2.add(number);
                }
                if (number % 2 == 0) {
                    num3.add(number);
                }
            } else {
                num4.add(number);
            }
        }

        printList(num2);
        printList(num3);
        printList(num4);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer number : list) {
            System.out.println(number);
        }
    }
}
