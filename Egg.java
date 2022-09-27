package Seminar_1_Hw;

public class Egg extends Eat_goods {
    protected int count_eggs;
    public Egg(String name, int price, int amount, String unit, int exp_date, int count_eggs) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
        this.exp_date = exp_date;
        this.count_eggs = count_eggs;
}
public String getInfo() {
    return String.format("Название: %s\nЦена: %d\nКоличество на складе: %d,%s\nСрок годности: %d\nКоличество штук в упаковке: %d",
            this.name, this.price, this.amount, this.unit, this.exp_date, this.count_eggs);
}
}