package ru.mirea.ikbo2019.PR5;

public class Task5
{
    public int n;
    private int res;
    private int right;
    public Task5(int n) {
        this.n = n;
    }

    public int func1(int n)
    {
        if(n%10 == n)
            return n;
        right = n%10;
        return right%10 + func1(n / 10);
    }
    public void func2()
    {
        res=func1(n);
        System.out.println(res);
    }
}
