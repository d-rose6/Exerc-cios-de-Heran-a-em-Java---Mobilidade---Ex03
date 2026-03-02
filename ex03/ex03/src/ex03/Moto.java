package ex03;

class Moto extends Veiculo { 
    int cilindradas; 
 
    public void mostrarDados() {
        mostrarModelo();
        System.out.println("Cilindradas: " + cilindradas + "cc");
    } 
} 
