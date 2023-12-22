public class CreditPaymentService {
    public int calculate (double p, int y, int s) {
        // p - процент годовой
        // y - количество лет
        // s - сумма займа

        int n = y * 12; // общее количество месяцев/платежей
        double m = p / 1200; // месячная ставка, где годовую делим на количесвто месяцев и на 100 процентов
        double k = (m * Math.pow((1 + m), n)) / (Math.pow((1 + m), n) - 1);
        // коэффициент
        double a = k * s;
        // аннуитетный платёж
        int ann = (int)a;
        return ann;

    }
}
