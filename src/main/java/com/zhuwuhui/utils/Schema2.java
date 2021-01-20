package com.zhuwuhui.utils;

import com.zhuwuhui.service.AbstractFactory;
import com.zhuwuhui.service.CPUApi;
import com.zhuwuhui.service.MainboardApi;

public class Schema2 implements AbstractFactory {
    @Override
    public CPUApi createCPUApi() {
        return new AMDCPU(939);
    }

    @Override
    public MainboardApi createMainboardApi() {
        return new MSIMainboard(939);
    }
}
