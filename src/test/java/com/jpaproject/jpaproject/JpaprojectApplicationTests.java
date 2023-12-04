package com.jpaproject.jpaproject;

import java.sql.SQLException;
import java.util.Iterator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.AllArgsConstructor;

@SpringBootTest
class JpaprojectApplicationTests {
	
	@Autowired
	private CourseRepository courseRepository;

	@Test
	public void givenDatasourceAvailableWhenAccessDetailsThenExpectDetails() throws SQLException{
		Course course = new Course("test", "test", 0, "test");
		//courseRepository.save(course);
		// Iterator<Course> iter = courseRepository.findAllByCategoryAndRating("Mendix", 1).iterator();
		// while(iter.hasNext()){
		// 	Course tmpCourse=iter.next();
		// 	System.out.println(tmpCourse.getName().concat(tmpCourse.getDescription()));
		// }
		

	}

}
