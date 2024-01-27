/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Home
 */
public class PartTimeStudent extends Student{
    private int NumOfCourse;

    public PartTimeStudent(int NumOfCourse, int sID, String sName) {
        super(sID, sName);
        this.NumOfCourse = NumOfCourse;
    }
    
}
