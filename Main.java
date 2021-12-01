
public class Main{
    public static void main(String[] args){
        int[] test_questions = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        test_questions[0] = (int)(Math.random() * 31);
        System.out.println("Question #"+ 1 +" is example #"+ test_questions[0] +" from W3 Schools.");
        for(int i = 1; i < 20; i++){
            int j = i + 1;
            test_questions[i] = check_for_match(test_questions, i);
            System.out.println("Question #"+ j +" is example #"+ test_questions[i] +" from W3 Schools."); 
        }
    }
    
    static int check_for_match(int[] array, int y){
        int x = (int)(Math.random() * 31);
        if(x == 0){
          x++;    
        }
        int i = y;
        while(i > 0){
            if(x != array[i-1]){
                i--;   
            }
            else{
                return check_for_match(array, y);
            }
        }
        return x;
    } 
}
 