package com.itheima.service.Impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.UserDao;
import com.itheima.dao.impl.BookDaoImpl;
import com.itheima.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;




    public BookServiceImpl(BookDao bookDao, UserDao userDao){
        this.bookDao=bookDao;
        this.userDao=userDao;
    }


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
        this.bookDao=bookDao;
    }

    public void save(){
        System.out.println("book service save...");
//        bookDao.save();
//        userDao.save();
    }
    public void destroy() throws Exception{
        System.out.println("service destory");
    }
    public void afterPropertiesSet() throws Exception{
        System.out.println("service init");
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
