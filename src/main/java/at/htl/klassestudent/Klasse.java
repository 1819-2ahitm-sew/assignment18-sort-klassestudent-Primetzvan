package at.htl.klassestudent;

public class Klasse {

    private int klassenbezeichnung;
    private Student [] students;

    Klasse(){

    }

    Klasse(int klassenbezeichnung, Student [] students){
        this.klassenbezeichnung = klassenbezeichnung;
        this.students = students;
    }

    public void sortBubble() {
        boolean swapfinished = false;
        for (int i = 0; i < getStudents().length - 1 && !swapfinished; i++) {
            swapfinished = true;
            for (int j = getStudents().length - 1; j > i; j--) {
                if (getStudents()[j - 1].compareTo(getStudents()[j]) > 0) {
                    swap(getStudents(), j, j - 1);
                    swapfinished = false;
                }
            }
        }
//        boolean sorted = true;
//        boolean finished = false;
//        while (!finished) {
//            sorted = false;
//            for (int fix = 0; fix < students.length - 1; fix++) {
//
//                if (students[fix].getNachname() > students[fix+1]) {
//                    swap(letters,fix, fix+1);
//                    sorted = true;
//                }
//            }
//            if (!sorted) {
//                finished = true;
//            }
//        }

    }

   public void sortInsert() {
        Student[] newArray = new Student[getStudents().length];

        for (int i = 0; i < getStudents().length; i++) {
            int j = i - 1;
            while (j >= 0 && newArray[j].compareTo(getStudents()[i]) > 0){
                newArray[j + 1] = newArray[j];
                j--;
            }
            newArray[j + 1] = getStudents()[i];
        }
        students = newArray;
   }

    private static void swap(Student[] students, int i, int j) {
        Student help;
        help = students[i];
        students[i] = students[j];
        students[j] = help;
    }

    public Student[] getStudents() {
        return students;
    }
}
