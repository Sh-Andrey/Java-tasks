/* 
Напишите метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
       
        if(month == 1 || month == 2 || month == 12)
            System.out.println("зима");
        if(month == 3 || month == 4 || month == 5)
            System.out.println("весна");
        if(month == 6 || month == 7 || month == 8)  
            System.out.println("лето");
        if(month == 9 || month == 10 || month == 11)	
            System.out.println("осень");
    }
}
