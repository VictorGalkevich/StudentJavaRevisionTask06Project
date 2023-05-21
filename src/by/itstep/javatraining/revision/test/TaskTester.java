package by.itstep.javatraining.revision.test;

import by.itstep.javatraining.revision.task.*;

public class TaskTester {

    public static String RIGHT = "completed successfully. WELL DONE!!!";
    public static String WRONG = "was not running successfully. Something was WRONG!";

    public static String testingTask01() {
        boolean result = Task01.task01(15) == 3
                && Task01.task01(49) == 7
                && Task01.task01(1) == 0
                && Task01.task01(-15) == 0
                && Task01.task01(0) == 0
                && Task01.task01(2) == 2
                && Task01.task01(3) == 3
                && Task01.task01(4) == 2
                && Task01.task01(5) == 5
                && Task01.task01(6) == 2
                && Task01.task01(7) == 7
                && Task01.task01(8) == 2
                && Task01.task01(9) == 3
                && Task01.task01(10) == 2
                && Task01.task01(11) == 11
                && Task01.task01(13) == 13
                && Task01.task01(17) == 17
                && Task01.task01(19) == 19
                && Task01.task01(23) == 23
                && Task01.task01(29) == 29
                && Task01.task01(31) == 31;

        return String.format("Task 01 [The Smallest Natural Divisor] %s", result ? RIGHT : WRONG);
    }

    public static String testingTask02() {
        boolean result = Task02.task02(32)
                && Task02.task02(1)
                && !Task02.task02(0)
                && !Task02.task02(30)
                && !Task02.task02(-4)
                && !Task02.task02(-64)
                && !Task02.task02(-512)
                && !Task02.task02(3)
                && !Task02.task02(7)
                && !Task02.task02(10)
                && !Task02.task02(20)
                && !Task02.task02(40)
                && !Task02.task02(50)
                && Task02.task02(2)
                && Task02.task02(4)
                && Task02.task02(8)
                && Task02.task02(16)
                && Task02.task02(32)
                && Task02.task02(64)
                && Task02.task02(128)
                && Task02.task02(256)
                && Task02.task02(512)
                && Task02.task02(4096);

        return String.format("Task 02 [An Exact Power of Two] %s", result ? RIGHT : WRONG);
    }

    public static String testingTask03() {
        boolean result = Task03.task03(40).equals("1 2 4 8 16 32")
                && Task03.task03(1).equals("1")
                && Task03.task03(0).equals("0")
                && Task03.task03(-40).equals("0")
                && Task03.task03(2).equals("1 2")
                && Task03.task03(5).equals("1 2 4")
                && Task03.task03(10).equals("1 2 4 8")
                && Task03.task03(16).equals("1 2 4 8 16")
                && Task03.task03(20).equals("1 2 4 8 16")
                && Task03.task03(100).equals("1 2 4 8 16 32 64")
                && Task03.task03(500).equals("1 2 4 8 16 32 64 128 256")
                && Task03.task03(1000).equals("1 2 4 8 16 32 64 128 256 512")
                && Task03.task03(10000).equals("1 2 4 8 16 32 64 128 256 512 1024 2048 4096 8192");

        return String.format("Task 03 [All Integer Powers of Two] %s", result ? RIGHT : WRONG);
    }

    public static String testingTask04() {
        boolean result = Task04.task04(1) == 0
                && Task04.task04(2) == 1
                && Task04.task04(3) == 1
                && Task04.task04(4) == 2
                && Task04.task04(5) == 3
                && Task04.task04(6) == 5
                && Task04.task04(7) == 8
                && Task04.task04(8) == 13
                && Task04.task04(9) == 21
                && Task04.task04(10) == 34
                && Task04.task04(11) == 55
                && Task04.task04(12) == 89
                && Task04.task04(13) == 144
                && Task04.task04(50) == 7_778_742_049L
                && Task04.task04(90) == 1_779_979_416_004_714_189L
                && Task04.task04(0) == -1
                && Task04.task04(-9) == -1
                && Task04.task04(-10) == -1
                && Task04.task04(-99) == -1
                && Task04.task04(-100) == -1;

        return String.format("Task 04 [The Fibonacci Number] %s", result ? RIGHT : WRONG);
    }

