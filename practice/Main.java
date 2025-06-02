
public class Main{
    public static void main(String[] args){
         Employee employee = new Employee("1235", "Hari", "sankar", "hari@gmail.com", "860497821", "hari@1234");
        employee.setBloodGroup(Employee.BloodGroupEnum.B_NEG);
        System.out.println("Blood group set to: " + employee.getBloodGroup());

    }
}