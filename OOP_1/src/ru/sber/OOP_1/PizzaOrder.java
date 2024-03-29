package ru.sber.OOP_1;

public class PizzaOrder {
    private String name;
    private String address;

    private PizzaSize size;

    private boolean withSauce;

    private boolean inProgress = false;

    private String formatOrder() {
        return String.format("%s пицца %s%s на адрес %s", size, name, withSauce ? " с соусом" : "", address);
    }

    public PizzaOrder(String name, String address, PizzaSize size, boolean withSauce) {
        this.name = name;
        this.address = address;
        this.size = size;
        this.withSauce = withSauce;
    }

    public void order() {
        if (inProgress) {
            System.out.println("Заказ уже принят");
            return;
        }

        System.out.format("Заказ принят: %s\n", formatOrder());
        inProgress = true;
    }

    public void cancel() {
        if (inProgress) {
            System.out.format("Заказ отменен: %s\n", formatOrder());
            inProgress = false;
            return;
        }
        System.out.println("Заказ не был принят");
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public PizzaSize getSize() {
        return size;
    }


    public void setSize(PizzaSize size) {
        this.size = size;
    }


    public boolean withSauce() {
        return withSauce;
    }


    public void setSauce(boolean withSauce) {
        this.withSauce = withSauce;
    }

    public String toString() {
        return String.format("%s пицца %s%s на адрес %s.",
                size, name, withSauce ? " с соусом" : "", address);
    }




}
