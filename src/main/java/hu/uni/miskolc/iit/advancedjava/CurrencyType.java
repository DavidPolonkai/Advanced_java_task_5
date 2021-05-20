package hu.uni.miskolc.iit.advancedjava;

public enum CurrencyType {
    EUR(1),
    HUF(300);

    private final int exchange;

    CurrencyType(int exchange){
        this.exchange=exchange;
    }

    public int getExchange(){
        return this.exchange;
    }

}
