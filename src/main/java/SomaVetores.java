public class SomaVetores {

  public int[] somaVetores(int[] a, int[] b) {

    int tamanho = 0;
    if (a.length >= b.length) {
      tamanho = a.length;
    } else {
      tamanho = b.length;
    }

    int[] soma = new int[tamanho + 1];
    int sobe1 = 0;
    for (int i = 0; i <= tamanho; i++) {
      int valueA = (i < a.length) ? a[i] : 0;
      int valueB = (i < b.length) ? b[i] : 0;

      soma[i] = valueA + valueB + sobe1;

      if (soma[i] > 9) {
        soma[i] = soma[i] - 10;
        sobe1 = 1;
      }
    }

    return soma;
  }
}