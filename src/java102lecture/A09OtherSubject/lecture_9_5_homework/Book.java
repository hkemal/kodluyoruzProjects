package java102lecture.A09OtherSubject.lecture_9_5_homework;

import java.time.LocalDate;

public class Book {
    private String name;

    private Integer pageCount;

    private String authorName;

    private Integer publishingDate;

    public Book() {
    }

    public Book(String name, Integer pageCount, String authorName, Integer publishingDate) {
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

    public Integer getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(Integer publishingDate) {
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
}
