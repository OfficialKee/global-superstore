package com.ltp.globalsuperstore;
import java.util.Date;
import java.util.Objects;
public class Item {
    
    private String category;
    private String name;
    private Double price;
    private Double discount;
    private Date date;


    public Item() {
    }

    public Item(String category, String name, Double price, Double discount, Date date) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.date = date;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return this.discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Item category(String category) {
        setCategory(category);
        return this;
    }

    public Item name(String name) {
        setName(name);
        return this;
    }

    public Item price(Double price) {
        setPrice(price);
        return this;
    }

    public Item discount(Double discount) {
        setDiscount(discount);
        return this;
    }

    public Item date(Date date) {
        setDate(date);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Item)) {
            return false;
        }
        Item product = (Item) o;
        return Objects.equals(category, product.category) && Objects.equals(name, product.name) && Objects.equals(price, product.price) && Objects.equals(discount, product.discount) && Objects.equals(date, product.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, name, price, discount, date);
    }

    @Override
    public String toString() {
        return "{" +
            " category='" + getCategory() + "'" +
            ", name='" + getName() + "'" +
            ", price='" + getPrice() + "'" +
            ", discount='" + getDiscount() + "'" +
            ", date='" + getDate() + "'" +
            "}";
    }

}
