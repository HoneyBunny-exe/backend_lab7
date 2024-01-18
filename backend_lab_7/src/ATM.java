import static java.lang.Thread.sleep;

public class ATM {
    static volatile int money = 200;
    static synchronized void getMoney(String name, int value) // Без synchronized в некоторых тестах будет вывод из двух нулей.
                                                // Все потому что на вывод информации в консоль нужно время,
                                                // за которое может успеть поменяться значение. synchronized
                                                // говорит, что несколько потоком не могут одновременно вызывать метод
    {
        if(value <= money)
        {
            money = money - value;
            System.out.println(name + ": " + money);
        }
        else{
            System.out.println(name + ": No money(");
        }
    }
}
