package com.rc.aopdemo.test;

abstract class Base<T extends Comparable<T>> {

    T data;

    public Base(String json) {
//        this.data = JsonUtil.toObject(json, deSerializable());
    }
}