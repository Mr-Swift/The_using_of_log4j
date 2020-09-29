package com.apple.developer;

import org.apache.log4j.Logger;
public class Test {
    static Logger logger = Logger.getLogger("com.apple.developer.Test");
    public static void main(String[] args) {
        int a[]={1};
        try {
            for (int i = 0; i <= a.length; i++)
                System.out.println(a[i]);
        }catch(Exception e){
            logger.debug(e.getMessage());
            System.out.println("异常捕捉成功！");
        }finally{
            System.out.println("Over!");
        }
    }
}
