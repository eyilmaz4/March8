package march8codes;

public class movieEvaluation {
    public static void main(String[] args) {
        movieEvaluate(6,100,120);
    }

    public static void movieEvaluate(int imdb, int totalVotes,int boxoffice ){
        if(imdb*totalVotes/boxoffice>10){
            System.out.println("watch the movie");
        }
        else{
            System.out.println("do not watch the movie");
        }
    }

}
