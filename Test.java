package test;

import java.util.Random;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

import com.gxyj.cashier.client.tools.SignPayRefNotify;

public class Test {
	    public static void main(String args[]){
//	        //��ʼ��ջ(char����)
//	        SqStack<Character> stack = new SqStack<Character>(10);
//	        
//	        //2״̬
//	        System.out.println("ջ�Ƿ�Ϊ�գ�"+stack.isNull());
//	        System.out.println("ջ�Ƿ�������"+stack.isFull());
//	        
//	        //2����
//	        //����ѹջ
//	        stack.push('a');
//	        stack.push('b');
//	        stack.push('c');
//	        //���ε�ջ
//	        System.out.println("��ջ˳��");
//	        System.out.println(stack.pop());
//	        System.out.println(stack.pop());
//	        System.out.println(stack.pop());
	    	
	    	          String str1 = "i((l)o[v{e}]y)o{u}!";//���ʽ1��(()[{}]){}
	    	          String str2 = "you((do)[not{}])know{}!)";//���ʽ2��(()[{}]){})
	    	         boolean match1 = StackUtils.isMatch(str1);
	    	         boolean match2 = StackUtils.isMatch(str2);
	    	         System.out.println("str1�е������Ƿ�ƥ�䣺"+match1);
	    	         System.out.println("str2�е������Ƿ�ƥ�䣺"+match2);
	    }
}
