package com.example.domain;

public class Book {
    private Integer id;
    private String date;
    private String name1;
    private String name2;
    private Integer description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public Integer getDescription() {
        return description;
    }

    public void setDescription(Integer description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}