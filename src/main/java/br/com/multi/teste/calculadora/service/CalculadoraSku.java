package br.com.multi.teste.calculadora.service;

import br.com.multi.teste.calculadora.model.ProdutoCaixa;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class CalculadoraSku {
    private final Gson gson;
    private final JsonObject pesoPorSku;
    private final JsonObject pedidos;

    public CalculadoraSku(JsonObject pedidos, JsonObject pesoPorSku) {
        this.gson = new Gson();
        this.pesoPorSku = pesoPorSku;
        this.pedidos = pedidos;
    }

    public void calcularTotais() {
        for (String pedido : pedidos.keySet()) {
            int totalSku = 0;
            int totalPeso = 0;

            JsonObject caixas = pedidos.getAsJsonObject(pedido);
            for (String caixa : caixas.keySet()) {

                JsonArray produtos = caixas.getAsJsonArray(caixa);
                for (int i = 0; i < produtos.size(); i++) {
                    JsonObject produtosJson = produtos.get(i).getAsJsonObject();

                    ProdutoCaixa produto = gson.fromJson(produtosJson, ProdutoCaixa.class);
                    totalSku += produto.qtd();
                    totalPeso += produto.qtd() * pesoPorSku.get(produto.sku()).getAsInt();
                }
            }
            System.out.println("Pedido: " + pedido);
            System.out.println("Total de SKU: " + totalSku);
            System.out.println("Total de peso (em gramas): " + totalPeso);
            System.out.println();
        }
    }
}
