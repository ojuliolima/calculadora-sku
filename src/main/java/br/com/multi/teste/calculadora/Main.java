package br.com.multi.teste.calculadora;

import br.com.multi.teste.calculadora.service.CalculadoraSku;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("sku.json");

            Gson gson = new Gson();
            JsonObject jsonEmObjeto = gson.fromJson(fileReader, JsonObject.class);

            JsonObject pedidos = jsonEmObjeto.getAsJsonObject("pedidos");
            JsonObject pesoProduto = jsonEmObjeto.getAsJsonObject("pesoPorSku");

            CalculadoraSku calculadora = new CalculadoraSku(pedidos, pesoProduto);
            calculadora.calcularTotais();

            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}