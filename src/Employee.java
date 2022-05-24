import java.lang.reflect.Array;

public class Employee {
    private String fio;
    private int department;
    private double salary;
    private static int counter = 1;
    private int id;
    public Employee (String fio, int department, double salary){
        id = counter++;
      this.fio = fio;
      this.department = department;
      this.salary = salary;
    }
    public int getId (){
        return this.id;
    }
    public String getFio (){
        return this.fio;
    }
    public int getDepartment (){
        return this.department;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
     public String toString(){
        return "ID: " +  id + "; " + "ФИО сотрудника: " + fio + "; " + "Отдел: " + department + "; " + "Зарплата: " + salary;
    }

}


