/* 
Создать 5 зергов, 3 протосса и 4 террана.
Дать им всем уникальные имена.
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zergy1 = new Zerg();
            zergy1.name = "byby";
        Zerg zergy2 = new Zerg();
            zergy2.name = "yby";
        Zerg zergy3 = new Zerg();
            zergy3.name = "byb";
        Zerg zergy4 = new Zerg();
            zergy4.name = "byy";
        Zerg zergy5 = new Zerg();
            zergy5.name = "by";
        Protoss protos1 = new Protoss();
            protos1.name = "gugu";
        Protoss protos2 = new Protoss();
            protos2.name = "ugu";
        Protoss protos3 = new Protoss();
            protos3.name = "guu";
        Terran terranus1 = new Terran();
            terranus1.name = "ololo";
        Terran terranus2 = new Terran();
            terranus2.name = "oolo";
        Terran terranus3 = new Terran();
            terranus3.name = "olo";
        Terran terranus4 = new Terran();
            terranus4.name = "ol";
        //напишите тут ваш код

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
