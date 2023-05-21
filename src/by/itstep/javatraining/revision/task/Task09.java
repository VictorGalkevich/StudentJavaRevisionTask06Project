package by.itstep.javatraining.revision.task;

/*	Task 09. The Count of Local Maximus [количество локальных максимумов]
 *
 *	Элемент последовательности называется локальным максимумом,
 *	если он строго больше предыдущего и последующего элемента
 *	последовательности. Первый и последний элемент последовательности
 *	не являются локальными максимумами по определению.
 *	Дано целое число. Необходимо подсчитать количество строгих локальных
 *	максимумов среди цифр заданного числа.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long long.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено количество строгих локальных максимумов.
 *
 *	[ input 1]: 2414241
 *	[output 1]: 3
 *
 *	[ input 2]: 131131
 *	[output 2]: 2
 *
 *	[ input 3]: 0
 *	[output 3]: 0
 *
 *	[ input 4]: -13245
 *	[output 4]: 1
 *
 *	[ input 5]: 12345
 *	[output 5]: 0
 */

public class Task09 {
    public static int task09(long number) {
        if(number < 0){
            number = -number;
        }
        byte currPrev = (byte) (number % 10);
        byte currValue = (byte) (number / 10 % 10);
        byte currFollowing = (byte) (number % 10);
        number = number / 100;
        byte counter = 0;
        while(number > 9){
            if(currValue > currPrev && currValue > currFollowing){
                counter++;
                currPrev = currFollowing;
                number /= 10;
                currValue = (byte) (number % 10);
                currFollowing = (byte) (number / 10 % 10);
            }else {
                currPrev = currValue;
                currValue = currFollowing;
                number /= 10;
                currFollowing = (byte) (number % 10);
            }
        }
        return counter;
    }
}
