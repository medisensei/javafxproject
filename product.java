package sample;

import javafx.fxml.FXML;

public class product {

    String productname;
    String price;
    String gain;

public String getproductname () {
    return productname;
}

    public void setproductname(String productname){
        this.productname=productname;
    }

    public String getprice () {
        return price;
    }

    public void setprice(String price){
        this.price=price;
    }
    public String getgain () {
        return gain;
    }

    public void setgain(String gain) {
        this.gain = gain;
    }

    public product(String productname,String price,String gain)
    {
        this.productname=productname;
        this.price=price;
        this.gain=gain;

    }

    public product()
    {}

}
