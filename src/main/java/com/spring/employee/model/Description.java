package com.spring.employee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "description")
public class Description {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable=false)
    private String title;

    @Column(nullable=false)
    private String description;

    // @OneToOne
    // @JoinColumn(name = "user_id")
    // private User user;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
   
}
