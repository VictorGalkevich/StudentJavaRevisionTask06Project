package by.itstep.javatraining.revision.task;

/*	Task X. Unique Number Digits [уникальные цифры числа]
 *
 *	Дано целое число. Необходимо определить, все ли цифры числа уникальны,
 *	т.е. среди цифр числа нет повторяющихся.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено булевское значение - результат решения задания.
 *
 *	[ input 1]: 12345
 *	[output 1]: true
 *
 *	[ input 2]: 54321
 *	[output 2]: true
 *
 *	[ input 3]: 11111
 *	[output 3]: false
 *
 *	[ input 4]: 121
 *	[output 4]: false
 *
 *	[ input 5]: -12345
 *	[output 5]: true
 *
 *	[ input 6]: 0
 *	[output 6]: true
 */

public class TaskX {
    public static boolean taskX(long number) {
        int[] digitsCounter = new int[10];
        if(number < 0){
            number = -number;
        }
        while(number != 0){
            digitsCounter[(int) number % 10]++;
            number /= 10;
        }
        boolean result = true;
        for(int i : digitsCounter){
            if (i > 1){
                result = false;
                break;
            }
        }
        return result;
    }
}
