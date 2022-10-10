package java102lecture.A04Exceptions.lecture_4_4_create_exception_class;

public class AgeCheckException extends Exception {
    public AgeCheckException(String messagge) {
        super(messagge);
    }

    @Override
    public String toString() {
        return "Bu AgeCheck sınıfına ait bir Exception!";
    }
}
