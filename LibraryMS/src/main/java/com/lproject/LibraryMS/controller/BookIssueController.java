package com.lproject.LibraryMS.controller;

import com.lproject.LibraryMS.model.BookIssue;
import com.lproject.LibraryMS.repository.BookIssueRepository;
import com.lproject.LibraryMS.service.BookIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookissue")
public class BookIssueController {

    @Autowired
    private BookIssueRepository repository;

    @PostMapping("/issue")
    public BookIssue add(@RequestBody BookIssue bookIssue) {
        return repository.save(bookIssue);
    }

    @GetMapping("/list")
    public List<BookIssue> getAll() {
        return repository.findAll();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable int id) {
        repository.deleteById(id);
    }
}
