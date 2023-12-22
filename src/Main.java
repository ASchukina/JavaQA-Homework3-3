
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Со сроком на год");
        System.out.println("ваш ежемесячный платёж составит:");
        System.out.println(service.calculate(9.99, 1, 1_000_000) + "рублей");

        System.out.println();
        System.out.println("Со сроком на два года");
        System.out.println("ваш ежемесячный платёж составит:");
        System.out.println(service.calculate(9.99, 2, 1_000_000) + "рублей");

        System.out.println();
        System.out.println("Со сроком на три года");
        System.out.println("ваш ежемесячный платёж составит:");
        System.out.println(service.calculate(9.99, 3, 1_000_000) + "рублей");
    }
}