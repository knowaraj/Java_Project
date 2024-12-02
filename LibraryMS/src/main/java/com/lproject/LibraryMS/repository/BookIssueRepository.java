package com.lproject.LibraryMS.repository;

import com.lproject.LibraryMS.model.BookIssue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookIssueRepository extends JpaRepository<BookIssue, Integer> {
    void deleteByuser_Id(int user_ID);
//    void deleteBybook_BId(int book_BID);
}
