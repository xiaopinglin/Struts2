package com.atguigu.struts2.helloworld;

public class SplitString {

	
	public static void splitString(String src, int len) {  
        int sl = 0;  
   
        if (null == src) {  
            System.out.println("The String is null!");  
            return;  
        }  
        sl = src.length();  
        // 将String转换成byte字节数组  
        byte bt[] = src.getBytes(); 
        if (len > sl) {  
            len = sl;  
        }  
        // 判断是否出现了截半，截半的话字节对于的ASC码是小于0的值  
        if (bt[len] < 0) {  
            System.out.println(new String(bt, 0, --len));  
        } else {   
            System.out.println(new String(bt, 0, len));  
        }  
    } 
	
	public static void main(String[] args) {
		
		String srcStr1 = "我ABC";  
        String srcStr2 = "我ABC汉DEF";  
   
        splitString(srcStr1, 4);  
        splitString(srcStr2, 6);
	}

}
