package at.htl.klassestudent;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student[] students1 = {
                new Student("Anna", "Schaetz"),
                new Student( "Emely", "Steiner"),
                new Student( "Sarah", "Feichtinger"),
                new Student( "Daniela", "Ploechl"),
                new Student( "Nina", "Weissengruber")};

        Student[] students2 = {
                new Student("Laura", "Riener"),
                new Student( "Christine", "Raffeiner"),
                new Student( "Leonie", "Zettl"),
                new Student( "Marcel", "Poelzl"),
                new Student( "Gregor", "David")};

        Klasse zweiteKlasse = new Klasse(2,students1);
        Klasse dritteKlasse = new Klasse(3,students2);

        zweiteKlasse.sortBubble();


        System.out.printf("\nSortiert     : \n");
        for(Student s1 : zweiteKlasse.getStudents()){
            System.out.print(s1.getVorname() + " " + s1.getNachname() + "\n");
        }

        dritteKlasse.sortInsert();


        System.out.printf("\nSortiert     : \n");
        for(Student s2 : dritteKlasse.getStudents()){
            System.out.print(s2.getVorname() + " " + s2.getNachname() + "\n");
        }

    }
}
