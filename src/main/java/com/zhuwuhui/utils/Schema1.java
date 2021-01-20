package com.zhuwuhui.utils;

import com.zhuwuhui.service.AbstractFactory;
import com.zhuwuhui.service.CPUApi;
import com.zhuwuhui.service.MainboardApi;

public class Schema1 implements AbstractFactory {
    @Override
    public CPUApi createCPUApi() {
        return new IntelCPU(1156);
    }

    @Override
    public MainboardApi createMainboardApi() {
        return new GAMainboard(1156);
    }
}
