/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rk.StudentManagementSystem;

/**
 *
 * @author rajat
 */
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class StudentNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(StudentNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String studentNotFoundHandler(StudentNotFoundException ex) {
    return ex.getMessage();
  }
}