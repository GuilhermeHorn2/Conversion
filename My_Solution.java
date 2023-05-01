package misc;

import java.util.ArrayList;

public class main_misc2 {
	
	
	
	public static void main(String[] args) {
	//(a+b)%k = ((a % k)+(b % k)) % k    || ||
	System.out.println(bits_flipped(29,15));

	 
	}
	
	private static int bits_flipped(int x,int y){
		
		String bx = Integer.toBinaryString(x);
		String by = Integer.toBinaryString(y);
		
		//System.out.println(bx);
		//.out.println(by);
		
	    if(bx.length() != by.length()){
	    	//I have to fill the smaller number with 0s on the left
	    	
	    	int diff = 0;
	    	if(bx.length() > by.length()){
	    		diff = bx.length() - by.length();
	    		
	    		StringBuilder by_app = new StringBuilder();
	    		for(int i = 0;i < diff;i++){
	    			by_app.append("0");
	    		}
	    		
	    		by_app.append(by);
	    		by = by_app.toString();
	    		//System.out.println(by);
	    		
	    		int c = 0;
	    		for(int i = 0;i < by.length();i++){
	    			String bit_x = bx.substring(i,i+1);
	    			String bit_y = by.substring(i,i+1);
	    			if(!bit_x.equals(bit_y)) {
	    				c++;
	    			}
	    		}
	    		return c;
	    		
	    		
	    	}
	    	else{
	    		diff = by.length() - bx.length();
	    		
	    		StringBuilder bx_app = new StringBuilder();
	    		for(int i = 0;i < diff;i++){
	    			bx_app.append("0");
	    		}
	    		bx_app.append(bx);
	    		bx = bx_app.toString();
	    		
	    		int c = 0;
	    		for(int i = 0;i < bx.length();i++){
	    			String bit_x = bx.substring(i,i+1);
	    			String bit_y = by.substring(i,i+1);
	    			if(!bit_x.equals(bit_y)){
	    				c++;
	    			}
	    		}
	    		
	    		return c;
	    	}
	    }
	    else {
	    	
	    	int c = 0;
	    	for(int i = 0;i < bx.length();i++){
	    		String bit_x = bx.substring(i, i+1);
	    		String bit_y = by.substring(i, i+1);
	    		
	    		if(!bit_x.equals(bit_y)) {
	    			c++;
	    		}
	    		
	    	}
	    	return c;
	    }
		
		
		
	}	
	
		
	
	}
	
	
