package com.example.demo.test.domain;

import org.checkerframework.checker.units.qual.C;

import javax.persistence.*;

@Entity
public class ManyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column()
    private String comment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "one_entity_id", foreignKey = @ForeignKey(name = "FK_ONE_ENTITY"))
    private OneEntity oneEntity;

    public ManyEntity() {}

    public ManyEntity(int i, String comment, OneEntity oneEntity) {
        this.id = i;
        this.comment = comment;
        this.oneEntity = oneEntity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public OneEntity getOneEntity() {
        return oneEntity;
    }

    public void setOneEntity(OneEntity oneEntity) {
        this.oneEntity = oneEntity;
    }
}
