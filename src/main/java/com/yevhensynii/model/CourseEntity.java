package com.yevhensynii.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "course")
public class CourseEntity extends CreatableEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "cost")
    private int cost;

    private List<SectionEntity> sectionEntities = new ArrayList<>();
}
