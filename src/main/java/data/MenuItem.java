package data;

public abstract class MenuItem {
    public String description;


    public MenuItem(String description) {
        this.description = description;
    }

    public abstract double getPrice();
}
