import java.util.HashSet;
import java.util.Set;

public class WalkingRobotSimulation {
    public static void main(String[] args){
        int[] commands = {4,-1,4,-2,4};
        int[][] obstacles = {{2,4}};

        Set<String> set = new HashSet<>();

        for(int obs[] : obstacles){
            set.add(obs[0] + "_" + obs[1]);
        }

        int x = 0;
        int y = 0;
        int maxDis = 0;

        int[] dir = {0,1};

        for(int i = 0 ; i < commands.length ; i++){
            if(commands[i] == -2) {
                int temp = dir[1];
                dir[1] = +1 * dir[0];
                dir[0] = -1 * temp;
            }
            else if(commands[i] == -1){
                int temp = dir[1];
                dir[1] = -1 * dir[0];
                dir[0] = +1 * temp;
            }
            else{
                for(int j = 0 ; j < commands[i] ; j++) {
                    int currX = x + dir[0];
                    int currY = y + dir[1];

                    String check = currX + "_" + currY;

                    if (set.contains(check)) {
                        break;
                    }

                    x = currX;
                    y = currY;
                }
            }
            maxDis = Math.max(maxDis,x*x + y*y);
        }
        System.out.println(maxDis);
    }
}
