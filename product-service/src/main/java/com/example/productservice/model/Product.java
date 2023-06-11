package com.example.productservice.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Product {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String description;
  private BigDecimal price;
}

