package SaberHacer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

@Test
	public void suma() {
	
	double resultado = Calculadora.suma(3, 5);
	double operacion =8;
	assertEquals(operacion, resultado);
	
			
		}
@Test
	public void resta() {
	
	double resultado = Calculadora.resta(5, 2);
	double operacion =3;
	assertEquals(operacion, resultado);
	
}
@Test
	public void multiplicacion() {
	
	double resultado = Calculadora.multiplicacion(3, 2);
	double operacion = 6;
	assertEquals(operacion, resultado);
	
}
@Test
	public void division() {
	
	double resultado = Calculadora.division(8, 2);
	double operacion = 4;
	assertEquals(operacion, resultado);
	
}

@Test
	public void exponenciacion() {

	double resultado = Calculadora.exponenciacion(Calculadora.suma(5, 2), Calculadora.multiplicacion(1,1));
	double operacion = Calculadora.exponenciacion(Calculadora.suma(5, 2), Calculadora.multiplicacion(1,1));
	assertEquals(operacion, resultado);

}

}
