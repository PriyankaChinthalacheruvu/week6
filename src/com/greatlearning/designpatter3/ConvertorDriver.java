package com.greatlearning.designpatter3;

public class ConvertorDriver {
    public static void main(String args[]){  //FACTORY DESIGN PATTERN
        String convertFrom="Dollar";
        double amount=1;
        Convertor convert= CurrencyFactory.convertToINR(convertFrom); // creating the proper object as per Factory Design

        if (convertFrom.equalsIgnoreCase("Dollar"))
            System.out.println("Dollar to INR --> Rs."+convert.convertToINR(amount)); //calling US specific impl
        else
            System.out.println("GBP to INR --> Rs."+convert.convertToINR(amount)); //calling GBp specific Impl


    }
}
