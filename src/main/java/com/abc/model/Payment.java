package com.abc.model;

import jakarta.persistence.*;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private Order order;

    private String paymentMethod;
    private boolean paymentStatus;

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }

    public boolean isPaymentStatus() { return paymentStatus; }
    public void setPaymentStatus(boolean paymentStatus) { this.paymentStatus = paymentStatus; }
}
