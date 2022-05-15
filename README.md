# Exercício pertencente a disciplina de Engenharia de Software III

## Design Patterns - Strategy

Considere uma aplicação feita para calcular impostos urbanos nas cidades do país. O cálculo não é muito complexo, mas varia de cidade para cidade. Inicialmente, se fará para São Paulo, Belo Horizonte, Porto Alegre e Curitiba.


- São Paulo -> Imposto = área total x 10 + número de cômodos x 2;


- Belo Horizonte -> Imposto = área total x 7 + número de quartos x 4;


- Porto Alegre -> Imposto = área total x 7,5 + área garagem x 2,5;
    - Se não houver garagem -> Imposto = área totoal x 8.


- Curitiba -> Imposto = área total x 5.
     - Se idade do imóvel > 50 anos, somar idade x 3;
     - Se idade do imóvel < 20 anos, somar idade x 2;
     - Se 20 anos > idade imóvel > 50 anos, somar idade x 2,5.

