public class Engineer extends Employee {
    private String specialization;

    public Engineer(String name, float salary, String specialization) {
        super(name, salary);
        this.specialization = specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public String getSpecialization() {
        return specialization;
    }

    public void debugCode(){
        System.out.println(getName() + "is debugging code in " + specialization);
    }
    @Override
    public String toString() {
        return  "Engineer | Name: " + getName() + "| Salary: " + getSalary() + "| Specialization: " + specialization;
    }
}
