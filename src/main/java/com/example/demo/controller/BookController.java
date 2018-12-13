package com.example.demo.controller;

import com.example.demo.dao.BookDao;
import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/book")
public class BookController {
    @Autowired(required = false)
    private BookDao bookDao;

    @ResponseBody
    @RequestMapping(value = "/getAllBooks",method = RequestMethod.GET)
    public List<Book> getAllBooks(){
        List<Book> bookList=bookDao.selectBook();
        return bookList;
    }

    @ResponseBody
    @RequestMapping(value = "insertBook",method = RequestMethod.POST)
    public void insertBook(){
        Book book=new Book();
        book.setBookName("Java");
        book.setAuthor("Harry");
        bookDao.insertBook(book);
    }

    @ResponseBody
    @RequestMapping(value = "/updateBook",method = RequestMethod.POST)
    public void updateBook(){
        Book book=new Book();
        book.setId(1);
        book.setBookName("MyBatis");
        book.setAuthor("Potter");
        bookDao.updateBook(book);
    }

    @ResponseBody
    @RequestMapping(value = "/deleteBook",method = RequestMethod.DELETE)
    public void deleteBook(int id){
        bookDao.deleteBook(id);
    }
}
