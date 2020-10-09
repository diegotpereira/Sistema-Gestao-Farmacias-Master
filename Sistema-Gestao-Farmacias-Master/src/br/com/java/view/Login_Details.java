package br.com.java.view;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import br.com.java.connection.Conexao;
import net.proteanit.sql.DbUtils;

public class Login_Details extends javax.swing.JFrame {
	
	Connection con = null;
	PreparedStatement pre = null;
	ResultSet res= null;
	
	public Login_Details() {
        initComponents();
        con=Conexao.getConnection();
        fill_Username();
       //setExtendedState(MAXIMIZED_BOTH);
        
	}
	
	 @SuppressWarnings("unchecked")
	 private void initComponents() {

	        jPanel1 = new javax.swing.JPanel();
	        jPanel2 = new javax.swing.JPanel();
	        jLabel1 = new javax.swing.JLabel();
	        jPanel3 = new javax.swing.JPanel();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        jTable1 = new javax.swing.JTable();
	        jPanel4 = new javax.swing.JPanel();
	        year = new javax.swing.JComboBox<>();
	        jLabel2 = new javax.swing.JLabel();
	        month = new javax.swing.JComboBox<>();
	        day = new javax.swing.JComboBox<>();
	        jLabel3 = new javax.swing.JLabel();
	        username = new javax.swing.JComboBox<>();

	        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
	        setTitle("Login_Details");
	        setResizable(false);

	        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

	        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

	        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
	        jLabel1.setText("Login_Details Form");

	        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	        jPanel2.setLayout(jPanel2Layout);
	        jPanel2Layout.setHorizontalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addGap(184, 184, 184)
	                .addComponent(jLabel1)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        jPanel2Layout.setVerticalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addGap(26, 26, 26)
	                .addComponent(jLabel1)
	                .addContainerGap(20, Short.MAX_VALUE))
	        );

	        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
	        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

	        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jTable1.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {
	                {null, null, null, null},
	                {null, null, null, null},
	                {null, null, null, null},
	                {null, null, null, null}
	            },
	            new String [] {
	                "        Nome", "        Tipo", "        Data", "        Hora"
	            }
	        ) {
	            boolean[] canEdit = new boolean [] {
	                false, false, false, false
	            };

	            public boolean isCellEditable(int rowIndex, int columnIndex) {
	                return canEdit [columnIndex];
	            }
	        });
	        jScrollPane1.setViewportView(jTable1);
	        if (jTable1.getColumnModel().getColumnCount() > 0) {
	            jTable1.getColumnModel().getColumn(0).setResizable(false);
	            jTable1.getColumnModel().getColumn(1).setResizable(false);
	            jTable1.getColumnModel().getColumn(3).setResizable(false);
	        }

	        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
	        jPanel3.setLayout(jPanel3Layout);
	        jPanel3Layout.setHorizontalGroup(
	            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel3Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jScrollPane1)
	                .addContainerGap())
	        );
	        jPanel3Layout.setVerticalGroup(
	            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel3Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
	                .addContainerGap())
	        );

	        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
	        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

	        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year : ", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
	        year.addItemListener(new java.awt.event.ItemListener() {
	            public void itemStateChanged(java.awt.event.ItemEvent evt) {
	                yearItemStateChanged(evt);
	            }
	        });

	        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel2.setText("User_Name : ");

	        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month : ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
	        month.addItemListener(new java.awt.event.ItemListener() {
	            public void itemStateChanged(java.awt.event.ItemEvent evt) {
	                monthItemStateChanged(evt);
	            }
	        });

	        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day : ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
	        day.addItemListener(new java.awt.event.ItemListener() {
	            public void itemStateChanged(java.awt.event.ItemEvent evt) {
	                dayItemStateChanged(evt);
	            }
	        });

	        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel3.setText("Login_Date : ");

	        username.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome de Usu�rio : " }));
	        username.addItemListener(new java.awt.event.ItemListener() {
	            public void itemStateChanged(java.awt.event.ItemEvent evt) {
	                usernameItemStateChanged(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
	        jPanel4.setLayout(jPanel4Layout);
	        jPanel4Layout.setHorizontalGroup(
	            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel4Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jLabel2)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(jLabel3)
	                .addGap(18, 18, 18)
	                .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap())
	        );
	        jPanel4Layout.setVerticalGroup(
	            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel4Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel2)
	                    .addComponent(jLabel3)
	                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap())
	        );

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(0, 0, Short.MAX_VALUE)))
	                .addContainerGap())
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addContainerGap())
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	        );

	        setSize(new java.awt.Dimension(710, 503));
	        setLocationRelativeTo(null);
	 }

	protected void usernameItemStateChanged(java.awt.event.ItemEvent evt) {
		// TODO Auto-generated method stub
		String sql;
		
		if(day.getSelectedIndex()==0&&month.getSelectedIndex()==0&&year.getSelectedIndex()==0){
		
			sql = "select NAME,TYPE,DATE,TIME from login where NAME='"+username.getSelectedItem()+"' ";
		      
		}else {
		
			sql = "select NAME,TYPE,DATE,TIME from login where NAME='"+username.getSelectedItem()+"' and DATE='"+day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem()+"' ";
		
		}  
		
		try {
		       
			pre=con.prepareStatement(sql);
		       
			res=pre.executeQuery();
		       
			jTable1.setModel(DbUtils.resultSetToTableModel(res));
		       
		} catch (Exception e) {
		        
			JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
		        
		}
	}

	protected void dayItemStateChanged(java.awt.event.ItemEvent evt) {
		// TODO Auto-generated method stub
		String sql ; 
		
		if(month.getSelectedIndex()!=0&&year.getSelectedIndex()!=0&&username.getSelectedIndex()==0){
		  
			sql = "select NAME,TYPE,DATE,TIME from login where DATE='"+day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem()+"' ";
		
		}else {
		  
			sql = "select NAME,TYPE,DATE,TIME from login where NAME='"+username.getSelectedItem()+"' and DATE='"+day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem()+"' ";   
		
		}
		       
		try {
		       
			pre=con.prepareStatement(sql);
		       
			res=pre.executeQuery();
		       
			jTable1.setModel(DbUtils.resultSetToTableModel(res));
		       
		}catch(Exception e){
		       
			JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
		       
		}
	}

	protected void monthItemStateChanged(java.awt.event.ItemEvent evt) {
		// TODO Auto-generated method stub
		String sql;
        
		if(day.getSelectedIndex()!=0&&month.getSelectedIndex()!=0&&year.getSelectedIndex()!=0&&username.getSelectedIndex()==0){

			sql = "select NAME,TYPE,DATE,TIME from login where DATE='"+day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem()+"' ";

		}else {

			sql = "select NAME,TYPE,DATE,TIME from login where NAME='"+username.getSelectedItem()+"' and DATE='"+day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem()+"' ";

		}       

		try {
       
			pre=con.prepareStatement(sql);
       
			res=pre.executeQuery();
       
			jTable1.setModel(DbUtils.resultSetToTableModel(res));
       
		}catch(Exception e){
       
			JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
       
		}
	
	}

	protected void yearItemStateChanged(java.awt.event.ItemEvent evt) {
		// TODO Auto-generated method stub
		String sql;
		
		if(month.getSelectedIndex()!=0&&day.getSelectedIndex()!=0&&username.getSelectedIndex()==0){
		
			sql = "select NAME,TYPE,DATE,TIME from login where DATE='"+day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem()+"' ";
		
		}else {
		
			sql = "select NAME,TYPE,DATE,TIME from login where NAME='"+username.getSelectedItem()+"' and DATE='"+day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem()+"' ";
		
		}
		    
		try {
		       
			pre=con.prepareStatement(sql);
		       
			res=pre.executeQuery();
		       
			jTable1.setModel(DbUtils.resultSetToTableModel(res));
		       
		}catch(Exception e){
		       
			JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
		       
		}
	}

	private void fill_Username() {
		// TODO Auto-generated method stub
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
            java.util.logging.Logger.getLogger(Login_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Details().setVisible(true);
            }
        });
    }
	
	// Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> day;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JComboBox<String> month;
    private javax.swing.JComboBox<String> username;
    public javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables

}
