package Seminar_1_Hw;

public class Bread extends Eat_goods {
    protected String flour_type;
    public Bread(String name, int price, int amount, String unit, int exp_date, String flour_type) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
        this.exp_date = exp_date;
        this.flour_type = flour_type;

}
public String getInfo() {
    return String.format("Название: %s\nЦена: %d\nКоличество на складе: %d,%s\nСрок годности: %d\nТип муки: %s",
            this.name, this.price, this.amount, this.unit, this.exp_date, this.flour_type);
}
}