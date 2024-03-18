package Minitest2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Material cf1 = new CrispyFlour("01", "Bot khoai", LocalDate.parse("2024-02-10"), 100, 10);
        Material cf2 = new CrispyFlour("02", "Bot san", LocalDate.parse("2024-02-11"), 200, 30);
        Material cf3 = new CrispyFlour("03", "Bot san day", LocalDate.parse("2024-02-12"), 300, 20);
        Material cf4 = new CrispyFlour("04", "Bot my", LocalDate.parse("2024-02-13"), 400, 40);
        Material cf5 = new CrispyFlour("05", "Bot gao", LocalDate.parse("2024-02-14"), 400, 50);
        Material m1 = new Meat("06", "thit bo", LocalDate.parse("2024-02-19"), 300, 1);
        Material m2 = new Meat("07", "thit ga", LocalDate.parse("2024-02-20"), 150, 3);
        Material m3 = new Meat("08", "thit lon", LocalDate.parse("2024-02-18"), 200, 5);
        Material m4 = new Meat("09", "thit trau", LocalDate.parse("2024-02-17"), 500, 7);
        Material m5 = new Meat("10", "thit vit", LocalDate.parse("2024-02-10"), 120, 5);
        Material [] materials = {cf1,cf2,cf3,cf4,cf5,m1,m2,m3,m4,m5};
        double total = 0;
        double realMoney =0;
        for(Material material : materials){
            total += material.getAmount();
            realMoney += material.getRealMoney();
        }
        System.out.println(total);
        System.out.println(realMoney);
    }
}