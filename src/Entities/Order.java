package Entities;

import java.util.Date;

public class Order {

    // Instance to get a date to "order moment"
    Date date = new Date();


    public Date getDate(){
        return date;
    }

    public void addItem(){}

    public void remoteItem(){}

    public Double total(Double price, Integer quantity){
        return price * quantity;
    }

}
