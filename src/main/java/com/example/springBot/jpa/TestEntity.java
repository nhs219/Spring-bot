package com.example.springBot.jpa;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test")
@Getter
@NoArgsConstructor
public class TestEntity {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Builder
    public TestEntity(long id, String name) {
        this.id= id;
        this.name=name;
    }
}
