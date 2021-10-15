package com.company.Main;

import com.company.Interface.DeskPhone;
import com.company.Interface.ITelephone;
import com.company.Interface.MobilePhone;

public class Main2 {
    public static void main(String[] args) {
        //interfaces
        System.out.println("In the interface");
        ITelephone iTelephone;
        DeskPhone deskPhone= new DeskPhone(1234);
        iTelephone=deskPhone;
        iTelephone.powerOn();
        iTelephone.callPhone(1234);
        iTelephone.answer();

        iTelephone =new MobilePhone(12345);
        iTelephone.powerOn();
        iTelephone.callPhone(12345);
        iTelephone.answer();
        iTelephone.dial(12345);
    }
}
