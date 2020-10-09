package br.com.java.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import org.apache.log4j.Logger;

import br.com.java.exception.PersistenceException;




public class Conexao {
	
	private static final String STR_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String STR_CON = "jdbc:mysql://localhost:3306/pharmacy?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static Logger log = Logger.getLogger(Conexao.class);

	public static Connection getConnection() {
		// TODO Auto-generated method stub
		
		   try{
			    Class.forName("com.mysql.cj.jdbc.Driver"); 
			    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbmedicamentos?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false","root","root");
			    if(con!=null)
			    	
			    	return con ;
			   
		   }catch(Exception e){
			    
			   JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
			   
		   }
			   
		   return null ;
			
        
//		Connection con = null;
//		
//		try {
//			Class.forName(STR_DRIVER);
//			con = DriverManager.getConnection(STR_CON, USER, PASSWORD);
//			con.setAutoCommit(false);
//			
//			log.debug("Aberta a conexão com banco de dados!");
//			return con;
//		} catch (ClassNotFoundException e) {
//			// TODO: handle exception
//			String errorMsg = "Driver (JDBC) não encontrado";
//			log.error(errorMsg, e);
//			throw new PersistenceException(errorMsg, e);
//		} catch (SQLException e) {
//			String errorMsg = "Erro ao obter a conexão";
//			log.error(errorMsg, e);
//			throw new PersistenceException(errorMsg, e);
//		}
//		
//	}
//	public static void closeAll(Connection conn) {
//		try {
//			
//			if (conn != null) {
//				conn.close();
//				log.debug("Fechada a conexão com banco de dados!");
//			}
//		
//		} catch (Exception e) {
//			
//			log.error("Não foi possivel fechar a conexão com o banco de dados!",e);
//		}
//	}
//
//	public static void closeAll(Connection conn, Statement stmt) {
//		try {
//			if (conn != null) {
//				closeAll(conn);
//			}
//			if (stmt != null) {
//				stmt.close();
//			}
//		} catch (Exception e) {
//			log.error("Não foi possivel fechar o statement!",e);
//		}
//	}
//
//	public static void closeAll(Connection conn, Statement stmt, ResultSet rs) {
//		try {
//			if (conn != null || stmt != null) {
//				closeAll(conn, stmt);
//			}
//			if (rs != null) {
//				rs.close();
//			}
//		} catch (Exception e) {
//			log.error("Não foi possivel fechar o resultSet!",e);
//		}
	}
}
