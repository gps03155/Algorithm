import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    /**
	    * 배열로 푸는 방식이 메모리, 시간 면에서 더 좋음
	    **/
		
	    // 1. 배열 (14296KB  128ms)
	    int[] alpha = new int[26];
		
	    char[] word1 = br.readLine().toCharArray();
	    char[] word2 = br.readLine().toCharArray();
		
	    for(char cha : word1) {
	        alpha[cha - 'a']++;
	    }
		
	    for(char cha : word2) {
	    	alpha[cha - 'a']--;
	    }
		
	    System.out.println(Arrays.stream(alpha).map(m -> Math.abs(m)).sum());
		
	    // 2. for (14356KB	140ms)
	    String[] word1= br.readLine().split("");
	    String[] word2 = br.readLine().split("");
		
	    List<String> list1 = new ArrayList<>(Arrays.asList(word1));
	    List<String> list2 = new ArrayList<>(Arrays.asList(word2));

	    for(Iterator<String> it = list1.iterator(); it.hasNext();) {
	    	String s1 = it.next();
	    	Boolean isCheck = false;
	    	
	    	for(Iterator<String> it2 = list2.iterator(); it2.hasNext();) {
	    		String s2 = it2.next();
	    		
	    		if(s1.equals(s2)) {
	    		    it2.remove();
	    		    isCheck = true;
	    		    break;
	    		}
	    	}
	    	
	    	if(isCheck) {
	    	    it.remove();
	    	}
	    }
	    
	    System.out.println(list1.size() + list2.size());
	}
}
