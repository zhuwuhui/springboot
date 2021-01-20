package com.zhuwuhui.utils;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        ComputerEngineer engineer = new ComputerEngineer();
        Schema2 schema1 = new Schema2();
        engineer.makeComputer(schema1);
    }
}
