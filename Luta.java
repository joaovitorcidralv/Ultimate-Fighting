package ufc;

import java.util.Random;

public class Luta {
    // agregação, uma classe estar contida em outra classe
    private Lutador desafiado;
    private Lutador desafiante;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada =true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            double probabilidadeVitoriaDesafiado = 0.383;  // 38.3% de chance de vitória sem vantagem
            double probabilidadeVitoriaDesafiante = 0.383; // 38.3% de chance de vitória sem vantagem
            double probabilidadeEmpate = 0.234;           // 23.4% de chance de empate sem vantagem

            if (this.desafiado.getVitorias() > this.desafiante.getVitorias() &&
                    this.desafiado.getDerrotas() < this.desafiante.getDerrotas()) {
                probabilidadeVitoriaDesafiado = 0.523;  // 52.3% de chance de vitória com vantagem
                probabilidadeVitoriaDesafiante = 0.203; // 20.3% de chance de vitória com vantagem
                probabilidadeEmpate = 0.274;           // 27.4% de chance de empate com vantagem
            } else if (this.desafiante.getVitorias() > this.desafiado.getVitorias() &&
                    this.desafiante.getDerrotas() < this.desafiado.getDerrotas()) {
                probabilidadeVitoriaDesafiante = 0.523;  // 52.3% de chance de vitória com vantagem
                probabilidadeVitoriaDesafiado = 0.203;   // 20.3% de chance de vitória com vantagem
                probabilidadeEmpate = 0.274;             // 27.4% de chance de empate com vantagem
            }

            Random random = new Random();
            double randomValue = random.nextDouble();

            if (randomValue < probabilidadeVitoriaDesafiado) {
                System.out.println("==================RESULTADO DE LUTA=================");
                System.out.println("Vitória de " + this.desafiado.getNome());
                System.out.println("====================================================");
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
            } else if (randomValue < probabilidadeVitoriaDesafiado + probabilidadeVitoriaDesafiante) {
                System.out.println("==================RESULTADO DE LUTA=================");
                System.out.println("Vitória de " + this.desafiante.getNome());
                System.out.println("====================================================");
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
            } else {
                System.out.println("==================RESULTADO DE LUTA=================");
                System.out.println("A luta terminou em empate!");
                System.out.println("====================================================");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
            }
        } else {
            System.out.println("Esta luta não pode acontecer, categorias diferentes!");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
}
