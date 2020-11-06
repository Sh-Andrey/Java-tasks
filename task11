import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ввести с клавиатуры три числа а, b, c - стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам.
Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int intriangle1 = Integer.parseInt(reader.readLine());
        int intriangle2 = Integer.parseInt(reader.readLine());
        int intriangle3 = Integer.parseInt(reader.readLine());
        
        if((intriangle1 < intriangle2+intriangle3) & (intriangle3 < intriangle2 + intriangle1) & (intriangle2 < intriangle1 + intriangle3)){
            System.out.println("Треугольник существует.");    
        }
        else
            System.out.println("Треугольник не существует.");        
    }
}
