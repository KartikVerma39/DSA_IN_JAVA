import java.util.Stack;

public class ReverseAStackRecursively {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        reverseAStack(st);

        for(int i = 0 ; i < st.size() ; i++){
            System.out.println(st.get(i));
        }
    }

    public static void setAtBottom(Stack<Integer> st , int temp){
        if (st.empty()){
            st.push(temp);
            return;
        }

        int ele = st.pop();
        setAtBottom(st , temp);
        st.push(ele);
    }

    public static void reverseAStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        else if(!st.isEmpty()){
            int ele = st.pop();
            reverseAStack(st);
            setAtBottom(st , ele);
        }
    }


}
