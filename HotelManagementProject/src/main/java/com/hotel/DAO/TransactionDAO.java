package com.hotel.DAO;

import java.util.List;

import com.hotel.DTO.Transaction;

public interface TransactionDAO {

	public boolean insertTransaction(Transaction t);
	public List getTransaction(long user);
	public List getTransaction();
}
