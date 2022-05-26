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
        System.out.println();
        departMinSalary(4);
        System.out.println();
        departMaxSalary(1);
        System.out.println();
        departAllMonthlyExpenses(3);
        System.out.println();
        departAvgSalary(1);
        System.out.println();
        departIndexSalary(2, 10);
        System.out.println();
        departPrintEmployee(4);
        System.out.println();
        findSalarySmaller(85_000);
        System.out.println();
        findSalaryMore(95_000);
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

        private static double departMinSalary (int department){
        double minSal = 1_000_000;
        String name = null;
            for (int i = 0; i < emp1.length; i++) {
                if (minSal > emp1[i].getSalary() && department == emp1[i].getDepartment()) {
                    minSal = emp1[i].getSalary();
                    department = emp1[i].getDepartment();
                    name = emp1[i].getFio();
                }
            }
            System.out.println("Минимальная зарплата у сотрудника из отдела №" + department + " " + name + " составляет " + minSal);
            return department;
        }
        private static double departMaxSalary (int department){
        double maxSal = 0;
        String name = null;
            for (int i = 0; i < emp1.length; i++) {
                if (maxSal < emp1[i].getSalary() && department == emp1[i].getDepartment()) {
                    maxSal = emp1[i].getSalary();
                    name = emp1[i].getFio();
                    department = emp1[i].getDepartment();
                }
            }
            System.out.println("Максимальная зарплата у сотрудника из отдела №" + department + " " + name + " составляет " + maxSal);
            return department;
        }
        private static double departAllMonthlyExpenses (int department){
        double sum = 0;
            for (int i = 0; i < emp1.length; i++) {
                if(department == emp1[i].getDepartment()){
                    sum = sum + emp1[i].getSalary();
                    department = emp1[i].getDepartment();
                }
            }
            System.out.println("Затраты за месяц по отделу №" + department + " составляют: " + sum);
            return department;
        }
        private static double departAvgSalary (int department){
        double sum = 0;
        int count = 0;
            for (int i = 0; i < emp1.length; i++) {
               if ( department == emp1[i].getDepartment()) {
                    count++;
                }
            }
            for (int i = 0; i < emp1.length; i++) {
                if (department == emp1[i].getDepartment()){
                    sum = sum + emp1[i].getSalary() / count;
                    department = emp1[i].getDepartment();
                }
            }
            System.out.println("Средняя зарплата по отделу №" + department + " составляет: " + sum);
            return  department;
        }
        private static double departIndexSalary (int department, int index){
        String name = null;
        double sum = 0;
            for (int i = 0; i < emp1.length; i++) {
                if (department == emp1[i].getDepartment()){
                    name = emp1[i].getFio();
                    sum = emp1[i].getSalary() / 100 * index;
                    department = emp1[i].getDepartment();
                    emp1[i].setSalary(emp1[i].getSalary() + sum);
                    System.out.println("Зарплата сотрудника из отдела №" + department + " " + name + " проиндексирована на " + index + "%. Прибавка составляет: " + sum);
                }
            }
            return department;
        }
        private static void departPrintEmployee (int department){
            for (int i = 0; i < emp1.length; i++) {
                if (department == emp1[i].getDepartment()){
                    department = emp1[i].getDepartment();
                    System.out.println("Сотрудник c ID " + emp1[i].getId() + ", " + emp1[i].getFio() + ", зарплатой  " + emp1[i].getSalary());
                }
            }
        }
        private static void findSalarySmaller (double salary){
            for (int i = 0; i < emp1.length; i++) {
                if (emp1[i].getSalary() < salary){
                    System.out.println("Сотрудник c ID " + emp1[i].getId() + ", " + emp1[i].getFio() + ", зарплатой  " + emp1[i].getSalary());
                }
            }
        }
        private static void findSalaryMore (double salary){
            for (int i = 0; i < emp1.length; i++) {
                if (emp1[i].getSalary() >= salary){
                    System.out.println("Сотрудник c ID " + emp1[i].getId() + ", " + emp1[i].getFio() + ", зарплатой  " + emp1[i].getSalary());
                }
            }
        }
}
