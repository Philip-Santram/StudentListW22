/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package studentlist;

/**
 * SYST 17796 - P16
 * Fundamentals of Software Design and Development
 *
 * This class represents a part-time student
 * @author Philip Santram
 */
public class PartTimeStudent extends Student {

    private int numCourses;
    
    public PartTimeStudent(String name, int numCourses)  {
       super(name);   
       this.numCourses = numCourses;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
    
    
}
