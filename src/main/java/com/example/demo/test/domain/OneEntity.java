package com.example.demo.test.domain;

import org.hibernate.annotations.BatchSize;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "one_entity")
public class OneEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String comment;

    @OneToMany(mappedBy = "oneEntity", fetch = FetchType.LAZY)
    private List<ManyEntity> manyEntities;

    public OneEntity() {}

    public OneEntity(int i, String comment) {
        this.id = i;
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<ManyEntity> getManyEntities() {
        return manyEntities;
    }

    public void setManyEntities(List<ManyEntity> manyEntities) {
        this.manyEntities = manyEntities;
    }
}
