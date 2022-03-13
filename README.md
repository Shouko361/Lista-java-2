# Lista-java2

### Lista de atividades java.

<p>
Exercício 1) Fazer um programa para calcular o fatorial de um número. Para se calcular o fatorial 
de um número, é necessário multiplicar ele por todos os seus antecessores até chegar número 1. 
Exemplo: para calcular o fatorial de 5 é necessário multiplicar 5 x 4 x 3 x 2 x 1.
</p>
<p>
Exercício 2) Fazer um programa para que o usuário entre com um número inteiro. Após isso, o 
programa deve calcular o termo correspondente da sequência de Fibonacci. 
Primeiros números da sequência: 0, 1, 1, 2, 3, 5 ...
Para se calcular o próximo termo da sequência de Fibonacci, é necessário somar os dois termos 
anteriores.
</p>
<p>
Exercício 3) Muitos não sabem, mas o Real não foi a única moeda que circulou pelo Brasil. Antes 
do plano Real (1994-atualmente), o nome da nossa moeda era Cruzeiro Real (1993-1994) e antes 
disso era o Cruzeiro (1990-1993). Criar um programa que converta uma quantia em Real, para 
Cruzeiro Real e Cruzeiro.
Para transformar o Real em Cruzeiro Real, basta multiplicar o valor em reais por 2.750.
Para transformar o Cruzeiro Real em Cruzeiro, basta multiplicar o valor por 1.000.
</p>
<p>
Exercício 4) Fazer um programa para validar o CPF inserido pelo usuário é válido. O CPF é um 
número composto por 11 dígitos, em que os 2 últimos são dígitos verificadores.
O número do CPF é escrito na forma ABCDEFGHI/JK ou diretamente como ABCDEFGHIJK, onde 
os algarismos não podem ser todos iguais entre si.
O J é chamado 1° dígito verificador do número do CPF.
O K é chamado 2° dígito verificador do número do CPF.
Para se calcular o primeiro dígito:
Para obter J multiplicamos A, B, C, D, E, F, G, H e I pelas constantes correspondentes:
A B C D E F G H I
x10 x9 x8 x7 x6 x5 x4 x3 x2
O resultado da soma, 10A + 9B + 8C + 7D + 6E + 5F + 4G + 3H + 2I, é dividido por 11.
Analisamos então o RESTO dessa divisão:
Se for 0 ou 1, o dígito J é [0] (zero). Se for 2, 3, 4, 5, 6, 7, 8, 9 ou 10, o dígito J é [11 - RESTO]
Para calcular o segundo dígito:
Já temos J. Para obter K multiplicamos A, B, C, D, E, F, G, H, I e J pelas constantes 
correspondentes:
A B C D E F G H I J
x11x10x9 x8 x7 x6 x5 x4 x3 x2
O resultado da soma, 11A + 10B + 9C + 8D + 7E + 6F + 5G + 4H + 3I + 2J, é dividido por 11.
Verificamos então o RESTO dessa divisão:
Se for 0 ou 1, o dígito K é [0] (zero). Se for 2, 3, 4, 5, 6, 7, 8, 9 ou 10, o dígito K é [11 - RESTO]
</p>
