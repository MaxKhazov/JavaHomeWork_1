package Seminar_1_Hw;

public class Pacifier extends Kids{
    public Pacifier(String name, int price, int amount, String unit,
     int min_age, String hyp_all) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
        this.min_age = min_age;
        this.hyp_all = hyp_all;
    
}
public String getInfo() {
    return String.format("Название: %s\nЦена: %d\nКоличество на складе: %d,%s\nМинимальный возраст: %d\nГиппоаллергенность: %s",
            this.name, this.price, this.amount, this.unit,this.min_age, this.hyp_all);
}
}