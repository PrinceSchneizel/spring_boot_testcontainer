package com.example.d2;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class D2entity {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String value;
}
