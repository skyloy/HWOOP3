import java.util.Comparator;

public class ComparatorForSalary implements Comparator<Employee> {
    // Сортировка сотрудников по возрастанию зарплаты
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int)(o1.getSalary() - o2.getSalary());
    }

}
