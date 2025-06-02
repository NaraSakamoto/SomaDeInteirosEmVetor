import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  private int[] somaVetores(int[] a, int[] b) {

    int tamanho = 0;
    if (a.length >= b.length) {
      tamanho = a.length;
    } else {
      tamanho = b.length;
    }

    int[] soma = new int[tamanho + 1];

    for (int i = 0; i < tamanho; i++) {
      int valueA = (i < a.length) ? a[i] : 0;
      int valueB = (i < b.length) ? b[i] : 0;
      soma[i] = valueA + valueB;
    }

    return soma;
  }

  @Test
  public void validaSomaDeVetores() {

    // 321
    int[] A = { 1, 2, 3 };
    // 432
    int[] B = { 2, 3, 4 };

    int[] C = somaVetores(A, B);

    int[] resultadoEsperado = { 3, 5, 7 };
    assertEquals(C, resultadoEsperado);
  }

}