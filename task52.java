import java.util.Comparator;
import java.lang.Comparable;
/* 
Реализуй метод boolean fight(Cat anotherCat):
продумай механизм драки котов в зависимости от их веса, возраста и силы.
Сравни каждый критерий по отдельности, чтобы победителем был тот, у кого были лучшие показатели по большинству критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если проиграли.
Если ничья и никто не выиграл, возвращаем false.
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {

        int pointage = Integer.compare(this.age, anotherCat.age);
        int pointweight = Integer.compare(this.weight, anotherCat.weight);
        int pointstrengt = Integer.compare(this.strength, anotherCat.strength);

        int point = pointage + pointweight + pointstrengt;
        return point > 0;
    }

    public static void main(String[] args) {

    }
}
