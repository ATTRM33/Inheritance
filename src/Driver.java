import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Manager("Rick James", 90000, 10));
        employees.add(new Manager("Kurt Cobain", 45000, 3));
        employees.add(new Engineer("Dave Underwood", 80000, "Python"));
        employees.add(new Engineer("Archibald Bootlicker", 100000, "C++"));
        employees.add(new Manager("Eddie Brock", 70000, 10));

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
