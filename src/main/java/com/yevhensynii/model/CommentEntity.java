package com.yevhensynii.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "comment")
public class CommentEntity extends CreatableEntity {
    @Column(name = "content")
    private String content;

    @Column(name = "author_id")
    private long authorId;

    @ManyToOne
    private LessonEntity lessonEntity;
}
