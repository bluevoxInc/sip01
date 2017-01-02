/**
 * 
 */
package com.springinpractice.sip01;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinpractice.sip01.model.Account;
import com.springinpractice.sip01.service.AccountService;

/**
 * @author wnorman
 *
 */
public class ConsoleApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		ApplicationContext appCtx =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountService accountService =
				(AccountService)appCtx.getBean("accountService");
		List<Account> delinquentAccounts = accountService
				.findDelinquentAccounts();
		
		for (Account a : delinquentAccounts) {
			System.out.println(a.getAccountNo());
		}
	}

}
