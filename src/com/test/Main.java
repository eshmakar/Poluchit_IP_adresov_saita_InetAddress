package com.test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();//получение моего IP адреса
        System.out.println(inetAddress);
        inetAddress = InetAddress.getByName("google.com");//получение одного IP адреса сайта
        System.out.println(inetAddress);
        InetAddress[] SW = InetAddress.getAllByName("google.com");//получение всех IP адресов сайта
        System.out.println(Arrays.toString(SW));
    }
}
