package java102lecture.A03InterfaceInnerClassAndGenerics.lecture_3_2_inner_and_nested_class;

public class Local {
    public void run() {

//        LocalClass
        class Yerel {
            private int a;

            public Yerel(int a) {
                this.a = a;
            }

            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }
        }
        Yerel yerel = new Yerel(15);
        System.out.println("Local sınıf çalıştı");
        System.out.println(yerel.getA());
    }

    public void print() {
//        Yerel yerel = new Yerel(15);
    }
}
