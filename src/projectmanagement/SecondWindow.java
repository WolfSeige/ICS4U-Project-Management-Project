//SECOND WINDOW
//for quiz
package projectmanagement;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class SecondWindow extends javax.swing.JFrame {
    //An array to store the user's answers
    public static String[] userAns = new String[11];
    //An array list to store the 10 Question objects
    public static ArrayList<Question> questionList = new ArrayList();
    //An array list to store questions answered wrong
    public static ArrayList<Question> wrongQ = new ArrayList();
    //An array list to store wrong answers
    public static ArrayList<String> wrongAns = new ArrayList();
    //stores the user's scores
    public  int score = 0;
    //keeps track of which question the user is on
    public int qNum = 0;
    //list of feedback
    public static String[] feedbackList = new String[10];
    
    //Strings used to store the options of the last question
    private String btnAText;
    private String btnBText;
    private String btnCText;
    private String btnDText;
    
    private MainWindow otherWindow;
    MainWindow firstWindow;
    public SecondWindow(MainWindow m) {
        initComponents();
        firstWindow = m;
    }

    //this is for reading the file "questions.txt" and storing the stuff in the questionList array list
    public static void readFile() {
        try {
            InputStream in = SecondWindow.class.getResourceAsStream("questions.txt");
            InputStream in2 = SecondWindow.class.getResourceAsStream("feedbacks.txt");
            Scanner scanner = new Scanner(in);
            Scanner scanner2 = new Scanner(in2);
            while (scanner.hasNextLine()) {
                //a placeholder Question object that we'll store all the scanner.nextLine information in
                Question q = new Question();
                //first line: question
                q.setQuestion(scanner.nextLine());
                //2-5th lines: options
                q.setOptionA(scanner.nextLine());
                q.setOptionB(scanner.nextLine());
                q.setOptionC(scanner.nextLine());
                q.setOptionD(scanner.nextLine());
                //6th line: answer
                q.setAnswer(scanner.nextLine());
                //add this Question object to the array list. Now it stores the question and its corresponding options and answer
                questionList.add(q);
            }
            //go through feedback file and add to feedback list
            for (int i = 0; i < feedbackList.length; i++) {
                feedbackList[i] = scanner2.nextLine();
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    //for actually displaying the question and options.
    //i is the question number
    public void displayQuestion(int i) {
        //set the text of the label and radio buttons, respectively, to the question and options
        lblQuestion.setText(questionList.get(i).getQuestion());
        btnA.setText(questionList.get(i).getOptionA());
        btnB.setText(questionList.get(i).getOptionB());
        btnC.setText(questionList.get(i).getOptionC());
        btnD.setText(questionList.get(i).getOptionD());
    }
    
    public void calcScore() {
        //check which option the user selected, then set the corresponding place in the array userAns to the option 
        if (btnA.isSelected()) {
            userAns[qNum] = btnAText;
        } else if (btnB.isSelected()) {
            userAns[qNum] = btnBText;
        } else if (btnC.isSelected()) {
            userAns[qNum] = btnCText;
        } else if (btnD.isSelected()) {
            userAns[qNum] = btnDText;
        }

        //check if user's answer is correct
        if (questionList.get(qNum - 1).getAnswer().equals(userAns[qNum])) {
            //the score goes up
            score++;
        }else{
            //record the wrong question & wrong user's answer
            wrongQ.add(questionList.get(qNum - 1));
            wrongAns.add(userAns[qNum]);
        }
  
        btnAText = btnA.getText();
        btnBText = btnB.getText();
        btnCText = btnC.getText();
        btnDText = btnD.getText();        
    }
    
    public String displayResults() {
        //TO DO: DISPLAY FEEDBACK
        String msg = "Questions you got wrong:\n";
        if(score == 10){
            msg = "Great job! You got all 10 questions correct";
        }else{
            for (int i = 0; i < wrongAns.size(); i++) {
            msg+= wrongQ.get(i).getQuestion()+"\n you chose: "+wrongAns.get(i)
                    +"\nThe correct answer: "+wrongQ.get(i).getAnswer()
                    +"\n"+feedbackList[questionList.indexOf(wrongQ.get(i))]+"\n\n"
                    ;
            }
        }
        return msg;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        btnDone = new javax.swing.JButton();
        btnA = new javax.swing.JRadioButton();
        btnB = new javax.swing.JRadioButton();
        btnC = new javax.swing.JRadioButton();
        btnD = new javax.swing.JRadioButton();
        lblQuestion = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDone.setText("Start Quiz!");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnA);
        btnA.setText(" ");

        buttonGroup1.add(btnB);
        btnB.setText(" ");

        buttonGroup1.add(btnC);
        btnC.setText(" ");

        buttonGroup1.add(btnD);
        btnD.setText(" ");

        lblQuestion.setText(" ");

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC)
                    .addComponent(lblQuestion)
                    .addComponent(btnD)
                    .addComponent(btnB)
                    .addComponent(btnA)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNext)
                        .addGap(44, 44, 44)
                        .addComponent(btnDone)))
                .addContainerGap(415, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblQuestion)
                .addGap(48, 48, 48)
                .addComponent(btnA)
                .addGap(18, 18, 18)
                .addComponent(btnB)
                .addGap(18, 18, 18)
                .addComponent(btnC)
                .addGap(18, 18, 18)
                .addComponent(btnD)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnDone))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //what happens when the done button is pressed
    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
 
        //first make sure qNum is smaller than the # of questions (10) 
        if (qNum < questionList.size()) {
            if (qNum == 0) {//check if the quiz has just started yet
                //set this button invisible so only the "next" button shows
                btnDone.setVisible(false);
                //display the first question
                displayQuestion(qNum);
                qNum++;
                
                // Clear any previous selections
                buttonGroup1.clearSelection(); 
                
                //set question and all options visible once the quiz starts
                lblQuestion.setVisible(true);
                btnA.setVisible(true);
                btnB.setVisible(true);
                btnC.setVisible(true);
                btnD.setVisible(true);
                
                //first question
                btnAText = questionList.get(0).getOptionA();
                btnBText = questionList.get(0).getOptionB();
                btnCText = questionList.get(0).getOptionC();
                btnDText = questionList.get(0).getOptionD();
            } 
        } else if (qNum >= questionList.size()) { //when the user has finished all questions and clicked "Submit!",
            //calculate the last (10th) question's score
            calcScore();
            
            //show the score (this is used to debug)
            JOptionPane.showMessageDialog(null, "Your score: "+score+"\n"+displayResults());
            
            //TO DO: SHOW THE RESULTS & FEEDBACK
            
            //Go back to main window (I have no clue what I did, but it works so yay)            
            if (firstWindow == null) {
                firstWindow = new MainWindow(this);
            }
            //set the other window to be visible
            firstWindow.setVisible(true);
            //hide this window
            this.setVisible(false);
            
            //reset everything
            btnDone.setText("Start Quiz!");
            qNum = 0;
            score = 0;
            Arrays.fill(userAns, null);  

            wrongAns.clear(); 
            wrongQ.clear();
            
            lblQuestion.setVisible(false);
            btnA.setVisible(false);
            btnB.setVisible(false);
            btnC.setVisible(false);
            btnD.setVisible(false);
        }
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        //first make sure qNum is smaller than the # of questions (10) 
        //because if it's greater and we run the following code we'll get an outOfBounds error
        if (qNum < questionList.size()) {
            //invoke the displayQuestion method and display the current question
            displayQuestion(qNum);
            //update the current score
            calcScore(); 
            
            //check if the user is on the last question - then display the other button and set it to say "Submit!"
            if (qNum == questionList.size() - 1) {
                btnDone.setVisible(true);
                btnDone.setText("Submit!");
            }
            qNum++;      
        }
        
        //clear all selections the user made when going into a new question
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_btnNextActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnA;
    private javax.swing.JRadioButton btnB;
    private javax.swing.JRadioButton btnC;
    private javax.swing.JRadioButton btnD;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JLabel lblQuestion;
    // End of variables declaration//GEN-END:variables
}
