package spring.example.entity;

import org.springframework.stereotype.Component;

import java.util.List;


public class Library {
    private String libraryNo;
    private List<String> book;

    public Library(String libraryNo, List<String> book) {
        this.libraryNo = libraryNo;
        this.book = book;

    }

    @Override
    public String toString() {
        return "Library No :"+libraryNo+"\n"+"Books :"+book;
    }
}



