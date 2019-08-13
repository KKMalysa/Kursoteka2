package pl.karolmalysa.kursoteka.persistance.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "courses")
public class Course extends BaseEntity {
//    //tu Michał ma inaczej
//    @Id
//    @GeneratedValue(strategy = GenerationType.TABLE)
//    @Column(name = "id")
//    private Long id;

    @Column(name = "name")
    private String name;
}
