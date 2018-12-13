package com.example.demo.dao;

import com.example.demo.model.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface BookDao {
    List<Book> selectBook();

    void insertBook(Book book);

    void updateBook(Book book);

    void deleteBook(int id);
}
