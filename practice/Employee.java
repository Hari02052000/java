import java.util.Date;

public class Employee{

  public  enum GenderEnum { 
        Male,
        Female, 
        Other
    }

 public  enum MarriageStatusEnum {
    single,
    married,
    divorced

    }
  public  enum BloodGroupEnum {
        A_POS,
        A_NEG,
        B_POS,
        B_NEG,
        AB_POS,
        AB_NEG,
        O_POS,
        O_NEG
    }
    private String EmployeeId; 
    private String FirstName;
    private String LastName; 
    private GenderEnum Gender;
    private Date DateOfBirth;
    private Date HireDate;  
    private String Email;
    private MarriageStatusEnum MarriageStatus;
    private BloodGroupEnum BloodGroup;
    private String PhoneNumber;
    private String NationalId;
    private String PassportNumber;
    private String BankAccount;
    private String TaxIdentificationNumber;
    private Float Salary;
    private String DepartmentId;
    private String JobPosition;
    private String AddressId;
    private Boolean IsWorking = true;
    private Date LastWorkingDay; 
    private String ProfilePictureUrl;
    private String Password;

    public Employee(
     String EmployeeId, 
     String FirstName,
     String LastName,
     String Email,
     String PhoneNumber,
     String Password    
     ){
      isBlank(LastName);
      isBlank(FirstName);
      isBlank(EmployeeId);
      isBlank(Email);
      isBlank(PhoneNumber);
      isBlank(Password);
        this.EmployeeId = EmployeeId;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
        this.Password = Password;
    }
    private boolean isBlank(String str) {  
         if(str == null || str.trim().isEmpty()){
         throw new Error("invalid input");
        }
        return true;
    }

   public String getEmployeeId(){
        return this.EmployeeId;
     } 
   public  Void setEmployeeId(String EmployeeId){
       this.isBlank(EmployeeId);
        this.EmployeeId = EmployeeId;
        return null;
        
     } 
   public  String getFirstName(){
        return this.FirstName;
     } 
   public  Void setFirstName(String FirstName){
       this.isBlank(FirstName);
        this.FirstName =  FirstName;
        return null;
     }
   public  String getLastName(){
        return this.LastName;
     } 
   public  void setLastName(String LastName){
        this.isBlank(LastName);
        this.LastName = LastName;
     } 
   public  GenderEnum getGender(){
        return this.Gender;
     } 
   public  Void setGender(GenderEnum Gender){
        this.Gender = Gender;
        return null;
     }  
    public Date getDateOfBirth(){
       return this.DateOfBirth;
     }
   public  Void setDateOfBirth(Date DateOfBirth){
        this.DateOfBirth = DateOfBirth;
        return null;
     }
   public  String getPassword(){
      return this.Password;
     }
   public  Void setPassword(String Password){
      this.Password = Password;
      return null;
     }
   public  Date getHireDate(){
        return this.HireDate;
     }   
   public  Void setHireDate(Date hireDate){
        this.HireDate = hireDate;
        return null;
     }   
   public  String getEmail(){
        return this.Email;
     }
  public  Void setEmail(String Email){
      this.isBlank(Email);
        this.Email = Email;
        return null;
     }
 public  MarriageStatusEnum getMarriageStatus(){
        return this.MarriageStatus;
     }
  public Void setMarriageStatus(MarriageStatusEnum MarriageStatus){
        this.MarriageStatus = MarriageStatus;
        return null;
     }
  public  BloodGroupEnum getBloodGroup(){
        return this.BloodGroup;
     }
  public Void setBloodGroup(BloodGroupEnum bloodGroup){
        this.BloodGroup = bloodGroup;
        return null;
    }
   public  String getPhoneNumber(){
        return this.PhoneNumber;
     }
 public  Void setPhoneNumber(String phoneNumber){
       this.isBlank(phoneNumber);
        this.PhoneNumber = phoneNumber;
        return null;
    }
  public   String getNationalId(){
        return this.NationalId;
     }
  public  Void setNationalId(String NationalId){
       this.isBlank(NationalId);
        this.NationalId = NationalId;
        return null;
     }
   public  String getPassportNumber(){
        return this.PassportNumber;
     }
   public  Void setPassportNumber(String PassportNumber){
      this.isBlank(PassportNumber);
        this.PassportNumber = PassportNumber;
        return null;
     }
   public String getBankAccount(){
        return this.BankAccount;
     }
   public Void setBankAccount(String BankAccount){
        this.isBlank(BankAccount);
        this.BankAccount = BankAccount;
        return null;
     }
   public  String TaxIdentificationNumber(){
        return this.TaxIdentificationNumber;
     } 
   public  Void setTaxIdentificationNumber(String taxNumber){
        this.isBlank(taxNumber);
        this.TaxIdentificationNumber = taxNumber;
        return null;
     } 
   public  Float getSalary(){
        return this.Salary;
     }
   public  Void setSalary(Float Salary){
        this.Salary = Salary;
        return null;
     }
   public  String getDepartmentId(){
        return this.DepartmentId;
     }
   public  Void setDepartmentId(String departmentId){
        this.isBlank(departmentId);
        this.DepartmentId = departmentId;
        return null;
     }
   public  String getJobPosition(){
        return this.JobPosition;
     }
   public  Void setJobPosition(String jobPosition){
      this.isBlank(jobPosition);
       this.JobPosition = jobPosition;
       return null;
     }
  public   String getAddressId(){
        return this.AddressId;
     }
   public  Void setAddressId(String addressId){
      this.isBlank(addressId);
        this.AddressId = addressId;
        return null;
     }
   public  Boolean getIsWorking(){
        return this.IsWorking;
     }
   public  Void setIsWorking(Boolean isWorking){
        this.IsWorking = isWorking;
        return null;
     }
    public Date getLastWorkingDay(){
        return this.LastWorkingDay;
     } 
    public Void setLastWorkingDay(Date LastWorkingDay){
        this.LastWorkingDay = LastWorkingDay;
        return null;
     } 
   public  String getProfilePictureUrl(){
        return this.ProfilePictureUrl;
     }
   public  Void setProfilePictureUrl(String ProfilePictureUrl){
      this.isBlank(ProfilePictureUrl);
        this.ProfilePictureUrl = ProfilePictureUrl;
        return null;
     }

}