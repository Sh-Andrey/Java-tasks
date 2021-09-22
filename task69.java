/* 
В конструкторе класса Cat [public Cat()] увеличивать счётчик котов (статическую переменную этого же класса catCount) на 1. В методе finalize уменьшать на 1.
*/

public class Cat {
    public static int catCount = 0;

    public Cat(){
        catCount++;
    }

    @Override
    protected void finalize() throws Throwable {
        Cat.catCount = catCount;
        catCount--;
    }

    public static void main(String[] args) {

    }
}
