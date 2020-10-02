package ru.mirea.ikbo2019.PR5;
import java.lang.*;
public class Task3 {
    private int a;
    private int b;

    public Task3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int func1()
    {
        if (a <= b)
        {

            System.out.println(a);
            a++;
            if (a > b)
                System.exit(0);
            func1();
        }
        if (a > b)
        {
            System.out.println(a);
            a--;
            if (a < b)
                System.exit(0);
            func1();
        }
        return 0;
    }
}
