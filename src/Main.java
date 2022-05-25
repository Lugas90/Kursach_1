import java.sql.Array;

public class Main {
    private static Employee [] emp1 = new Employee[10];
    public static void main(String[] args) {
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
        printAllEmployee();
        System.out.println();
        allMonthlyExpenses();
        System.out.println();
        minSalary();
        System.out.println();
        maxSalary();
        System.out.println();
        avgSalary();
        System.out.println();
        allFio();
        System.out.println();
        indexSalary(20);
        System.out.println();
        printAllEmployee();
        }

    private static void printAllEmployee () {
        for (int i = 0; i < emp1.length; i++) {
            System.out.println(emp1[i]);
        }
    }
    private static double allMonthlyExpenses () {
            double sum = 0;
            for (int i = 0; i < emp1.length; i++){
                sum = sum + emp1[i].getSalary();
            }
            System.out.println("Сумма затрат за месяц составляет: " + sum);
            return sum;
        }

    private static double minSalary (){
        double minSum = 1_000_000;
        String name = null;
            for (int i = 0; i < emp1.length; i++) {
                if (minSum > emp1[i].getSalary()){
                    minSum = emp1[i].getSalary();
                    name = emp1[i].getFio();
                }
            }
        System.out.println("Сотрудник " + name + " с минимальной зарплатой: " +  minSum);
            return minSum;
        }

    private static double maxSalary (){
        double maxSum = 0;
        String name = null;
            for (int i = 0; i < emp1.length; i++) {
                if (maxSum < emp1[i].getSalary()){
                    maxSum = emp1[i].getSalary();
                    name = emp1[i].getFio();
                }
            }
            System.out.println("Сотрудник " + name + " с максимальной зарплатой: " +  maxSum);
            return maxSum;
        }
    private static double avgSalary () {
            double avgSum = 0;
            for (int i = 0; i < emp1.length; i++) {
                avgSum = avgSum + emp1[i].getSalary() / emp1.length;
            }
            System.out.println("Среднее значение зарплаты составляет: " + avgSum);
            return avgSum;
        }
    private static void allFio (){
            for (int i = 0; i < emp1.length; i++) {
                System.out.println("ФИО сотрудника: " + emp1[i].getFio());
            }
        }

    private static double indexSalary (int index){
        double indexSum = 0;
            for (int i = 0; i < emp1.length; i++) {
              indexSum = emp1[i].getSalary() / 100 * index;
              emp1[i].setSalary(emp1[i].getSalary() + indexSum);
                System.out.println("Зарплата сотрудника " + emp1[i].getFio() +  " проиндексирована на " + index + "%. Прибавка составляет: " + indexSum);
            }
            return indexSum;
        }
}
