package com.greatlearning.designpatter3;

public class GBPConvertorImplementation implements Convertor{

    @Override
    public Double convertToINR(double amount) {
        return amount*100.88; // 1GBp is 100rs

    }
}
