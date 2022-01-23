package com.greatlearning.designpatter3;

public class DollarConvertotImplementation implements Convertor{

    @Override
    public Double convertToINR(double amount) {

        return amount*74.42; //1dollar is 75rs
    }
}
