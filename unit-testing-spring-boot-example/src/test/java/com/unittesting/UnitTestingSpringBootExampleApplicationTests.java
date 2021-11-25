package com.unittesting;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class UnitTestingSpringBootExampleApplicationTests {

	private Calculator c=new Calculator();
	@Test
	void contextLoads() {
	}

	@Test
	@Disabled
	void testSum()
	{
		//expeted
		int expectedResult=10;

		//actual
		int actualResult=c.doSum(12,3,2);

		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void testProduct()
	{
		int expectedResult=6;

		int actualResult = c.doProuct(2, 3);
		assertThat(actualResult).isEqualTo(expectedResult);

	}
	@Test
	void testCampareTwoNo()
	{
		boolean actualResult = c.doCompareTwoNo(3, 3);
		assertThat(actualResult).isTrue();

	}
}
