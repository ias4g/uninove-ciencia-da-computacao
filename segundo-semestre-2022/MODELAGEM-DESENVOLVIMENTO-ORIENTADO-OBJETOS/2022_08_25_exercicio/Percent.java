/**
 * @file Percent.java
 * @author Izael Silva (https://github.com/Ias4g)
 * @date 25 de Agosto de 2022
 *
 * @copyright Copyright (c) 2022
 *
 */

public class Percent {
    public static double reajustarsalary(double salary, double percent) {
        salary = salary + (salary * (percent / 100));
        return salary;
    }

    public static String verifyClass(double salary) {
        if (salary <= 2424) {
            return "Classe E";
        } else if (salary <= 4848) {
            return "Classe D";
        } else if (salary <= 12120) {
            return "Classe C";
        } else if (salary <= 24240) {
            return "Classe B";
        } else {
            return "Classe A";
        }
    }
}