package com.lproject.LibraryMS.service.impl;

import com.lproject.LibraryMS.model.Book;

import com.lproject.LibraryMS.repository.BookRepository;

import com.lproject.LibraryMS.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book add(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book findByBookname(String bookname) {
        return null;
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public void deleteByBid(int id) {
        getById(id);
        bookRepository.deleteById(id);
    }

    @Override
    public Book getById(int id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        return optionalBook.orElseThrow((() -> new RuntimeException("Book not Found")));

    }

    @Override
    public Book update(Book book, int id) {
       return null;
    }


}
