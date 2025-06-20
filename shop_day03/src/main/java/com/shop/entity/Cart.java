package com.shop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "cart")
@Getter
@Setter
@ToString
public class Cart {
    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne// 1:1 맵핑
    @JoinColumn(name = "member_id") // JoinColumn 매핑할 외래키를 지정합니다. 외래키 이름을 설정
    private Member member;
}
