
package projectmanagement;


public class Question {
    
   //attributes for a question
    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String answer;
    
    /**
     * primary constructor
     * creates empty question and options
     */
    public Question(){
        question = "";
        optionA = "";
        optionB = "";
        optionC = "";
        optionD = "";
        answer = "";
    }
    /**
     * secondary constructor
     * takes in strings for question and options
     * @param q
     * @param a
     * @param b
     * @param c
     * @param d 
     */
    public Question(String q, String a, String b, String c, String d, String answer){
        this();
        question = q;
        optionA = a;
        optionB = b;
        optionC = c;
        optionD = d;
        this.answer = answer;
    }
    //getters
    public String getQuestion(){
        return question;
    }
    
    public String getOptionA(){
        return optionA;
    }
    
    public String getOptionB(){
        return optionB;
    }
    
    public String getOptionC(){
        return optionC;
    }
    
    public String getOptionD(){
        return optionD;
    }
    
    public String getAnswer(){
        return answer;
    }
    
    //setters
    public void setQuestion(String q){
        question  = q;
    }
    
    public void setOptionA(String a){
        optionA = a;
    }
    
    public void setOptionB(String b){
        optionB = b;
    }
    
    public void setOptionC(String c){
        optionC = c;
    }
    
    public void setOptionD(String d){
        optionD = d;
    }
    
    public void setAnswer(String ans){
        answer = ans;
    }
}
