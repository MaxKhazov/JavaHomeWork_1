package Seminar_1_Hw;

public class Pampers extends Kids {
    protected int size;
    protected int min_weight;
    protected int max_weight;
    protected String type;

    public Pampers(String name, int price, int amount, String unit,
     int min_age, String hyp_all, int size, int min_weight, int max_weight, String type) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
        this.min_age = min_age;
        this.hyp_all = hyp_all;
        this.size = size;
        this.min_weight = min_weight;
        this.max_weight = max_weight;
        this.type = type;
}
public String getInfo() {
    return String.format("Название: %s\nЦена: %d\nКоличество на складе: %d,%s\nМинимальный возраст: %d\nГиппоаллергенность: %s\nРазмер: %d\nМинимальный вес: %d\nМаксимальный вес: %d\nТип: %s",
            this.name, this.price, this.amount, this.unit,this.min_age, this.hyp_all, this.size, this.min_weight, this.max_weight, this.type);
}
}