package Accenture_Java_HandsOn;

import java.util.Scanner;

class Book{
    private String bookName;
    private String authorName;
    private int bookPrice;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

}
public class OOPS_ClassObjectsPackages_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the book name:");
        String bookName = sc.nextLine();

        System.out.println("Enter the price:");
        int price = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Author name:");
        String authorName = sc.nextLine();

        Book b1 = new Book();
        b1.setBookName(bookName);
        b1.setAuthorName(authorName);
        b1.setBookPrice(price);

        System.out.println("Book Details");
        System.out.println("Book Name :" + b1.getBookName());
        System.out.println("Book Price :" + b1.getBookPrice());
        System.out.println("Author Name :" + b1.getAuthorName());

    }
}
