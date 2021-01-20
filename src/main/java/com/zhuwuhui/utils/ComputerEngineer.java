package com.zhuwuhui.utils;

import com.zhuwuhui.service.AbstractFactory;
import com.zhuwuhui.service.CPUApi;
import com.zhuwuhui.service.MainboardApi;

public class ComputerEngineer {

    public void makeComputer(AbstractFactory schema){
        prepareHardwares(schema);
    }

    private void prepareHardwares(AbstractFactory schema){
        CPUApi cpu = schema.createCPUApi();
        MainboardApi mainboard = schema.createMainboardApi();
        cpu.calculate();
        mainboard.installCPU();
    }
}
