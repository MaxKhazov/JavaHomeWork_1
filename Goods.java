package Seminar_1_Hw;

import java.util.Random;

public class Goods {
    protected static Random r;
    protected String name;
    protected int price;
    protected int amount;
    protected String unit;

    public String getInfo() {
        return String.format("Название: %s\nЦена: %d\nКоличество на складе: %d,%s\n ",
                this.name, this.price, this.amount, this.unit);
    }

    // public Goods(String name, int price, int amount, String unit) {
    //     this.name = name;
    //     this.price = price;
    //     this.amount = amount;
    //     this.unit = unit;
    // }





}

