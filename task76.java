import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dedyliName = reader.readLine();
        Cat catdedyli = new Cat(dedyliName);

        String babyliName = reader.readLine();
        Cat catbabyli = new Cat(babyliName);

        String papaName = reader.readLine();
        Cat catpapa = new Cat(papaName, catdedyli, null);

        String mamaName = reader.readLine();
        Cat catmama = new Cat(mamaName, null, catbabyli);

        String sonName = reader.readLine();
        Cat catson = new Cat(sonName, catpapa, catmama);

        String dochName = reader.readLine();
        Cat catdoch = new Cat(dochName, catpapa, catmama);

        System.out.println(catdedyli);
        System.out.println(catbabyli);
        System.out.println(catpapa);
        System.out.println(catmama);
        System.out.println(catson);
        System.out.println(catdoch);
    }

    public static class Cat {
        private String name;
        private Cat parent1;
        private Cat parent2;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent1, Cat parent2) {
            this.name = name;
            this.parent1 = parent1;
            this.parent2 = parent2;
        }

        @Override
        public String toString() {
            if (parent1 == null) {
                if (parent2 == null) {
                    return "The cat's name is " + name + ", no mother, no father ";
                } else {
                    return "The cat's name is " + name + ", mother is " + parent2.name + ", no father";
                }
            } else {
                if (parent2 == null) {
                    return "The cat's name is " + name + ", no mother, father is " + parent1.name;
                } else {
                    return "The cat's name is " + name + ", mother is " + parent2.name + ", father is " + parent1.name;
                }
            }
        }
    }

}
