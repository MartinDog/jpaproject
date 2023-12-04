package com.jpaproject.jpaproject;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity//엔터티에 연결시킬거
@Table(name="COURSES")//맵핑할 DB테이블 명
// @NamedQuery(
//     name="Course.findAllByCategoryAndRating",
//     query="select c from Course c where c.category=?1 and c.rating=?2"
// )
//쿼리 추가
// @NamedQueries({
//     @NamedQuery(name="Course.findAllByRating",query="select c from Course c where c.category=?1 and c.rating=?2"),
//     @NamedQuery(name="Course.findAllByCategoryAndRating", query="select c from Course c where c.category=?1 and c.rating=?2")
// })
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Course {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name="category")
    private String category;
    @Column(name="rating")
    private Integer rating;
    @Column(name="description")
    private String description;
    public Course(String name,String category,int rating,String description){
        this.name=name;
        this.category=category;
        this.rating = Integer.valueOf(rating);
        this.description = description;
    }
}
