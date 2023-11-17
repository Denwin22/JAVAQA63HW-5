public class CalculateVacation {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month < 12; month++) {
            if (money < threshold) { // можем ли отдыхать?
                money = income + money - expenses;
            } else {
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
            }
        }
        return count;
    }
}


//public class CalculateVacation {
//    public int calculate(int income, int expenses, int threshold) {
//        int count = 0; // счётчик месяцев отдыха
//        int money = 0; // количество денег на счету
//        for (int month = 0; month < 12; month++) {
//            if (money >= expenses) { // можем ли отдыхать?
//                count++; // увеличиваем счётчик месяцев отдыха
//                money = money - expenses;
//            } else {
//                money = money + income;
//            }
//        }
//        return count;
//    }
//}
