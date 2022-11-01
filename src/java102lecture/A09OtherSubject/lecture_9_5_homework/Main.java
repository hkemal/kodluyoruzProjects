package java102lecture.A09OtherSubject.lecture_9_5_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book("1984", 352, "George Orwell", 1949);
        Book book2 = new Book("Suç ve Ceza", 705, "Fyodor Dostoyevski", 1866);
        Book book3 = new Book("Palto", 65, "Nikolay Gogol", 1842);
        Book book4 = new Book("Silahlara Veda", 384, "Ernest Hemingway", 1928);
        Book book5 = new Book("Uçurtma Avcısı", 375, "Khaled Hosseini", 2003);
        Book book6 = new Book("Saatleri Ayarlama Enstitüsü", 382, "Ahmet Hamdi Tanpınar", 1961);
        Book book7 = new Book("Dönüşüm", 128, "Franz Kafka", 1915);
        Book book8 = new Book("Semaver", 138, "Sait Faik Abasıyanık", 1936);
        Book book9 = new Book("Kırmızı Pazartesi", 112, "Gabriel Garcia Marquez", 1981);
        Book book10 = new Book("Otomatik Portakal", 172, "Anthony Burgess", 1962);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        bookList.add(book8);
        bookList.add(book9);
        bookList.add(book10);


        Map<String, String> bookMapped = bookList.stream().collect(Collectors.toMap(Book::getName, Book::getAuthorName));
        System.out.println(bookMapped);
        List<Book> booksPageCountGreaterThanHundred = bookList.stream().filter(item -> item.getPageCount() > 100).collect(Collectors.toList());
        System.out.println(booksPageCountGreaterThanHundred);

    }
}
