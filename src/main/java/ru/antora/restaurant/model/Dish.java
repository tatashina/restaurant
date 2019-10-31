package main.java.ru.antora.restaurant.model;

/**
 * Структура хранения наименования еды и её стоимости + внешний ключ к Menu.
 */
public class Dish {

    private String name;

    private Integer price;

    private Menu menu;

    public Dish() {

    }

    public Dish(String name, Integer price, Menu menu) {
        this.name = name;
        this.price = price;
        this.menu = menu;
    }

    public Dish(Dish dish) {
        this(dish.name, dish.price, dish.menu);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
