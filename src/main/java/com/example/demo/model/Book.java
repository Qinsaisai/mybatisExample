package com.example.demo.model;

public class Book {
    private int id;
    private String bookName;
    private String author;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getBookName(){
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName=bookName;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }

    @Override
    public String toString(){
        return "Book[id="+id+",name="+bookName+",author="+author+"]";
    }
}
