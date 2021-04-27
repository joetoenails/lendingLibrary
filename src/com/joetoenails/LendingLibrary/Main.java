package com.joetoenails.LendingLibrary;
import com.joetoenails.LendingLibrary.Author;

public class Main {

    public static void main(String[] args) {

		Author joe = new Author("Joe","1991-11-27");
		Author pickles = new Author("Pickles","2018-06-18");
        Book memoirs = new Book("Back when","Joe",100);
        Book newAuth = new Book("Old Golf","Gumbo",99);

        for (int key: Author.authorList.keySet()){
            Author oneAuthor = Author.authorList.get(key);
            System.out.print(oneAuthor.getAuthorName()+" ");
            System.out.print(oneAuthor.getAuthorID()+" ");
            System.out.print(oneAuthor.getAuthorDOB());
            if (!oneAuthor.bookList.isEmpty()) {
                System.out.print(" Book ID: "+oneAuthor.bookList.get(0));
            }
            System.out.println();


        }

    }
}
