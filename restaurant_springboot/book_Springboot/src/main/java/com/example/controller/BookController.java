package com.example.controller;

import com.example.domain.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        // TODO 这里返回的数据是交给前端
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag ? Code.DELETE_OK:Code.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        String msg = book != null ? "" : "数据查询失败，请重试！";
        return new Result(book, code,msg, 1);
    }

    @GetMapping("/getByName/{query}/{name1}/{pagenum}/{pagesize}")
    public Result getByName(@PathVariable String query, @PathVariable String name1, @PathVariable Integer pagenum, @PathVariable Integer pagesize) {
        try {
            name1 = URLDecoder.decode(name1, "UTF-8");
            query = URLDecoder.decode(query, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        List<Book> book = bookService.getByName(query, name1, pagenum,  pagesize);
        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        String msg = book != null ? "" : "数据查询失败，请重试！";
        int totalCountByName = bookService.getTotalCountByName(query,  name1);
        return new Result(book, code, msg, totalCountByName);
    }

    @GetMapping("/getByName2/{name1}/{pagenum}/{pagesize}")
    public Result getByName(@PathVariable String name1, @PathVariable Integer pagenum, @PathVariable Integer pagesize) {
        try {
            name1 = URLDecoder.decode(name1, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        List<Book> book = bookService.getByName2(name1, pagenum,  pagesize);
        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        String msg = book != null ? "" : "数据查询失败，请重试！";
        int totalCountByName = bookService.getTotalCountByName2(name1);
        int totalMoney = bookService.getTotalMoney(name1);
        return new Result(book, code, msg, totalCountByName, totalMoney);
    }

    @GetMapping("/getByName3/{name1}/{name2}/{pagenum}/{pagesize}")
    public Result getByName3(@PathVariable String name1, @PathVariable String name2, @PathVariable Integer pagenum, @PathVariable Integer pagesize) {
        try {
            name1 = URLDecoder.decode(name1, "UTF-8");
            name2 = URLDecoder.decode(name2, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        List<Book> book = bookService.getByName3(name1, name2, pagenum,  pagesize);
        Integer code = Code.GET_OK;
        String msg = "";

        int totalCountByName = bookService.getTotalCountByName2(name1);
        System.out.println("aaaa: " + totalCountByName);

        int peopleMoney = bookService.getPeopleMoney(name1, name2);
        System.out.println("bbb: " + peopleMoney);

        return new Result(book, code, msg, totalCountByName, peopleMoney);
    }

    // 访问这个url就return这个方法
    @GetMapping("/getAll/{pagenum}/{pagesize}")
    public Result getAll(@PathVariable Integer pagenum, @PathVariable Integer pagesize) {
        List<Book> bookList = bookService.getAll(pagenum,  pagesize);
        Integer code = bookList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = bookList != null ? "" : "数据查询失败，请重试！";
        int totalCount = bookService.getTotalCount();
        return new Result(bookList, code, msg, totalCount);
    }

}
