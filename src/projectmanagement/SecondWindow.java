package projectmanagement;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class SecondWindow extends javax.swing.JFrame {
    //An array to store the user's answers
    private static String[] userAns = new String[10];  
    //An array list to store the 10 Question objects
    private static ArrayList<Question> questionList = new ArrayList();
    //stores the user's scores
    private int score = 0;
    //keeps track of which question the user is on
    private int qNum = 0;
    
    MainWindow firstWindow;
    public SecondWindow(MainWindow m) {
        initComponents();
        firstWindow = m;
    }

    //this is for reading the file "questions.txt" and storing the stuff in the questionList array list
    public static void readFile() {
        try {
            InputStream in = SecondWindow.class.getResourceAsStream("questions.txt");
            Scanner scanner = new Scanner(in);

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
                //and so it loops...
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDone.setText("Start Quiz!");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnA);
        btnA.setText("jRadioButton1");

        buttonGroup1.add(btnB);
        btnB.setText("jRadioButton2");

        buttonGroup1.add(btnC);
        btnC.setText("jRadioButton3");

        buttonGroup1.add(btnD);
        btnD.setText("jRadioButton4");

        lblQuestion.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuestion)
                    .addComponent(btnDone)
                    .addComponent(btnD)
                    .addComponent(btnB)
                    .addComponent(btnC)
                    .addComponent(btnA))
                .addContainerGap(517, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblQuestion)
                .addGap(38, 38, 38)
                .addComponent(btnA)
                .addGap(18, 18, 18)
                .addComponent(btnB)
                .addGap(18, 18, 18)
                .addComponent(btnD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnC)
                .addGap(39, 39, 39)
                .addComponent(btnDone)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //what happens when the done button is pressed
    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        //first make sure qNum is smaller than the # of questions (10) 
        //because if it's greater and we run the following code we'll get an outOfBounds error
        if (qNum < questionList.size()) {
            //invoke the displayQuestion method and display the current question
            displayQuestion(qNum);
            //check which option the user selected, then set the corresponding place in the array userAns to the option 
            //here we're setting it to btn.getText() because in the displayQuestion method we did btn.setText(questionList.getOption())
            if (btnA.isSelected()) {
                userAns[qNum] = btnA.getText();
            } else if (btnB.isSelected()) {
                userAns[qNum] = btnB.getText();
            } else if (btnC.isSelected()) {
                userAns[qNum] = btnC.getText();
            } else if (btnD.isSelected()) {
                userAns[qNum] = btnD.getText();
            }
            //check if the user's answer is equal to the question's answer
            //FOR SOME REASON THERE'S A BUG, EVEN IF WE DID THE ENTIRE QUIZ CORRECTLY WE WOULD ONLY GET 2 POINTS
            if (questionList.get(qNum).getAnswer().equals(userAns[qNum])) {
                //the score goes up
                score++;
            }
            //show the score (this is used to debug)
            System.out.println(score);
            
            //this is to display different text on the done button depending on what question the user is on
            //if the user hasn't started, it displays "Start Quiz!"
            //if the user is on questions 1 - 9, it displays "Next"
            //on question 10 (the last question), displays "Submit!"
            if (qNum >= 0 && qNum < questionList.size() - 1) {
                btnDone.setText("Next");
            } else if (qNum == questionList.size() - 1) {
                btnDone.setText("Submit!");
            }
            //on to the next question
            qNum++;
        } else if (qNum >= questionList.size()) { //when the user has finished all questions and clicked "Submit!",
            //show the score (this is used to debug)
            JOptionPane.showMessageDialog(null, score);
            //TO DO: SHOW THE RESULTS & FEEDBACK
            //TO DO: CLOSE THIS WINDOW AND GO BACK TO THE NOTES WINDOW
        }
    }//GEN-LAST:event_btnDoneActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnA;
    private javax.swing.JRadioButton btnB;
    private javax.swing.JRadioButton btnC;
    private javax.swing.JRadioButton btnD;
    private javax.swing.JButton btnDone;
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
