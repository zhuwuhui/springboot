package com.zhuwuhui.utils;

import com.zhuwuhui.service.MainboardApi;

public class GAMainboard implements MainboardApi {

    private int cpuHoles = 0;

    public GAMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("在GA 主板里插槽孔数="+cpuHoles);
    }
}
