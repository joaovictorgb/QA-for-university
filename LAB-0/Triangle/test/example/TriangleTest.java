/**
 * Testes para o programa do Triângulo.
 * Professora Dra.Sabrina Souto
 * Enviado por João Victor Barbosa.
 */

 package example;

 import static org.junit.jupiter.api.Assertions.*;
 
 import org.junit.jupiter.api.Assertions;
 import org.junit.jupiter.api.Test;
 
 public class TriangleTest {

     @Test
     public void trianguloEquilatero() throws Exception {
         Triangle triangle = new Triangle(2, 2, 2);
         assertEquals(TriangleKind.EQUILATERAL, triangle.getKind());
     }
 
     // Testa triângulo isósceles
     @Test
     public void trianguloIsosceles() throws Exception {
         Triangle triangle = new Triangle(3, 3, 2);
         assertEquals(TriangleKind.ISOSCELES, triangle.getKind());
     }
 
     // Testa triângulo escaleno
     @Test
     public void trianguloEscaleno() throws Exception {
         Triangle triangle = new Triangle(3, 4, 5);
         assertEquals(TriangleKind.SCALENE, triangle.getKind());
     }
 
     // Testa lado zero
     @Test
     public void ladoZeroExcecao() {
         Assertions.assertThrows(TriangleException.class, () -> {
             Triangle triangle = new Triangle(0, 1, 2);
         });
     }
 
     // Testa lado negativo
     @Test
     public void ladoNegativoExcecao() {
         Assertions.assertThrows(TriangleException.class, () -> {
             Triangle triangle = new Triangle(3, -1, 2);
         });
     }
 
     // Testa desigualdade triangular
     @Test
     public void desigualdadeTriangularExcecao() {
         Assertions.assertThrows(TriangleException.class, () -> {
             Triangle triangle = new Triangle(1, 1, 3);
         });
     }
 
     // Testa lados fora de ordem
     @Test
     public void ladosForaDeOrdemExcecao() {
         Assertions.assertThrows(TriangleException.class, () -> {
             Triangle triangle = new Triangle(2, 3, 1);
         });
     }
 
     // Testa triângulo equilátero grande
     @Test
     public void trianguloEquilateroGrande() throws Exception {
         Triangle triangle = new Triangle(1000, 1000, 1000);
         assertEquals(TriangleKind.EQUILATERAL, triangle.getKind());
     }
 
     // Testa triângulo isósceles grande
     @Test
     public void trianguloIsoscelesGrande() throws Exception {
         Triangle triangle = new Triangle(1000, 1000, 500);
         assertEquals(TriangleKind.ISOSCELES, triangle.getKind());
     }
 
     // Testa triângulo escaleno grande
     @Test
     public void trianguloEscalenoGrande() throws Exception {
         Triangle triangle = new Triangle(2000, 3000, 3500);
         assertEquals(TriangleKind.SCALENE, triangle.getKind());
     }
 
     // Testa triângulo equilátero pequeno
     @Test
     public void trianguloEquilateroPequeno() throws Exception {
         Triangle triangle = new Triangle(0.1, 0.1, 0.1);
         assertEquals(TriangleKind.EQUILATERAL, triangle.getKind());
     }
 
     // Testa triângulo isósceles pequeno
     @Test
     public void trianguloIsoscelesPequeno() throws Exception {
         Triangle triangle = new Triangle(0.2, 0.2, 0.3);
         assertEquals(TriangleKind.ISOSCELES, triangle.getKind());
     }
 
     // Testa triângulo escaleno pequeno
     @Test
     public void trianguloEscalenoPequeno() throws Exception {
         Triangle triangle = new Triangle(0.3, 0.4, 0.5);
         assertEquals(TriangleKind.SCALENE, triangle.getKind());
     }
 
     // Testa lado negativo 1
     @Test
     public void ladoNegativoExcecao1() {
         Assertions.assertThrows(TriangleException.class, () -> {
             Triangle triangle = new Triangle(1, 1, -1);
         });
     }
 
     // Testa dois lados negativos
     @Test
     public void doisLadosNegativosExcecao() {
         Assertions.assertThrows(TriangleException.class, () -> {
             Triangle triangle = new Triangle(1, -1, -1);
         });
     }
 
     // Testa todos lados negativos
     @Test
     public void todosLadosNegativosExcecao() {
         Assertions.assertThrows(TriangleException.class, () -> {
             Triangle triangle = new Triangle(-1, -1, -1);
         });
     }
 
     // Testa lado negativo grande
     @Test
     public void ladoNegativoGrandeExcecao() {
         Assertions.assertThrows(TriangleException.class, () -> {
             Triangle triangle = new Triangle(1000, 1000, -500);
         });
     }
 
     // Testa lados com comprimento zero
     @Test
     public void ladoComprimentoZeroExcecao() {
         Assertions.assertThrows(TriangleException.class, () -> {
             Triangle triangle = new Triangle(0, 0, 0);
         });
     }
 }
 