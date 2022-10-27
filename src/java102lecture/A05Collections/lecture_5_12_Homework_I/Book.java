package java102lecture.A05Collections.lecture_5_12_Homework_I;

import java.time.LocalDate;

public class Book implements Comparable<Book> {

    private String name;

    private Integer pageCount;

    private String authorName;

    private LocalDate publishingDate;

    public Book() {
    }

    public Book(String name, Integer pageCount, String authorName, LocalDate publishingDate) {
        this.name = name;
        this.pageCount = pageCount;
        this.authorName = authorName;
        this.publishingDate = publishingDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDate getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(LocalDate publishingDate) {
        this.publishingDate = publishingDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("name='").append(name).append('\'');
        sb.append(", pageCount=").append(pageCount);
        sb.append(", authorName='").append(authorName).append('\'');
        sb.append(", publishingDate=").append(publishingDate);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public int compareTo(Book book) {
        return this.getName().compareTo(book.getName());
    }
}
