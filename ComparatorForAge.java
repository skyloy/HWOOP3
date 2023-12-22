import java.util.Comparator;

public class ComparatorForAge implements Comparator<Employee> {
    // Сортировка сотрудников по возросту  от большего к меньшему
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getAge() < o2.getAge()){
            return 1;
        } else if(o1.getAge() > o2.getAge()){
            return -1;
        } else{
            return 0;
        }

    }



}
