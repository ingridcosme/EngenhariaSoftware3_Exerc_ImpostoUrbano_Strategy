# Exerc�cio pertencente a disciplina de Engenharia de Software III

## Design Patterns - Strategy

Considere uma aplica��o feita para calcular impostos urbanos nas cidades do pa�s. O c�lculo n�o � muito complexo, mas varia de cidade para cidade. Inicialmente, se far� para S�o Paulo, Belo Horizonte, Porto Alegre e Curitiba.


- S�o Paulo -> Imposto = �rea total x 10 + n�mero de c�modos x 2;


- Belo Horizonte -> Imposto = �rea total x 7 + n�mero de quartos x 4;


- Porto Alegre -> Imposto = �rea total x 7,5 + �rea garagem x 2,5;
    - Se n�o houver garagem -> Imposto = �rea totoal x 8.


- Curitiba -> Imposto = �rea total x 5.
     - Se idade do im�vel > 50 anos, somar idade x 3;
     - Se idade do im�vel < 20 anos, somar idade x 2;
     - Se 20 anos > idade im�vel > 50 anos, somar idade x 2,5.

