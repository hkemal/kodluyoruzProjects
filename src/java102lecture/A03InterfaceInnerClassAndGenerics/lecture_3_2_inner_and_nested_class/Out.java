package java102lecture.A03InterfaceInnerClassAndGenerics.lecture_3_2_inner_and_nested_class;

//Outer Class
public class Out {

    public int a = 5;

    public static int b = 20;

    //Non-Static InnerClass
//    public class In {
//
//        public int a = 10;
//
//        public void run() {
//            System.out.println("In sınıfına ait run metodu çalıştı.");
//            int a = 1;
//            System.out.println(a);
//            System.out.println(this.a);
//            System.out.println(Out.this.a);
//        }
//    }
//
//    public void run() {
//        In in = new In();
//        in.run();
//    }
//
//    public In getIn() {
//        return new In();
//    }

    //Static InnerClass
    public static class In {

        public static int a = 10;

        public static void run() {
            System.out.println("In sınıfına ait run metodu çalıştı.");
            int a = 1;
            System.out.println(a);
            System.out.println(In.a);
            System.out.println(Out.b);
        }
    }

    public static void run() {
        In in = new In();
        in.run();
    }
}
