package com.example.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table


public class Items {
    @Id
    @Column
    private int itemId;
    private String itemName;
    @Column
    private String maker;
    @Column
    private int price;
    public int getItemId(){
        return itemId;
    }
    public void setitemId(int itemId){
        this.itemId=itemId;
    }
    public String getItemName(){
        return itemName;
    }
    public void setItemName(String itemName){
        this.itemName=itemName;
    }
    public String getMaker(){
        return maker;
    }
    public void setMaker(String maker){
        this.maker=maker;
    }


}
