import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());

        if(num1 > 0 & num2 > 0)
            System.out.println(1);
        else if(num1 < 0 & num2 > 0)
            System.out.println(2);
        else if(num1 < 0 & num2 < 0)
            System.out.println(3);
        else if(num1 > 0 & num2 < 0)
            System.out.println(4);
    }
}
