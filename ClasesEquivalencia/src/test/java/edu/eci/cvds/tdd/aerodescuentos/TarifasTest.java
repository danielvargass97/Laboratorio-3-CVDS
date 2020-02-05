package edu.eci.cvds.tdd.aerodescuentos;


import org.junit.Test;

import junit.framework.*;

public class TarifasTest {
 
	@SuppressWarnings("deprecation")
	@Test
	public void descuento23PorCiento() throws Exception {
		// Descuento por más de 20 días de antelación y edad mayor a 65 años
		double CalculoTarifa = CalculadorDescuentos.calculoTarifa(500, 22, 70);
		Assert.assertEquals(CalculoTarifa,385.0);			
	}
	@SuppressWarnings("deprecation")
	@Test 
	public void descuento20PorCiento()throws Exception {
		// Descuento por más de 20 días de antelación y edad menor a 18 años
		double CalculoTarifa = CalculadorDescuentos.calculoTarifa(135.5, 55, 12);
		Assert.assertEquals(CalculoTarifa, 108.4);
	}
	@SuppressWarnings("deprecation")
	@Test
	public void descuento15PorCiento()throws Exception {
		// Descuento por más de 20 días de antelación
		double CalculoTarifa = CalculadorDescuentos.calculoTarifa(897.4, 30, 31);
		Assert.assertEquals(CalculoTarifa, 762.79);
	}
	@SuppressWarnings("deprecation")
	@Test
	public void descuento5PorCiento()throws Exception {
		// Descuento por edad menor a 18 años
		double CalculoTarifa = CalculadorDescuentos.calculoTarifa(659.8, 0, 15);
		Assert.assertEquals(CalculoTarifa, 626.81);
	}
	@SuppressWarnings("deprecation")
	@Test 
	public void descuento8PorCiento()throws Exception {
		// Descuento por edad mayor a 65 años
		double CalculoTarifa = CalculadorDescuentos.calculoTarifa(3520, 2, 99);
		Assert.assertEquals(CalculoTarifa,3238.4);
	}
		

}
