public class main {
    public static void main(String[] args) {
        int initialBalance = 300;
        int addend = 1300;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }
        //int bonus = addend>100?addend/100 : 0;
        int finalBalance = initialBalance + addend + bonus;
        System.out.println("Итоговый баланс" + finalBalance);
        System.out.println("Бонус:" + bonus);
    }
}
