/* 
Написать функцию, которая вычисляет минимум из трёх чисел.
*/

public class Solution {
    public static int min(int a, int b, int c) {
        int t;
        if (a < b)  t = a;
        else        t = b;
            if (t < c)  t = t;
            else        t = c;
        return t;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
