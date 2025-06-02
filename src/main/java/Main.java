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
      soma[i] = a[i] + b[i];
    }

    return soma;
  }

  @Test
  void validaSomaDeVetores() {

    // 321
    int[] A = { 1, 2, 3 };
    // 432
    int[] B = { 2, 3, 4 };

    int[] C = somaVetores(A, B);

    int[] resultadoEsperado = { 3, 5, 7 };
    assertEquals(C, resultadoEsperado);
  }

}