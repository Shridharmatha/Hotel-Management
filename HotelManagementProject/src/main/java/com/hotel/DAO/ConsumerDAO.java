package com.hotel.DAO;

import java.util.List;

import com.hotel.DTO.Consumer;

public interface ConsumerDAO {
	public boolean insertConsumer(Consumer c);
	public boolean updateConsumer(Consumer c);
	public boolean deleteConsumer(Consumer c);
	public Consumer getConsumer(int cid,String password);
	public List<Consumer> getConsumer();
	

}
