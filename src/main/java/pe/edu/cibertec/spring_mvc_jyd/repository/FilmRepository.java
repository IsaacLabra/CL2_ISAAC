package pe.edu.cibertec.spring_mvc_jyd.repository;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;
import pe.edu.cibertec.spring_mvc_jyd.entity.Film;

public interface FilmRepository extends CrudRepository<Film, Integer> {
    @Override
    @Cacheable(value = "films")
    Iterable<Film> findAll();

    @Override
    @CacheEvict(value = "films", allEntries = true)
    Film save(Film film);

    @Override
    @CacheEvict(value = "films", allEntries = true)
    void deleteById(Integer id);
}
