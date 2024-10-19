package in.hd.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.hd.main.entities.CoursesEntity;


@Repository
public interface CourseRepository extends JpaRepository<CoursesEntity, Long>{

}
