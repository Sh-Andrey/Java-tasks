import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
"четное однозначное число" - если число четное и имеет одну цифру,
"нечетное однозначное число" - если число нечетное и имеет одну цифру,
"четное двузначное число" - если число четное и имеет две цифры,
"нечетное двузначное число" - если число нечетное и имеет две цифры,
"четное трехзначное число" - если число четное и имеет три цифры,
"нечетное трехзначное число" - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(reader.readLine());
        
        String onenum, twonum = "";
        
        if(num % 2 == 0 && num > 0 && num < 1000) 
        {   
            if(num / 10 == 0 ) twonum = "однозначное";
            else if (num / 100 == 0) twonum = "двузначное";
            else if(num / 1000 == 0) twonum = "трехзначное";
        
            System.out.println("четное " + twonum +" число");
        } 
        else if (num % 2 != 0 && num > 0 && num < 1000)
        {
            if(num / 10 == 0 ) twonum = "однозначное";
            else if (num / 100 == 0) twonum = "двузначное";
            else if(num / 1000 == 0) twonum = "трехзначное";
        
            System.out.println("нечетное " + twonum +" число");
        }
    }
}
