package com.example.dao;

import com.example.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookDao {

//    @Insert("insert into tbl_book values(null,#{name1},#{name2},#{description})")
    @Insert("insert into tbl_book (name1,name2,description) values(#{name1},#{name2},#{description})")
    public int save(Book book);

    @Update("update tbl_book set name1 = #{name1}, name2 = #{name2}, description = #{description} where id = #{id}")
    public int update(Book book);

    @Delete("delete from tbl_book where id = #{id}")
    public int delete(Integer id);

    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);

//    @Select("select * from tbl_book")
//    public List<Book> getAll();
    // 要不要嵌套子查询 再写一个limit
    @Select("select * from tbl_book where ${query} = #{name1} limit #{pagenum}, #{pagesize}")
    public List<Book> getByName(String query, String name1, Integer pagenum, Integer pagesize);

    @Select("select * from tbl_book where name1 = #{name1} or name2 = #{name1} limit #{pagenum}, #{pagesize}")
    public List<Book> getByName2(String name1, Integer pagenum, Integer pagesize);

    @Select("select count(*) from tbl_book where ${query} = #{name1}")
    public int getTotalCountByName(String query, String name1);

    @Select("select count(*) from tbl_book where name1 = #{name1} or name2 = #{name1}")
    public int getTotalCountByName2(String name1);

    @Select("select * from tbl_book limit #{pagenum}, #{pagesize}")
    public List<Book> getAll(Integer pagenum, Integer pagesize);

    @Select("select count(*) from tbl_book")
    public int getTotalCount();

    @Select("select t2.sum2 - t1.sum1  from\n" +
            "(select sum(description) as sum1 from tbl_book where name1 = #{name1}) as t1,\n" +
            "(select sum(description) as sum2 from tbl_book where name2 = #{name1}) as t2 ")
    public int getTotalMoney(String name1);

    @Select("select ifnull(sum1,0) - ifnull(sum2,0) as sum  from\n" +
            "(select sum(description) as sum1 from tbl_book where name1 = #{name1} and name2 = #{name2}) as t1,\n" +
            "(select sum(description) as sum2 from tbl_book where name1 = #{name2} and name2 = #{name1}) as t2 ")
    public int getPeopleMoney(String name1, String name2);

    @Select("select * from tbl_book  where name1 = #{name1} and name2 = #{name2} or name1 = #{name2} and name2 = #{name1}  limit #{pagenum}, #{pagesize}")
    public List<Book> getByName3(String name1, String name2, Integer pagenum, Integer pagesize);
}
