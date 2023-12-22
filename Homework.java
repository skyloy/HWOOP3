import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Homework {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Andrey", 23 , new Random().nextInt(10_000, 50_000)));
        employees.add(new Employee("Alice", 19 , new Random().nextInt(10_000, 50_000)));
        employees.add(new Employee("Alex", 25 , new Random().nextInt(10_000, 50_000)));
        employees.add(new Employee("Kate", 28 , new Random().nextInt(10_000, 50_000)));
        employees.add(new Employee("Joseph", 34 , new Random().nextInt(10_000, 50_000)));
        employees.add(new Employee("Thomas", 32 , new Random().nextInt(10_000, 50_000)));
        employees.add(new Employee("Harry", 26 , new Random().nextInt(10_000, 50_000)));
        employees.add(new Employee("Oscar", 21 , new Random().nextInt(10_000, 50_000)));
        employees.add(new Employee("James", 23 , new Random().nextInt(10_000, 50_000)));
        employees.add(new Employee("Anton", 31 , 40_000));
        employees.add(new Employee("Lily", 31 , 40_000));

        // сортируем по убыванию зарплат
        ComparatorForAge comparatorAge = new ComparatorForAge();
        employees.sort(comparatorAge);
//      System.out.println(employees); вывод списка для проверки сортировки

        // сортируем по возрастанию зарплат
        ComparatorForSalary comparatorSalary = new ComparatorForSalary();
        employees.sort(comparatorSalary);
//      System.out.println(employees); вывод списка для проверки сортировки

        // Создаем второй список в который поместим топ 5 сотрудников по зарплате
        List<Employee> topFive = new ArrayList<>();
        for (int i = employees.size()-5; i < employees.size(); i++){
            topFive.add(employees.get(i));
        }
        // Сортируем по зарплатам, но реверсим метод,
        // т.к. желательно, чтобы топ сотрудников шёл от большего к меньшему
        Collections.sort(topFive, Employee::compareTo);
        System.out.println("Top 5: " + topFive);

        SpecialAgeComparator Scomparator = new SpecialAgeComparator();
        employees.sort(Scomparator);
        System.out.println(employees);
    }
}
/**
 * Создать класс Employee (сотрудник) со следующими полями:
 * 1. String name - имя
 * 2. int age - возраст
 * 3. double salary - зарплата
 * <p>
 * Необходимо:
 * 0. Создать список из 10-20 рандомных сотрудников.
 * 1. Отсортировать его по убыванию возрастов (от большего к меньшему).
 * 2. Отсортировать его по возрастанию зарплаты.
 * 3. Вывести топ-5 сотрудников с наибольшей зарплатой, отсортированных по имени в алфавитном порядке.
 * 4.* Отсортировать сотрудников по возрастанию возрастов.
 * Если возрасты одинаковые - то по убыванию зарплаты.
 * Если и они равны - в алфавитном порядке.
 */
