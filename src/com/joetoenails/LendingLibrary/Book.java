package com.joetoenails.LendingLibrary;
import com.joetoenails.LendingLibrary.Author;

public class Book {
    private int bookID;
    String title;
    String authorName;
    private int authorID;
    private int numCopies;
    public int numAvail;
    private static int numBooks;

    public Book(String title,String authorName, int numCopies){
        numBooks++;
        this.title = title;
        Author thisAuthor = Author.authorLookUp(authorName);
        this.authorName = thisAuthor.getAuthorName();
        this.authorID = thisAuthor.getAuthorID();
        this.bookID = numBooks;
        thisAuthor.addBook(bookID);

    }

}
