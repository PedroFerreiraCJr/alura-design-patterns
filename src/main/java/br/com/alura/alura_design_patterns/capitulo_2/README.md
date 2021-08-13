## Este capítulo implemnta o design pattern Chain Of Responsability.
A regra a ser implementada dessa vez é a regra de descontos. Dado um orçamento, este pode estar ou não elegível a receber um desconto.

## Regras
1. Se o orçamento tiver mais que cinco (5) itens, recebe desconto de 10%.
2. Se o orçamento tiver valor acima de quinhentos reais (R$ 500.0), aplica desconto de 7%;

## Explicação da Solução
Uma cadeia de execuções buscando pelo desconto que deve ser aplicado conforme a regra que se aplica. Cada nó da cadeia tem uma condição para ser aplicado, e caso uma condição for atendida, o resultado, que é o desconto deve ser calculado. Também devemos pensar na condição em que nenhuma regra se aplica, portanto, não havendo desconto.