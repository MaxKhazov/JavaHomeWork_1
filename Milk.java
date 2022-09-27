package Seminar_1_Hw;

public class Milk extends Drinks {
    protected double percent;
    protected int exp_date;
    public Milk(String name, int price, int amount, String unit, double volume, double percent, int exp_date) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
        this.volume = volume;
        this.percent = percent;
        this.exp_date = exp_date;

}
public String getInfo() {
    return String.format("Название: %s\nЦена: %d\nКоличество на складе: %d,%s\nОбъем: %f\nЖирность: %f\nСрок годности: %d ",
            this.name, this.price, this.amount, this.unit, this.volume, this.percent, this.exp_date);
}

}