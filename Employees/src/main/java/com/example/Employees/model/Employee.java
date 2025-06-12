package com.example.Employees.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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

  private enum ValidationFieldsEnum {
    FIRST_NAME,
    LAST_NAME,
    EMAIL,
    PHONE_NUMBER,
    PASSWORD
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

  @Column(nullable = false, unique = true)
  private String phoneNumber;

  private String nationalId;

  private String passportNumber;

  private String bankAccount;

  private String taxIdentificationNumber;
  
  @Column(nullable = false)
  private double salary = 0.0;

  private String departmentId;

  private String jobPosition;

  private String addressId;

  @Column(nullable = false)
  private boolean isWorking = true;

  @Temporal(TemporalType.DATE)
  private Date lastWorkingDay;

  @Column(columnDefinition = "TEXT")
  private String profilePictureUrl;

  @Column(nullable = false)
  private String password;

  public Employee() {}

  public Employee(
      String firstName, String lastName, String email, String phoneNumber, String password) {
    this.setFirstName(firstName);
    this.setLastName(lastName);
    this.setEmail(email);
    this.setPhoneNumber(phoneNumber);
    this.setPassword(password);
  }

  private boolean isBlank(String str) {
    return Objects.requireNonNullElse(str, "").isBlank();
  }

  private boolean validate(ValidationFieldsEnum fields, String str) {
    switch (fields) {
      case EMAIL:
        if (isBlank(str)) {
          throw new IllegalArgumentException("given" + str + "is not a valid email");
        } else {
          return true;
        }
      case FIRST_NAME:
        if (isBlank(str)) {
          throw new IllegalArgumentException("given" + str + "is not a valid first name");
        } else {
          return true;
        }

      case LAST_NAME:
        if (isBlank(str)) {
          throw new IllegalArgumentException("given" + str + "is not a valid last name");
        } else {
          return true;
        }

      case PASSWORD:
        if (isBlank(str)) {
          throw new IllegalArgumentException("please create a valid password");
        } else {
          return true;
        }

      case PHONE_NUMBER:
        if (isBlank(str)) {
          throw new IllegalArgumentException("given" + str + "is not a valid phone number");
        } else {
          return true;
        }
    }
    throw new IllegalArgumentException("invalid options");
  }

  public Long getEmployeeId() {
    return this.employeeId;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.validate(ValidationFieldsEnum.FIRST_NAME, firstName);
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.validate(ValidationFieldsEnum.LAST_NAME, lastName);
    this.lastName = lastName;
  }

  public GenderEnum getGender() {
    return this.gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public Date getDateOfBirth() {
    return this.dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Date getHireDate() {
    return this.hireDate;
  }

  public void setHireDate(Date hireDate) {
    this.hireDate = hireDate;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.validate(ValidationFieldsEnum.EMAIL, email);
    this.email = email;
  }

  public MarriageStatusEnum getMarriageStatus() {
    return this.marriageStatus;
  }

  public void setMarriageStatus(MarriageStatusEnum marriageStatus) {
    this.marriageStatus = marriageStatus;
  }

  public BloodGroupEnum getBloodGroup() {
    return this.bloodGroup;
  }

  public void setBloodGroup(BloodGroupEnum bloodGroup) {
    this.bloodGroup = bloodGroup;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.validate(ValidationFieldsEnum.PHONE_NUMBER, phoneNumber);
    this.phoneNumber = phoneNumber;
  }

  public String getNationalId() {
    return this.nationalId;
  }

  public void setNationalId(String nationalId) {
    this.nationalId = nationalId;
  }

  public String getPassportNumber() {
    return this.passportNumber;
  }

  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }

  public String getBankAccount() {
    return this.bankAccount;
  }

  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }

  public String TaxIdentificationNumber() {
    return this.taxIdentificationNumber;
  }

  public void setTaxIdentificationNumber(String taxNumber) {
    this.taxIdentificationNumber = taxNumber;
  }

  public double getSalary() {
    return this.salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getDepartmentId() {
    return this.departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.isBlank(departmentId);
    this.departmentId = departmentId;
  }

  public String getJobPosition() {
    return this.jobPosition;
  }

  public void setJobPosition(String jobPosition) {
    this.jobPosition = jobPosition;
  }

  public String getAddressId() {
    return this.addressId;
  }

  public void setAddressId(String addressId) {
    this.isBlank(addressId);
    this.addressId = addressId;
  }

  public Boolean getIsWorking() {
    return this.isWorking;
  }

  public void setIsWorking(boolean isWorking) {
    this.isWorking = isWorking;
  }

  public Date getLastWorkingDay() {
    return this.lastWorkingDay;
  }

  public void setLastWorkingDay(Date LastWorkingDay) {
    this.lastWorkingDay = LastWorkingDay;
  }

  public String getProfilePictureUrl() {
    return this.profilePictureUrl;
  }

  public void setProfilePictureUrl(String ProfilePictureUrl) {
    this.isBlank(ProfilePictureUrl);
    this.profilePictureUrl = ProfilePictureUrl;
  }

  public Map<String, Object> getEmployeeDetails() {
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
