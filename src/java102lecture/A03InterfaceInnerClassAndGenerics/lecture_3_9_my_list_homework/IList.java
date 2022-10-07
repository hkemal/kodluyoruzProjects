package java102lecture.A03InterfaceInnerClassAndGenerics.lecture_3_9_my_list_homework;

public interface IList<T> {

    Long size();

    Integer getCapacity();

    void add(T value);

    T get(int index);

    void remove(int index);

    boolean set(int index, T data);

    String toString();

    Integer indexOf(T data);

    Integer lastIndexOf(T data);

    Boolean isEmpty();

    T[] toArray();

    void clear();

    MyList<T> sublist(int start, int finish);

    Boolean contains(T data);
}
