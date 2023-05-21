package by.itstep.javatraining.revision.task;

/*	Task 04. The Fibonacci Number [число Фибоначчи]
 *
 *	Последовательность Фибоначчи определяется так:
 *	F(1) = 0, F(2) = 1, F(3) = 1, F(4) = 2, F(5) = 3, …, F(n) = F(n−1) + F(n−2).
 *	Необходимо по данному числу N определить N-ное число числового ряда Фибоначчи F(N).
 *	Если число задано не верно, то должно быть возвращено число -1.
 *
 *	Примечание
 *	В силу очень быстрого роста чисел ряда Фибоначчи тестирование в малом диапазоне значений.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа int.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено N-ное число числового ряда Фибоначчи в виде длинного целого или число -1.
 *
 *	[ input 1]: 1
 *	[output 1]: 0
 *
 *	[ input 2]: 2
 *	[output 2]: 1
 *
 *	[ input 3]: 3
 *	[output 3]: 1
 *
 *	[ input 4]: 13
 *	[output 4]: 144
 *
 *	[ input 5]: 50
 *	[output 5]: 7'778'742'049
 *
 *	[ input 6]: -1
 *	[output 6]: -1
 *
 *	[ input 7]: -55
 *	[output 7]: -1
 */

public class Task04 {
    public static long task04(int number) {
        if (number < 1) {
            return -1;
        }
        long firstValue = 1;
        long secondValue = 0;
        int i = 0;
        while(i < number - 2){
            i++;
            long tmp = firstValue + secondValue;
            secondValue = firstValue;
            firstValue = tmp;
        }
        return number == 1 ? 0 : firstValue;
    }
}