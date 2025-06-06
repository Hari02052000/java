package com.example.Employees.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "employee_table")
public class Employee {

    public enum GenderEnum {
        Male,
        Female,
        Other
    }

    public enum MarriageStatusEnum {
        single,
        married,
        divorced
    }

    public enum BloodGroupEnum {
        A_POS,
        A_NEG,
        B_POS,
        B_NEG,
        AB_POS,
        AB_NEG,
        O_POS,
        O_NEG
    }

    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Enumerated(EnumType.STRING)
    private GenderEnum gender;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @Temporal(TemporalType.DATE)
    private Date hireDate;

    @Column(nullable = false, unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    private MarriageStatusEnum marriageStatus;

    @Enumerated(EnumType.STRING)
    private BloodGroupEnum bloodGroup;

    @Column(nullable = false,unique = true)
    private String phoneNumber;

    private String nationalId;

    private String passportNumber;

    private String bankAccount;

    private String taxIdentificationNumber;

    private Float salary;

    private String departmentId;

    private String jobPosition;

    private String addressId;

    @Column(nullable = false)
    private Boolean isWorking = true;

    @Temporal(TemporalType.DATE)
    private Date lastWorkingDay;

    @Column(columnDefinition = "TEXT")
    private String profilePictureUrl;

    @Column(nullable = false)
    private String password;

    public Employee(){}
    public Employee(String firstName, String lastName, String email, String phoneNumber, String password) {
        if (isBlank(firstName) || isBlank(lastName) || isBlank(email) || isBlank(phoneNumber) || isBlank(password)) {
            throw new IllegalArgumentException("Fields cannot be blank");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    private boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }
    
       public Long getEmployeeId(){
        return this.employeeId;
     } 
   public  String getFirstName(){
        return this.firstName;
     } 
   public  Void setFirstName(String FirstName){
       this.isBlank(FirstName);
        this.firstName =  FirstName;
        return null;
     }
   public  String getLastName(){
        return this.lastName;
     } 
   public  void setLastName(String LastName){
        this.isBlank(LastName);
        this.lastName = LastName;
     } 
   public  GenderEnum getGender(){
        return this.gender;
     } 
   public  Void setGender(GenderEnum Gender){
        this.gender = Gender;
        return null;
     }  
    public Date getDateOfBirth(){
       return this.dateOfBirth;
     }
   public  Void setDateOfBirth(Date DateOfBirth){
        this.dateOfBirth = DateOfBirth;
        return null;
     }
   public  String getPassword(){
      return this.password;
     }
   public  Void setPassword(String Password){
      this.password = Password;
      return null;
     }
   public  Date getHireDate(){
        return this.hireDate;
     }   
   public  Void setHireDate(Date hireDate){
        this.hireDate = hireDate;
        return null;
     }   
   public  String getEmail(){
        return this.email;
     }
  public  Void setEmail(String Email){
      this.isBlank(Email);
        this.email = Email;
        return null;
     }
 public  MarriageStatusEnum getMarriageStatus(){
        return this.marriageStatus;
     }
  public Void setMarriageStatus(MarriageStatusEnum MarriageStatus){
        this.marriageStatus = MarriageStatus;
        return null;
     }
  public  BloodGroupEnum getBloodGroup(){
        return this.bloodGroup;
     }
  public Void setBloodGroup(BloodGroupEnum bloodGroup){
        this.bloodGroup = bloodGroup;
        return null;
    }
   public  String getPhoneNumber(){
        return this.phoneNumber;
     }
 public  Void setPhoneNumber(String phoneNumber){
       this.isBlank(phoneNumber);
        this.phoneNumber = phoneNumber;
        return null;
    }
  public   String getNationalId(){
        return this.nationalId;
     }
  public  Void setNationalId(String NationalId){
       this.isBlank(NationalId);
        this.nationalId = NationalId;
        return null;
     }
   public  String getPassportNumber(){
        return this.passportNumber;
     }
   public  Void setPassportNumber(String PassportNumber){
      this.isBlank(PassportNumber);
        this.passportNumber = PassportNumber;
        return null;
     }
   public String getBankAccount(){
        return this.bankAccount;
     }
   public Void setBankAccount(String BankAccount){
        this.isBlank(BankAccount);
        this.bankAccount = BankAccount;
        return null;
     }
   public  String TaxIdentificationNumber(){
        return this.taxIdentificationNumber;
     } 
   public  Void setTaxIdentificationNumber(String taxNumber){
        this.isBlank(taxNumber);
        this.taxIdentificationNumber = taxNumber;
        return null;
     } 
   public  Float getSalary(){
        return this.salary;
     }
   public  Void setSalary(Float Salary){
        this.salary = Salary;
        return null;
     }
   public  String getDepartmentId(){
        return this.departmentId;
     }
   public  Void setDepartmentId(String departmentId){
        this.isBlank(departmentId);
        this.departmentId = departmentId;
        return null;
     }
   public  String getJobPosition(){
        return this.jobPosition;
     }
   public  Void setJobPosition(String jobPosition){
      this.isBlank(jobPosition);
       this.jobPosition = jobPosition;
       return null;
     }
  public   String getAddressId(){
        return this.addressId;
     }
   public  Void setAddressId(String addressId){
      this.isBlank(addressId);
        this.addressId = addressId;
        return null;
     }
   public  Boolean getIsWorking(){
        return this.isWorking;
     }
   public  Void setIsWorking(Boolean isWorking){
        this.isWorking = isWorking;
        return null;
     }
    public Date getLastWorkingDay(){
        return this.lastWorkingDay;
     } 
    public Void setLastWorkingDay(Date LastWorkingDay){
        this.lastWorkingDay = LastWorkingDay;
        return null;
     } 
   public  String getProfilePictureUrl(){
        return this.profilePictureUrl;
     }
   public  Void setProfilePictureUrl(String ProfilePictureUrl){
      this.isBlank(ProfilePictureUrl);
        this.profilePictureUrl = ProfilePictureUrl;
        return null;
     }
   public Map<String,Object>getEmployeeDetails(){
        Map<String, Object> employeeDetails = new HashMap<>();
        employeeDetails.put("employee_id", this.employeeId);
        employeeDetails.put("firstName", this.firstName);
        employeeDetails.put("lastName", this.lastName);
        employeeDetails.put("gender", this.gender);
        employeeDetails.put("dateOfBirth", this.dateOfBirth);
        employeeDetails.put("hireDate", this.hireDate);
        employeeDetails.put("email", this.email);
        employeeDetails.put("profilePictureUrl", this.profilePictureUrl);
        employeeDetails.put("lastWorkingDay", this.lastWorkingDay);
        employeeDetails.put("jobPosition", this.jobPosition);
        employeeDetails.put("marriageStatus", this.marriageStatus);
        employeeDetails.put("salary", this.salary);
        employeeDetails.put("taxIdentificationNumber", this.taxIdentificationNumber);
        employeeDetails.put("bankAccount", this.bankAccount);
        employeeDetails.put("passportNumber", this.passportNumber);
        employeeDetails.put("nationalId", this.nationalId);
        employeeDetails.put("phoneNumber", this.phoneNumber);
        employeeDetails.put("bloodGroup", this.bloodGroup);
       return employeeDetails; 
   }
}
