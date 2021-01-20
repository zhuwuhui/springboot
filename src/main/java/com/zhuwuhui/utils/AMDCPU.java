package com.zhuwuhui.utils;

import com.zhuwuhui.service.CPUApi;

public class AMDCPU implements CPUApi {

    private int pins = 0;

    public AMDCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("在AMD CPU里针脚="+pins);
    }
}
