import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        Employee [] emp1 = new Employee[10];
        emp1 [0] = new Employee("Разборов Петр Михайлович", 1, 70_000);
        emp1 [1] = new Employee("Карасев Виктор Иванович", 1, 68_500);
        emp1 [2] = new Employee("Проскурина Яна Викторовна", 2, 81_300);
        emp1 [3] = new Employee("Анджи Салих Ахмедович", 2, 70_000);
        emp1 [4] = new Employee("Крипова Лариса Николаевна", 3, 88_600);
        emp1 [5] = new Employee("Антипова Елена Сергеевна", 3, 101_700);
        emp1 [6] = new Employee("Волшебник Павел Петрович", 4, 61_000);
        emp1 [7] = new Employee("Мерлин Бахтияр Абркадабрович", 4, 68_500);
        emp1 [8] = new Employee("Толян Анатолий Васильевич", 5, 74_900);
        emp1 [9] = new Employee("Кружка Мария Степановна", 5, 78_500);

        System.out.println(emp1[5]);
        System.out.println();
        printAllEmployee(emp1);
        System.out.println();
        allMonthlyExpenses(emp1);
        System.out.println();
        minSalary(emp1);
        System.out.println();
        maxSalary(emp1);
        System.out.println();
        avgSalary(emp1);
        System.out.println();
        allFio(emp1);
        System.out.println();
        indexSalary(emp1);
        System.out.println();
        printAllEmployee(emp1);
        }

    public static void printAllEmployee (Employee [] emp) {
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
        }
    }
        public static double allMonthlyExpenses (Employee [] emp) {
            double sum = 0;
            for (int i = 0; i < emp.length; i++){
                sum = sum + emp[i].getSalary();
            }
            System.out.println("Сумма затрат за месяц составляет: " + sum);
            return sum;
        }

        public static double minSalary (Employee [] emp){
        double minSum = 0;
            for (int i = 0; i < emp.length; i++) {
                if (emp[i].getSalary() > 0) {
                    minSum = emp[i].getSalary();
                    break;
                }
            }
            for (int i = 0; i < emp.length; i++) {
                if (minSum > emp[i].getSalary()){
                    minSum = emp[i].getSalary();
                }
            }
            System.out.println("Сотрудник с минимальной зарплатой: " +  minSum);
            return minSum;
        }

        public static double maxSalary (Employee [] emp){
        double maxSum = 0;
            for (int i = 0; i < emp.length; i++) {
                if (maxSum < emp[i].getSalary()){
                    maxSum = emp[i].getSalary();
                }
            }
            System.out.println("Сотрудник с максимальной зарплатой: " +  maxSum);
            return maxSum;
        }
        public static double avgSalary (Employee [] emp) {
            double avgSum = 0;
            for (int i = 0; i < emp.length; i++) {
                avgSum = avgSum + emp[i].getSalary() / emp.length;
            }
            System.out.println("Среднее значение зарплаты составляет: " + avgSum);
            return avgSum;
        }
        public static void allFio (Employee [] emp){
            for (int i = 0; i < emp.length; i++) {
                System.out.println("ФИО сотрудника: " + emp[i].getFio());
            }
        }
        
        public static double indexSalary (Employee [] emp){
        double indexSum = 0;
            for (int i = 0; i < emp.length; i++) {
              indexSum = emp[i].getSalary() * 0.10;
              emp[i].setSalary(emp[i].getSalary() + indexSum);
                System.out.println("Зарплата сотрудника проиндексирована на 10%. Прибавка составляет: " + indexSum);
            }
            return indexSum;
        }
}
