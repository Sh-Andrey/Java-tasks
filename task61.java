/* 
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов initialize(...)
*/

public class Rectangle {

    int top, left, width, height;

    public void initialize(int top, int left, int width, int height){
        this.top = 0;
        this.left = 0;
        this.width = width;
        this.height = height;
    }

    public void initialize(int left, int top, int width){
        this.top = top;
        this.left = 0;
        this.width = width;
        this.height = 0;
    }

    public void initialize(int width, int top){
        this.top = top;
        this.left = 0;
        this.width = width;
        this.height = height;
    }

    public void initialize(int width){
        this.top = 0;
        this.left = 0;
        this.width = width;
        this.height = 0;
    }

    public static void main(String[] args) {

    }
}
