public class Main {
    public static void main(String[] args) {
        int onAccount = -196; // Денег на счёте изначально
        int replenishment = 7777; // Сумма пополнения
        int bonus; // Количество рублей с каждой сотни больше 1000 пополнения

        if (replenishment >= 1000) {bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int total = onAccount + replenishment + bonus; // Итоговая сумма на счёте после пополнения

        System.out.println("Вы пополнили баланс на " + replenishment + "₽");
        System.out.println("Количество бонусных рублей составило " + bonus + "₽");
        System.out.println("Денег на счёте " + total + "₽");
    }
}