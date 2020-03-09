package march8codes;

public class squareArray {
    public static void main(String[] args) {
int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(isSquareArray(arr));
    }
    public static boolean isSquareArray(int [][] arr){
        boolean square=true;
        for(int i=0; i<arr.length; i++){
            if(arr.length!=arr[i].length){
                square=false;
            }
        }
     return square;
    }
}

