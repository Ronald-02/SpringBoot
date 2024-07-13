package dio.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyApp {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MyApp.class, args);

		Calculadora calculadora = ctx.getBean(Calculadora.class);

		// Exemplo de uso da calculadora
		double resultadoSoma = calculadora.somar(10, 5);
		System.out.println("10 + 5 = " + resultadoSoma);

		double resultadoSubtracao = calculadora.subtrair(10, 5);
		System.out.println("10 - 5 = " + resultadoSubtracao);

		double resultadoMultiplicacao = calculadora.multiplicar(10, 5);
		System.out.println("10 * 5 = " + resultadoMultiplicacao);

		double resultadoDivisao = calculadora.dividir(10, 5);
		System.out.println("10 / 5 = " + resultadoDivisao);
	}
}
