package java102lecture.A02OOPBaseRules.lecture_2_6_abstraction;

public class Main {
    public static void main(String[] args) {
        OgretimGorevlisi ogretimGorevlisi = new OgretimGorevlisi("Mahmut Çetindağ", "05121230000", "mahmutç@patika.dev", "CENG", "Doktor", "3001");
        Asistan asistan = new Asistan("Mahmut Asistan", "05121230001", "mahmuta@patika.dev", "CENG", "Doktor", "12:00-14:00");
        BilgiIslem bilgiIslem = new BilgiIslem("Mahmut Network", "05121230002", "mahmutn@patika.dev", "Altyapı", "09:00-18:00", "Network");
        GuvenlikGorevlisi guvenlikGorevlisi = new GuvenlikGorevlisi("Mahmut Güvenlik", "05121230003", "mahmutg@patika.dev", "Güvenlik", "09:00-18:00", "A1");
    }
}
