/* 
Написать функцию, которая возвращает минимум из двух чисел.
*/

public class Solution {
    public static int min(int a, int b) {
        int t;
        if (a < b) t = a;
        else       t = b;
        return t;
    }

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
