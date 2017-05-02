package br.com.paqui.estudos.lambda;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LambdasTest {

	@Test
	public void test() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		Lambdas lambdas = new Lambdas();

		assertEquals(21, lambdas.somaTodos(numbers));
		assertEquals(12, lambdas.somaPares(numbers));
		assertEquals(15, lambdas.somaMaioresQue(numbers, 3));
	}

}
