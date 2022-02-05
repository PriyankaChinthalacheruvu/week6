package com.greatlearning.designpatter3;

import java.util.Currency;


public class CurrencyFactory { //FACTORY DESIGN PATTERN
    public static Convertor convertToINR(String convertTo){

        if(convertTo.equalsIgnoreCase("Dollar")){
             return new DollarConvertotImplementation(); //creating obj as per US condition
        }
        else if(convertTo.equalsIgnoreCase("GBP")){
            return new GBPConvertorImplementation(); //crsting obj as per GBP condition
        }
        return null;
    }
}
