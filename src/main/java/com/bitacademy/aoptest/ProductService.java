package com.bitacademy.aoptest;

import org.springframework.stereotype.Service;

// Component Scan
@Service
public class ProductService {
   public ProductVo findProduct(String keyword) {
      System.out.println("상품 ["+ keyword + "]을 찾고 있습니다.");
      //로직 진행(DAO 등)
      //에러 발생 시뮬레이션
      if (1 < 2) { // true
    	  throw new RuntimeException("Exception 발생!");
      }
      return new ProductVo(keyword);
   }
}
