package by.itstep.javatraining.revision.task;

/*	Task 03. All Integer Powers of Two [все целые степени двойк]
 *
 *	По данному числу N распечатайте все целые степени двойки, не превосходящие N, в порядке возрастания.
 *	В случае некорректных данных напечатайте ноль.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа int.
 *
 *	Формат выходных данных [output]
 *	Должна возвращаться строка, которая содержит ответ на задание.
 *
 *	[ input 1]: 40
 *	[output 1]: 1 2 4 8 16 32
 *
 *	[ input 2]: 1
 *	[output 2]: 1
 *
 *	[ input 3]: 0
 *	[output 3]: 0
 *
 *	[ input 4]: -40
 *	[output 4]: 0
 */

public class Task03 {
    public static String task03(int number) {
        if(number < 1){
            return "0";
        }
        int tmpNumber = 1;
        StringBuilder result = new StringBuilder("1");
        while(tmpNumber <= number / 2){
            tmpNumber = tmpNumber << 1;
            result.append(" ").append(tmpNumber);
        }
        return result.toString();
    }
}