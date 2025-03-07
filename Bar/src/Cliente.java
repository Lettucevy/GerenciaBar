class Cliente {
    private char sexo;
    private int qtdCervejas;
    private int qtdRefrigerantes;
    private int qtdEspetinhos;

    public Cliente(char sexo, int qtdCervejas, int qtdRefrigerantes, int qtdEspetinhos) {
        this.sexo = sexo;
        this.qtdCervejas = qtdCervejas;
        this.qtdRefrigerantes = qtdRefrigerantes;
        this.qtdEspetinhos = qtdEspetinhos;
    }

    public char getSexo() {
        return sexo;
    }

    public int getQtdCervejas() {
        return qtdCervejas;
    }

    public int getQtdRefrigerantes() {
        return qtdRefrigerantes;
    }

    public int getQtdEspetinhos() {
        return qtdEspetinhos;
    }
}