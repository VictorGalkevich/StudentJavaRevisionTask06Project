package by.itstep.javatraining.revision.controller;

import by.itstep.javatraining.revision.test.TaskTester;

public class Main {
    public static void main(String[] args) {
        String msg = TaskTester.testingTask01();
        msg += "\n" + TaskTester.testingTask02();
        msg += "\n" + TaskTester.testingTask03();
        msg += "\n" + TaskTester.testingTask04();
        msg += "\n" + TaskTester.testingTask05();
        msg += "\n" + TaskTester.testingTask06();
        msg += "\n" + TaskTester.testingTask07();
        msg += "\n" + TaskTester.testingTask08();
        msg += "\n" + TaskTester.testingTask09();
        msg += "\n" + TaskTester.testingTask10();
        msg += "\n" + TaskTester.testingTaskX();
        System.out.println(msg);
    }
}