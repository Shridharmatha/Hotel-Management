package com.hotel.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.hotel.DTO.Consumer;
import com.hotel.connector.ConnectionFactory;

public class ConsumerDAOImpl implements ConsumerDAO{
	
	private Connection con;
	public ConsumerDAOImpl()
	{
		this.con=ConnectionFactory.requsetConnection();
	}

	@Override
	public boolean insertConsumer(Consumer c) {
		String query="INSERT INTO CONSUMER VALUES(0,?,?,?,?,?)";
		PreparedStatement ps=null;
		int res=0;
		try {
			ps=con.prepareStatement(query);
			ps.setString(1, c.getName());
			ps.setLong(2,c.getAccno());
			ps.setString(3, c.getEmail());
			ps.setLong(4,c.getPhone());
			ps.setString(5,c.getPassword() );
			res=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		if(res>0)
		{
			return true;
		}else {
			return false;
		}
		
		
	}

	@Override
	public boolean updateConsumer(Consumer c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteConsumer(Consumer c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Consumer getConsumer(int cid, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Consumer> getConsumer() {
		// TODO Auto-generated method stub
		return null;
	}

}
