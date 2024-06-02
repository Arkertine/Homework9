import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] allSalaries = {12000, 13000, 11500, 15500, 7000};
        int salariesSum = 0;
        for (int i = 0; i < allSalaries.length; i++) {
            salariesSum += allSalaries[i];
        }
        System.out.printf("«Сумма трат за месяц составила %S рублей.»%n", salariesSum);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 2");
        int minSalary = allSalaries[0];
        int maxSalary = allSalaries[0];
        for (int i = 0; i < allSalaries.length; i++) {
            if (allSalaries[i] > maxSalary) {
                maxSalary = allSalaries[i];
            }
            if (allSalaries[i] < minSalary) {
                minSalary = allSalaries[i];
            }
        }
        System.out.printf("«Минимальная сумма трат за неделю составила %s рублей. Максимальная сумма трат за неделю составила %s рублей».%n", minSalary, maxSalary);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 3");
        double averageSum = (double) salariesSum / allSalaries.length;
        System.out.printf("«Средняя сумма трат за месяц составила %.2f рублей».%n", averageSum);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(reverseFullName[i]);
            } else {
                System.out.print(reverseFullName[i]);
            }
        }
        System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}