public class RobotReturnToOrigin {
    public static void main(String[] args){
        String moves = "UDLR";
        int vertical = 0;
        int horizontal = 0;
        int n = moves.length();
        for(int i = 0 ; i < n ; i++){
            if(moves.charAt(i) == 'U'){
                vertical++;
            }
            else if(moves.charAt(i) == 'D'){
                vertical--;
            }
            else if(moves.charAt(i) == 'R'){
                horizontal++;
            }
            else if(moves.charAt(i) == 'L'){
                horizontal--;
            }
        }


        if(vertical == 0 && horizontal == 0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
