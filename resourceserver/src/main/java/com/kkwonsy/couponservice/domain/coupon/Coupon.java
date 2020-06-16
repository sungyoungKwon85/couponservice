package com.kkwonsy.couponservice.domain.coupon;

import com.kkwonsy.couponservice.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Coupon extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200, nullable = false)
    private String name;

    private LocalDateTime expireDate;

    @Builder
    public Coupon(String name, LocalDateTime expireDate) {
        this.name = name;
        this.expireDate = expireDate;
    }
}
