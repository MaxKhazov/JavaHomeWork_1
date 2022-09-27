package Seminar_1_Hw;

public class Mask extends Hygiene {
    public Mask(String name, int price, int amount, String unit, int count_inside) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
        this.count_inside = count_inside;
}
public String getInfo() {
    return String.format("Название: %s\nЦена: %d\nКоличество на складе: %d,%s\nКоличество штук в упаковке: %d",
            this.name, this.price, this.amount, this.unit, this.count_inside);
}
}