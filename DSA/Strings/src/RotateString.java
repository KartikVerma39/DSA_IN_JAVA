//1stApproach

//public class RotateString {
//    public static void main(String[] args){
//        String s = "abcde";
//        String goal = "eabcd";
//
//        if(s.length() != goal.length()){
//            System.out.println("False");
//            return;
//        }
//
//        String concat = s + s;
//
//        if(concat.contains(goal)){
//            System.out.println("True");
//            return;
//        }
//        System.out.println("False");
//    }
//}


//2ndApproach

public class RotateString{
    public static void main(String[] args){
        String s = "abcde";
        String goal = "eabcd";

        for(int i = 0 ; i < s.length() ; i++){
            String rotated = s.substring(i) + s.substring(0,i);
            if(rotated.equals(goal)){
                System.out.println("True");
                return;
            }
        }

        System.out.println("False");
    }
}