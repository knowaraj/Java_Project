package com.lproject.LibraryMS.repository;

import com.lproject.LibraryMS.model.Book;
import com.lproject.LibraryMS.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book,Integer>{

}
