import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inum = Integer.parseInt(reader.readLine());
        
        if(inum > 0 && inum < 8){
            String[] dni = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
                System.out.println(dni[(inum - 1)]);
        }
        else
            System.out.println("такого дня недели не существует");
    }
}
