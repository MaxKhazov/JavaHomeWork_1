package Seminar_1_Hw;

public class ToiletPaper extends Hygiene {
    protected int count_layer;
    public ToiletPaper(String name, int price, int amount, String unit, int count_inside, int count_layer) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
        this.count_inside = count_inside;
        this.count_layer = count_layer;
}
public String getInfo() {
    return String.format("Название: %s\nЦена: %d\nКоличество на складе: %d,%s\nКоличество штук в упаковке: %d\nКоличество слоёв: %d",
            this.name, this.price, this.amount, this.unit, this.count_inside, this.count_layer);
}
}
