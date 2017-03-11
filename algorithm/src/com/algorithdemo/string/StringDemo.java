package com.algorithdemo.string;

public class StringDemo {
	
	/**
	 * 判断两个字符串是否互为变形 例如 str1=“123” str2=“321” 返回true 
	 * str1=“1223” str2=“321” 返回false 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isDeformate(String str1, String str2){
		if(str1 == null || str2 == null || str1.length()!=str2.length()){
			return false;
		}
		char[] chas1 = str1.toCharArray();
		char[] chas2 = str2.toCharArray();
		int[] map = new int[256];
		for(int i = 0; i < chas1.length; i++) {
			map[chas1[i]]++;
		}
		for(int i = 0; i < chas2.length; i++){
			if(map[chas2[i]]--==0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s1 = "1234";
		String s2 = "4321";
		System.out.println(isDeformate(s1,s2));
	}

}
