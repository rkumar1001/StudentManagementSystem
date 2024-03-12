/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rk.StudentManagementSystem;

/**
 *
 * @author rajat
 */
class StudentNotFoundException extends RuntimeException {
    
    StudentNotFoundException() {
        super("Could not find student ");
    }

}
