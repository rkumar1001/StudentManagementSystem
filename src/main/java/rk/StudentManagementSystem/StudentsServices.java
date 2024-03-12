package rk.StudentManagementSystem;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rajat
 */

@Service
public class StudentsServices {
    
    @Autowired
    private StudentsRepository studentsRepository;
    
    public List<Students> getAllStudents() {
        return studentsRepository.findAll();
    }

    @SuppressWarnings("null")
    public Optional<Students> getStudentById(Long id) {
        return studentsRepository.findById(id);
    }
    public List<Students> getStudentsByName(String name){
        return studentsRepository.findByName(name);
    }
    
    public List<Students> getStudentsByAddress(String address){
        return studentsRepository.findByAddress(address);
    }
    
    public Students getStudentsByEmailAddress(String emailAddress){
        return studentsRepository.findByEmailAddress(emailAddress);
    }
    
    public Students getStudentsByMobileNumber(String mobileNo){
        return studentsRepository.findByMobileNo(mobileNo);
    }

    @SuppressWarnings("null")
    public Students addStudents(Students students) {
        return studentsRepository.save(students);
    }

    public Students updateStudents(Long id, Students students) {
        students.setId(id);
        return studentsRepository.save(students);
    }

    @SuppressWarnings("null")
    public void deleteStudents(Long id) {
        studentsRepository.deleteById(id);
    }
    
}
