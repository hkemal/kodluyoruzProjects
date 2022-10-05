package java102lecture.A02OOPBaseRules.lecture_2_5_polymorphism;

public class Memur extends Calisan {

    private String departman;

    private String mesai;

    public Memur(String adSoyad, String telefon, String eposta, String departman, String mesai) {
        super(adSoyad, telefon, eposta);
        this.departman = departman;
        this.mesai = mesai;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }

    public void Calis() {
        System.out.println(this.getAdSoyad() + " çalışmaya başladı.");
    }

    @Override
    public void giris() {
        System.out.println(this.getAdSoyad() + " memuru C kapısından giriş yaptı.");
    }
}
