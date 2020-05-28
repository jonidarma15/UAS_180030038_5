package com.aa183.joni;

public class Buku {
    private Integer _id;
    private String book_title;
    private String book_author;
    private byte[] book_image;
    private String book_pages;

    public Buku(Integer _id, String book_title, String book_author, byte[] book_image, String book_pages) {
        this._id = _id;
        this.book_title = book_title;
        this.book_author = book_author;
        this.book_image = book_image;
        this.book_pages = book_pages;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public byte[] getBook_image() {
        return book_image;
    }

    public void setBook_image(byte[] book_image) {
        this.book_image = book_image;
    }

    public String getBook_pages() {
        return book_pages;
    }

    public void setBook_pages(String book_pages) {
        this.book_pages = book_pages;
    }
}