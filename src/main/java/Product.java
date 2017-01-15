/**
 * Created by Дашуля on 15.01.2017.
 */
public class Product {
    private String name;
    private String category;
    private Integer fixedPrice;
    private Integer summaryPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getFixedPrice() {
        return fixedPrice;
    }

    public void setFixedPrice(Integer fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    public Integer getSummaryPrice() {
        return summaryPrice;
    }

    public void setSummaryPrice(Integer summaryPrice) {
        this.summaryPrice = summaryPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", fixedPrice=" + fixedPrice +
                ", summaryPrice=" + summaryPrice +
                '}';
    }
}
