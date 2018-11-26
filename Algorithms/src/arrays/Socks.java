package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Socks {

	/*
	 * take in # of socks, and array listing socks(by id)
	 * find # of pairs
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	//not complete
	
	 static int sockMerchant(int n, int[] ar) {
	        Map<Integer, Integer> socks = new HashMap<Integer, Integer>();
	        Set<Integer> keys = new HashSet<Integer>();
	        for(int a : ar){
	            
	            if(socks.get(a)==null){
	                socks.put(a, 1);
	            }
	            else{
	            int temp = socks.get(a);
	            socks.put(a, ++temp);
	            }
	        keys.add(a);
	         }
	        
	        
	    
	        int pairs = 0;
	        for(int sock: keys){
	            System.out.println("total number of "+ sock + " is " + socks.get(sock));
	            System.out.println(sock);
	            int x = socks.get(sock);
	            while(x>1){
	                x-=2;
	                pairs++;
	            }
	        }
	        
	        return pairs;

	    }
	 

}
