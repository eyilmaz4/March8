package march8codes;

public class maxValueOfArray {
    public static void main(String[] args) {
        int[][] myArr={{1,2,3},{4,5}};
      maxValue(myArr);
    }
    public static int maxValue(int [][] arr){
      int max=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]>arr[i][j+1]){
                    max=arr[i][j];
                }
            }

        }
        return max;
    }
}
