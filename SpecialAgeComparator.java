import java.util.Comparator;
public class SpecialAgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        Comparator<Employee> comparator = new ComparatorForAge().reversed(); // сортировка по возрасанию возрастов
        Comparator<Employee> comparator1 = new ComparatorForSalary().reversed(); // сортировка по убыванию зарплат
        if (comparator.compare(o1, o2) != 0) {
            return comparator.compare(o1, o2);
        } else if (comparator.compare(o1, o2) == 0 && comparator1.compare(o1,o2) != 0) {
            return comparator1.compare(o1,o2);
        } else  {
            return o1.compareTo(o2);
        }
    }
}




/**
 * 4.* Отсортировать сотрудников по возрастанию возрастов.
 * Если возрасты одинаковые - то по убыванию зарплаты.
 * Если и они равны - в алфавитном порядке.
 */
