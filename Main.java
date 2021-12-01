//Riley Heaman
//CIS 219 Prof Swinarski
//Project #1: Non-repeating Test Question Randomizer
//11-23-21
public class Main{
    public static void main(String[] args){
        int[] test_questions = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};                                 //Initialize a bank for 20 out of the 30 possible questions.
        test_questions[0] = (int)(Math.random() * 31);                                                    //Lets Pick our first quesiton.
        System.out.println("Question #"+ 1 +" is example #"+ test_questions[0] +" from W3 Schools.");     //"This is our first question." Displayed
        for(int i = 1; i < 20; i++){                                                                      //Start a loop at 2nd spot in array till the final spot
            int j = i + 1;                                                                                //Count the test #s starting @ 2.
            test_questions[i] = check_for_match(test_questions, i);                                       //Call the function that selects unused questions
            System.out.println("Question #"+ j +" is example #"+ test_questions[i] +" from W3 Schools."); //Display which question was selected for #j on the Test
        }
    }
    
    static int check_for_match(int[] array, int y){ //This is our unused random # generator. It takes the array and current spot on that array.
        int x = (int)(Math.random() * 31);          //Generate a random number between 0 & 30. 
        if(x == 0){                                 //If that # is 0,
          x++;                                      //Make it 1. 
        }       
        int i = y;                                  //Take value of y without changing y.
        while(i > 0){                               //While our spot in the array isn't the 1st,
            if(x != array[i-1]){                        //Our new random # isn't the one previously used,  
                i--;                                        //check before that spot.
            }
            else{                                       //We found the same # in the array,
                return check_for_match(array, y);           //Restart with a new random #.
            }
        }               
        return x;                                   //new # is unique and returned to be placed in the current slot in the array.
    } 
}
 