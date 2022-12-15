public class Programmer {
    private String name;
    private double salary;
    private Language language;

    public Programmer(String name, double salary, Language language) {
        this.name = name;
        this.salary = salary;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;

    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                "salary=" + salary +
                "language=" + language ;
    }

}
