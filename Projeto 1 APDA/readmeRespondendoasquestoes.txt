Projeto e An�lise de Algoritmo


Considere uma situa��o em que voc� est� desenvolvendo um sistema de gerenciamento de estoque para um armaz�m. A lista de produtos no estoque � extensa e est� ordenada pelo nome do produto. Cada produto tem um identificador �nico.

Desenvolvimento do Projeto:
Desenvolva um algoritmo eficiente para calcular a complexidade de tempo no pior caso para a busca de um produto no estoque. Considere que a busca ser� realizada pelo nome do produto. Justifique sua resposta e discuta como a ordem influencia na performance do algoritmo.
Implemente um algoritmo de ordena��o que mantenha a lista de produtos do estoque sempre ordenada. Explique como seu algoritmo funciona e por que voc� escolheu essa abordagem espec�fica para ordenar a lista.












Desenvolva um algoritmo de busca bin�ria que aproveite a ordena��o alfab�tica da lista de produtos. 
O algoritmo deve receber como entrada o nome do produto a ser localizado e retornar o identificador �nico desse produto, caso exista no estoque. 
Explique como seu algoritmo funciona e justifique por que a busca bin�ria � apropriada neste contexto.

"Meu algor�timo funciona criando sublistas da minha lista principal de produtos de forma recursiva, dessa forma:

caso o nome do produto seja alfabeticamente igual que o produto m�dio da lista ent�o ele � o que eu estava procurando
caso o array inicial fique maior que o final, ent�o o produto n�o est� na lista
caso o nome do produto seja alfabeticamente menor que o produto m�dio da lista ent�o ele cria uma sublista (in�cioDaLista, ProdutoM�dio-1)
caso o nome do produto seja alfabeticamente maior que o produto m�dio da lista ent�o ele cria uma sublista (produtoM�dio+1, finalDaLista)

A busca bin�ria � apropriada nesse contexto pois como a lista estar� ordenada, a busca bin�ria ser� bem mais r�pida no pior caso que uma busca sequencial"














Suponha que, ao analisar o desempenho do sistema de gerenciamento de estoque, voc� percebe que a busca linear est� sendo frequentemente utilizada para buscar produtos com nomes similares.
Proponha uma otimiza��o para o algoritmo de busca que permita encontrar produtos que come�am com uma determinada letra de forma mais eficiente, aproveitando a ordena��o alfab�tica da lista.

"Uma busca bin�ria no subarray dos produtos que come�am com aquela letra"












An�lise de Caso M�dio:
Considere que, em m�dia, 80% das buscas no sistema s�o para produtos que est�o entre as 100 primeiras posi��es alfab�ticas.
Proponha uma estrat�gia que tire proveito desse padr�o para melhorar o desempenho do algoritmo de busca. 
Implemente a estrat�gia e um novo algoritmo e explique como ela otimiza a busca para casos m�dios

"Uma boa ideia seria implemente uma nova busca bin�ria para os 100 primeiros elementos, e somente caso o elemento n�o estivesse nessa lista o programa deveria buscar na lista dos excedentes
Dessa maneira:

int a = binarySearch(listaDeProdutos, "zinco", 0, 100);
        if(a == -1){

            a = binarySearch(listaDeProdutos, "zinco", 0, listaDeProdutos.size()-1);
            
           if( a == -1){
               System.out.println("elemento n�o encontrado");
           }
           
            else{
            System.out.println("cobalto est� na posi��o " + a);
            }
        }
        else{
            System.out.println("cobalto est� na posi��o " + a);
        }

"

