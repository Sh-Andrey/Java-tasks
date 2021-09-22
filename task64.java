/* 
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("Ivan", 40, "buhalovo");
        System.out.println(man);
        Man man1 = new Man("Ivan", 40, "buhalovo");
        System.out.println(man1);

        Woman woman = new Woman("Inka", 20, "Berulevo");
        System.out.println(woman);
        Woman woman1 = new Woman("Inka", 20, "Berulevo");
        System.out.println(woman1);
    }

    public static class Man{
        String name, address;
        int age;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return (name + " " + age + " " + address);
        }
    }

    public static class Woman{
        String name, address;
        int age;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return (name + " " + age + " " + address);
        }
    }
}
