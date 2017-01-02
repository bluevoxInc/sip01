/**
 * 
 */
package com.springinpractice.sip01.dao;

import java.util.List;

import com.springinpractice.sip01.model.Account;

/**
 * @author wnorman
 *
 */
public interface AccountDao {
	
	List<Account> findAll() throws Exception;
	
}
