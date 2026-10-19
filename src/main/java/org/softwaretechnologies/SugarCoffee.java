package org.softwaretechnologies;


// TODO: 09.12.2024 /**
//     Создайте класс SugarCoffee, поддерживающий интерфейс CofeIntrface
//     к стоимости базового напитка добавьте 20.
//     к описанию добавьте " + sugar"
//     */
<<<<<<< HEAD
public class SugarCoffe implements CoffeeInterface {
    private CoffeeInterface coffee;
=======

public class SugarCoffee implements CoffeeInterface {

    private CoffeeInterface coffee;

    public SugarCoffee(CoffeeInterface coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 20;
    }

    @Override
    public String description() {
        return coffee.description() + " + sugar";
    }
>>>>>>> 78c4c60 (Task 6 20.10)

}
public class SugarCoffee(CoffeeInterface coffee) {
    this.coffee = coffee;
}
@Override
