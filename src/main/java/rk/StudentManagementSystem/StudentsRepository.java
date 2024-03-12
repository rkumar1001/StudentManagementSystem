
package rk.StudentManagementSystem;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rajat
 */
public interface StudentsRepository extends JpaRepository<Students, Long> {
    
    List<Students> findByName(String name);
    List<Students> findByAddress(String address);
    Students findByEmailAddress(String emailAddress);
    Students findByMobileNo(String mobileNo);
    
}
