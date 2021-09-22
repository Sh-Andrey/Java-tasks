/* 
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес (чужой домашний кот)

Задача инициализатора - сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касается возраста и цвета.
А вот имени может и не быть (null).
То же касается адреса: null.
*/

public class Cat {
    
    String name;
    int age;
    int weight;
    String address;
    String color;
    
    public void initialize(String name){
        this.name = name;
        this.age = 5;
        this.weight = 70;
        this.color = "green";
        
    }
    
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "black";
    }
    
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.color = "cean";
    }
    
    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 4;
    }
    
    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 2;
    }
}
