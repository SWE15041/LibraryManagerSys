package com.librarymansys.demo.library.dao;

import com.librarymansys.demo.library.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepositroy extends JpaRepository<Book,Long> {
}
