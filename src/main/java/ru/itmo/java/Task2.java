package ru.itmo.java;

@SuppressWarnings("all")
public class Task2 {

    /**
     * Дано произвольное вещественное число. Выведите его дробную часть
     * <p>
     * Например
     * - дано 17.9
     * - вывод 0.9
     */
    double getFractionalPart(double realNumber)
    {
        double a = (int)realNumber;

        return realNumber - a; //your code here
    }

    /**
     * Дан символ, верните его код. Не используйте явное приведение типов и любые библиотечные функции
     */
    int charCode(char c)
    {
        int a = c;
        return a;
    }

    /**
     * Даны 2 целых числа. Проверьте равны ли они
     */
    boolean testIfIntsEqual(Integer a, Integer b)
    {
       return a.equals(b);
    }

    /**
     * Дано целое число. Выведите {@code true}, если оно входит в заданный диапазон или {@code false}
     * в иных случаях
     *
     * @param number      заданное число
     * @param leftBound   правая граница диапазона
     * @param rightBound  верхняя граница диапазона
     * @param inclusively входят ли границы в заданный даипазон
     */
    boolean numberInRange(Integer number, Integer leftBound, Integer rightBound, Boolean inclusively)
    {
        if (number == null || leftBound == null || rightBound == null || inclusively == null) {
            return false;
        }
       if((inclusively == true) &&(number >= leftBound) && (number <= rightBound))
       {
           return true;
       }
       if((inclusively == false) &&(number > leftBound) && (number < rightBound))
       {
            return true;
       }
       return  false;
    }

    /**
     * Даны 3 символа. Определите является ли хотя бы один из них цифрой 1..9
     */
    boolean atLeastOneIsDigit(char c1, char c2, char c3)
    {
        if (((int)c1 >= 48) && ((int)c1 <= 57))
        {
        return true;
        }
        if (((int)c2 >= 48) && ((int)c2 <= 57))
        {
            return true;
        }
        if (((int)c3 >= 48) && ((int)c3 <= 57))
        {
            return true;
        }
        return false;
    }

    /**
     * Даны два вещественных числа. Определите равны ли они
     */
    boolean areRealNumbersEqual(double a, double b)
    {
        return 1e-5 > Math.abs(a - b);
    }

    /**
     * Дано трехзначное число 100 <= N <= 999. Найдите сумму его чисел.
     */
    int sumOfDigits(int n)
    {
        int res = 0;
        while(n > 0)
        {
            int a = n % 10;
            res += a;
            n /= 10;
        }
        return res;
    }

    /**
     * Дано натуральное число N <= 10000. Выведите следующее после N четное число. Например: N = 8, Result = 10
     */
    int nextEvenNumber(int n)
    {
        int i = n + 1;
        while(true )
        {
            if(i % 2 == 0)
            {
                return i;
            }
            else
                i++;
        }
    }

    /**
     * Школа №32 решила создать 3 дополнительных физмат класса и укомплектовать кабинеты новыми партами.
     * За одной партой может сидеть 2 ученика. Кол-во учеников в каждом из классов известно (num1, num2, num3).
     * Выведите минимальное кол-во парт, которые нужно приобрести школе, при условии что каждый из классов сидит в
     * своем кабинете
     */
    int schoolDesks(int num1, int num2, int num3)
    {
        int res = 0;
        if(num1 % 2 == 0)  { res = num1/2; } else res = num1/2 + 1;
        if(num2 % 2 == 0)  { res += num2/2; } else res += num2/2 + 1;
        if(num3 % 2 == 0)  { res += num3/2; } else res += num3/2 + 1;
        return res;
    }

    /**
     * Дано натуральное число N >= 10. Выведите результат применения XOR к последним 2-м цифрам числа N
     */
    int xorDigits(int N)
    {
        int res = 0;

        int a = N%10;
        N = N/10;
        int b = N%10;
        return a^b;
    }

}
