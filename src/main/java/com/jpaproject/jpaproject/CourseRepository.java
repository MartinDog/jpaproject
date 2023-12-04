package com.jpaproject.jpaproject;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

import java.util.List;


@Repository
public interface CourseRepository extends CrudRepository<Course,Long>{
    // Iterable<Course> findAllByCategoryAndRating(String category, Integer rating);
    @Query("select c from Course c where c.category=?1")
    //이건 기존 namedquery로 jpql로 작성 되었다.
    Iterable<Course> findAllByCategory(String category);

    @Query("select c from Course c where c.category=:category and c.rating > :rating")
    //jpql과 같다 하지만 ?1 대신 Param을 이용했다는 것이 다르다
    Iterable<Course> findAllByCategoryAndRatingGreaterThan(@Param("category") String category, @Param("rating") int rating);

    @Query(value="select * from COURSE where rating =?1",nativeQuery = true)
    //nativeQuery True를 해주면 db 설저에 맡는 쿼리를 날릴 수 있다.
    Iterable<Course> findAllByRating(int rating);

    @Modifying//@Query가 수정 작업을 한다고 알림
    @Transactional//하나의 트랜색션 내에서 변경 작업이 이루어지게 한다
    @Query("update Course c set c.rating=:rating where c.name=:name")
    int updateCourseRatingByName(@Param("rating") int rating, @Param("name") String name);
}
