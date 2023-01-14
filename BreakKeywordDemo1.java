package class8;

import java.sql.SQLOutput;

public class BreakKeywordDemo1 {
    public static void main(String[] args) {
        boolean summer = true;
        int temp = 75;
        while (temp<=105) {
            if (temp <= 100) {
                System.out.println("I love summer because temp is " + temp);
            } else {
                System.out.println("Its very hot " + temp);
            }
            temp += 5;
        }
    }
}
        /*System.out.println("---------------------");
        boolean summer=true;
        int i;
        for (int i = 75; i <= 100; i += 5) {
            System.out.println("I love summer because temp is " + i);

        }
                System.out.println("Its very hot " + i);
        }
    }*/



