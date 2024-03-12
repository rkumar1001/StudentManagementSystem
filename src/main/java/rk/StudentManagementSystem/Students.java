/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rk.StudentManagementSystem;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.Objects;

/**
 *
 * @author rajat
 */
@Entity
public class Students{
    
    private @Id @GeneratedValue Long id;
    private String name;
    private String address;
    private String mobileNo;
    private String emailAddress;
    
    public Students() {}

    public Students(String name, String address, String mobileNo, String emailAddress) 
    {
        this.name = name;
        this.address = address;
        this.mobileNo = mobileNo;
        this.emailAddress = emailAddress;
    }
    
    
    

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    
    @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Students))
      return false;
    Students student = (Students) o;
    return Objects.equals(this.id, student.id) && Objects.equals(this.name, student.name)
        && Objects.equals(this.address, student.address) &&
            Objects.equals(this.mobileNo, student.mobileNo) && 
            Objects.equals(this.emailAddress, student.emailAddress);
  }

    @Override
    public int hashCode() {
        
        return Objects.hash(this.id,this.name,this.address,this.mobileNo,
                this.emailAddress);
    }
    
    @Override
  public String toString() {
    return "Student{" + "id=" + this.id + ", name='" + 
            this.name + '\'' + ", address='" + this.address + '\'' + ", "
            + "mobileNo='" + this.mobileNo + '\'' + ", emailAddress='" + this.emailAddress +'\'' +'}';
  }
    
}
