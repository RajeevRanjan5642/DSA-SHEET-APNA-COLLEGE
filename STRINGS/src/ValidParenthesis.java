import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String p){
        Stack<Character>st=new Stack<>();
        st.push(p.charAt(0));
        for(int i=1; i<p.length(); i++){
            char temp2=p.charAt(i);
            if(st.isEmpty()) st.push(temp2);
            else {
                char temp1 = st.peek();
                if (temp1 == '(' && temp2 == ')' || temp1 == '[' && temp2 == ']'
                        || temp1 == '{' && temp2 == '}') st.pop();
                else st.push(temp2);
            }
        }
        if(st.isEmpty()) return true;
        else return false;
    }
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        System.out.println(isValid(str));
    }
}
/*
T.C = O(N)
S.C = O(N)
*/
