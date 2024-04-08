package JavaOOP.Sem6.SRP;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Employee {
    private String name;
    private int baseSalary;

    public Employee(String name) {
        this.name = name;
    }
}
