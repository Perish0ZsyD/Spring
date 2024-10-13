package com.siyuan.spring6.iocxml.di;

/**
 * @author Siyuan
 * @date 2024/10/13/18:36
 */
public class Book {
    private  String bookName;
    private  String author;

    public Book() {
        System.out.println("无参构造...");
    }

    // 带参构造
    public Book(String bookName, String author) {
        System.out.println("带参构造...");
        this.bookName = bookName;
        this.author = author;
    }
// 生成set方法

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' + '}';
    }

    public static void main(String[] args) {
        // set方法原生写法
        Book book = new Book();
        book.setAuthor("siyuan");
        book.setBookName("javaSpring");

        // 构造器原生方法
        Book book1 = new Book("java", "siyuan");
    }
}
