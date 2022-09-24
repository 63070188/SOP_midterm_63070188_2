package com.example.sop_midterm_63070188_2.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.io.Serializable;

@Data
@Document("Product")
public class Product implements Serializable {
    @Id
    private String _id;
    private String productName;
    private double productCost;
    private double productProfit;
    private double productPrice;

    public Product() {
    }

    public Product(String _id, String productName, double productCost, double productProfit, double productPrice) {
        this._id = _id;
        this.productName = productName;
        this.productCost = productCost;
        this.productProfit = productProfit;
        this.productPrice = productPrice;
    }
}
