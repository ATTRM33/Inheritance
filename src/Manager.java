public class Manager extends Employee{
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void conductMeeting() {
        System.out.println(getName() + " is conducting a meeting.");
    }

    @Override
    public String toString() {
        return "Manager | Name: " + getName() + "| Salary: " + getSalary() + "| Team Size: " + teamSize;
    }
}
