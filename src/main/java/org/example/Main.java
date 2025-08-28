package org.example;

public class Main {
    public static void main(String[] args) {

        // =============================
        // TESTE 1 - CLASSE FATURA
        // =============================
        System.out.println("===== TESTE FATURA =====");
        Fatura f1 = new Fatura("001", "Mouse Gamer", 2, 150.0);
        Fatura f2 = new Fatura("002", "Teclado Mecânico", -3, -200.0);

        System.out.println("Fatura 1: " + f1.getDescricao() +
                " | Quantidade: " + f1.getQuantidade() +
                " | Preço por Item: R$ " + f1.getPrecoPorItem() +
                " | Total: R$ " + f1.getTotalFatura());

        System.out.println("Fatura 2: " + f2.getDescricao() +
                " | Quantidade: " + f2.getQuantidade() +
                " | Preço por Item: R$ " + f2.getPrecoPorItem() +
                " | Total: R$ " + f2.getTotalFatura());

        // =============================
        // TESTE 2 - CLASSE EMPREGADO
        // =============================
        System.out.println("\n===== TESTE EMPREGADO =====");
        Empregado e1 = new Empregado("Ana", "Silva", 3000.0);
        Empregado e2 = new Empregado("Carlos", "Santos", 4500.0);

        System.out.println("Salário anual de " + e1.getNome() + ": R$ " + e1.getSalarioAnual());
        System.out.println("Salário anual de " + e2.getNome() + ": R$ " + e2.getSalarioAnual());

        e1.aplicarAumento(10);
        e2.aplicarAumento(10);

        System.out.println("\nApós aumento de 10%:");
        System.out.println("Salário anual de " + e1.getNome() + ": R$ " + e1.getSalarioAnual());
        System.out.println("Salário anual de " + e2.getNome() + ": R$ " + e2.getSalarioAnual());

        // =============================
        // TESTE 3 - CLASSE DATA
        // =============================
        System.out.println("\n===== TESTE DATA =====");
        Data d1 = new Data(15, 8, 2025);   // Data válida
        Data d2 = new Data(29, 2, 2024);   // Ano bissexto
        Data d3 = new Data(31, 11, 2023);  // Data inválida

        d1.displayData();
        d2.displayData();
        d3.displayData();
    }
}
