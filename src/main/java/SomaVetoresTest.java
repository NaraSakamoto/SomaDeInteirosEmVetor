import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SomaVetoresTest {

  @Test
  public void validaSomaDeVetoresSimples() {
    SomaVetores calculadora = new SomaVetores();

    // 321
    int[] A = { 1, 2, 3 };
    // 432
    int[] B = { 2, 3, 4 };
    // 753
    int[] C = calculadora.somaVetores(A, B);

    int[] resultadoEsperado = { 3, 5, 7 };
    assertEquals(resultadoEsperado[0], C[0]);
    assertEquals(resultadoEsperado[1], C[1]);
    assertEquals(resultadoEsperado[2], C[2]);
  }

  @Test
  public void validaSomaDeVetoresTamanhosDiferentes() {
    SomaVetores calculadora = new SomaVetores();

    // 32
    int[] A = { 2, 3 };
    // 432
    int[] B = { 2, 3, 4 };
    // 464
    int[] C = calculadora.somaVetores(A, B);

    int[] resultadoEsperado = { 4, 6, 4 };
    assertEquals(resultadoEsperado[0], C[0]);
    assertEquals(resultadoEsperado[1], C[1]);
    assertEquals(resultadoEsperado[2], C[2]);
  }

  @Test
  public void validaSomaDeVetoresNumerosGrandes() {
    SomaVetores calculadora = new SomaVetores();

    // 543
    int[] A = { 3, 4, 5 };
    // 761
    int[] B = { 1, 6, 7 };
    // 1304
    int[] C = calculadora.somaVetores(A, B);

    int[] resultadoEsperado = { 4, 0, 3, 1 };
    assertEquals(resultadoEsperado[0], C[0]);
    assertEquals(resultadoEsperado[1], C[1]);
    assertEquals(resultadoEsperado[2], C[2]);
    assertEquals(resultadoEsperado[3], C[3]);
  }

}