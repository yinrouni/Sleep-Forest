package com.CS5520.sleepforest;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "shop")
public class Shop {

    @PrimaryKey(autoGenerate = false)
    @NonNull
    @ColumnInfo(name="shopId")
    private int shopId;

    @ColumnInfo(name="totalCoins")
    private int totalCoins;


    public Shop(int shopId, int totalCoins){
        this.totalCoins = totalCoins;
        this.shopId = shopId;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getTotalCoins() {
        return totalCoins;
    }

    public void setTotalCoins(int totalCoins) {
        this.totalCoins = totalCoins;
    }
}


