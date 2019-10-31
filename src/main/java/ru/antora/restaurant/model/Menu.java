package main.java.ru.antora.restaurant.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Структура хранения меню ресторана. Содержит дату создания/(обновления?) + ссылку на ресторан.
 *
 */
public class Menu {
    private Restaurant restaurant;

    private LocalDate date;

    public Menu() {

    }

    public Menu(Restaurant restaurant, LocalDate date) {
        super();
        this.restaurant = restaurant;
        this.date = date;
    }

    public Menu(Menu menu) {
        this(menu.restaurant, menu.date);
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