    public static String testingTask05() {
        boolean result = Task05.task05(987_654_321) == 9
                && Task05.task05(12_345) == 5
                && Task05.task05(0) == 0
                && Task05.task05(-15) == 5
                && Task05.task05(15) == 5
                && Task05.task05(-987_654_321) == 9
                && Task05.task05(-12_345) == 5
                && Task05.task05(9) == 9
                && Task05.task05(-9) == 9
                && Task05.task05(-9_223_372_036_854_775_807L) == 9
                && Task05.task05(9_223_372_036_854_775_807L) == 9
                && Task05.task05(-1_223_372_036_854_775_807L) == 8
                && Task05.task05(1_223_372_036_854_775_807L) == 8
                && Task05.task05(111) == 1
                && Task05.task05(-111) == 1
                && Task05.task05(999) == 9
                && Task05.task05(-999) == 9
                && Task05.task05(100) == 1
                && Task05.task05(-1) == 1;

        return String.format("Task 05 [Max Number Digit] %s", result ? RIGHT : WRONG);
    }

    public static String testingTask06() {
        boolean result = Task06.task06(1234) == 1
                && Task06.task06(4112) == 2
                && Task06.task06(100) == 2
                && Task06.task06(-2222) == 4
                && Task06.task06(0) == 1
                && Task06.task06(9) == 1
                && Task06.task06(10) == 1
                && Task06.task06(12) == 1
                && Task06.task06(4321) == 1
                && Task06.task06(-4321) == 1
                && Task06.task06(-1234) == 1
                && Task06.task06(2222) == 4
                && Task06.task06(1111) == 4
                && Task06.task06(9999) == 4
                && Task06.task06(31313) == 2
                && Task06.task06(13131) == 3
                && Task06.task06(112233) == 2
                && Task06.task06(223311) == 2
                && Task06.task06(221133) == 2
                && Task06.task06(2211133) == 3
                && Task06.task06(2221133) == 2
                && Task06.task06(2233311) == 2
                && Task06.task06(-33333) == 5
                && Task06.task06(-11111) == 5
                && Task06.task06(-31313) == 2
                && Task06.task06(-13131) == 3
                && Task06.task06(-112233) == 2
                && Task06.task06(-223311) == 2
                && Task06.task06(-221133) == 2
                && Task06.task06(-2211133) == 3
                && Task06.task06(-2221133) == 2
                && Task06.task06(-2233311) == 2
                && Task06.task06(-9_223_372_036_854_775_807L) == 2
                && Task06.task06(9_223_372_036_854_775_807L) == 2
                && Task06.task06(-1_223_372_036_854_775_807L) == 2
                && Task06.task06(1_223_372_036_854_775_807L) == 2;

        return String.format("Task 06 [The Count of Min Number Digits] %s", result ? RIGHT : WRONG);
    }

    public static String testingTask07() {
        boolean result = Task07.task07(12345) == 4
                && Task07.task07(-56789) == 8
                && Task07.task07(11) == -1
                && Task07.task07(0) == -1
                && Task07.task07(1) == -1
                && Task07.task07(9) == -1
                && Task07.task07(-1) == -1
                && Task07.task07(-9) == -1
                && Task07.task07(10) == 0
                && Task07.task07(-10) == 0
                && Task07.task07(100) == 0
                && Task07.task07(-100) == 0
                && Task07.task07(1000) == 0
                && Task07.task07(-1000) == 0
                && Task07.task07(12) == 1
                && Task07.task07(-12) == 1
                && Task07.task07(321) == 2
                && Task07.task07(4321) == 3
                && Task07.task07(-321) == 2
                && Task07.task07(-4321) == 3
                && Task07.task07(58679) == 8
                && Task07.task07(85679) == 8
                && Task07.task07(41) == 1
                && Task07.task07(-14) == 1
                && Task07.task07(95678) == 8
                && Task07.task07(56879) == 8
                && Task07.task07(-9_223_372_036_854_775_807L) == 8
                && Task07.task07(9_223_372_036_854_775_807L) == 8
                && Task07.task07(-1_223_372_036_854_775_807L) == 7
                && Task07.task07(1_223_372_036_854_775_807L) == 7;

        return String.format("Task 07 [The Double Max] %s", result ? RIGHT : WRONG);
    }

