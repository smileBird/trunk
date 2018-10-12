package test;

import java.util.Random;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

import com.gxyj.cashier.client.tools.SignPayRefNotify;

public class Test {
	    public static void main(String args[]){
//	        //初始化栈(char类型)
//	        SqStack<Character> stack = new SqStack<Character>(10);
//	        
//	        //2状态
//	        System.out.println("栈是否为空："+stack.isNull());
//	        System.out.println("栈是否已满："+stack.isFull());
//	        
//	        //2操作
//	        //依次压栈
//	        stack.push('a');
//	        stack.push('b');
//	        stack.push('c');
//	        //依次弹栈
//	        System.out.println("弹栈顺序：");
//	        System.out.println(stack.pop());
//	        System.out.println(stack.pop());
//	        System.out.println(stack.pop());
	    	
	    	          String str1 = "i((l)o[v{e}]y)o{u}!";//表达式1：(()[{}]){}
	    	          String str2 = "you((do)[not{}])know{}!)";//表达式2：(()[{}]){})
	    	         boolean match1 = StackUtils.isMatch(str1);
	    	         boolean match2 = StackUtils.isMatch(str2);
	    	         System.out.println("str1中的括号是否匹配："+match1);
	    	         System.out.println("str2中的括号是否匹配："+match2);
	    }
}
