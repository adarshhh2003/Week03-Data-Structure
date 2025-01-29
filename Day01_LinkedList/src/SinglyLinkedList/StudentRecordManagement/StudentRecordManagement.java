package SinglyLinkedList.StudentRecordManagement;

public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentRecordManager manager = new StudentRecordManager();
        manager.addStudentAtBeginning(2, "Rahul", 24, "B+");
        manager.addStudentAtBeginning(1, "Adarsh", 21, "A+");
        manager.addStudentAtEnd(4, "Amit", 24, "C");
        manager.addStudentAtPosition(2, 3, "Rohit", 25, "B+");
        manager.deleteStudent(2);
        manager.updateGrade(4, "B+");
        manager.searchStudent(1);

        manager.displayAllStudent();
    }
}
