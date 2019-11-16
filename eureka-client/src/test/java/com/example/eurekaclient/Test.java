package com.example.eurekaclient;

import com.example.eurekaclient.util.RegexUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    @org.junit.Test
    public void test(){
        String s = "{\"p699700\":\"张辉\",\"p699701\":\"33100319870222001X\",\"p699702\":\"3400.0\",\"p699703\":\"300.0\",\"p699704\":\"27.0\"}";

        System.out.println(RegexUtil.removeUselessChar(s));
    }

    @org.junit.Test
    public void test1(){
        String reg = "\\b([a-z]+) \\1\\b/ig";
        String s = "Is is the cost of of gasoline going up up";

        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(s);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
