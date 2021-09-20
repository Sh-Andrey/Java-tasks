/* 
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок (символ из горизонтальной строки не учитывается).
*/

public class Solution {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.print(8);
        }
        System.out.println();
        for(int i = 1; i <= 10; i++){
            System.out.println(8);
        }        

    }
}
