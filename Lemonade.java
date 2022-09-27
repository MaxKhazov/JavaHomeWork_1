package Seminar_1_Hw;

public class Lemonade extends Drinks {
    public Lemonade(String name, int price, int amount, String unit, double volume) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
        this.volume = volume;
}
public String getInfo() {
    return String.format("Название: %s\nЦена: %d\nКоличество на складе: %d,%s\nОбъем: %f",
            this.name, this.price, this.amount, this.unit, this.volume);
}
}
