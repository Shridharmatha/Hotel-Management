package com.hotel.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hotel.DTO.Transaction;
import com.hotel.connector.ConnectionFactory;

public class TransactionDAOImpl implements TransactionDAO{
	private Connection con=null;
	
	

	public TransactionDAOImpl(Connection con) {
		
		this.con=ConnectionFactory.requsetConnection();
	}

	@Override
	public boolean insertTransaction(Transaction t) {
		String query = "INSERT INTO PASSBOOK(TRANS_ID,USER_ACCNO,REC_ACCNO,TRANS_DATE,TRANS_TYPE,AMOUNT)VALUES(?,?,?,sysdate(),?,?)";
		PreparedStatement ps = null;
		int res = 0;

		try {
			con.setAutoCommit(false);
			ps = con.prepareStatement(query);
			ps.setLong(1, t.getTransactionId());
			ps.setLong(2, t.getUser());
			ps.setLong(3, t.getRec_acc());
			ps.setString(4, t.getTransaction());
			ps.setDouble(5, t.getAmount());

			res = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (res > 0) {
			try {
				con.commit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		} else {
			try {
				con.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}

	}

	@Override
	public List getTransaction(long user) {
		String query = "SELECT * FROM PASSBOOK WHERE USER_ACCNO=? ORDER BY TRANS_DATE DESC";
		PreparedStatement ps = null;
		ResultSet rs = null;
		Transaction t = null;

		ArrayList<Transaction> passbook = new ArrayList<>();

		try {
			ps = con.prepareStatement(query);
			ps.setLong(1, user);

			rs = ps.executeQuery();
			while (rs.next()) {
				t = new Transaction();
				t.setTransactionId(rs.getLong(1));
				t.setUser(rs.getLong(2));
				t.setRec_acc(rs.getLong(3));
				t.setTransaction(rs.getString(4));
				t.setAmount(rs.getDouble(5));
				t.setDate(rs.getDate(6));
				passbook.add(t);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return passbook;
	}

	@Override
	public List getTransaction() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "SELECT * FROM PASSBOOK ORDER BY TRANS_DATE DESC";
		Transaction t = null;
		ArrayList<Transaction> passbook = new ArrayList<Transaction>();
		try {
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				t = new Transaction();
				t.setTransactionId(rs.getLong(1));
				t.setUser(rs.getLong(2));
				t.setRec_acc(rs.getLong(3));
				t.setTransaction(rs.getString(4));
				t.setAmount(rs.getDouble(5));
				t.setDate(rs.getDate(6));
				passbook.add(t);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return passbook;
	}
}
