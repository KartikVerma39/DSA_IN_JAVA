public class RotateImage {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int rows = arr.length;
        int columns = arr[0].length;

        for(int i = 0 ; i < rows ; i++){
            for(int j = i + 1 ; j < columns ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns/2 ; j++){
                int temp = arr[i][columns - j - 1];
                arr[i][columns - j - 1] = arr[i][j];
                arr[i][j] = temp;
            }
        }


        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
