package com.example.project.entities.pk;

import com.example.project.entities.Order;
import com.example.project.entities.Product;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class OrderItemPK implements Serializable {
    private static final Long serialVersionUID = 1L;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItemPK that)) return false;

        return getOrder() != null ? getOrder().equals(that.getOrder()) : that.getOrder() == null;
    }

    @Override
    public int hashCode() {
        return getOrder() != null ? getOrder().hashCode() : 0;
    }
}
