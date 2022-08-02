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
