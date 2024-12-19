package com.hotel.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
		String query="update consumer set name=?, accno=?,email=?,phone=?,password=? where cid=?";
		PreparedStatement ps=null;
		int res=0;
		try {
			ps=con.prepareStatement(query);
			ps.setString(1,c.getName());
			ps.setLong(2, c.getAccno());
			ps.setString(3, c.getEmail());
			ps.setLong(4, c.getPhone());
			ps.setString(5,c.getPassword());
			ps.setInt(6, c.getCid());
			res=ps.executeUpdate();
		} catch (SQLException e) {
			
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
	public boolean deleteConsumer(Consumer c) {
		String query="delete from consumer where cid=?";
		PreparedStatement ps=null;
		int res=0;
		try {
			ps=con.prepareStatement(query);
			ps.setInt(1,c.getCid());
			res=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}if(res>0)
		{
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Consumer getConsumer(int cid, String password) {
		String query="select * from consumer where cid=? and password=?";
		PreparedStatement ps=null;
		ResultSet rs=null;
		Consumer c=null;
		try {
			ps=con.prepareStatement(query);
			ps.setInt(1,cid);
			ps.setString(2, password);
			rs=ps.executeQuery();
			while(rs.next())
			{
				c=new Consumer();
				c.setCid(rs.getInt(1));
				c.setName(rs.getString("name"));
				c.setAccno(rs.getLong("accno"));
				c.setEmail(rs.getString("email"));
				c.setPhone(rs.getLong("phone"));
				c.setPassword(rs.getNString("password"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public List<Consumer> getConsumer() {
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<Consumer> Consumerlist=new ArrayList<>();
		String query="select * from consumer";
		try {
			ps=con.prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next())
			{
				Consumer c=new Consumer();
				c.setCid(rs.getInt("cid"));
				c.setName(rs.getString("name"));
				c.setAccno(rs.getLong("accno"));
				c.setEmail(rs.getString("email"));
				c.setPhone(rs.getLong("phone"));
				c.setPassword(rs.getNString("password"));
				Consumerlist.add(c);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return Consumerlist;
	}

}
