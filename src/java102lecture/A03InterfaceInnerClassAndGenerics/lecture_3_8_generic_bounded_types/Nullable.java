package java102lecture.A03InterfaceInnerClassAndGenerics.lecture_3_8_generic_bounded_types;

public class Nullable<T extends Number> {

    private final T value;

    public Nullable(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isNull() {
        return this.getValue() == null;
    }

    public void run() {
        if (this.isNull()) {
            System.out.println("Bu değişkene değer atanmamıştır (null)");
        } else {
            System.out.println(this.value);
        }
    }
}
