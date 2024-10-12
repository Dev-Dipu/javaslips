package Student;

public class Studentper {
    public static float getPercent(int[] subs){
        int totalmarks=0;
        for(int i=0; i<subs.length; i++){
            totalmarks += subs[i];
        }
        return (float) totalmarks/ subs.length;
    }
}
