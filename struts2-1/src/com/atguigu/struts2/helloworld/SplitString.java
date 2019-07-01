package com.atguigu.struts2.helloworld;

public class SplitString {

	
	public static void splitString(String src, int len) {  
        int sl = 0;  
   
        if (null == src) {  
            System.out.println("The String is null!");  
            return;  
        }  
        sl = src.length();  
        // ��Stringת����byte�ֽ�����  
        byte bt[] = src.getBytes(); 
        if (len > sl) {  
            len = sl;  
        }  
        // �ж��Ƿ�����˽ذ룬�ذ�Ļ��ֽڶ��ڵ�ASC����С��0��ֵ  
        if (bt[len] < 0) {  
            System.out.println(new String(bt, 0, --len));  
        } else {   
            System.out.println(new String(bt, 0, len));  
        }  
    } 
	
	public static void main(String[] args) {
		
		String srcStr1 = "��ABC";  
        String srcStr2 = "��ABC��DEF";  
   
        splitString(srcStr1, 4);  
        splitString(srcStr2, 6);
	}

}
