# 🚗 Aplicativo Álcool ou Gasolina
![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white) ![Android Studio](https://img.shields.io/badge/android%20studio-346ac1?style=for-the-badge&logo=android%20studio&logoColor=white)

Aplicativo desenvolvido para ajudar os motoristas a decidirem se é mais vantajoso abastecer o carro com álcool ou gasolina com base no preço de ambos os combustíveis. A lógica é a seguinte:

- O aplicativo calcula a razão entre o preço do litro do álcool e o preço do litro da gasolina.
- Caso a razão (preço do álcool / preço da gasolina) seja menor ou igual a 0,7, é mais vantajoso abastecer com álcool.
- Caso contrário, é mais vantajoso abastecer com gasolina.

## 📱 Funcionalidades
- **Entrada de dados**: O usuário insere o preço do litro de álcool e gasolina.
- **Cálculo**: O aplicativo calcula a relação entre os preços.
- **Resultado**: O app informa qual combustível é mais vantajoso de acordo com o cálculo.

## 📙 Conhecimentos
Este aplicativo foi criado com o objetivo de praticar o uso do **Kotlin** e o conceito de **Intents** no Android para realizar a troca entre **Activitys**. Além disso, também envolveu o uso de **View Components** como **EditText**, **Button** e **TextView** para a interação com o usuário. Este projeto foi desenvolvido com fins de estudo, visando aprimorar habilidades no desenvolvimento de aplicativos Android.

## 📊 Diagrama de fluxo:

```mermaid
flowchart TD
    A[Início] --> B[Inserir preço do Álcool]
    B --> C[Inserir preço da Gasolina]
    C --> D[Calcular razão: Álcool / Gasolina]
    D --> E{Razão <= 0.7?}
    E -->|Sim| F[Mais vantajoso: Álcool]
    E -->|Não| G[Mais vantajoso: Gasolina]
    F --> H[Fim]
    G --> H
```
## 🧑‍💻 Contato
Entre em contato! 😁

**Bruno Vivian Carvalho**

[![Linkedin Badge](https://img.shields.io/badge/-LinkedIn-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/bvcarvalho/)](https://www.linkedin.com/in/bvcarvalho/)
