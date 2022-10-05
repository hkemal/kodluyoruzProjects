package java102lecture.A02OOPBaseRules.lecture_2_5_polymorphism;

public class Main {
    public static void main(String[] args) {

        Calisan calisan = new Calisan("Mustafa Çetindağ", "05121231212", "info@patika.dev");
        Akademisyen akademisyen = new Akademisyen("Patika Dev", "05121231234", "bilgi@patika.dev", "CENG", "Docent");
        Memur memur = new Memur("Ali Veli", "05121231267", "aliveli@patika.dev", "Bilgi İşlem", "09:00-18:00");
        OgretimGorevlisi ogretimGorevlisi = new OgretimGorevlisi("Mahmut Çetindağ", "05121230000", "mahmutç@patika.dev", "CENG", "Doktor", "3001");
        Asistan asistan = new Asistan("Mahmut Asistan", "05121230001", "mahmuta@patika.dev", "CENG", "Doktor", "12:00-14:00");
        BilgiIslem bilgiIslem = new BilgiIslem("Mahmut Network", "05121230002", "mahmutn@patika.dev", "Altyapı", "09:00-18:00", "Network");
        GuvenlikGorevlisi guvenlikGorevlisi = new GuvenlikGorevlisi("Mahmut Güvenlik", "05121230003", "mahmutg@patika.dev", "Güvenlik", "09:00-18:00", "A1");

        //Polimofizm(Çok Biçimlilik
//        Calisan akademisyen2 = new Akademisyen("Kodluyoruz", "05121231200", "kodluyoruz@patika.dev", "CENG", "Docent");
//        akademisyen2.giris();
        //akademisyen2.getBolum();
        Calisan[] loginUser = {calisan, akademisyen, memur, ogretimGorevlisi};
        Calisan.girisYapanlar(loginUser);
    }
}
