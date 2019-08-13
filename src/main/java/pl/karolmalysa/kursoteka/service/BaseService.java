package pl.karolmalysa.kursoteka.service;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.karolmalysa.kursoteka.persistance.model.BaseEntity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
/*
parametr T rozszerza BaseEntity, (czyli jest modelem bazy danych)
parametr K rozszerza Serializable, (klucz, po którym identyfikujemy swoje dane, nasze id)
parametr R rozszerza JpaRepository, (czyli nasze repository -
dzięki niemu mamy niżej getRepository,
mamy save, które przyjmuje obiekt entity i zwraca również entity,
delete przyjmuje klucz,
Collection<T> - zwraca kolekcje naszych encji,
getOne(K id) - zwraca jedną encję, wybraną przy użyciu klucza

 */
public interface BaseService<T extends BaseEntity, K extends Serializable, R extends JpaRepository<T, K>> {

    R getRepository();

    T save(T entity);

    T delete(K id);

    Collection<T> getAll();

    T getOne(K id);


}
