class Solution {
    public int evalRPN(String[] tokens) {
        int a,b;
		Stack<Integer> S = new Stack<Integer>();
		for (String s : tokens) {
            switch(s)
            {
                case "+":
                  S.add(S.pop()+S.pop());
                  break;
                case "/":
                   b = S.pop();
				   a = S.pop();
				   S.add(a / b);
                   break;
                case "*":
                    S.add(S.pop() * S.pop());
                    break;
                case "-":
                   b = S.pop();
				   a = S.pop();
				   S.add(a - b);
                    break;
                default:
                    S.add(Integer.parseInt(s));
            }
		}	
		return S.pop();
    }
}
