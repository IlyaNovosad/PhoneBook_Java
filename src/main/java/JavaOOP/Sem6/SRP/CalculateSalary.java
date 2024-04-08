package JavaOOP.Sem6.SRP;

public class CalculateSalary {
    private Integer baseSalary;

    public CalculateSalary(Integer baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double calculateSalary() {
        return baseSalary * 1.5;
    }
}
