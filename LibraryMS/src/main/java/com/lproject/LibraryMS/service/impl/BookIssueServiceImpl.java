package com.lproject.LibraryMS.service.impl;

import com.lproject.LibraryMS.model.BookIssue;
import com.lproject.LibraryMS.repository.BookIssueRepository;
import com.lproject.LibraryMS.service.BookIssueService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookIssueServiceImpl implements BookIssueService {

    private final BookIssueRepository bookIssueRepository;

    @Autowired
    public BookIssueServiceImpl(BookIssueRepository bookIssueRepository) {
        this.bookIssueRepository = bookIssueRepository;
    }

    @Override
    public BookIssue saveBookIssue(BookIssue bookIssue) {
        return bookIssueRepository.save(bookIssue);
    }

    @Override
    public BookIssue getBookIssueById(int id) {
        return bookIssueRepository.findById(id).orElse(null);
    }

    @Override
    public List<BookIssue> getAllBookIssues() {
        return bookIssueRepository.findAll();
    }

    @Override
    public void deleteBookIssue(int id) {
        bookIssueRepository.deleteById(id);
    }

    @Override
    public void deleteByuserId(int user_id) {
        bookIssueRepository.deleteByuser_Id(user_id);
    }

}
