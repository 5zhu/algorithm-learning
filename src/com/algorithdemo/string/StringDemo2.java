package com.algorithdemo.string;

/**
 * ��дһ����ȡ�ַ����ĺ���������Ϊһ���ַ������ֽ��������Ϊ���ֽڽ�ȡ���ַ����� ����Ҫ��֤���ֲ����ذ�����硰��ABC��4��Ӧ�ý�Ϊ����AB�������롰��ABC��DEF����6��Ӧ�����Ϊ����ABC�������ǡ���ABC+���İ��
 * @author Administrator
 *
 */
public class StringDemo2 {
    
    public static String substr(String src, int len){
       // str.getBytes();
        return new String(src.getBytes(), 0, len-(src.getBytes()[len] < 0?1:0));
    }
    
    public static void main(String[] args) {
       String str = StringDemo2.substr("��Abc��", 6);
       System.out.println(str);
       String str2 = "��Abc��";
       System.out.println(str2.getBytes()[3]);
    }

}
