import java.util.Stack;

public class SortStackRecursively {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        stackSort(st);

        for(int i = 0 ; i < st.size() ; i++){
            System.out.println(st.get(i));
        }

    }

    public static void insert(Stack<Integer> st , int ele){
        if(st.empty() || st.peek() < ele){
            st.push(ele);
            return;
        }

        int temp = st.pop();
        insert(st , ele);
        st.push(temp);

    }

    public static void stackSort(Stack<Integer> st){
        if(!st.isEmpty()){
            int ele = st.pop();
            stackSort(st);
            insert(st , ele);
        }
    }
}
