class Bar {

    private static final double PRECO_INGRESSO_MULHER = 8.0;
    private static final double PRECO_INGRESSO_HOMEM = 10.0;
    private static final double PRECO_CERVEJA = 5.0;
    private static final double PRECO_REFRI = 3.0;
    private static final double PRECO_ESPETINHO = 7.0;
    private static final double COUVERT = 4.0;
    private static final double LIMITE_CONSUMO_ISENCAO_COUVERT = 30.0;

    public double calcularConsumo(Cliente cliente) {
        return (cliente.getQtdCervejas() * PRECO_CERVEJA) +
               (cliente.getQtdRefrigerantes() * PRECO_REFRI) +
               (cliente.getQtdEspetinhos() * PRECO_ESPETINHO);
    }

    public double calcularCouvert(double totalConsumo) {
        return totalConsumo > LIMITE_CONSUMO_ISENCAO_COUVERT ? 0.0 : COUVERT;
    }

    public double calcularIngresso(char sexo) {
        return (sexo == 'F') ? PRECO_INGRESSO_MULHER : PRECO_INGRESSO_HOMEM;
    }

    public void gerarRelatorio(Cliente cliente) {
        double totalConsumo = calcularConsumo(cliente);
        double valorCouvert = calcularCouvert(totalConsumo);
        double valorIngresso = calcularIngresso(cliente.getSexo());
        double valorTotal = totalConsumo + valorCouvert + valorIngresso;

        System.out.println("RELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f%n", totalConsumo);
        if (valorCouvert == 0) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f%n", valorCouvert);
        }
        System.out.printf("Ingresso = R$ %.2f%n", valorIngresso);
        System.out.printf("Valor a pagar = R$ %.2f%n", valorTotal);
    }
}

