package by.jrr.VladtgBot.bean;

import java.io.Serializable;
import java.util.Objects;

public class ProductNastolkiBy implements Serializable {
    private static final long serialVersionUID = 1L;

    private String title;
    private String price;
    private String age;
    private String quantity;
    private String link;

    public ProductNastolkiBy() {
    }


    public ProductNastolkiBy(String title, String price, String age, String quantity, String link) {
        this.title = title;
        this.price = price;
        this.age = age;
        this.quantity = quantity;
        this.link = link;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductNastolkiBy that = (ProductNastolkiBy) o;
        return Objects.equals(title, that.title) &&
                Objects.equals(price, that.price) &&
                Objects.equals(age, that.age) &&
                Objects.equals(quantity, that.quantity) &&
                Objects.equals(link, that.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, age, quantity, link);
    }

    @Override
    public String toString() {
        return "ProductNastolkiBy{" +
                "title='" + title + '\'' +
                ", price='" + price + '\'' +
                ", age='" + age + '\'' +
                ", quantity='" + quantity + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
