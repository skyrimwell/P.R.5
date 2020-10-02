package ru.mirea.ikbo2019.PR5;

public class Task2
{
    public int n;
    private int start = 1;

    public Task2(int n) {
        this.n = n;
    }

    public int func1() {
        if (n <= 0) {
            return 0;
        } else if (start <= n) {
            System.out.println(start);
            start++;
            func1();
            return start;
        }
        return 0;
    }
}

