public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println(" Задача 1");
        String firstName = "Семён";
        String middleName = "Иванов";
        String lastName = "Семёнович";
        String fullName = middleName + " " + firstName + " " + lastName;
        System.out.println(" Ф.И.О. сотрудника " + fullName);
        // Задача 2
        System.out.println(" Задача 2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        // Задача 3
        System.out.println(" Задача 3");
        String fullName2 = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName2);

    }
}