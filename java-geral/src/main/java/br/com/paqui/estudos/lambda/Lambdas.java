package br.com.paqui.estudos.lambda;

import java.util.List;
import java.util.function.Predicate;

import org.apache.commons.lang3.math.NumberUtils;

public class Lambdas {

	public int somaTodos (List<Integer> numbers) {
		return soma (numbers, n -> true);
	}

	public int somaPares (List<Integer> numbers) {
		return soma (numbers, n -> n % 2 == 0);
	}

	public int somaMaioresQue (List<Integer> numbers, Integer fator) {
		return soma (numbers, n -> n > fator);
	}

	private int soma (List<Integer> numbers, Predicate<Integer> p) {
	    int total = 0;
	    for (int number : numbers) {
	        if (p.test(number)) {
	            total += number;
	        }
	    }
	    return total;
	}

	class RegraDeNegocio {
		Integer obj;

		public void naoNulo() {
			if (obj == null) {
				throw new RuntimeException("Obj nulo.");
			}
		}

		public void deveSerMaiorQueZero() {
			if (NumberUtils.compare(obj, 0) > 0 ) {
				throw new RuntimeException("Valor menor que zero.");
			}
		}
	}
}
