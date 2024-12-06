//THIS IS THE MAIN WINDOW 
//for study notes
package projectmanagement;

import java.io.InputStream;
import java.util.ArrayList;
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
                    /*
                    e.g. for the below text:
                    "------PEOPLE INVOLVED IN A SYSTEM------
                    The client, analysts, designers and developers, testers, users and other jobs such as lawyers, communications officers, specialists and so on.

                    ------HOW TO MEASURE SUCCESS?------
                    Answer the following questions:
                    Does the project solve what it was meant to solve?
                    Is it easy to maintain and administer?
                    Is there a successful support system in place for the client?
                    Was it delivered on time and ready to go?
                    Was the client happy with the finished product?"
                    we can see that after the first line there is an empty line. This means that everything above the empty line belongs to one note (in this case, "people involved in a system"
                    and everything below belongs to another (in this case, "how to measure success")
                    When reaching an empty line the program will know that it's no longer on the former note
                    */
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotes = new javax.swing.JTextArea();
        btnQuiz = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        boxTopics = new javax.swing.JComboBox<>();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        jLabel1.setText("Project Management for SLDC");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Welcome to the Software Development Life Cycle Review Project! This project is dedicated to students who did not take notes in class but has an upcoming project management and SLDC test. \nYou can use the below notes to review, and when you're ready just click on \"Start Quiz\" to take a simple quiz to test your knowledge.\nYou will be given feedback on how you did on the quiz.\nGood luck!");
        jScrollPane2.setViewportView(jTextArea2);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(209, 209, 209)
                                    .addComponent(btnQuiz)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnQuit))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1037, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(boxTopics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(boxTopics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQuit)
                            .addComponent(btnQuiz))
                        .addContainerGap())))
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea txtNotes;
    // End of variables declaration//GEN-END:variables
}
