package com.kkwonsy.couponservice.domain.coupon;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CouponRepositoryTest {

    @Autowired
    private CouponRepository couponRepository;

    @AfterEach
    public void cleanUp() {
        couponRepository.deleteAll();
    }

    @Test
    public void save_coupon_and_load_it() throws Exception {
        // given
        String name = "Discount 10%!";
        LocalDateTime expireDate = LocalDateTime.now().plusDays(10);

        couponRepository.save(
                Coupon.builder()
                .name(name)
                .expireDate(expireDate)
                .build());

        // when
        List<Coupon> coupons = couponRepository.findAll();

        // then
        Coupon coupon = coupons.get(0);
        assertThat(coupon.getName()).isEqualTo(name);
        assertThat(coupon.getExpireDate()).isEqualTo(expireDate);
    }


}