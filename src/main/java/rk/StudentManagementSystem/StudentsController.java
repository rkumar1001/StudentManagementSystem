
package rk.StudentManagementSystem;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rajat
 */
@RestController
@RequestMapping("/students")
public class StudentsController {

    public StudentsController(StudentsServices services) {
        this.services = services;
    }
    
    private final StudentsServices services;
    
    @GetMapping()
    List<Students> all(){
       return services.getAllStudents();
    }
    
    @GetMapping("/{id}")
    Students byId(@PathVariable Long id){
       return services.getStudentById(id)
                .orElseThrow(() -> new StudentNotFoundException());
    }
    
    @GetMapping("/byName/{name}")
    List<Students> byName(@PathVariable String name){
       return  services.getStudentsByName(name);              
    }
    
    @GetMapping("/byAddress/{address}")
    List<Students> byAddress(@PathVariable String address){
       return  services.getStudentsByAddress(address);       
    }
    
    @GetMapping("/byMobileNumber/{mobileNo}")
    Students byMobileNumber(@PathVariable String mobileNo){
       return (Students) services.getStudentsByMobileNumber(mobileNo);          
    }
    
    @GetMapping("/byEmailAddress/{emailAddress}")
    Students byEmailAddress(@PathVariable String emailAddress){
       return (Students) services.getStudentsByEmailAddress(emailAddress);          
    }
    
    @PostMapping("/addStudents")
  Students newStudent(@RequestBody Students newStudent) {
    return services.addStudents(newStudent);
  }
  
  @PutMapping("/updatStudents/{id}")
  Students updateStudents(@PathVariable Long id,@RequestBody Students newStudent ) {
    
    return services.getStudentById(id)
      .map(student -> {
        student.setName(newStudent.getName());
        student.setAddress(newStudent.getAddress());
        student.setMobileNo(newStudent.getMobileNo());
        student.setEmailAddress(newStudent.getEmailAddress());
        return services.addStudents(student);
      })
      .orElseGet(() -> {
        newStudent.setId(id);
        return services.addStudents(newStudent);
      });
  }
  
   @DeleteMapping("/deleteStudents/{id}")
  void deleteEmployee(@PathVariable Long id) {
    services.deleteStudents(id);
  }
    
    
    
    
}
