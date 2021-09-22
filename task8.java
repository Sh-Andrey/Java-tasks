import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 
        int inum = Integer.parseInt(reader.readLine());
        
        if(inum >= 0) {
            inum = inum * 2;
                System.out.println(inum);
        }
        else {
            inum = inum + 1;
                System.out.println(inum);
        }
    }

}
