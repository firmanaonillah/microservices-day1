package com.example.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Integer totalQuantity;
    private Integer totalPrice;
    @OneToMany(targetEntity=OrderItem.class, fetch=FetchType.EAGER)
    private List<OrderItem> orderItemLists;

}