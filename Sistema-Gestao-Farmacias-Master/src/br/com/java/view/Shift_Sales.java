package br.com.java.view;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import br.com.java.connection.Conexao;

import net.proteanit.sql.DbUtils;

public class Shift_Sales extends javax.swing.JFrame{
	
	
	Connection con = null;
	PreparedStatement pre= null;
	ResultSet res = null;
	    
	public Shift_Sales() {
	        
		initComponents();
	        
		con=Conexao.getConnection();
	        
		fill_Username();
	    
	}

	    
	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	    private void initComponents() {

	        jPanel1 = new javax.swing.JPanel();
	        jPanel2 = new javax.swing.JPanel();
	        jLabel1 = new javax.swing.JLabel();
	        jPanel3 = new javax.swing.JPanel();
	        jLabel2 = new javax.swing.JLabel();
	        username = new javax.swing.JComboBox<>();
	        jLabel3 = new javax.swing.JLabel();
	        day = new javax.swing.JComboBox<>();
	        month = new javax.swing.JComboBox<>();
	        year = new javax.swing.JComboBox<>();
	        jPanel4 = new javax.swing.JPanel();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        jTable1 = new javax.swing.JTable();
	        jPanel5 = new javax.swing.JPanel();
	        total = new javax.swing.JLabel();
	        jLabel4 = new javax.swing.JLabel();
	        jPanel6 = new javax.swing.JPanel();
	        jButton1 = new javax.swing.JButton();

	        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
	        setTitle("Vendas");
	        setResizable(false);

	        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

	        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

	        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
	        jLabel1.setText("Vendas por turno");
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            
	        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	        jPanel2.setLayout(jPanel2Layout);
	        jPanel2Layout.setHorizontalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(jLabel1)
	                .addGap(278, 278, 278))
	        );
	        jPanel2Layout.setVerticalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addGap(20, 20, 20)
	                .addComponent(jLabel1)
	                .addContainerGap(27, Short.MAX_VALUE))
	        );

	        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
	        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

	        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel2.setText("Nome de usu�rio : ");
	        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

	        username.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User_Name : " }));
	        username.addItemListener(new java.awt.event.ItemListener() {
	            public void itemStateChanged(java.awt.event.ItemEvent evt) {
	                usernameItemStateChanged(evt);
	            }
	        });

	        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel3.setText("Data : ");
	        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

	        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day : ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
	        day.addItemListener(new java.awt.event.ItemListener() {
	            public void itemStateChanged(java.awt.event.ItemEvent evt) {
	                dayItemStateChanged(evt);
	            }
	        });

	        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month : ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
	        month.addItemListener(new java.awt.event.ItemListener() {
	            public void itemStateChanged(java.awt.event.ItemEvent evt) {
	                monthItemStateChanged(evt);
	            }
	        });

	        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year : ", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
	        year.addItemListener(new java.awt.event.ItemListener() {
	            public void itemStateChanged(java.awt.event.ItemEvent evt) {
	                yearItemStateChanged(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
	        jPanel3.setLayout(jPanel3Layout);
	        jPanel3Layout.setHorizontalGroup(
	            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel3Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jLabel2)
	                .addGap(18, 18, 18)
	                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
	                .addComponent(jLabel3)
	                .addGap(31, 31, 31)
	                .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(39, 39, 39))
	        );
	        jPanel3Layout.setVerticalGroup(
	            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel3Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addComponent(jLabel3))
	                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(jLabel2)
	                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
	        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

	        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jTable1.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {
	                {null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null}
	            },
	            new String [] {
	                "   User_Name", "   Barcode", "   Drug_Name", "   Quantity", "   Price", "   Amount", "    Date"
	            }
	        ) {
	            boolean[] canEdit = new boolean [] {
	                false, false, false, false, false, false, false
	            };

	            public boolean isCellEditable(int rowIndex, int columnIndex) {
	                return canEdit [columnIndex];
	            }
	        });
	        jScrollPane1.setViewportView(jTable1);

	        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
	        jPanel4.setLayout(jPanel4Layout);
	        jPanel4Layout.setHorizontalGroup(
	            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel4Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jScrollPane1)
	                .addContainerGap())
	        );
	        jPanel4Layout.setVerticalGroup(
	            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel4Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
	        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

	        total.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
	        total.setText("R$ 00.0");
	        total.setForeground(new java.awt.Color(255, 255, 255));

	        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel4.setText("Daily gain : ");
	        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

	        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
	        jPanel5.setLayout(jPanel5Layout);
	        jPanel5Layout.setHorizontalGroup(
	            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel5Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jLabel4)
	                .addGap(18, 18, 18)
	                .addComponent(total)
	                .addContainerGap())
	        );
	        jPanel5Layout.setVerticalGroup(
	            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel5Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(total)
	                    .addGroup(jPanel5Layout.createSequentialGroup()
	                        .addGap(19, 19, 19)
	                        .addComponent(jLabel4)))
	                .addContainerGap())
	        );

	        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
	        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

	        jButton1.setText("Resetar Nome e Data");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
	        jPanel6.setLayout(jPanel6Layout);
	        jPanel6Layout.setHorizontalGroup(
	            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel6Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jButton1)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        jPanel6Layout.setVerticalGroup(
	            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel6Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addGap(18, 18, 18)
	                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap())
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );

	        setSize(new java.awt.Dimension(778, 606));
	        setLocationRelativeTo(null);
	    }// </editor-fold>//GEN-END:initComponents

	    private void usernameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_usernameItemStateChanged
	String sql;
	        if(day.getSelectedIndex()==0&&month.getSelectedIndex()==0&&year.getSelectedIndex()==0){
	sql = "select USER_NAME,BARCODE,NAME,QUANTITY,PRICE,AMOUNT,DATE from history_sales where USER_NAME='"+username.getSelectedItem()+"' ";
	       double amount = 0; 
	       try {
	       pre=con.prepareStatement(sql);
	       res=pre.executeQuery();
	       jTable1.setModel(DbUtils.resultSetToTableModel(res));
	       help_user1();
	       } catch (Exception e) {
	        JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
	        }}else {
	sql = "select USER_NAME,BARCODE,NAME,QUANTITY,PRICE,AMOUNT,DATE from history_sales where USER_NAME='"+username.getSelectedItem()+"' and DATE='"+day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem()+"' ";
	       double amount = 0; 
	       try {
	       pre=con.prepareStatement(sql);
	       res=pre.executeQuery();
	       jTable1.setModel(DbUtils.resultSetToTableModel(res));
	       help_user();
	       }catch (Exception e) {
	        JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
	       }
	}
	    }//GEN-LAST:event_usernameItemStateChanged

	    private void dayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dayItemStateChanged
	 if(month.getSelectedIndex()!=0&&year.getSelectedIndex()!=0){
	date_help();
	 }
	    }//GEN-LAST:event_dayItemStateChanged

	    private void monthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_monthItemStateChanged
	 if(day.getSelectedIndex()!=0&&year.getSelectedIndex()!=0){
	date_help();
	 }
	    }//GEN-LAST:event_monthItemStateChanged

	    private void yearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_yearItemStateChanged
	 if(month.getSelectedIndex()!=0&&day.getSelectedIndex()!=0){
	date_help();
	 }
	    }//GEN-LAST:event_yearItemStateChanged

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	username.setSelectedIndex(0);
	day.setSelectedIndex(0);
	month.setSelectedIndex(0);
	year.setSelectedIndex(0);
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
	            java.util.logging.Logger.getLogger(Shift_Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(Shift_Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(Shift_Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(Shift_Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new Shift_Sales().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify//GEN-BEGIN:variables
	    public javax.swing.JComboBox<String> day;
	    private javax.swing.JButton jButton1;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JPanel jPanel2;
	    private javax.swing.JPanel jPanel3;
	    private javax.swing.JPanel jPanel4;
	    private javax.swing.JPanel jPanel5;
	    private javax.swing.JPanel jPanel6;
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JTable jTable1;
	    public javax.swing.JComboBox<String> month;
	    private javax.swing.JLabel total;
	    private javax.swing.JComboBox<String> username;
	    public javax.swing.JComboBox<String> year;
	    // End of variables declaration//GEN-END:variables
	private void fill_Username(){
	    String sql = "select NAME from users";
	    try {
	        pre=con.prepareStatement(sql);
	        res=pre.executeQuery();
	        while(res.next()){
	        username.addItem(res.getString("NAME"));
	        }
	    } catch (Exception e) {
	  JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);      
	    }
	} 
	private void help_user(){
	    String sql = "select USER_NAME,BARCODE,NAME,QUANTITY,PRICE,AMOUNT,DATE from history_sales where USER_NAME='"+username.getSelectedItem()+"' and DATE='"+day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem()+"' ";
	       double amount = 0; 
	       try {
	       pre=con.prepareStatement(sql);
	       res=pre.executeQuery();
	       while(res.next()){
	           amount += Double.parseDouble(res.getString("AMOUNT")) ;
	       } total.setText(String.valueOf(amount)+"R$");
	       } catch (Exception e) {
	        JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
	        }
	}
	private void help_user1(){
	    String sql = "select USER_NAME,BARCODE,NAME,QUANTITY,PRICE,AMOUNT,DATE from history_sales where USER_NAME='"+username.getSelectedItem()+"'";
	       double amount = 0; 
	       try {
	       pre=con.prepareStatement(sql);
	       res=pre.executeQuery();
	       while(res.next()){
	           amount += Double.parseDouble(res.getString("AMOUNT")) ;
	       } total.setText(String.valueOf(amount)+"R$");
	       } catch (Exception e) {
	        JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
	        }
	}
	private void help(){
	String sql;
	if(username.getSelectedIndex()==0){
	sql = "select USER_NAME,BARCODE,NAME,QUANTITY,PRICE,AMOUNT,DATE from history_sales where DATE='"+day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem()+"' ";        
	}else{
	sql = "select USER_NAME,BARCODE,NAME,QUANTITY,PRICE,AMOUNT,DATE from history_sales where USER_NAME='"+username.getSelectedItem()+"' and DATE='"+day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem()+"' ";
	}
	    double amount = 0; 
	       try {
	       pre=con.prepareStatement(sql);
	       res=pre.executeQuery();
	       while(res.next()){
	           amount += Double.parseDouble(res.getString("AMOUNT")) ;
	       } total.setText(String.valueOf(amount)+"R$");
	       } catch (Exception e) {
	        JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
	        }
	}
	private void date_help(){
	String sql;
	if(username.getSelectedIndex()==0){
	sql = "select USER_NAME,BARCODE,NAME,QUANTITY,PRICE,AMOUNT,DATE from history_sales where DATE='"+day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem()+"' ";        
	}else{
	sql = "select USER_NAME,BARCODE,NAME,QUANTITY,PRICE,AMOUNT,DATE from history_sales where USER_NAME='"+username.getSelectedItem()+"' and DATE='"+day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem()+"' ";
	}
	double amount = 0;
	       try {
	       pre=con.prepareStatement(sql);
	       res=pre.executeQuery();
	       jTable1.setModel(DbUtils.resultSetToTableModel(res));
	       help();
	       }catch(Exception e){
	       JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
	       }}
	

}
