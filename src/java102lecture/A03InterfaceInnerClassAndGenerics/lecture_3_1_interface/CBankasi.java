package java102lecture.A03InterfaceInnerClassAndGenerics.lecture_3_1_interface;

public class CBankasi implements IBanka {

    private String bankaAdi;

    private String terminalId;

    private String password;

    public CBankasi(String bankaAdi, String terminalId, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalId = terminalId;
        this.password = password;
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println(this.bankaAdi + " bağlanıldı.");
        return true;
    }

    @Override
    public void payment(double price, String cardNumber, String expireDate, String cvc) {
        System.out.println("İşlem başarılı oldu.");
    }
}
