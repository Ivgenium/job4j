package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;
    public Item() {
    }
    public Item(int id) {
        this.id = id;
    }
    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public static void main(String[] args) {
        Item gadget = new Item();
        gadget = new Item(0);
        gadget = new Item(1, "No name");
    }
}
