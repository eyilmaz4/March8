package march8codes;

public class tenArray {
    public static void main(String[] args) {
int [][] nums=tenByTen(10,10);
printNumbersTriangle(nums);

    }
    public static int [][] tenByTen(int rows, int cols){
        int [][] tenTen=new int [rows][cols];
        int index=1;

        for(int i=0; i<tenTen.length; i++ ){
            for(int j=0; j<tenTen[i].length;j++){
                tenTen[i][j]=index;
               index++;
            }
        }
        return tenTen;

            }

            public static void printNumbersTriangle(int numbers [][]){
        for(int i=0; i<numbers.length;i++){
            for(int j=0; j<=i; j++){
                System.out.print("\t"+numbers[i][j]);
                            }
            System.out.println();
        }
            }

        }
