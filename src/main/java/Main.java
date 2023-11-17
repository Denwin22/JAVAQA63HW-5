public class Main {
    public static void main(String[] args) {
        CalculateVacation service = new CalculateVacation();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;

        int count = service.calculate(income, expenses, threshold);
        System.out.println(income + " + " + expenses + " + " + threshold + " + " + count);

    }
}
