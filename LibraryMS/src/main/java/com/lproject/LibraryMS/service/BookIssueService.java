package com.lproject.LibraryMS.service;

import com.lproject.LibraryMS.model.BookIssue;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BookIssueService {
    BookIssue saveBookIssue(BookIssue bookIssue);
    BookIssue getBookIssueById(int id);
    List<BookIssue> getAllBookIssues();
    void deleteBookIssue(int id);
    void deleteByuserId(int user_id);
}
