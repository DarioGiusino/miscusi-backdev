package org.miscusi.backdev.pojo;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Float totalPrice;

    private String address;

    private Boolean isPaid;

    @ManyToMany(mappedBy = "orders")
    @JsonManagedReference
    private List<Product> products;

    public OrderEntity() {
    }

    public OrderEntity(Float totalPrice, String address, Boolean isPaid) {
        setTotalPrice(totalPrice);
        setAddress(address);
        setIsPaid(isPaid);
    }

    public OrderEntity(Float totalPrice, String address, Boolean isPaid, Product... products) {
        this(totalPrice, address, isPaid);
        setProducts(products);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setProducts(Product[] products) {
        setProducts(Arrays.asList(products));
    }
}
