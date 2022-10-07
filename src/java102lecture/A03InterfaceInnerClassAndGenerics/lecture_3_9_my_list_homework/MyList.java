package java102lecture.A03InterfaceInnerClassAndGenerics.lecture_3_9_my_list_homework;

import java.util.Arrays;

public class MyList<T> implements IList {

    private Integer capacity;

    Object[] genericArray;

    public MyList() {
        genericArray = new Object[10];
        this.capacity = 10;
    }

    public MyList(Integer capacity) {
        this.capacity = capacity;
        genericArray = new Object[this.capacity];
    }

    @Override
    public Long size() {
        long count = 0;
        for (Object item : genericArray) {
            if (item != null) {
                count++;
            }
        }
        return count;
    }

    @Override
    public Integer getCapacity() {
        return this.capacity;
    }

    @Override
    public void add(Object value) {
        boolean capacityControlFlag = true;
        for (int i = 0; i < genericArray.length; i++) {
            if (genericArray[i] == null) {
                genericArray[i] = value;
                capacityControlFlag = false;
                break;
            }
        }
        if (capacityControlFlag) {
            int formetLength = genericArray.length;
            this.capacity = formetLength * 2;
            genericArray = Arrays.copyOf(genericArray, capacity);
            genericArray[formetLength] = value;
        }
    }

    @Override
    public Object get(int index) {
        if (index >= genericArray.length - 1 || index < 0) {
            System.out.println("Hatalı index girdiniz");
            return null;
        } else {
            return genericArray[index];
        }
    }

    @Override
    public void remove(int index) {
        if (index >= genericArray.length - 1 || index < 0) {
            System.out.println("Hatalı index girdiniz");
        } else {
            genericArray[index] = null;
        }
    }

    @Override
    public boolean set(int index, Object value) {
        if (index >= genericArray.length - 1 || index < 0) {
            System.out.println("Hatalı index girdiniz");
            return false;
        } else {
            genericArray[index] = value;
            return true;
        }
    }

    @Override
    public String toString() {
        String myList = "";
        for (Object item : genericArray) {
            if (item != null) {
                myList += item + ", ";
            }
        }
        if (myList.length() > 2) {
            return "[" + myList.substring(0, myList.length() - 2) + "]";
        } else {
            return "[" + myList + "]";
        }
    }

    @Override
    public Integer indexOf(Object data) {
        Integer index = null;
        for (int i = 0; i < genericArray.length; i++) {
            if (genericArray[i] == data) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public Integer lastIndexOf(Object data) {
        Integer index = null;
        for (int i = genericArray.length - 1; i >= 0; i--) {
            if (genericArray[i] == data) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public Boolean isEmpty() {
        Boolean emptyFlag = true;
        for (int i = 0; i < genericArray.length; i++) {
            if (genericArray[i] != null) {
                emptyFlag = false;
                break;
            }
        }
        return emptyFlag;
    }

    @Override
    public Object[] toArray() {
        Object[] newArray = new Object[0];
        int arrayCapacity = 1;
        for (Object item : genericArray) {
            if (item != null) {
                newArray = Arrays.copyOf(genericArray, arrayCapacity);
                newArray[arrayCapacity - 1] = item;
                arrayCapacity++;
            }
        }
        return newArray;
    }

    @Override
    public void clear() {
        for (int i = 0; i < genericArray.length; i++) {
            genericArray[i] = null;
        }
    }

    @Override
    public MyList sublist(int start, int finish) {
        MyList<T> liste = new MyList<>();
        for (int i = start; i <= finish; i++) {
            if (genericArray[i] != null) {
                liste.add(genericArray[i]);
            }
        }
        return liste;
    }

    @Override
    public Boolean contains(Object data) {
        Boolean containsFlag = false;
        for (int i = 0; i < genericArray.length; i++) {
            if (genericArray[i] == data) {
                containsFlag = true;
            }
        }
        return containsFlag;
    }
}
