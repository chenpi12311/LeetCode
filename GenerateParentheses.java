import java.util.*;

public class GenerateParentheses {
    
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<String>();
        backtrack(results, "", 0, 0, n);
        return results;
    }

    private void backtrack(List<String> lists, String str, int open, int close, int max) {
        if (str.length() == max * 2) 
	{
	    lists.add(str);
	    return;
	}
		
	if (open < max)
	    backtrack(lists, str + "(" , open + 1, close, max);
	if (close < open)
	    backtrack(lists, str + ")", open, close + 1, max);
    }

    public static void main(String[] args) {
	GenerateParentheses gp = new GenerateParentheses();
	List<String> lists = gp.generateParenthesis(3);
 	for (String list : lists) 
	{
	    System.out.println(list);
	}
    }

}
