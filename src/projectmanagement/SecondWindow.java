
package projectmanagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class SecondWindow extends javax.swing.JFrame {
    
    //private ArrayList<String> questionList = new ArrayList();
    //private ArrayList<String> optionAList = new ArrayList();
    //private ArrayList<String> optionBList = new ArrayList();
    //private ArrayList<String> optionCList = new ArrayList();
    //private ArrayList<String> optionDList = new ArrayList();
    //private ArrayList<String> answerList = new ArrayList();
    private ArrayList<Question> questionList = new ArrayList();
    
    MainWindow firstWindow;
    
    
    public SecondWindow(MainWindow m) {
        initComponents();
        firstWindow = m;
    }

    public void readFile() {
        try {
            File file = new File("path");
            Scanner scanner = new Scanner(file);
            Question q = new Question();
            while (scanner.hasNext()) {
                q.setQuestion(scanner.nextLine());
                q.setOptionA(scanner.nextLine());
                q.setOptionB(scanner.nextLine());
                q.setOptionC(scanner.nextLine());
                q.setOptionD(scanner.nextLine());
                q.setAnswer(scanner.nextLine());
                questionList.add(q);
                //questionList.add(scanner.nextLine());
                //optionAList.add(scanner.nextLine());
                //optionBList.add(scanner.nextLine());
                //optionCList.add(scanner.nextLine());
                //optionDList.add(scanner.nextLine());
                //answerList.add(scanner.nextLine());
            }
            /*
            for (int i = 0; i < questionList.size(); i++) {
                Question tempQuestion
                        = new Question(questionList.get(i - 1), optionAList.get(i - 1), optionBList.get(i - 1),
                                optionCList.get(i - 1), optionDList.get(i - 1), answerList.get(i - 1));
                questions.add(i - 1, tempQuestion);
            }
            */
        } catch (FileNotFoundException e) {
            System.out.println("Error" + e);
        }
    }

    public void displayOptions() {
        
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
        jLabel1 = new javax.swing.JLabel();
        txtQ1 = new javax.swing.JTextField();
        btnQ1A = new javax.swing.JRadioButton();
        btnQ1B = new javax.swing.JRadioButton();
        btnQ1C = new javax.swing.JRadioButton();
        btnQ1D = new javax.swing.JRadioButton();
        txtQ2 = new javax.swing.JTextField();
        btnQ2A = new javax.swing.JRadioButton();
        btnQ2B = new javax.swing.JRadioButton();
        btnQ2C = new javax.swing.JRadioButton();
        btnQ2D = new javax.swing.JRadioButton();
        txtQ3 = new javax.swing.JTextField();
        btnQ3A = new javax.swing.JRadioButton();
        btnQ3B = new javax.swing.JRadioButton();
        btnQ3C = new javax.swing.JRadioButton();
        btnQ3D = new javax.swing.JRadioButton();
        txtQ4 = new javax.swing.JTextField();
        btnQ4A = new javax.swing.JRadioButton();
        btnQ4B = new javax.swing.JRadioButton();
        btnQ4C = new javax.swing.JRadioButton();
        btnQ4D = new javax.swing.JRadioButton();
        txtQ5 = new javax.swing.JTextField();
        btnQ5A = new javax.swing.JRadioButton();
        btnQ5B = new javax.swing.JRadioButton();
        btnQ5C = new javax.swing.JRadioButton();
        btnQ5D = new javax.swing.JRadioButton();
        txtQ6 = new javax.swing.JTextField();
        btnQ6A = new javax.swing.JRadioButton();
        btnQ6B = new javax.swing.JRadioButton();
        btnQ6C = new javax.swing.JRadioButton();
        btnQ6D = new javax.swing.JRadioButton();
        txtQ7 = new javax.swing.JTextField();
        btnQ7A = new javax.swing.JRadioButton();
        btnQ7B = new javax.swing.JRadioButton();
        btnQ7C = new javax.swing.JRadioButton();
        btnQ7D = new javax.swing.JRadioButton();
        txtQ8 = new javax.swing.JTextField();
        btnQ8A = new javax.swing.JRadioButton();
        btnQ8B = new javax.swing.JRadioButton();
        btnQ8C = new javax.swing.JRadioButton();
        btnQ8D = new javax.swing.JRadioButton();
        txtQ9 = new javax.swing.JTextField();
        btnQ9A = new javax.swing.JRadioButton();
        btnQ9B = new javax.swing.JRadioButton();
        btnQ9C = new javax.swing.JRadioButton();
        btnQ9D = new javax.swing.JRadioButton();
        txtQ10 = new javax.swing.JTextField();
        btnQ10A = new javax.swing.JRadioButton();
        btnQ10B = new javax.swing.JRadioButton();
        btnQ10C = new javax.swing.JRadioButton();
        btnQ10D = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDone.setText("Submit!");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        txtQ1.setText("jTextField1");

        buttonGroup1.add(btnQ1A);
        btnQ1A.setText("jRadioButton1");

        buttonGroup1.add(btnQ1B);
        btnQ1B.setText("jRadioButton2");

        buttonGroup1.add(btnQ1C);
        btnQ1C.setText("jRadioButton3");

        buttonGroup1.add(btnQ1D);
        btnQ1D.setText("jRadioButton4");

        txtQ2.setText("jTextField1");

        buttonGroup2.add(btnQ2A);
        btnQ2A.setText("jRadioButton1");

        buttonGroup2.add(btnQ2B);
        btnQ2B.setText("jRadioButton2");

        buttonGroup2.add(btnQ2C);
        btnQ2C.setText("jRadioButton3");

        buttonGroup2.add(btnQ2D);
        btnQ2D.setText("jRadioButton4");

        txtQ3.setText("jTextField1");

        buttonGroup3.add(btnQ3A);
        btnQ3A.setText("jRadioButton1");

        buttonGroup3.add(btnQ3B);
        btnQ3B.setText("jRadioButton2");

        buttonGroup3.add(btnQ3C);
        btnQ3C.setText("jRadioButton3");

        buttonGroup3.add(btnQ3D);
        btnQ3D.setText("jRadioButton4");

        txtQ4.setText("jTextField1");

        buttonGroup4.add(btnQ4A);
        btnQ4A.setText("jRadioButton1");

        buttonGroup4.add(btnQ4B);
        btnQ4B.setText("jRadioButton2");

        buttonGroup4.add(btnQ4C);
        btnQ4C.setText("jRadioButton3");

        buttonGroup4.add(btnQ4D);
        btnQ4D.setText("jRadioButton4");

        txtQ5.setText("jTextField1");

        buttonGroup5.add(btnQ5A);
        btnQ5A.setText("jRadioButton1");

        buttonGroup5.add(btnQ5B);
        btnQ5B.setText("jRadioButton2");

        buttonGroup5.add(btnQ5C);
        btnQ5C.setText("jRadioButton3");

        buttonGroup5.add(btnQ5D);
        btnQ5D.setText("jRadioButton4");

        txtQ6.setText("jTextField1");

        buttonGroup6.add(btnQ6A);
        btnQ6A.setText("jRadioButton1");

        buttonGroup6.add(btnQ6B);
        btnQ6B.setText("jRadioButton2");

        buttonGroup6.add(btnQ6C);
        btnQ6C.setText("jRadioButton3");

        buttonGroup6.add(btnQ6D);
        btnQ6D.setText("jRadioButton4");

        txtQ7.setText("jTextField1");

        buttonGroup7.add(btnQ7A);
        btnQ7A.setText("jRadioButton1");

        buttonGroup7.add(btnQ7B);
        btnQ7B.setText("jRadioButton2");

        buttonGroup7.add(btnQ7C);
        btnQ7C.setText("jRadioButton3");

        buttonGroup7.add(btnQ7D);
        btnQ7D.setText("jRadioButton4");

        txtQ8.setText("jTextField1");

        buttonGroup8.add(btnQ8A);
        btnQ8A.setText("jRadioButton1");

        buttonGroup8.add(btnQ8B);
        btnQ8B.setText("jRadioButton2");

        buttonGroup8.add(btnQ8C);
        btnQ8C.setText("jRadioButton3");

        buttonGroup8.add(btnQ8D);
        btnQ8D.setText("jRadioButton4");

        txtQ9.setText("jTextField1");

        buttonGroup9.add(btnQ9A);
        btnQ9A.setText("jRadioButton1");

        buttonGroup9.add(btnQ9B);
        btnQ9B.setText("jRadioButton2");

        buttonGroup9.add(btnQ9C);
        btnQ9C.setText("jRadioButton3");

        buttonGroup9.add(btnQ9D);
        btnQ9D.setText("jRadioButton4");

        txtQ10.setText("jTextField1");

        buttonGroup10.add(btnQ10A);
        btnQ10A.setText("jRadioButton1");

        buttonGroup10.add(btnQ10B);
        btnQ10B.setText("jRadioButton2");

        buttonGroup10.add(btnQ10C);
        btnQ10C.setText("jRadioButton3");

        buttonGroup10.add(btnQ10D);
        btnQ10D.setText("jRadioButton4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnQ2C)
                                    .addComponent(btnQ2A))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnQ2B)
                                    .addComponent(btnQ2D))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnQ1C)
                                .addComponent(btnQ1A))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnQ1B)
                                .addComponent(btnQ1D))))
                    .addComponent(txtQ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnQ3C)
                            .addComponent(btnQ3A))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQ3B)
                            .addComponent(btnQ3D)))
                    .addComponent(txtQ5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnQ5C)
                            .addComponent(btnQ5A))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQ5B)
                            .addComponent(btnQ5D)))
                    .addComponent(txtQ4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnQ4C)
                            .addComponent(btnQ4A))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQ4B)
                            .addComponent(btnQ4D))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQ6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnQ6C)
                            .addComponent(btnQ6A))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQ6B)
                            .addComponent(btnQ6D)))
                    .addComponent(txtQ7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnQ7C)
                            .addComponent(btnQ7A))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQ7B)
                            .addComponent(btnQ7D)))
                    .addComponent(txtQ8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnQ8C)
                            .addComponent(btnQ8A))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQ8B)
                            .addComponent(btnQ8D)))
                    .addComponent(txtQ9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnQ9C)
                            .addComponent(btnQ9A))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQ9B)
                            .addComponent(btnQ9D)))
                    .addComponent(txtQ10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnQ10C)
                            .addComponent(btnQ10A))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQ10B)
                            .addComponent(btnQ10D))))
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addComponent(btnDone)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtQ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQ1A)
                            .addComponent(btnQ1B))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQ1C)
                            .addComponent(btnQ1D)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtQ6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQ6A)
                            .addComponent(btnQ6B))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQ6C)
                            .addComponent(btnQ6D))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtQ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQ2A)
                            .addComponent(btnQ2B))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQ2C)
                            .addComponent(btnQ2D)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtQ7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQ7A)
                            .addComponent(btnQ7B))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQ7C)
                            .addComponent(btnQ7D))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtQ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQ3A)
                            .addComponent(btnQ3B))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQ3C)
                            .addComponent(btnQ3D)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtQ8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQ8A)
                            .addComponent(btnQ8B))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQ8C)
                            .addComponent(btnQ8D))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtQ4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQ4A)
                            .addComponent(btnQ4B))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQ4C)
                            .addComponent(btnQ4D)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtQ9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQ9A)
                            .addComponent(btnQ9B))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQ9C)
                            .addComponent(btnQ9D))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtQ5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQ5A)
                            .addComponent(btnQ5B))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQ5C)
                            .addComponent(btnQ5D)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtQ10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQ10A)
                            .addComponent(btnQ10B))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQ10C)
                            .addComponent(btnQ10D))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnDone))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        //
    }//GEN-LAST:event_btnDoneActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDone;
    private javax.swing.JRadioButton btnQ10A;
    private javax.swing.JRadioButton btnQ10B;
    private javax.swing.JRadioButton btnQ10C;
    private javax.swing.JRadioButton btnQ10D;
    private javax.swing.JRadioButton btnQ1A;
    private javax.swing.JRadioButton btnQ1B;
    private javax.swing.JRadioButton btnQ1C;
    private javax.swing.JRadioButton btnQ1D;
    private javax.swing.JRadioButton btnQ2A;
    private javax.swing.JRadioButton btnQ2B;
    private javax.swing.JRadioButton btnQ2C;
    private javax.swing.JRadioButton btnQ2D;
    private javax.swing.JRadioButton btnQ3A;
    private javax.swing.JRadioButton btnQ3B;
    private javax.swing.JRadioButton btnQ3C;
    private javax.swing.JRadioButton btnQ3D;
    private javax.swing.JRadioButton btnQ4A;
    private javax.swing.JRadioButton btnQ4B;
    private javax.swing.JRadioButton btnQ4C;
    private javax.swing.JRadioButton btnQ4D;
    private javax.swing.JRadioButton btnQ5A;
    private javax.swing.JRadioButton btnQ5B;
    private javax.swing.JRadioButton btnQ5C;
    private javax.swing.JRadioButton btnQ5D;
    private javax.swing.JRadioButton btnQ6A;
    private javax.swing.JRadioButton btnQ6B;
    private javax.swing.JRadioButton btnQ6C;
    private javax.swing.JRadioButton btnQ6D;
    private javax.swing.JRadioButton btnQ7A;
    private javax.swing.JRadioButton btnQ7B;
    private javax.swing.JRadioButton btnQ7C;
    private javax.swing.JRadioButton btnQ7D;
    private javax.swing.JRadioButton btnQ8A;
    private javax.swing.JRadioButton btnQ8B;
    private javax.swing.JRadioButton btnQ8C;
    private javax.swing.JRadioButton btnQ8D;
    private javax.swing.JRadioButton btnQ9A;
    private javax.swing.JRadioButton btnQ9B;
    private javax.swing.JRadioButton btnQ9C;
    private javax.swing.JRadioButton btnQ9D;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtQ1;
    private javax.swing.JTextField txtQ10;
    private javax.swing.JTextField txtQ2;
    private javax.swing.JTextField txtQ3;
    private javax.swing.JTextField txtQ4;
    private javax.swing.JTextField txtQ5;
    private javax.swing.JTextField txtQ6;
    private javax.swing.JTextField txtQ7;
    private javax.swing.JTextField txtQ8;
    private javax.swing.JTextField txtQ9;
    // End of variables declaration//GEN-END:variables
}
