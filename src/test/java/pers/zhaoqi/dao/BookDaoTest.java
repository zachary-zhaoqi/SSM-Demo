package pers.zhaoqi.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pers.zhaoqi.BaseTest;
import pers.zhaoqi.entity.Book;

import java.util.List;

public class BookDaoTest extends BaseTest {

    @Autowired
    private BookDao bookDao;

    @Test
    public void queryById() {
        long bookId=1000;
        Book book=bookDao.queryById(bookId);
        System.out.println(book);
    }

    @Test
    public void queryAll() {
        List<Book> list=bookDao.queryAll(0,10);
        for (Book book : list) {
            System.out.println(book);
        }
    }

    @Test
    public void reduceNumber() {
        long bookId=1000;
        Book book=bookDao.queryById(bookId);
        System.out.println(book);
        bookDao.reduceNumber(bookId);
        book=bookDao.queryById(bookId);
        System.out.println(book);
    }
}