    public static String testingTask08() {
        boolean result = Task08.task08(0) == 1
                && Task08.task08(1) == 2    // 3
                && Task08.task08(2) == 4
                && Task08.task08(3) == 5
                && Task08.task08(4) == -1
                && Task08.task08(5) == 6
                && Task08.task08(6) == -1
                && Task08.task08(7) == -1
                && Task08.task08(8) == 7
                && Task08.task08(9) == -1
                && Task08.task08(10) == -1
                && Task08.task08(11) == -1
                && Task08.task08(12) == -1
                && Task08.task08(13) == 8
                && Task08.task08(15) == -1
                && Task08.task08(20) == -1
                && Task08.task08(21) == 9
                && Task08.task08(30) == -1
                && Task08.task08(34) == 10
                && Task08.task08(50) == -1
                && Task08.task08(55) == 11
                && Task08.task08(89) == 12
                && Task08.task08(100) == -1
                && Task08.task08(144) == 13
                && Task08.task08(233) == 14
                && Task08.task08(377) == 15
                && Task08.task08(500) == -1
                && Task08.task08(610) == 16
                && Task08.task08(75_025) == 26
                && Task08.task08(7_778_742_049L) == 50
                && Task08.task08(1_779_979_416_004_714_189L) == 90
                && Task08.task08(-55) == -1
                && Task08.task08(-1) == -1;

        return String.format("Task 08 [The Number of Fibonacci Number] %s", result ? RIGHT : WRONG);
    }

    public static String testingTask09() {
        boolean result = Task09.task09(23232) == 2
                && Task09.task09(1212110) == 2
                && Task09.task09(0) == 0
                && Task09.task09(15143120) == 3
                && Task09.task09(12345) == 0
                && Task09.task09(11111) == 0
                && Task09.task09(1) == 0
                && Task09.task09(-1) == 0
                && Task09.task09(12) == 0
                && Task09.task09(-21) == 0
                && Task09.task09(123) == 0
                && Task09.task09(-321) == 0
                && Task09.task09(121) == 1
                && Task09.task09(-12121) == 2
                && Task09.task09(1212121) == 3
                && Task09.task09(-2121212) == 2
                && Task09.task09(12_345_678_987_654_321L) == 1
                && Task09.task09(-9_223_372_036_854_775_807L) == 3
                && Task09.task09(9_223_372_036_854_775_807L) == 3;

        return String.format("Task 09 [The Count of Local Maximus] %s", result ? RIGHT : WRONG);
    }

    public static String testingTask10() {
        boolean result = Task10.task10(123456) == 1
                && Task10.task10(1234567789) == 2
                && Task10.task10(1122233335) == 4
                && Task10.task10(0) == 1
                && Task10.task10(-15) == 1
                && Task10.task10(-1234567789) == 2
                && Task10.task10(-1122233335) == 4
                && Task10.task10(1111122223333L) == 5
                && Task10.task10(333344455551L) == 4
                && Task10.task10(-11111) == 5
                && Task10.task10(12) == 1
                && Task10.task10(11122) == 3
                && Task10.task10(11222) == 3
                && Task10.task10(-55558799912L) == 4
                && Task10.task10(5588899912222L) == 4
                && Task10.task10(-22233222) == 3
                && Task10.task10(442555) == 3
                && Task10.task10(-9_222_372_333_354_777_807L) == 4
                && Task10.task10(9_222_372_333_354_777_807L) == 4;

        return String.format("Task 10 [The Largest Sequence of Number Digits] %s", result ? RIGHT : WRONG);
    }

    public static String testingTaskX() {
        boolean result = TaskX.taskX(12345)
                && TaskX.taskX(54321)
                && TaskX.taskX(0)
                && !TaskX.taskX(11111)
                && !TaskX.taskX(121)
                && TaskX.taskX(-12345)
                && TaskX.taskX(-54321)
                && !TaskX.taskX(11345)
                && !TaskX.taskX(54311)
                && !TaskX.taskX(12145)
                && !TaskX.taskX(54121)
                && !TaskX.taskX(-11345)
                && !TaskX.taskX(-54311)
                && TaskX.taskX(1234567890)
                && TaskX.taskX(-1234567890)
                && !TaskX.taskX(900)
                && !TaskX.taskX(-900)
                && !TaskX.taskX(11111)
                && !TaskX.taskX(-11111)
                && !TaskX.taskX(999999)
                && !TaskX.taskX(-999999)
                && !TaskX.taskX(1000000)
                && !TaskX.taskX(-1000000);

        return String.format("Task X [Unique Number Digits] %s", result ? RIGHT : WRONG);
    }
}