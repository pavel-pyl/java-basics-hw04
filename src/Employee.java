import java.util.Locale;

public class Employee implements Payable{

  private String employeeId;
  private String name;
  private double averageMonthlySalary;

  public Employee(String employeeId, String name) {
    this.employeeId = employeeId;
    this.name = name;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAverageMonthlySalary() {
    return averageMonthlySalary;
  }

  public void setAverageMonthlySalary(double averageMonthlySalary) {
    this.averageMonthlySalary = averageMonthlySalary;
  }

  @Override
  public String toString() {
    return String.format(new Locale("en","US"), "Employee [name = %s; employeeId = %s; av.salary = %.2f]", getName(), getEmployeeId(), getAverageMonthlySalary());
  }

  @Override
  public void calculatePay() {
  }
}
