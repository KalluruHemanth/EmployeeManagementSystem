package com.spec.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="employee_table")// it will change table nam ein the database @NotBlank
public class Employee {
	
	@Column(name="employeeName")//will change column name inthe table 
	private String empName;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empid;
	@NotNull
	private double empSalary;
	
	@Pattern(regexp="^[6789][0-9]{9}$",
	message="pls enter a valid number")
	private String moblieNo;
	@Email(message="its a mandtory field")
	private String email;
	
	private String address;

	private String department;
	
	private int age;
	
	private char gender;
	
	private String designation;
	public Employee() {
		super();
	}
	public Employee(String empName, int empid, double empSalary, String moblieNo, String email, String address,
			String department, int age, char gender, String designation) {
		super();
		this.empName = empName;
		this.empid = empid;
		this.empSalary = empSalary;
		this.moblieNo = moblieNo;
		this.email = email;
		this.address = address;
		this.department = department;
		this.age = age;
		this.gender = gender;
		this.designation = designation;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getMoblieNo() {
		return moblieNo;
	}
	public void setMoblieNo(String moblieNo) {
		this.moblieNo = moblieNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empid=" + empid + ", empSalary=" + empSalary + ", moblieNo="
				+ moblieNo + ", email=" + email + ", address=" + address + ", department=" + department + ", age=" + age
				+ ", gender=" + gender + ", designation=" + designation + "]";
	}
	

}