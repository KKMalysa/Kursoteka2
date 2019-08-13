package pl.karolmalysa.kursoteka.persistance.repository;

        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
        import pl.karolmalysa.kursoteka.persistance.model.Course;

public interface CourseRepo extends BaseRepository<Course, Long> {

}
