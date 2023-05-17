package math;

public class Calculadora {

  public double sumar(double primerNumero, double segundoNumero) {
    return primerNumero + segundoNumero;
  }
  
  public double restar(double primerNumero, double segundoNumero) {
    return primerNumero - segundoNumero;
  }
  
  public double multiplicar(double primerNumero, double segundoNumero) {
    return primerNumero * segundoNumero;
  }
  
  public double division(double dividendo, double divisor) {
    
    if(divisor == 0) throw new IllegalArgumentException("El divisor no puede ser cero"); 
    return dividendo/divisor;
  }
  
  public double calcularRaizCuadrada(double numero) {
    if(numero < 0) {
      throw new IllegalArgumentException("El número no puede ser negativo"); 
    }
    return Math.sqrt(numero);
  }
  
  public double calcularPotencia(double base, double exponente) {
    return Math.pow(base, exponente);
  }
 
  
}
