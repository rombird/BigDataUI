package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Servlet.DbUtils;

class DataSourceTests {
	// Resource를 탐지하지 못해서 오류 발생(구체적인 위치 못찾음) 
	@Test
	void t1() throws Exception {
		DbUtils.conn(); // conn이 문제 없이 동작한다면 System.out.print가 나올 것
	}
	
//	@Test
//	void t2() {
//		
//	}
//	
//	@Test
//	void t3() {
//		
//	}

}
