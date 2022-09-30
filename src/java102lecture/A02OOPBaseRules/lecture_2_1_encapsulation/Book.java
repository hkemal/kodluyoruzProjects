package java102lecture.A02OOPBaseRules.lecture_2_1_encapsulation;

public class Book {

    public Book() {
    }

    public Book(String name, int pageNumber) {
        this.name = name;
        this.pageNumber = pageNumber;
    }

    private String name;

    private int pageNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        if (pageNumber < 0) {
            pageNumber = 0;
        }
        this.pageNumber = pageNumber;
    }
}
