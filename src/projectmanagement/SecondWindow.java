
package projectmanagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class SecondWindow extends javax.swing.JFrame {
    private static String[] userAns = new String[10];  
    private static ArrayList<Question> questionList = new ArrayList();
    private int score = 0;
    private int qNum = 0;
    
    MainWindow firstWindow;
    
    
    public SecondWindow(MainWindow m) {
        initComponents();
        firstWindow = m;
    }

    public static void readFile() {
        try {
            File file = new File("src/projectmanagement/questions.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                Question q = new Question();
                q.setQuestion(scanner.nextLine());
                q.setOptionA(scanner.nextLine());
                q.setOptionB(scanner.nextLine());
                q.setOptionC(scanner.nextLine());
                q.setOptionD(scanner.nextLine());
                q.setAnswer(scanner.nextLine());
                //scanner.nextLine();
                questionList.add(q);    
            } 
        } catch (FileNotFoundException e) {
            System.out.println("Error" + e);
        }
        System.out.println(questionList.get(2).getQuestion());
    }

    public void displayQuestion(int i) {
        txtQuestion.setText(questionList.get(i).getQuestion());
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
        txtQuestion = new javax.swing.JTextField();
        btnA = new javax.swing.JRadioButton();
        btnB = new javax.swing.JRadioButton();
        btnC = new javax.swing.JRadioButton();
        btnD = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDone.setText("Start Quiz!");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        txtQuestion.setText("jTextField1");

        buttonGroup1.add(btnA);
        btnA.setText("jRadioButton1");

        buttonGroup1.add(btnB);
        btnB.setText("jRadioButton2");

        buttonGroup1.add(btnC);
        btnC.setText("jRadioButton3");

        buttonGroup1.add(btnD);
        btnD.setText("jRadioButton4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDone))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnD))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnA)
                        .addGap(99, 99, 99)
                        .addComponent(btnB)))
                .addGap(627, 774, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDone))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnA)
                    .addComponent(btnB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnD)
                    .addComponent(btnC))
                .addGap(105, 105, 105))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        if (qNum < questionList.size()) {
            displayQuestion(qNum);
            if (btnA.isSelected()) {
                userAns[qNum] = btnA.getText();
            } else if (btnB.isSelected()) {
                userAns[qNum] = btnB.getText();
            } else if (btnC.isSelected()) {
                userAns[qNum] = btnC.getText();
            } else if (btnD.isSelected()) {
                userAns[qNum] = btnD.getText();
            }
            if (questionList.get(qNum).getAnswer().equals(userAns[qNum])) {
                score++;
            }
            System.out.println(score);
            if (qNum >= 0 && qNum < questionList.size() - 1) {
                btnDone.setText("Next");
            } else if (qNum == questionList.size() - 1) {
                btnDone.setText("Submit!");
            }
            qNum++;
        } else if (qNum >= questionList.size()) {
            JOptionPane.showMessageDialog(null, score);
            //CLOSE THIS WINDOW AND GO BACK TO THE NOTES WINDOW
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
    private javax.swing.JTextField txtQuestion;
    // End of variables declaration//GEN-END:variables
}
