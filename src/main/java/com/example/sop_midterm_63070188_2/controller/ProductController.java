package com.example.sop_midterm_63070188_2.controller;

import com.example.sop_midterm_63070188_2.pojo.Product;
import com.example.sop_midterm_63070188_2.service.ProductService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @RabbitListener(queues = "AddProductQueue")
    public boolean serviceAddProduct(Product product){
        try {
            service.addProduct(product);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @RabbitListener(queues = "UpdateProductQueue")
    public boolean serviceUpdateProduct(Product product){
        try {
            service.updateProduct(product);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @RabbitListener(queues = "DeleteProductQueue")
    public boolean serviceDeleteProduct(Product product){
        try {
            service.deleteProduct(product);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @RabbitListener(queues = "GetNameProductQueue")
    public Product serviceGetProductName(String name){
        try {
            return  service.getProductByName(name);
        }catch (Exception e){
            return null;
        }
    }

    @RabbitListener(queues = "GetAllProductQueue")
    public List<Product> serviceGetAllProduct(){
        try {
            return  service.getAllProduct();
        }catch (Exception e){
            return null;
        }
    }
}
