package com.joetoenails.LendingLibrary;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Author {

    static Map<Integer,Author> authorList = new HashMap<>();
    private int authorID;
    private String authorName;
    private LocalDate authorDOB;
    ArrayList <Integer> bookList = new ArrayList<>();

    public Author(String authorNameInput, String authorDOBInput){
        this.authorName = authorNameInput;
        this.authorDOB = LocalDate.parse(authorDOBInput);
        this.authorID = authorList.size()+1;
        authorList.put(authorList.size(),this);

    }
    public String getAuthorName(){
        return authorName;
    }
    public int getAuthorID() {
        return authorID;
    }

    public LocalDate getAuthorDOB() {
        return authorDOB;
    }

    static public Author authorLookUp(String authorName){

        for (int key:authorList.keySet()){
            if(authorList.get(key).authorName.equals(authorName)){
                return authorList.get(key);
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Author not found, add DOB.");
        String newAuthorDOB = sc.nextLine();
        return new Author(authorName, newAuthorDOB);

    }


    public void addBook(int bookID){
        this.bookList.add(bookID);
    }
}
