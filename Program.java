package Seminar_1_Hw;

public class Program {
    public static void main(String[] args) {
        Egg eggs = new Egg("Хохольские", 80, 2400, "штук", 25, 10 );
        Milk Mymilk = new Milk("Простоквашино", 75, 60, "штук", 0.9, 3.2, 25);
        Pampers MyPampers = new Pampers("Huggies", 1299, 21, "упаковок", 1, "Да", 4, 9, 14, "Подгузники-Трусики");
        System.out.println(eggs.getInfo());
        System.out.println("------------------");
        System.out.println(Mymilk.getInfo());
        System.out.println("------------------");
        System.out.println(MyPampers.getInfo());
    }
}
