package com.algorithdemo.string;

/**
 * 编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。 但是要保证汉字不被截半个，如“我ABC”4，应该截为“我AB”，输入“我ABC汉DEF”，6，应该输出为“我ABC”而不是“我ABC+汉的半个
 * @author Administrator
 *
 */
public class StringDemo2 {
    
    public static String substr(String src, int len){
       // str.getBytes();
        return new String(src.getBytes(), 0, len-(src.getBytes()[len] < 0?1:0));
    }
    
    public static void main(String[] args) {
       String str = StringDemo2.substr("我Abc的", 6);
       System.out.println(str);
       String str2 = "我Abc的";
       System.out.println(str2.getBytes()[3]);
    }

}
