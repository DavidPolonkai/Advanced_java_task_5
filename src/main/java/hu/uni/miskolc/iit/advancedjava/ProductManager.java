package hu.uni.miskolc.iit.advancedjava;

public class ProductManager {
    public void changeCurrency(Product[] array) {
        for (Product item : array) {
            if (item.getCurrency().equals(CurrencyType.EUR)) {
                item.setCurrency(CurrencyType.HUF);
            }
            else if (item.getCurrency().equals(CurrencyType.HUF)) {
                item.setCurrency(CurrencyType.EUR);
            }
        }
    }
}
