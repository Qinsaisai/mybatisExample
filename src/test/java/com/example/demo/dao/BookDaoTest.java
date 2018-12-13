package com.example.demo.dao;

import com.example.demo.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class BookDaoTest {
    @Autowired(required = false)
    private BookDao bookDao;

    @Test
    public void testSelectBook(){
        List<Book> bookList=bookDao.selectBook();
        log.info("查询数据成功:{}",bookList);
    }

    @Test
    public void testInsertBook(){
        Book book=new Book();
        book.setBookName("mybatis");
        book.setAuthor("Potter");
        bookDao.insertBook(book);
        log.info("添加数据成功");
    }

    @Test
    public void testUpdateBook(){
        Book book=new Book();
        book.setId(1);
        book.setBookName("MyBatis");
        book.setAuthor("Potter");
        bookDao.updateBook(book);
        log.info("更新数据成功");
    }

    @Test
    public void testDeleteBook(){
        int id=1;
        bookDao.deleteBook(id);
        log.info("删除数据成功");
    }
}
