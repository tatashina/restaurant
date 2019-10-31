package main.java.ru.antora.restaurant.model;

/**
 * Класс Ресторан содержит имя ресторана.
 */
public class Restaurant {
    private String restaurantName;

    public Restaurant() {

    }

    public Restaurant(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Restaurant(Restaurant restaurant) {
        this(restaurant.restaurantName);
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }


}
