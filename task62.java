/* 
Создать class Person. У человека должно быть имя String name, возраст int age.
Добавь метод initialize(String name, int age), в котором проинициализируй переменные name и age.
В методе main создай объект Person, занеси его ссылку в переменную person.
Вызови метод initialize с любыми значениями.
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Puh", 5);
    }

    static class Person {
        private String name;
        private int age;

        public void initialize(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
}
