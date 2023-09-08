package com.example.service.impl;

import com.example.dao.BookDao;
import com.example.domain.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        return bookDao.save(book) > 0;
    }

    public boolean update(Book book) {
        return bookDao.update(book) > 0;
    }

    public boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }

    public Book getById(Integer id) {
//        if(id == 1){
//            throw new BusinessException(Code.BUSINESS_ERR,"请不要使用你的技术挑战我的耐性!");
//        }
//        //将可能出现的异常进行包装，转换成自定义异常
//        try{
//            int i = 1/0;
//        }catch (Exception e){
//            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器访问超时，请重试!",e);
//        }
        return bookDao.getById(id);
    }

    public List<Book> getAll(Integer pagenum, Integer pagesize) {
//        return bookDao.getAll();
        return bookDao.getAll(pagenum, pagesize);
    }

    @Override
    public int getTotalCount() {
        return bookDao.getTotalCount();
    }

    @Override
    public List<Book> getByName(String query, String name1, Integer pagenum, Integer pagesize) {
        return bookDao.getByName(query, name1,  pagenum,  pagesize);
    }

    public List<Book> getByName2(String name1, Integer pagenum, Integer pagesize) {
        return bookDao.getByName2(name1,  pagenum,  pagesize);
    }

    public List<Book> getByName3(String name1, String name2, Integer pagenum, Integer pagesize) {
        return bookDao.getByName3(name1, name2,  pagenum,  pagesize);
    }

    public int getTotalCountByName(String query, String name1) {
        return bookDao.getTotalCountByName(query,  name1);
    }

    @Override
    public int getTotalCountByName2(String name1) {
        return bookDao.getTotalCountByName2(name1);
    }

    public int getTotalMoney(String name1) {
        return bookDao.getTotalMoney(name1);
    }

    @Override
    public int getPeopleMoney(String name1, String name2) {
        return bookDao.getPeopleMoney(name1, name2);
    }

}
