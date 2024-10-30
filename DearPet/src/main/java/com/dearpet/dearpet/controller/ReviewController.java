package com.dearpet.dearpet.controller;

import com.dearpet.dearpet.dto.ReviewDTO;
import com.dearpet.dearpet.service.ReviewService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/*
 * Review Controller
 * @Author ghpark
 * @Since 2024.10.28
 */
@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    // 상품 리뷰 목록 조회
    @GetMapping("/reviews")
    public List<ReviewDTO> getAllReviewsByProductId(@RequestParam("productId") Long productId) {
        return reviewService.getReviewsByProductId(productId);
    }

    // 리뷰 상세 정보 조회
    @GetMapping("/reviews/{reviewId}")
    public ReviewDTO getReview(@PathVariable("reviewId") Long reviewId) {
        return reviewService.getReviewById(reviewId);
    }

    // 상품 리뷰 작성
    @PostMapping("/products/{productId}/reviews")
    public ReviewDTO createReview(@RequestParam Long userId, @PathVariable("productId") Long productId, @RequestBody ReviewDTO reviewDTO) {
        return reviewService.createReview(userId, productId, reviewDTO);
    }

    // 리뷰 수정
    @PatchMapping("reviews/{reviewId}")
    public ReviewDTO updateReview(@PathVariable("reviewId") Long reviewId, @RequestBody ReviewDTO reviewDTO) {
        return reviewService.updateReview(reviewId, reviewDTO);
    }

    // 리뷰 삭제
    @DeleteMapping("reviews/{reviewId}")
    public void deleteReview(@PathVariable("reviewId") Long reviewId) {
        reviewService.deleteReview(reviewId);
    }
}