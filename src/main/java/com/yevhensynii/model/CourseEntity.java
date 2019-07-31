package com.yevhensynii.model;

import com.yevhensynii.model.parent.CreatableEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<SectionEntity> sectionEntities = new ArrayList<>();
}
