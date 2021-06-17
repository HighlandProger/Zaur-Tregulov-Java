package regex;

public class Test6_Printf {

    static void employeeInfo (Employee emp){
        System.out.printf("%04d \t Hello %-12s \t %-12s \t %,.1f \n",
                emp.id, emp.name, emp.surname, emp.salary*(1+emp.bonusPct));
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "John", "Connor", 2000, 0.15);
        Employee emp2 = new Employee(15, "Tom", "Cruze", 5000, 0.1);
        Employee emp3 = new Employee(105, "Elton", "John", 6789, 0.3);

        employeeInfo(emp1);
        employeeInfo(emp2);
        employeeInfo(emp3);

        String newString = String.format("\n%02d \t Hello %12s \t %-15s \t %,.1f \n",
                05, "Said", "Kimpaev", 1500*(1+0.35));

        System.out.println(newString);
    }
}

class Employee{
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }
}