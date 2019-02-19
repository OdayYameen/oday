/**
 * 
 */
package CasesTest;

import static org.junit.Assert.*;

import org.junit.Test;

import srcCode.shop;

/**
 * @author FIS
 *
 */
public class MyClasTest {

	@Test
	public void test1() {
		shop sh=new shop();
		int act=sh.count;
		assertTrue(act==0);
		
	}
	@Test
	public void test2() {
		shop sh=new shop();
		sh.additem(1,127.0,"JavaBook");
		int count=sh.count;
		double TP=sh.calcTPrice();
		assertTrue(count==1);
		assertTrue(TP==127.0);
		
		
	}
	@Test
	public void test3() {
		
		shop sh=new shop();
		sh.additem(1,127.0,"JavaBook");
		sh.additem(1, 100, "Web Design Book");
		int count=sh.count;
		double TP=sh.calcTPrice();
		assertTrue(count==2);
		
		assertTrue(TP==227.0);
		
		
	}
	
	
}
