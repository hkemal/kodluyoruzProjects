package java102lecture.A05Collections.lecture_5_4_Tree_Set;

import java.util.Comparator;

public class OrderNoteComparable implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getNote() - student2.getNote();
    }
}
