/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Week4.StudentInfoSystem;

/**
 *
 * @author ayza
 */
public class Course {
    Teacher teacher;
    String courseName;
    int courseCode;
    String prefix;
    double note;
    double sozNote;

    //Constructor
    Course(String courseName,int courseCode,String prefix){
        this.teacher=teacher;
        this.courseName=courseName;
        this.courseCode=courseCode;
        this.prefix=prefix;
        this.note=0.0;
        this.sozNote=0.0;
    }
    //methods
    protected void addTeacher(Teacher teacher)
    {
        if(this.prefix.equals(teacher.branch))
        {
            System.out.println(teacher.name+" bu dersi verebilir.");
        }
        else {
            System.out.println(teacher.name+" bu dersi veremez!");
        }
    }

    protected void printTeacher()
    {
        if (teacher.name!= null) {
            System.out.println(teacher.name+" adlı öğretmen "+this.courseName+" dersini verebilir.");
        }
        else {
            System.out.println(teacher.name+" adlı öğretmen "+this.courseName+" dersini veremez!");
        }
    }
}
