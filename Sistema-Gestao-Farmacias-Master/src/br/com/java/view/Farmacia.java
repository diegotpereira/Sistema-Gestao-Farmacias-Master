package br.com.java.view;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import br.com.java.auth.Login;
import br.com.java.connection.Conexao;



public class Farmacia extends javax.swing.JFrame{
	
	    Connection con = null;
	    PreparedStatement pre= null;
	    ResultSet res = null;
	    static int ex;
//	    User user ;
//	    Company comp;
//	    static Drug drug ;
//	    static Move_Drug move_drug;
//	    Buy_Drug buy;
	    Date d;
	    SimpleDateFormat dd;
	    static String to;
	    static String from;
	    static String text;
	    static String almost_expired_bar;
	    static String expired_bar;
	    
		public Farmacia() {
			
			setIconImage(Toolkit.getDefaultToolkit().getImage(Farmacia.class.getResource("/br/com/java/img/Untitled.png")));
			initComponents();
	        con=Conexao.getConnection();
	        showDate();
	        buttonvis();
//	        user = new User();
//	        drug = new Drug();
//	        comp = new Company();
//	        move_drug = new Move_Drug();
//	        buy = new Buy_Drug();
	        loginas();
	        warning();
	        login_as();
	        alert_message();
			
		}

		private void initComponents() {
			// TODO Auto-generated method stub
			jPanel1 = new javax.swing.JPanel();
	        jPanel2 = new javax.swing.JPanel();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        time = new javax.swing.JLabel();
	        today = new javax.swing.JLabel();
	        jButton1 = new javax.swing.JButton();
	        username = new javax.swing.JLabel();
	        jLabel5 = new javax.swing.JLabel();
	        jLabel11 = new javax.swing.JLabel();
	        username1 = new javax.swing.JLabel();
	        jButton2 = new javax.swing.JButton();
	        jLabel4 = new javax.swing.JLabel();
	        msgAlertDialog = new javax.swing.JPanel();
	        jPanel3 = new javax.swing.JPanel();
	        jLabel12 = new javax.swing.JLabel();
	        btnShowMsg = new javax.swing.JButton();
	        btnCancle = new javax.swing.JButton();
	        userB = new javax.swing.JButton();
	        drugs = new javax.swing.JButton();
	        adduser = new javax.swing.JButton();
	        deleteuser = new javax.swing.JButton();
	        updateuser = new javax.swing.JButton();
	        adddrug = new javax.swing.JButton();
	        deletedrug = new javax.swing.JButton();
	        updatedrug = new javax.swing.JButton();
	        searchdrug = new javax.swing.JButton();
	        drugdetails = new javax.swing.JButton();
	        newcom = new javax.swing.JButton();
	        endwith = new javax.swing.JButton();
	        update = new javax.swing.JButton();
	        movedrug = new javax.swing.JButton();
	        setting = new javax.swing.JButton();
	        logindetails = new javax.swing.JButton();
	        changepass = new javax.swing.JButton();
	        company = new javax.swing.JButton();
	        editprice = new javax.swing.JButton();
	        purchase = new javax.swing.JButton();
	        renew_validate = new javax.swing.JButton();
	        buydrug = new javax.swing.JButton();
	        updatedeals = new javax.swing.JButton();
	        alldeals = new javax.swing.JButton();
	        sales = new javax.swing.JButton();
	        salesbill = new javax.swing.JButton();
	        logout = new javax.swing.JButton();
	        shiftsales = new javax.swing.JButton();
	        checkplace = new javax.swing.JButton();
	        druglist = new javax.swing.JButton();
	        movedrug1 = new javax.swing.JButton();
	        jLabel6 = new javax.swing.JLabel();
	        jLabel7 = new javax.swing.JLabel();
	        jLabel8 = new javax.swing.JLabel();
	        jLabel9 = new javax.swing.JLabel();
	        jLabel10 = new javax.swing.JLabel();
	        expired1 = new javax.swing.JButton();
	        almost = new javax.swing.JButton();
	        retdrug = new javax.swing.JButton();
	        jLabel13 = new javax.swing.JLabel();
	        jMenuBar1 = new javax.swing.JMenuBar();
	        jMenu1 = new javax.swing.JMenu();
	        jMenu2 = new javax.swing.JMenu();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setTitle("Pharmacy Management");
	        setPreferredSize(new java.awt.Dimension(1220, 607));
	        setResizable(false);

	        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
	        jPanel1.setLayout(null);

	        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

	        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
	        jLabel1.setText("Pharmacy Management");

	        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
	        jLabel2.setText("Time");

	        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
	        jLabel3.setText("Today");

	        time.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
	        time.setForeground(new java.awt.Color(0, 0, 102));
	        time.setText("00:00:00");

	        today.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
	        today.setForeground(new java.awt.Color(153, 0, 0));
	        today.setText("00-00-0000");

	        jButton1.setBackground(new java.awt.Color(0, 0, 0));
	        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Apps-session-logout-icon.png"))); // NOI18N
	        jButton1.setToolTipText("Logout");
	        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        username.setBackground(new java.awt.Color(255, 255, 255));
	        username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        username.setForeground(new java.awt.Color(153, 0, 0));
	        username.setText("Login As : ");

	        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel5.setText("Login As : ");

	        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel11.setText("User Name : ");

	        username1.setBackground(new java.awt.Color(255, 255, 255));
	        username1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        username1.setForeground(new java.awt.Color(0, 0, 102));
	        username1.setText("Login As : ");

	        jButton2.setBackground(new java.awt.Color(0, 0, 0));
	        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/2572420.postal.envelope.icon.dark.blue.isolated.on.black.background (1).jpg"))); // NOI18N
	        jButton2.setToolTipText("Public Inbox");
	        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	        jButton2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton2ActionPerformed(evt);
	            }
	        });

	        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
	        jLabel4.setText("(Administration)");

	        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	        jPanel2.setLayout(jPanel2Layout);
	        jPanel2Layout.setHorizontalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addGap(10, 10, 10)
	                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(62, 62, 62)
	                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(20, 20, 20)
	                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(username1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel2Layout.createSequentialGroup()
	                        .addGap(80, 80, 80)
	                        .addComponent(jLabel1))
	                    .addGroup(jPanel2Layout.createSequentialGroup()
	                        .addGap(150, 150, 150)
	                        .addComponent(jLabel4)))
	                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel2Layout.createSequentialGroup()
	                        .addGap(89, 89, 89)
	                        .addComponent(jLabel2))
	                    .addGroup(jPanel2Layout.createSequentialGroup()
	                        .addGap(69, 69, 69)
	                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGap(95, 95, 95)
	                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel2Layout.createSequentialGroup()
	                        .addGap(20, 20, 20)
	                        .addComponent(jLabel3))
	                    .addComponent(today, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
	        );
	        jPanel2Layout.setVerticalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel2Layout.createSequentialGroup()
	                        .addGap(20, 20, 20)
	                        .addComponent(jLabel5)
	                        .addGap(15, 15, 15)
	                        .addComponent(jLabel11))
	                    .addGroup(jPanel2Layout.createSequentialGroup()
	                        .addGap(20, 20, 20)
	                        .addComponent(username)
	                        .addGap(15, 15, 15)
	                        .addComponent(username1))
	                    .addGroup(jPanel2Layout.createSequentialGroup()
	                        .addGap(20, 20, 20)
	                        .addComponent(jLabel1))
	                    .addGroup(jPanel2Layout.createSequentialGroup()
	                        .addGap(10, 10, 10)
	                        .addComponent(jLabel2)
	                        .addGap(23, 23, 23)
	                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(time)
	                            .addComponent(jLabel4)))
	                    .addGroup(jPanel2Layout.createSequentialGroup()
	                        .addGap(10, 10, 10)
	                        .addComponent(jLabel3)
	                        .addGap(23, 23, 23)
	                        .addComponent(today))
	                    .addGroup(jPanel2Layout.createSequentialGroup()
	                        .addGap(20, 20, 20)
	                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
	                .addGap(8, 8, 8))
	        );

	        jPanel1.add(jPanel2);
	        jPanel2.setBounds(0, 0, 1220, 80);

	        msgAlertDialog.setBackground(new java.awt.Color(0, 255, 0));

	        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

	        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
	        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
	        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        jLabel12.setText("You have new Message(s)");

	        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
	        jPanel3.setLayout(jPanel3Layout);
	        jPanel3Layout.setHorizontalGroup(
	            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(50, 50, 50))
	        );
	        jPanel3Layout.setVerticalGroup(
	            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap())
	        );

	        btnShowMsg.setText("Show Message");
	        btnShowMsg.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnShowMsgActionPerformed(evt);
	            }
	        });

	        btnCancle.setText("Cancel");

	        javax.swing.GroupLayout msgAlertDialogLayout = new javax.swing.GroupLayout(msgAlertDialog);
	        msgAlertDialog.setLayout(msgAlertDialogLayout);
	        msgAlertDialogLayout.setHorizontalGroup(
	            msgAlertDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(msgAlertDialogLayout.createSequentialGroup()
	                .addGap(62, 62, 62)
	                .addComponent(btnShowMsg)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
	                .addComponent(btnCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(59, 59, 59))
	            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        msgAlertDialogLayout.setVerticalGroup(
	            msgAlertDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, msgAlertDialogLayout.createSequentialGroup()
	                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(24, 24, 24)
	                .addGroup(msgAlertDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(btnShowMsg)
	                    .addComponent(btnCancle))
	                .addContainerGap(14, Short.MAX_VALUE))
	        );

	        jPanel1.add(msgAlertDialog);
	        msgAlertDialog.setBounds(810, 480, 410, 110);

	        userB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        userB.setForeground(new java.awt.Color(0, 51, 51));
	        userB.setText("User");
	        userB.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                userBActionPerformed(evt);
	            }
	        });
	        jPanel1.add(userB);
	        userB.setBounds(1050, 100, 140, 34);

	        drugs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        drugs.setForeground(new java.awt.Color(0, 51, 51));
	        drugs.setText("Drugs");
	        drugs.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                drugsActionPerformed(evt);
	            }
	        });
	        jPanel1.add(drugs);
	        drugs.setBounds(860, 100, 150, 34);

	        adduser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        adduser.setText("Add User");
	        adduser.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                adduserActionPerformed(evt);
	            }
	        });
	        jPanel1.add(adduser);
	        adduser.setBounds(1050, 150, 140, 31);

	        deleteuser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        deleteuser.setText("Delete User");
	        deleteuser.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                deleteuserActionPerformed(evt);
	            }
	        });
	        jPanel1.add(deleteuser);
	        deleteuser.setBounds(1050, 190, 140, 31);

	        updateuser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        updateuser.setText("Update User");
	        updateuser.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                updateuserActionPerformed(evt);
	            }
	        });
	        jPanel1.add(updateuser);
	        updateuser.setBounds(1050, 230, 140, 31);

	        adddrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        adddrug.setText("Add Drug");
	        adddrug.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                adddrugActionPerformed(evt);
	            }
	        });
	        jPanel1.add(adddrug);
	        adddrug.setBounds(860, 150, 150, 31);

	        deletedrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        deletedrug.setText("Delete Drug");
	        deletedrug.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                deletedrugActionPerformed(evt);
	            }
	        });
	        jPanel1.add(deletedrug);
	        deletedrug.setBounds(860, 190, 150, 31);

	        updatedrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        updatedrug.setText("Update Drug");
	        updatedrug.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                updatedrugActionPerformed(evt);
	            }
	        });
	        jPanel1.add(updatedrug);
	        updatedrug.setBounds(860, 230, 150, 31);

	        searchdrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        searchdrug.setText("Search Drug");
	        searchdrug.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                searchdrugActionPerformed(evt);
	            }
	        });
	        jPanel1.add(searchdrug);
	        searchdrug.setBounds(860, 270, 150, 31);

	        drugdetails.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        drugdetails.setForeground(new java.awt.Color(0, 51, 51));
	        drugdetails.setText("Drug Details");
	        drugdetails.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                drugdetailsActionPerformed(evt);
	            }
	        });
	        jPanel1.add(drugdetails);
	        drugdetails.setBounds(670, 100, 150, 34);

	        newcom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        newcom.setText("New Company");
	        newcom.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                newcomActionPerformed(evt);
	            }
	        });
	        jPanel1.add(newcom);
	        newcom.setBounds(188, 154, 118, 31);

	        endwith.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        endwith.setText("End With");
	        endwith.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                endwithActionPerformed(evt);
	            }
	        });
	        jPanel1.add(endwith);
	        endwith.setBounds(188, 195, 118, 31);

	        update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        update.setText("Updates");
	        update.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                updateActionPerformed(evt);
	            }
	        });
	        jPanel1.add(update);
	        update.setBounds(188, 236, 119, 31);

	        movedrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        movedrug.setText("Drugs_List");
	        movedrug.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                movedrugActionPerformed(evt);
	            }
	        });
	        jPanel1.add(movedrug);
	        movedrug.setBounds(860, 350, 150, 31);

	        setting.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        setting.setForeground(new java.awt.Color(0, 51, 51));
	        setting.setText("Setting");
	        setting.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                settingActionPerformed(evt);
	            }
	        });
	        jPanel1.add(setting);
	        setting.setBounds(10, 102, 141, 34);

	        logindetails.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        logindetails.setText("Login Details");
	        logindetails.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                logindetailsActionPerformed(evt);
	            }
	        });
	        jPanel1.add(logindetails);
	        logindetails.setBounds(10, 154, 141, 31);

	        changepass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        changepass.setText("Change Password");
	        changepass.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                changepassActionPerformed(evt);
	            }
	        });
	        jPanel1.add(changepass);
	        changepass.setBounds(10, 195, 158, 31);

	        company.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        company.setForeground(new java.awt.Color(0, 51, 51));
	        company.setText("Company");
	        company.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                companyActionPerformed(evt);
	            }
	        });
	        jPanel1.add(company);
	        company.setBounds(188, 102, 118, 34);

	        editprice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        editprice.setText("Edit Prices");
	        editprice.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                editpriceActionPerformed(evt);
	            }
	        });
	        jPanel1.add(editprice);
	        editprice.setBounds(670, 190, 150, 31);

	        purchase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        purchase.setForeground(new java.awt.Color(0, 51, 51));
	        purchase.setText("Purchases");
	        purchase.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                purchaseActionPerformed(evt);
	            }
	        });
	        jPanel1.add(purchase);
	        purchase.setBounds(520, 100, 130, 34);

	        renew_validate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        renew_validate.setText("Renew_Validity");
	        renew_validate.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                renew_validateActionPerformed(evt);
	            }
	        });
	        jPanel1.add(renew_validate);
	        renew_validate.setBounds(670, 270, 150, 31);

	        buydrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        buydrug.setText("Buy Drugs");
	        buydrug.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                buydrugActionPerformed(evt);
	            }
	        });
	        jPanel1.add(buydrug);
	        buydrug.setBounds(520, 150, 130, 31);

	        updatedeals.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        updatedeals.setText("Update Deals");
	        updatedeals.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                updatedealsActionPerformed(evt);
	            }
	        });
	        jPanel1.add(updatedeals);
	        updatedeals.setBounds(520, 190, 130, 31);

	        alldeals.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        alldeals.setText("All Deals");
	        alldeals.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                alldealsActionPerformed(evt);
	            }
	        });
	        jPanel1.add(alldeals);
	        alldeals.setBounds(520, 230, 130, 31);

	        sales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        sales.setForeground(new java.awt.Color(0, 51, 51));
	        sales.setText("Sales");
	        sales.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                salesActionPerformed(evt);
	            }
	        });
	        jPanel1.add(sales);
	        sales.setBounds(338, 102, 150, 34);

	        salesbill.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        salesbill.setText("Sales Bill");
	        salesbill.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                salesbillActionPerformed(evt);
	            }
	        });
	        jPanel1.add(salesbill);
	        salesbill.setBounds(338, 154, 150, 31);

	        logout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        logout.setText("Logout");
	        logout.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                logoutActionPerformed(evt);
	            }
	        });
	        jPanel1.add(logout);
	        logout.setBounds(10, 236, 141, 31);

	        shiftsales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        shiftsales.setText("Shift Sales");
	        shiftsales.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                shiftsalesActionPerformed(evt);
	            }
	        });
	        jPanel1.add(shiftsales);
	        shiftsales.setBounds(338, 195, 150, 31);

	        checkplace.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        checkplace.setText("Check Places");
	        checkplace.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                checkplaceActionPerformed(evt);
	            }
	        });
	        jPanel1.add(checkplace);
	        checkplace.setBounds(670, 150, 150, 31);

	        druglist.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
	        druglist.setText("Drugs_List");
	        druglist.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                druglistActionPerformed(evt);
	            }
	        });
	        jPanel1.add(druglist);
	        druglist.setBounds(0, 0, 96, 30);

	        movedrug1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        movedrug1.setText("Move Drug");
	        movedrug1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                movedrug1ActionPerformed(evt);
	            }
	        });
	        jPanel1.add(movedrug1);
	        movedrug1.setBounds(860, 310, 150, 31);

	        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/rsz_1rsz_16314569-telephone-round-gray-web-icon-on-black-background-stock-photo-phone.jpg"))); // NOI18N
	        jLabel6.setText("jLabel6");
	        jPanel1.add(jLabel6);
	        jLabel6.setBounds(0, 450, 80, 80);

	        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
	        jLabel7.setText("045/3397825");
	        jPanel1.add(jLabel7);
	        jLabel7.setBounds(90, 490, 390, 29);

	        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
	        jLabel8.setText("01128284736 / 01014033489");
	        jPanel1.add(jLabel8);
	        jLabel8.setBounds(90, 450, 390, 29);

	        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
	        jLabel9.setText("Alexandria / Elraml Station / st-Elshazly");
	        jPanel1.add(jLabel9);
	        jLabel9.setBounds(120, 550, 380, 22);

	        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
	        jLabel10.setText("Location : ");
	        jPanel1.add(jLabel10);
	        jLabel10.setBounds(10, 550, 105, 22);

	        expired1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        expired1.setText("Expired Drugs");
	        expired1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                expired1ActionPerformed(evt);
	            }
	        });
	        jPanel1.add(expired1);
	        expired1.setBounds(670, 230, 150, 31);

	        almost.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        almost.setText("Almost_Finished");
	        almost.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                almostActionPerformed(evt);
	            }
	        });
	        jPanel1.add(almost);
	        almost.setBounds(670, 310, 150, 31);

	        retdrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        retdrug.setText("Retrieval Drug");
	        retdrug.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                retdrugActionPerformed(evt);
	            }
	        });
	        jPanel1.add(retdrug);
	        retdrug.setBounds(338, 235, 150, 31);

	        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/capsule.pill.health.medicine (1).jpg"))); // NOI18N
	        jPanel1.add(jLabel13);
	        jLabel13.setBounds(0, 74, 1220, 520);

	        jMenu1.setText("About Pharmacy");
	        jMenuBar1.add(jMenu1);

	        jMenu2.setText("About Developer");
	        jMenuBar1.add(jMenu2);

	        setJMenuBar(jMenuBar1);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1221, Short.MAX_VALUE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
	        );

	        setSize(new java.awt.Dimension(1231, 646));
	        setLocationRelativeTo(null);			
		}

		
		/// Eventos
		protected void retdrugActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void almostActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void buydrugActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void expired1ActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void movedrug1ActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void druglistActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void checkplaceActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void shiftsalesActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void logoutActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void salesbillActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void salesActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void alldealsActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void updatedealsActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void renew_validateActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void purchaseActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void editpriceActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void companyActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void changepassActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void logindetailsActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void settingActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void movedrugActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void updateActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void endwithActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void newcomActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void drugdetailsActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void searchdrugActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void updatedrugActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void deletedrugActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void updateuserActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void adddrugActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void deleteuserActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void drugsActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void adduserActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void userBActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void btnShowMsgActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void jButton1ActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		protected void jButton2ActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			
		}

		private void showDate() {
			// TODO Auto-generated method stub
		    d = new Date();
	        dd = new SimpleDateFormat("dd-MM-yyyy");
	        today.setText(dd.format(d));
	        
	        new Timer(0,new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent ae) {
	                Date d = new Date();
	                SimpleDateFormat dd = new SimpleDateFormat("hh:mm:ss a");
	                time.setText(dd.format(d));
	            }
	        }).start();
			
		}

		private void buttonvis() {
			// TODO Auto-generated method stub
			adduser.setVisible(false);
	        deleteuser.setVisible(false);
	        updateuser.setVisible(false);
	        
	        adddrug.setVisible(false);
	        deletedrug.setVisible(false);
	        updatedrug.setVisible(false);
	        searchdrug.setVisible(false);
	        movedrug.setVisible(false);
	        movedrug1.setVisible(false);
	        
	        checkplace.setVisible(false);
	        editprice.setVisible(false);
	        renew_validate.setVisible(false);
	        expired1.setVisible(false);
	        almost.setVisible(false);
	        
	        buydrug.setVisible(false);
	        updatedeals.setVisible(false);
	        alldeals.setVisible(false);
	        
	        salesbill.setVisible(false);
	        shiftsales.setVisible(false);
	        retdrug.setVisible(false);
	        
	        newcom.setVisible(false);
	        endwith.setVisible(false);
	        update.setVisible(false);
	        
	        logindetails.setVisible(false);
	        changepass.setVisible(false);
	        logout.setVisible(false);
			
		}

		private void loginas() {
			// TODO Auto-generated method stub
			String sql = "select ID,NAME from users where ID='"+Login.id.getText()+"' ";
	        try{
	            pre=con.prepareStatement(sql);
	            res=pre.executeQuery();
	            if(res.next()){
	                username1.setText(res.getString("NAME"));
	                if(res.getString("ID").equals("1")){
	                    username.setText("Admin");
	                }else{
	                    username.setText("Employee");
	                }
	            }
	        }catch(Exception e){
	            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
	        }
			
		}

		private void warning() {
			// TODO Auto-generated method stub
			int ex_year ;
	        int current_year ;
	        int ex_month ;
	        int ex_day ;
	        int current_month ;
	        int current_day ;
	        String sql = "select BARCODE,EXPIRATION_DATE from drugs";
	        
	        try{
	            pre=con.prepareStatement(sql);
	            res=pre.executeQuery();
	            while(res.next()){
	                Warning warning = new Warning();
	                ex_year = Integer.parseInt(res.getString("EXPIRATION_DATE").split("-")[2]);
	                ex_month = Integer.parseInt(res.getString("EXPIRATION_DATE").split("-")[1]);
	                ex_day = Integer.parseInt(res.getString("EXPIRATION_DATE").split("-")[0]);
	                current_year = Integer.parseInt(dd.format(d).split("-")[2]);
	                current_month = Integer.parseInt(dd.format(d).split("-")[1]);
	                current_day = Integer.parseInt(dd.format(d).split("-")[0]);
	                if(ex_year==current_year){
	                    if(ex_month-current_month==2){
	                        ex=1;
	                        almost_expired_bar = res.getString("BARCODE");
	                        warning.setVisible(true);
	                    }else if(ex_month==current_month){
	                        if(ex_day==current_day){
	                            ex=0;
	                            expired_bar = res.getString("BARCODE");
	                            update_to_expired();
	                            warning.setVisible(true);
	                        }
	                    }
	                }
	                
	            }
	        }catch(Exception e){
	            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
	       }
	        
	        
			
		}

		private void update_to_expired() {
			// TODO Auto-generated method stub
			
		}

		private void login_as() {
			// TODO Auto-generated method stub
		    Date d = new Date();
	        SimpleDateFormat dd = new SimpleDateFormat("hh:mm:ss");
	        String sql = "insert into login (NAME,TYPE,DATE,TIME) values ('"+username1.getText()+"' ,'"+username.getText()+"' ,'"+today.getText()+"' ,'"+dd.format(d)+"' )";
	        try {
	            pre=con.prepareStatement(sql);
	            pre.execute();
	        } catch (Exception e){
	            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
	        }
		}

		private void alert_message() {
			// TODO Auto-generated method stub
			String sql = "select MESSAGE_TO,MESSAGE_FROM,MESSAGE_TEXT from message_history where MESSAGE_TO='"+username1.getText()+"' ";
		    
			       try{
		            pre=con.prepareStatement(sql);
		            res=pre.executeQuery();
		            if(res.next()){
		                to=res.getString("MESSAGE_TO");
		                from=res.getString("MESSAGE_FROM");
		                text=res.getString("MESSAGE_TEXT");
		                msgAlertDialog.setVisible(true);
		            }else{
		                msgAlertDialog.setVisible(false);
		            }
		            
		        }catch(Exception e){
		            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
		        }
			
		}
		 // Declaração de variaveis
	    private javax.swing.JButton adddrug;
	    private javax.swing.JButton adduser;
	    private javax.swing.JButton alldeals;
	    private javax.swing.JButton almost;
	    private javax.swing.JButton btnCancle;
	    private javax.swing.JButton btnShowMsg;
	    private javax.swing.JButton buydrug;
	    private javax.swing.JButton changepass;
	    private javax.swing.JButton checkplace;
	    private javax.swing.JButton company;
	    private javax.swing.JButton deletedrug;
	    private javax.swing.JButton deleteuser;
	    private javax.swing.JButton drugdetails;
	    private javax.swing.JButton druglist;
	    private javax.swing.JButton drugs;
	    private javax.swing.JButton editprice;
	    private javax.swing.JButton endwith;
	    private javax.swing.JButton expired1;
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton jButton2;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel10;
	    private javax.swing.JLabel jLabel11;
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
	    private javax.swing.JMenu jMenu1;
	    private javax.swing.JMenu jMenu2;
	    private javax.swing.JMenuBar jMenuBar1;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JPanel jPanel2;
	    private javax.swing.JPanel jPanel3;
	    private javax.swing.JButton logindetails;
	    private javax.swing.JButton logout;
	    private javax.swing.JButton movedrug;
	    private javax.swing.JButton movedrug1;
	    private javax.swing.JPanel msgAlertDialog;
	    private javax.swing.JButton newcom;
	    public javax.swing.JButton purchase;
	    private javax.swing.JButton renew_validate;
	    private javax.swing.JButton retdrug;
	    private javax.swing.JButton sales;
	    private javax.swing.JButton salesbill;
	    private javax.swing.JButton searchdrug;
	    private javax.swing.JButton setting;
	    private javax.swing.JButton shiftsales;
	    public static javax.swing.JLabel time;
	    public static javax.swing.JLabel today;
	    private javax.swing.JButton update;
	    private javax.swing.JButton updatedeals;
	    private javax.swing.JButton updatedrug;
	    private javax.swing.JButton updateuser;
	    public javax.swing.JButton userB;
	    private javax.swing.JLabel username;
	    public static javax.swing.JLabel username1;
	    // End of variables declaration//GEN-END:variables
}
