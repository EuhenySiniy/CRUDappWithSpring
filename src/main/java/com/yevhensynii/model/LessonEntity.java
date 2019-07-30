package com.yevhensynii.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

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
@Table(name = "lesson")
public class LessonEntity extends CreatableEntity {
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "lesson")
    private List<CommentEntity> commentEntities = new ArrayList<>();
}
