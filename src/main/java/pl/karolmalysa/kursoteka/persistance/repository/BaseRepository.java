package pl.karolmalysa.kursoteka.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import pl.karolmalysa.kursoteka.persistance.model.BaseEntity;

import java.io.Serializable;
/**
 Ponieważ obiekty, które przyjmie ten interfejs jako swoje obiekty, będą musiały rozszerzać BaseEntity, ponieważ będą
 odpowiedzialne za wygląd tabel w naszej bazie danych
 Dzięki tym wszsytkim rozszerzeniom nie trzeba klepać kodu ;)
 */

public interface BaseRepository<T extends BaseEntity, K extends Serializable>
        extends JpaRepository<T, K>, JpaSpecificationExecutor<T> {

}
