package com.dearpet.dearpet.dto;

import com.dearpet.dearpet.entity.Product;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/*
 * Product DTO
 * @Author 위지훈
 * @Since 2024.10.25
 */
@Getter
@Setter
public class ProductDTO {
    private Long productId;                // PK
    private String name;                   // 상품명
    private BigDecimal price;              // 상품 가격
    private String description;            // 상품 상세 설명
    private String image;                  // 상품 이미지
    private int quantity;                  // 상품 수량
    private Product.ProductStatus status;  // 상품 상태
    private Long categoryId;               // 카테고리 Id

    // 기본 생성자
    public ProductDTO() {
    }

    // 생성자
    public ProductDTO(Long productId, String name, BigDecimal price, String description, String image, int quantity, Product.ProductStatus status, Long categoryId) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
        this.quantity = quantity;
        this.status = status;
        this.categoryId = categoryId;
    }
}
