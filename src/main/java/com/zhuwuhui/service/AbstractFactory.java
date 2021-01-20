package com.zhuwuhui.service;

public interface AbstractFactory {

    public CPUApi createCPUApi();

    public MainboardApi createMainboardApi();
}
