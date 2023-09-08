package com.example.book_springboot;

import com.example.domain.Book;
import com.example.service.BookService;
import com.example.service.impl.BookServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.naming.CompositeName;
import java.util.List;

@SpringBootTest
public class BookSpringbootApplicationTests {

    @Autowired
    private BookService bookService;

    @Test
    public void testGetAll(){
        List<Book> all = bookService.getAll(3, 4 );
        System.out.println(all);
    }
}
