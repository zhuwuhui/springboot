package com.zhuwuhui.utils;

import com.zhuwuhui.service.MainboardApi;

public class MSIMainboard implements MainboardApi {

    private int cpuHoles = 0;

    public MSIMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("在MSI 主板里插槽孔数="+cpuHoles);
    }
}
