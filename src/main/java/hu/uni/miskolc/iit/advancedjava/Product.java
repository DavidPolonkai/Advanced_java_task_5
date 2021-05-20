package hu.uni.miskolc.iit.advancedjava;

public class Product {

    private final String name;

    private int price;

    private CurrencyType currency;

    public Product(String name, int price) {
        super();
        this.name=name;
        this.price = price;
    }

    public static int comparePrice(Product p1, Product p2) {
        return Integer.compare(p1.price, p2.price);
    }

    public CurrencyType getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyType newCurrency) {
        if (this.currency == null){
            this.currency = newCurrency;
        }
        else if (isItChange(newCurrency)) {
            this.price = calculateNewPrice(newCurrency);
            this.currency = newCurrency;
        }

    }

    private boolean isItChange(CurrencyType newCurrency) {
        return !newCurrency.equals(this.currency);
    }

    private int calculateNewPrice(CurrencyType newCurrency) {
        return this.price/this.currency.getExchange()*newCurrency.getExchange();
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", currency=" + currency +
                '}';
    }
}
