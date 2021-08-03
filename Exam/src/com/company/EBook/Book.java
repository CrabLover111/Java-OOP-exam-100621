package com.company.EBook;

public class Book {
    private final int pageQuantity;
    private final String name;
    private final String author;
    private int currentPage = 0;


    public Book(int pageQuantity, String name, String author) {
        this.pageQuantity = pageQuantity;
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getPageQuantity() {
        return pageQuantity;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void plusPage() {
        currentPage++;
    }
    public void minusPage() {
        currentPage--;
    }


}
