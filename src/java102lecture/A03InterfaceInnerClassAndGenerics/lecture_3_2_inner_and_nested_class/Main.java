package java102lecture.A03InterfaceInnerClassAndGenerics.lecture_3_2_inner_and_nested_class;

public class Main {
    public static void main(String[] args) {
        //Non-Static Inner Class
//        Out out = new Out();
//        out.run();
//        Out.In in = out.new In();
//        in.run();

        //Static Inner Class
//        Out.In.run();

        //LocalClass
//        Local local = new Local();
//        local.run();

//        AnonimClass
        Anonim anonim = new Anonim() {
            public int a = 20;

            @Override
            public void run() {
                System.out.println(this.a);
                System.out.println("Anonim olarak yazılmış run metodu");
                print();
            }

            public void print() {
                System.out.println("Print metodu");
            }

        };
        anonim.run();
        System.out.println(anonim.a);
//        anonim.print();
    }
}
