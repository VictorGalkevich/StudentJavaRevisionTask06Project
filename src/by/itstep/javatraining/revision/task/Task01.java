package by.itstep.javatraining.revision.task;

/*	Task 01. The Smallest Natural Divisor [наименьший натуральный делитель]
 *
 *	Дано целое число. Выведите его наименьший натуральный делитель, отличный от 1.
 *	Если данные введены некорректно, т.е. меньше единицы, то выведите ноль.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа int.
 *
 *	Формат выходных данных [output]
 *	Должно возвращаться целое число, которое является решением задания.
 *
 *	[ input 1]: 15
 *	[output 1]: 3
 *
 *	[ input 2]: 49
 *	[output 2]: 7
 *
 *	[ input 3]: 1
 *	[output 3]: 0
 *
 *	[ input 4]: -15
 *	[output 4]: 0
 */

public class Task01 {
    public static int task01(int number) {
        if(number < 2){
            return 0;
        }
        for (int i = 2; i <= number / 2; i++) {
            if(number % i == 0){
                return i;
            }
        }
        return number;
    }
}