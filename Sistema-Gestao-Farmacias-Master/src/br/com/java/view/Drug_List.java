package br.com.java.view;

import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import br.com.java.connection.Conexao;
import net.proteanit.sql.DbUtils;



public class Drug_List extends javax.swing.JFrame{
	
	Connection con = null;
	PreparedStatement pre = null;
	ResultSet res= null;
	String sql1;
	String sql2;
	String sql3;
	
	public Drug_List() {
	
		initComponents();
        con=Conexao.getConnection();
        drug_list();
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        druglist = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        sort_by = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de medicamentos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Tabela de medicamentos");
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(273, 273, 273))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        druglist.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        druglist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "         Name", "         Type", "         Barcode", "         Price", "         Expiry", "         Company"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        druglist.getTableHeader().setReorderingAllowed(false);
        druglist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                druglistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(druglist);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        sort_by.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sort By : ", "Name", "Type", "Expiration" }));
        sort_by.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sort_byItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Order por : ");
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sort_by, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sort_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        setSize(new java.awt.Dimension(679, 539));
        setLocationRelativeTo(null);
	}

	protected void sort_byItemStateChanged(java.awt.event.ItemEvent evt) {
		// TODO Auto-generated method stub
		switch (sort_by.getSelectedIndex()){ // one case will execute in these cases 
	    
		case 1 : {
	    
			sql1 = "select NAME , TYPE ,BARCODE,SELLING_PRICE , EXPIRY , COMPANY_NAME from drugs order by NAME";
	    
			sort(1);  break;  //1- order by name from A - Z
	    
		}
	   
		case 2 : {
	   
			sql2 = "select NAME , TYPE ,BARCODE,SELLING_PRICE , EXPIRY , COMPANY_NAME from drugs order by TYPE";
	   
			sort(2);break;  // 2- order by type from A - Z 
	    
		}
	    
		case 3 : {
	   
			sql3 = "select NAME , TYPE ,BARCODE,SELLING_PRICE , EXPIRY , COMPANY_NAME from drugs order by EXPIRY DESC";
	   
			sort(3); break; //3- order by expiry , so the most expiry will be first (drug expired)
	   }  
	
		}
	
	}

	private void sort(int index) {
		// TODO Auto-generated method stub
		
		try{
			   
			switch (index){
			       
			case 1 : {
			        
				pre=con.prepareStatement(sql1);
			        
				res=pre.executeQuery();
			        
				druglist.setModel(DbUtils.resultSetToTableModel(res));   
			      
			}
			
			break;
			       
			case 2 : {
			       
				pre=con.prepareStatement(sql2);
			        
				res=pre.executeQuery();
			        
				druglist.setModel(DbUtils.resultSetToTableModel(res));    
			       
			}
			
			break;
			       
			case 3 : {
			       
				pre=con.prepareStatement(sql3);
			        
				res=pre.executeQuery();
			        
				druglist.setModel(DbUtils.resultSetToTableModel(res));    // set data in the table 
			       
			}
			    
			
			}    
			    
		}catch(Exception e){
			        
			JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
			    
		}
	}


	protected void druglistMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO Auto-generated method stub
		int row = druglist.getSelectedRow();
		String t = druglist.getModel().getValueAt(row,2).toString();
		String sql = "select * from drugs where BARCODE='"+t+"' ";
		
		try{
		    pre=con.prepareStatement(sql);
		    res=pre.executeQuery();
		    
		    if(res.next()){
		        String Name = res.getString("NOME");
		        Farmacia.drug.name.setText(Name);
		        
		        String Type = res.getString("TIPO");
		        Farmacia.drug.type.setSelectedItem(Type);
		        
		        String Barcode = res.getString("C�D BARRAS");
		        Farmacia.drug.barcode.setText(Barcode);
		        
		        String Code = res.getString("C�DIGO");
		        Farmacia.drug.code.setText(Code);
		        
		        String Dose = res.getString("DOSE");
		        Farmacia.drug.dose.setText(Dose);
		        
		        String cost_price = res.getString("CUSTO");
		        Farmacia.drug.cost_price.setText(cost_price);
		        
		        String sell_price = res.getString("VENDA");
		        Farmacia.drug.selling_price.setText(sell_price);
		        
		        String company_Name = res.getString("COMPANIA");
		        Farmacia.drug.company_name.setSelectedItem(company_Name);
		        
		        String Quantity = res.getString("QUANTIDADE");
		        Farmacia.drug.quantity.setSelectedItem(Quantity);
		        
		        String Day = res.getString("DTFABRICACAO").split("-")[0];
		        Farmacia.drug.pro_day.setSelectedItem(Day);
	            String Month = res.getString("DTFABRICACAO").split("-")[1];
	            Farmacia.drug.pro_month.setSelectedItem(Month);
	            String Year = res.getString("DTFABRICACAO").split("-")[2];
	            Farmacia.drug.pro_year.setSelectedItem(Year);
	             
	            String ex_Day = res.getString("VALIDADE").split("-")[0];
	            Farmacia.drug.exp_day.setSelectedItem(ex_Day);
	            String ex_Month = res.getString("VALIDADE").split("-")[1];
	            Farmacia.drug.exp_month.setSelectedItem(ex_Month);
	            String ex_Year = res.getString("VALIDADE").split("-")[2];
	            Farmacia.drug.exp_year.setSelectedItem(ex_Year);
	        
	            String sec = res.getString("LOCAL").split("-")[0];
	            Farmacia.drug.section.setSelectedItem(sec);
	            String pla = res.getString("LOCAL").split("-")[1];
	            Farmacia.drug.place.setSelectedItem(pla);
		        
             
		    }
		}catch(Exception e){
		    JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
		}
	}

	private void drug_list() {
		// TODO Auto-generated method stub
		String sql = "select NAME , TYPE ,BARCODE,SELLING_PRICE , EXPIRY , COMPANY_NAME from drugs"; // get data from database
	    
		try{
	        
			pre=con.prepareStatement(sql); // prepare sql statement
	        res=pre.executeQuery(); // execute sql statement
	        druglist.setModel(DbUtils.resultSetToTableModel(res)); // set data in the table 
	    
		}catch(Exception e){
	        
			JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
	    }
	}
	// Declara��o de variaveis
    private javax.swing.JTable druglist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> sort_by;
    // End of variables declaration//GEN-END:variables

}
