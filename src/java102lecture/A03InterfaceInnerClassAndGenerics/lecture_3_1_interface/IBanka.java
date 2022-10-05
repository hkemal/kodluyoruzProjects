package java102lecture.A03InterfaceInnerClassAndGenerics.lecture_3_1_interface;

public interface IBanka {

    final String hostIpAddress = "127.0.0.1";

    boolean connect(String ipAddress);

    void payment(double price, String cardNumber, String expireDate, String cvc);
}
