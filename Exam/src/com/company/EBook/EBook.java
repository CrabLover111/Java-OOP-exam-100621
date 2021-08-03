package com.company.EBook;

import java.util.ArrayList;
import java.util.Scanner;

public class EBook {
    ArrayList<Book> library = new ArrayList<>();
    private int charge = 100;
    private Book currentBook;
    public RuntimeException OutOfChargeException;

    public void read(Book book) {
        if (charge < 1) throw OutOfChargeException;
        else {
            currentBook = book;
            charge--;
            System.out.println("book name: " + currentBook.getName());
            System.out.println("current page: " + currentBook.getCurrentPage() + " of" + currentBook.getPageQuantity());
            System.out.println("current charge: " + charge + "%");
        }
    }
    public void goTo(int page) {
        if (charge < 1) throw OutOfChargeException;
        else {
            currentBook.setCurrentPage(page);
            charge--;
        }
    }
    public void toMenu() {
        if (charge < 1) throw OutOfChargeException;
        else {
            currentBook = null;
            charge--;
            System.out.println("you`re in main menu, choose what you want to read");
        }
    }

    public void nextPage() {
        if (charge < 1) throw OutOfChargeException;
        else {
            currentBook.plusPage();
            charge--;
            System.out.println("current page: " + currentBook.getCurrentPage() + " of" + currentBook.getPageQuantity());
            System.out.println("current charge: " + charge + "%");
        }
    }

    public void previousPage() {
        if (charge < 1) throw OutOfChargeException;
        else {
            currentBook.minusPage();
            charge--;
            System.out.println("current page: " + currentBook.getCurrentPage() + " of" + currentBook.getPageQuantity());
            System.out.println("current charge: " + charge + "%");
        }
    }

    public void addToLibrary() {
        if (charge < 1) throw OutOfChargeException;
        else {
            charge--;
            Scanner scanner = new Scanner(System.in);
            int pageQuantity;
            String name;
            String author;
            System.out.println("enter a book name");
            name = scanner.nextLine();
            System.out.println("enter author`s name");
            author = scanner.nextLine();
            double random = Math.random() * 400;
            int randomStuff = (int) random;
            library.add(new Book(randomStuff, name, author));
            System.out.println("you`ve just added a book called " + name + ", that contains " + randomStuff + " pages" + " and was written by " + author);
        }
    }
}
