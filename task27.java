/* 
Создай объект типа Cat (кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
Присвой каждому животному владельца (owner).
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.owner = new Woman();
        Dog dog = new Dog();
        dog.owner = new Woman();
        Fish fish = new Fish();
        fish.owner = new Woman();
        Woman Woman = new Woman();
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
