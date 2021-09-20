/* 
Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
*/

public class Solution {
    public static int min(int a, int b, int c, int d) {
        int q;
        int w = min(a, b);
        if (w < c)  q = w;
        else        q = c;
            if (q < d)  q = q;
            else        q = d;
        return q;   
    }

    public static int min(int a, int b) {
        int t;
        if (a < b)  t = a;
        else        t = b;
        return t;    
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
