package com.example.service;

import com.example.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {

    /**
     * 保存
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 修改
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 按id删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 按id查询
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查询全部
     * @return
     */
    public List<Book> getAll(Integer pagenum, Integer pagesize);

    /**
     * 返回count(*)
     * @return
     */
    public int getTotalCount();


    public List<Book> getByName(String query, String name1, Integer pagenum, Integer pagesize);
    public List<Book> getByName2(String name1, Integer pagenum, Integer pagesize);
    public List<Book> getByName3(String name1, String name2,  Integer pagenum, Integer pagesize);

    public int getTotalCountByName(String query, String name1);

    public int getTotalCountByName2(String name1);

    public int getTotalMoney(String name1);

    public int getPeopleMoney(String name1, String name2);
}
