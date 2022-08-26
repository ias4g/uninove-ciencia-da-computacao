/**
 * @file Percent.java
 * @author Izael Silva (https://github.com/Ias4g)
 * @date 25 de Agosto de 2022
 *
 * @copyright Copyright (c) 2022
 *
 */

public class Percent {
    public static double reajustarSalario(double salary, double percent) {
        salary = salary + salary * percent / 100;
        return salary;
    }
}