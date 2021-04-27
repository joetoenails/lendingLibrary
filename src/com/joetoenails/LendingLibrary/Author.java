package com.joetoenails.LendingLibrary;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Author {

    static public Map<Integer,String> authorList = new HashMap<>();
    private int authorID;
    private String authorName;
    private LocalDate authorDOB;
    public ArrayList <Integer> bookList = new ArrayList<>();

    Author(String authorNameInput, String authorDOBInput){
        this.authorName = authorNameInput;
        this.authorDOB = LocalDate.parse(authorDOBInput);
        this.authorID = authorList.size()+1;
        authorList.put(authorList.size(),authorName);

    }
    public int getAuthorID() {
        return authorID;
    }

    public LocalDate getAuthorDOB() {
        return authorDOB;
    }

    static public String authorNameLookUp(String authorName){
        if (authorList.containsValue(authorName)){
            return authorName;
        }
        else{
            Scanner sc = new Scanner(System.in);
            System.out.println("Author not found, add DOB.");
            String newAuthorDOB =sc.nextLine();
            new Author (authorName,newAuthorDOB);
            return authorName;
        }
    }

    static public int authorIDLookUp(String authorName){
        int foundKey =-1;
        for (int key: authorList.keySet()){
            if (authorList.get(key).equals(authorName)){
                foundKey = key;
            }

        }
        return foundKey;
    }

    public void addBook(int bookID){
        this.bookList.add(bookID);
    }
}
