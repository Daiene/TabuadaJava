public class TabuadaMultiplicacao implements Tabuada {
    /*Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para
    exibir a tabuada de um número. A classe deve receber o número como parâmetro.*/

    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "*" + numero + "=" + i*numero);
        }
    }
}
