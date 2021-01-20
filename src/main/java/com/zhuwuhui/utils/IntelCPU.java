package com.zhuwuhui.utils;

import com.zhuwuhui.service.CPUApi;

public class IntelCPU implements CPUApi {

    private int pins = 0;

    public IntelCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("在因特尔 CPU里针脚="+pins);
    }
}
