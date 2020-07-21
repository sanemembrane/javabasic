package com.busyqa.coursework.wk1_answer;

public class CheckOddEven {
    public static void main(String[] args) {  
    	
        int mark = 1853;  
        int lastDigit = mark % 10;
        
    
        switch (lastDigit ){
        
        case 0 :System.out.println("EVEN NUMBER");
        break;
        case 2 :System.out.println("EVEN NUMBER");
        break;
        case 4 :System.out.println("EVEN NUMBER");    
        break;
        case 6 :System.out.println("EVEN NUMBER");
        break;
        case 8 :System.out.println("EVEN NUMBER");
        break;
        case 1 :System.out.println("ODD NUMBER");
        break;
        case 3 :System.out.println("ODD NUMBER");
        break;
        case 5 :System.out.println("ODD NUMBER");
        break;
        case 7 :System.out.println("ODD NUMBER");
        break;
        case 9 :System.out.println("ODD NUMBER");
        
        
        }
        System.out.println("DONE");
    }
}
