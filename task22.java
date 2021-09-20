/* 
Напиши код метода convertEurToUsd, который переводит евро в доллары по заданному курсу.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(13, 50));
        System.out.print(convertEurToUsd(50, 40));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur * exchangeRate;
    }
}
