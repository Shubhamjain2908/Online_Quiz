package quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Stack;
import java.util.TreeMap;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class QuizStart extends javax.swing.JFrame{

    JFrame f=new JFrame();
    static int i=1;
    Connection con=null;
    Statement st=null;
    ResultSet rs=null,rs1=null,rs0=null;
    //ArrayList <Integer> al=new ArrayList <Integer>();
    TreeMap <Integer, Integer> tMap = new TreeMap<>();
    Stack <Integer> stc=new Stack <>();
    Stack <Integer> stc1=new Stack <>();
    Stack <Integer> stcAns=new Stack <>();
    Stack <Integer> stcAns1=new Stack <>();
    Stack <Integer> stcUAns=new Stack <>();
    Stack <Integer> stcUAns1=new Stack <>();
    int ca=0;
    static long score=0,questionAttempted=0,correctAttempts=0,wrongAttempts=0,totalMarks=0,achivedMarks=0;
    static int no_ques=0,tot_mar=0,neg_mar=0,cans=0;
    int ansSelected=0,time1=0;
    static String ename=null,enroll1=null; 
    /**
     * Creates new form Quiz_main
     */
    public QuizStart() {
        initComponents();   
    }
    public QuizStart(String enroll,String exname,Integer tme) {
        initComponents();  
         prev.setEnabled(false);
        System.out.println(" Exam Name"+exname+" Time : "+tme);
        ename=exname;
        enroll1=enroll;
        time1=tme;
        er1.setText(enroll1.toUpperCase());
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","root");
            System.out.println("Connected");

            st = con.createStatement();
            
        } 
        catch (ClassNotFoundException | SQLException e) 
        {
            System.out.println(e);
        }
        ques(exname);
        Esetup(exname,tme);
    }
    public void Esetup(String en,int ti)
    {
        try
        {
            String query2="Select * from exam_setup where Exam_name='"+en+"'";
            rs=st.executeQuery(query2);
            while(rs.next())
            {
                no_ques=rs.getInt(3);
                tot_mar=rs.getInt(4);
                neg_mar=rs.getInt(5);
                int al_time=rs.getInt(6);
                String msg="Important Instructions* \n 1.You will have "+(al_time)+" minutes \n 2.There will be "+no_ques+" question \n 3.Every question is mandatory \n 4.You will get "+tot_mar+" Mark['s] for each correct attempt \n 5."+neg_mar+" mark['s] will be deducted for each wrong attempt";
                JOptionPane.showMessageDialog(null,msg);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Question = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        option1 = new javax.swing.JTextField();
        option2 = new javax.swing.JTextField();
        option3 = new javax.swing.JTextField();
        option4 = new javax.swing.JTextField();
        er1 = new javax.swing.JLabel();
        count = new javax.swing.JLabel();
        finish = new javax.swing.JButton();
        next = new javax.swing.JButton();
        prev = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 255));

        Question.setEditable(false);
        Question.setBackground(new java.awt.Color(204, 204, 204));
        Question.setColumns(20);
        Question.setRows(5);
        jScrollPane1.setViewportView(Question);

        jLabel1.setText("(A)");

        jLabel2.setText("(B)");

        jLabel3.setText("(C)");

        jLabel4.setText("(D)");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setText("Q#");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N

        option1.setEditable(false);
        option1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option1ActionPerformed(evt);
            }
        });

        option2.setEditable(false);

        option3.setEditable(false);

        option4.setEditable(false);

        er1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        er1.setText("jLabel11");

        count.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        count.setText("1");

        finish.setText("Finish Test");
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });

        next.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 15)); // NOI18N
        next.setForeground(new java.awt.Color(0, 51, 51));
        next.setText("NEXT");
        next.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 2, true));
        next.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        next.setFocusTraversalPolicyProvider(true);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        prev.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 15)); // NOI18N
        prev.setForeground(new java.awt.Color(0, 51, 51));
        prev.setText("PREVIOUS");
        prev.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 2, true));
        prev.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        prev.setFocusTraversalPolicyProvider(true);
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });

        jButton1.setText("Clear Answer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(option1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(option2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(option3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(option4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(er1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(count, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(finish, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(next, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(prev, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(count, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(prev, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jRadioButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(194, 194, 194)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(option2, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                            .addComponent(option1))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(option3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1)
                                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                            .addComponent(jRadioButton4)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(option4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(er1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finish))
                .addGap(85, 85, 85))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel12)
                                .addComponent(count))
                            .addComponent(er1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(option1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(finish))))
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(option4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(option2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(option3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jRadioButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton4)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prev, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(35, 35, 35))
        );

        jLabel12.getAccessibleContext().setAccessibleName("qno");

        jDesktopPane2.setBackground(new java.awt.Color(153, 255, 255));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("MOSHU QUIZ");

        jDesktopPane2.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1)
                    .addComponent(jDesktopPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ques(String ex)
    {
        try
        {
            /*String query0="SELECT COUNT(Question_ID)  FROM exam_questions WHERE Subject_Name='"+ex+"'";
            rs0=st.executeQuery(query0);
            while (rs0.next())
            {
                int qc=rs0.getInt(1);   //COUNT of questions
            }*/
            String query="Select Question_ID,Ans from exam_questions where Subject_Name='"+ex+"'";
            rs=st.executeQuery(query);
            while(rs.next())
            {
                stc.push(rs.getInt(1));
                stcAns.push(rs.getInt(2));
            }
            System.out.println(stc+" "+stcAns);
        }
        catch(SQLException e)
           {
               System.out.println(e);
           }
        System.out.println(stc);
        
       /* loadQues(stc);
    }
    public void loadQues(Stack <Integer> sp){*/
        try
        {
            String query1="Select * from exam_questions where Question_ID='"+stc.peek()+"'";
            rs1=st.executeQuery(query1);
            //stc1.push(stc.pop());
            while (rs1.next())
            {
                Question.setText(rs1.getString(3));
                option1.setText(rs1.getString(4));
                option2.setText(rs1.getString(5));
                option3.setText(rs1.getString(6));
                option4.setText(rs1.getString(7));
                cans=rs1.getInt(8);
            }
            progress();
            stcUAns.push(ansSelected);
        }
        catch(SQLException e)
        {
           System.out.println(e);
        }
    }
    public void nques()
    {
        if(i>0&&i<no_ques){
        i++;
        count.setText(Integer.toString(i));
        stc1.push(stc.pop());
        stcAns1.push(stcAns.pop());
        stcUAns1.push(ansSelected);
         try
        {
            String query1="Select * from exam_questions where Question_ID='"+stc.peek()+"'";
            rs1=st.executeQuery(query1);
            //stc1.push(stc.pop());
            while (rs1.next())
            {
                Question.setText(rs1.getString(3));
                option1.setText(rs1.getString(4));
                option2.setText(rs1.getString(5));
                option3.setText(rs1.getString(6));
                option4.setText(rs1.getString(7));
                cans=rs1.getInt(8);                
            }
            progress();
            //stcUAns.push(ansSelected);
        }
        catch(SQLException e)
        {
           System.out.println(e);
        }
    }
        else
        {
            JOptionPane.showMessageDialog(null,"Questions Completed","Alert",JOptionPane.WARNING_MESSAGE);
        }
        
    }
    public void pques()
    {
         if(i>0){
        i--;
        prev.setEnabled(true);
        count.setText(Integer.toString(i));
        }
        stc.push(stc1.pop());
        stcAns.push(stcAns1.pop());
        stcUAns.push(stcUAns1.pop());
         try
        {
            String query1="Select * from exam_questions where Question_ID='"+stc.peek()+"'";
            rs1=st.executeQuery(query1);
            //stc1.push(stc.pop());
            while (rs1.next())
            {
                Question.setText(rs1.getString(3));
                option1.setText(rs1.getString(4));
                option2.setText(rs1.getString(5));
                option3.setText(rs1.getString(6));
                option4.setText(rs1.getString(7));
                cans=rs1.getInt(8);               
            }
            progress();
            //stcUAns.push(ansSelected);
        }
        catch(SQLException e)
        {
           System.out.println(e);
        }
    }
    public void progress()//calculating marks and stuff
	{	
            
		try
		{		
			if(jRadioButton1.isSelected() && cans==1)
			{
			 score=score+tot_mar;
			 correctAttempts++;
			 System.out.println("my ans 1");
                         ansSelected=1;
			}
			else if(jRadioButton2.isSelected() && cans==2)
			{
				 score=score+tot_mar;	
				 correctAttempts++;
				 System.out.println("my ans 2");
                                 ansSelected=2;
			}
			else if(jRadioButton3.isSelected() && cans==3)
			{
				 score=score+tot_mar;
				 correctAttempts++;
				 System.out.println("my ans 3");
                                 ansSelected=3;
			}
			else if(jRadioButton4.isSelected() && cans==4)
			{
			 score=score+tot_mar;
			 correctAttempts++;
			 System.out.println("my ans 4");
                         ansSelected=4;
			}
			else if(jRadioButton4.isSelected() && cans==5 && option4.equals("ALL OF THESE"))
			{
			 score=score+tot_mar;
			 correctAttempts++;
			 System.out.println("my ans 5");
                         ansSelected=5;
			}
			else if(jRadioButton4.isSelected() && cans==6 && option4.equals("NONE OF THESE"))
			{
				 score=score+tot_mar;
				 correctAttempts++;
				 System.out.println("my ans 6");
                                 ansSelected=6;
			}
			else
			{
				wrongAttempts++;
                                score=score-neg_mar;
			}
                        stcUAns.push(ansSelected);
			System.out.println("score ="+score+" "+correctAttempts+" "+wrongAttempts);
			questionAttempted++;	
                        System.out.println(stcUAns);
		}
		catch(Exception ex)
		{
                    System.out.println(ex);
		}
	}
   
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void option1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_option1ActionPerformed

    private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed
        //f.setVisible(true);
        int a=JOptionPane.showConfirmDialog(f,"Are you sure?");  
        if(a==JOptionPane.YES_OPTION) {
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        {
        try{
            String query=("Insert into result values('"+enroll1+"','"+ename+"','"+time1+"','"+no_ques+"','"+questionAttempted+"','"+correctAttempts+"','"+wrongAttempts+"','"+(no_ques*tot_mar)+"','"+score+"')");
            int j=st.executeUpdate(query);
            System.out.println(query);
            if(j>0)
            {
                System.out.println("Record Inserted...");
            }
            else
            {
                System.out.println("Record insertion fail...");
            }
           }
        catch(SQLException e)
            {
                System.out.println(e);
            }
        String msg="Result!\n1.score="+score+"\n2.question attempted="+questionAttempted+"\n3.correct attempted="+correctAttempts+"\n4.wrong attempted="+wrongAttempts+"\n5.total marks="+(no_ques*tot_mar)+"";
	JOptionPane.showMessageDialog(null,msg);
        }
        finish fi=new finish(enroll1,ename);
        fi.setVisible(true);
        this.setVisible(false);
        }
        else
        {
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
        System.out.println(score);
    }//GEN-LAST:event_finishActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        prev.setEnabled(true);
        nques();
        tMap.put(stc.peek(),ansSelected);        
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_nextActionPerformed

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
        if(!stc1.isEmpty()){
        pques();
        buttonGroup1.clearSelection();
        }
    }//GEN-LAST:event_prevActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         buttonGroup1.clearSelection();//Clear Answer
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(QuizStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizStart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Question;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel count;
    private javax.swing.JLabel er1;
    private javax.swing.JButton finish;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton next;
    private javax.swing.JTextField option1;
    private javax.swing.JTextField option2;
    private javax.swing.JTextField option3;
    private javax.swing.JTextField option4;
    private javax.swing.JButton prev;
    // End of variables declaration//GEN-END:variables

}
