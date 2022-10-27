package java102lecture.A05Collections.lecture_5_12_Homework_I;

import java.time.LocalDate;
import java.time.Month;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", 352, "George Orwell", LocalDate.of(1949, Month.JUNE, 8));
        Book book2 = new Book("Suç ve Ceza", 705, "Fyodor Dostoyevski", LocalDate.of(1866, Month.JANUARY, 1));
        Book book3 = new Book("Palto", 65, "Nikolay Gogol", LocalDate.of(1842, Month.FEBRUARY, 1));
        Book book4 = new Book("Silahlara Veda", 384, "Ernest Hemingway", LocalDate.of(1928, Month.MARCH, 1));
        Book book5 = new Book("Uçurtma Avcısı", 375, "Khaled Hosseini", LocalDate.of(2003, Month.MARCH, 29));

        TreeSet<Book> books = new TreeSet<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.stream().forEach(System.out::println);

        System.out.println("**********************");

        TreeSet<Book> book = new TreeSet<Book>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageCount() - o2.getPageCount();
            }
        });

        book.add(book1);
        book.add(book2);
        book.add(book3);
        book.add(book4);
        book.add(book5);

        book.stream().forEach(System.out::println);
    }
}
