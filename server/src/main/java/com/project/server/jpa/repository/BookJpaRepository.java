package com.project.server.jpa.repository;

import com.project.server.jpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

//@Transactional
@Repository
public interface BookJpaRepository extends JpaRepository<Book,Long>{
    List<Book> findAll();

    @Transactional
    void deleteById(Long id);

    List<Book> findByNameIgnoreCaseContaining(String query);


//    @Query(value = "Select * From book b where book_name like %?1%", nativeQuery = true)
//    List<Book> getBooksByQuery(String query);

}
