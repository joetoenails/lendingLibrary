package com.joetoenails.LendingLibrary;
import com.joetoenails.LendingLibrary.Author;

public class Book {
    private int bookID;
    String title;
    String authorName;
    private int authorID;
    private int numCopies;
    public int numAvail;

    Book(String title,String authorName, int numCopies){
        this.title = title;
        this.authorName = Author.authorNameLookUp(authorName);
        if(Author.authorIDLookUp(this.authorName)==-1){
            System.out.println("Something went wrong.");
        }
        else{
            this.authorID = Author.authorIDLookUp(this.authorName);
        }


    }

}
