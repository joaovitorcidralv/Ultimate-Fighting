package ufc;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public void apresentar(){
        System.out.println("------------------------------------------------------------------");
        System.out.println("Chegou a hora! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " metros");
        System.out.println("pesando " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + " vitórias ");
        System.out.println(this.getDerrotas() + " derrotas ");
        System.out.println(this.getEmpates() + " empates! ");
    }

    //apresentação simples
    public void status(){
        System.out.println(this.getNome() + " é um " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }

    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    //categoria de acordo com o peso
    private void setCategoria() {
        if (this.peso < 52.6){
            this.categoria = "Peso-Palha";
        } else if (this.peso < 56.7) {
            this.categoria = "Peso-Mosca";
        } else if (this.peso < 61.2) {
            this.categoria = "Peso-Galo";
        } else if (this.peso < 65.7) {
            this.categoria = "Peso-Pena";
        } else if (this.peso < 70.3) {
            this.categoria = "Peso-Leve";
        } else if (this.peso < 77.1) {
            this.categoria = "Peso Meio-Médio";
        } else if (this.peso < 83.9){
            this.categoria = "Peso-Médio";
        } else if (this.peso < 92.9) {
            this.categoria = "Peso Meio-Pesado";
        } else if (this.peso < 120.2) {
            this.categoria = "Peso Pesado";
        } else {
            System.out.println("Não se enquadra nas categorias, não pode lutar!");

        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
