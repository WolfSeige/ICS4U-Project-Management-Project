//Afiya, Shasha, Stella 
//2024.12.6
//Project Management Project
/*
In a group (groupSize >= 2 && groupSize <= 3), you will be creating a Java program which will help your sister study for her SDLC test. 
Your system must include points to study from, as well as a multiple choice quiz (10 questions) for practice, 
which will be automatically graded and feedback given. These study notes and questions must be read from external files (so they can easily be updated). 
You and your partner(s) will be using the stages of the SDLC to complete this project. 
*/


//THIS IS THE MAIN WINDOW 
//for study notes
package projectmanagement;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainWindow extends javax.swing.JFrame {
    //the list of notes
    static ArrayList<String> notes = new ArrayList();
    
    //use a scanner to scan through the notes file, storing them in the 'notes' array list
    public static void readNotes() {
        try {
            //a placeholder String to store the current note
            String note = "";
            //honestly I don't understand what this is, but it's on the classroom slides on JAR
            //apparantly if we don't write it this way the JAR won't recognise the external txt files
            InputStream in = MainWindow.class.getResourceAsStream("notes");
            Scanner s = new Scanner(in);
            
            while (s.hasNextLine()) { //will loop until the end of the file, then stop
                //nextLine stores the String text on a line in the notes file
                String nextLine = s.nextLine();
                while (!nextLine.equals("")) { //I used a blank line ("") to separate different notes - this while loop is checking if the next line of text still belongs to the same note
                    //In this case, add the line of text to the placeholder String
                    note += nextLine + "\n";  
                    //and move on to the next line to check if it's still in the same note
                    nextLine = s.nextLine();
                }
                //reached an empty line (""), end the above while loop
                //add the current note to the array list of notes
                //e.g. we would add
                notes.add(note);
                //reset the placeholder String to its default value
                note = "";
            }
        } catch (Exception e) {
            System.out.println(e);
        }  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotes = new javax.swing.JTextArea();
        btnQuiz = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        boxTopics = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        jLabel1.setText("SLDC Project - Study Notes");

        txtNotes.setColumns(20);
        txtNotes.setRows(5);
        jScrollPane1.setViewportView(txtNotes);

        btnQuiz.setText("Start Quiz!");
        btnQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizActionPerformed(evt);
            }
        });

        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        boxTopics.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a topic to review", "What is a System?", "People involved in a System", "How to measure success?", "The Software Development Process", "Mistakes in the Software Development Process", "The Waterfall Model", "Project Management Tools", "Gantt Chart", "UML" }));
        boxTopics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTopicsActionPerformed(evt);
            }
        });

        jLabel2.setText("Welcome to the Software Development Life Cycle Review Project! ");

        jLabel3.setText("This project is dedicated to students who did not take notes in class but has an upcoming project management and SLDC test.");

        jLabel4.setText("You can use the below notes to review, and when you're ready just click on \"Start Quiz\" to take a simple quiz to test your knowledge.");

        jLabel5.setText("You will be given feedback on how you did on the quiz.");

        jLabel6.setText("Good luck!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(boxTopics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnQuiz)
                        .addGap(38, 38, 38)
                        .addComponent(btnQuit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)
                                .addGap(64, 64, 64)))))
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxTopics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnQuiz)
                        .addComponent(btnQuit)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private SecondWindow otherWindow;

    public MainWindow() {
        initComponents();
    }
    
    public MainWindow(SecondWindow m) {
        initComponents();
        otherWindow = m;
    }
    
    //quiz button - when pressed will direct to the quiz window (secondWindow)
    private void btnQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizActionPerformed
        //check if the second window has already been created
        if (otherWindow == null) {
            otherWindow = new SecondWindow(this);
        }
        //set the other window to be visible
        otherWindow.setVisible(true);
        //hide this window
        this.setVisible(false);
    }//GEN-LAST:event_btnQuizActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

    private void boxTopicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTopicsActionPerformed
        //The combo box options
        /*
        What is a System?
        People involved in a System
        How to measure success?
        The Software Development Process
        Mistakes in the Software Development Process 
        The Waterfall Model
        Phases of the Waterfall Model
        Cost of Mistakes in the Software Development Process
        Project Management Tools
        Gantt Chart
        UML
         */
        //this is the currently selected combo box option
        String selectedItem = (String) boxTopics.getSelectedItem(); 
        //check which combo box option is currently selected; display the corresponding note
        if (selectedItem.equals("Select a topic to review")) {
            txtNotes.setText("Select a topic above to review");
        }else if (selectedItem.equals("What is a System?")) {
            txtNotes.setText(notes.get(0));
        }else if (selectedItem.equals("People involved in a System")) {
            txtNotes.setText(notes.get(1));
        }else if (selectedItem.equals("How to measure success?")) {
            txtNotes.setText(notes.get(2));
        }else if (selectedItem.equals("The Software Development Process")) {
            txtNotes.setText(notes.get(3));
        }else if (selectedItem.equals("Mistakes in the Software Development Process")) {
            txtNotes.setText(notes.get(4));
        }else if (selectedItem.equals("The Waterfall Model")) {
            txtNotes.setText(notes.get(5));
        }else if (selectedItem.equals("Project Management Tools")) {
            txtNotes.setText(notes.get(6));
        }else if (selectedItem.equals("Gantt Chart")) {
            txtNotes.setText(notes.get(7));
        }else if (selectedItem.equals("UML")) {
            txtNotes.setText(notes.get(8));
        }
    }//GEN-LAST:event_boxTopicsActionPerformed


    public static void main(String args[]) {
        //invoke the method and store the notes in the array list
        readNotes();
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
        //read the file and store the questions into the questionList array list
        SecondWindow.readFile();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTopics;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnQuiz;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtNotes;
    // End of variables declaration//GEN-END:variables
}
