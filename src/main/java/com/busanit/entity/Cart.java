package com.busanit.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@ToString
public class Cart {
    @Id
    @Column(name = "cart_id")   // pk
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "member_id", nullable = false)    // fk, nullable = false inner join
    private Member member;

    @OneToMany(mappedBy = "cart")
    private List<CartItem> cartItem = new ArrayList<>();
}
