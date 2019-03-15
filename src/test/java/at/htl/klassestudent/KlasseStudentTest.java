package at.htl.klassestudent;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class KlasseStudentTest {

    @Test
    public void test13(){
        Student[] students = {
                new Student("Anna", "Schaetz"),
                new Student( "Emely", "Steiner"),
                new Student( "Sarah", "Feichtinger"),
                new Student( "Daniela", "Ploechl"),
                new Student( "Nina", "Weissengruber")};

        Student[] rightOrder = students.clone();
        Klasse klass = new Klasse(1,students);
        klass.sortBubble();
        Arrays.sort(rightOrder);
        assertThat(klass.getStudents(), is(rightOrder));

    }

    @Test
    public void test30(){
        Student[] students = {
                new Student("Laura", "Riener"),
                new Student( "Christine", "Raffeiner"),
                new Student( "Leonie", "Zettl"),
                new Student( "Marcel", "Poelzl"),
                new Student( "Gregor", "David")};

        Student[] rightOrder = students.clone();
        Klasse klass = new Klasse(2,students);
        klass.sortInsert();
        Arrays.sort(rightOrder);
        assertThat(klass.getStudents(), is(rightOrder));

    }


}