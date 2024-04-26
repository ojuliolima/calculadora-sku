# Calculadora de SKU
Esse projeto tem como objetivo ler um arquivo json e a partir dessas informações, calcular a quantidade total e peso total de SKU's(produtos) por pedido

## Funcionalidades

- Leitura de arquivo JSON com informações de pedidos e pesos por SKU.
- Cálculo do total de SKU e peso para cada pedido.


## Pré-requisito
1. Certifique-se de ter o JDK instalado em seu ambiente.
2. Clone este repositório.
3. Certifique-se de ter um arquivo `sku.json` na raiz do projeto, seguindo o formato esperado.
4. Certifique-se de ter o jar da biblioteca gson-2.10.1 na raiz do projeto, será necessário importa-lá para dentro do projeto
5. Execute a classe `Main` para calcular os totais dos pedidos.

## Instalação da biblioteca Gson
### IntelliJ IDEA
- Baixar a Biblioteca Gson:
Baixe o arquivo JAR Gson do site oficial ou adicione-o ao seu arquivo pom.xml caso esteja usando o Maven.
- Importar a Biblioteca:
File > Project Structure (Ctrl+Alt+Shift+S) > Project Settings > Modules > Dependencies > + > Encontre o gson-2.10.1.jar que se encontra na raiz do projeto > Selecione a biblioteca > Clique em Apply

### Eclipse:
- Baixar a Biblioteca Gson:
Baixe o arquivo JAR Gson do site oficial ou adicione-o ao seu arquivo pom.xml caso esteja usando o Maven.
- Importar a Biblioteca:
Clique com o botão direito no projeto no Eclipse.
Navegue até "Build Path" > "Configure Build Path...".
Na guia "Libraries", clique em "Add External JARs...".
Selecione o gson-2.10.1.jar que se encontra na raiz do projeto e clique em "OK".
Clique em "Apply and Close" para aplicar as alterações.

## Modelo de json utilizado
```json
{
  "pedidos":{
    "pedido1":{
      "caixa1":[
        {
          "sku":"pendrive",
          "qtd":3
        }
      ],
      "caixa2":[
        {
          "sku":"mouse",
          "qtd":2
        },
        {
          "sku":"pendrive",
          "qtd":2
        }
      ]
    },
    "pedido2":{
      "caixa1":[
        {
          "sku":"pendrive",
          "qtd":2
        },
        {
          "sku":"mouse",
          "qtd":2
        },
        {
          "sku":"keyboard",
          "qtd":2
        }
      ]
    },
    "pedido3":{
      "caixa1":[
        {
          "sku":"pendrive",
          "qtd":2
        }
      ],
      "caixa2":[
        {
          "sku":"mouse",
          "qtd":2
        }
      ],
      "caixa3":[
        {
          "sku":"monitor",
          "qtd":1
        }
      ]
    }
  },
  "pesoPorSku":{
    "pendrive":50,
    "mouse":210,
    "keyboard":730,
    "monitor":3100
  }
}
```
