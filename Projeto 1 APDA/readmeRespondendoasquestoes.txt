Projeto e Análise de Algoritmo


Considere uma situação em que você está desenvolvendo um sistema de gerenciamento de estoque para um armazém. A lista de produtos no estoque é extensa e está ordenada pelo nome do produto. Cada produto tem um identificador único.

Desenvolvimento do Projeto:
Desenvolva um algoritmo eficiente para calcular a complexidade de tempo no pior caso para a busca de um produto no estoque. Considere que a busca será realizada pelo nome do produto. Justifique sua resposta e discuta como a ordem influencia na performance do algoritmo.
Implemente um algoritmo de ordenação que mantenha a lista de produtos do estoque sempre ordenada. Explique como seu algoritmo funciona e por que você escolheu essa abordagem específica para ordenar a lista.












Desenvolva um algoritmo de busca binária que aproveite a ordenação alfabética da lista de produtos. 
O algoritmo deve receber como entrada o nome do produto a ser localizado e retornar o identificador único desse produto, caso exista no estoque. 
Explique como seu algoritmo funciona e justifique por que a busca binária é apropriada neste contexto.

"Meu algorítimo funciona criando sublistas da minha lista principal de produtos de forma recursiva, dessa forma:

caso o nome do produto seja alfabeticamente igual que o produto médio da lista então ele é o que eu estava procurando
caso o array inicial fique maior que o final, então o produto não está na lista
caso o nome do produto seja alfabeticamente menor que o produto médio da lista então ele cria uma sublista (inícioDaLista, ProdutoMédio-1)
caso o nome do produto seja alfabeticamente maior que o produto médio da lista então ele cria uma sublista (produtoMédio+1, finalDaLista)

A busca binária é apropriada nesse contexto pois como a lista estará ordenada, a busca binária será bem mais rápida no pior caso que uma busca sequencial"














Suponha que, ao analisar o desempenho do sistema de gerenciamento de estoque, você percebe que a busca linear está sendo frequentemente utilizada para buscar produtos com nomes similares.
Proponha uma otimização para o algoritmo de busca que permita encontrar produtos que começam com uma determinada letra de forma mais eficiente, aproveitando a ordenação alfabética da lista.

"Uma busca binária no subarray dos produtos que começam com aquela letra"












Análise de Caso Médio:
Considere que, em média, 80% das buscas no sistema são para produtos que estão entre as 100 primeiras posições alfabéticas.
Proponha uma estratégia que tire proveito desse padrão para melhorar o desempenho do algoritmo de busca. 
Implemente a estratégia e um novo algoritmo e explique como ela otimiza a busca para casos médios

"Uma boa ideia seria implemente uma nova busca binária para os 100 primeiros elementos, e somente caso o elemento não estivesse nessa lista o programa deveria buscar na lista dos excedentes
Dessa maneira:

int a = binarySearch(listaDeProdutos, "zinco", 0, 100);
        if(a == -1){

            a = binarySearch(listaDeProdutos, "zinco", 0, listaDeProdutos.size()-1);
            
           if( a == -1){
               System.out.println("elemento não encontrado");
           }
           
            else{
            System.out.println("cobalto está na posição " + a);
            }
        }
        else{
            System.out.println("cobalto está na posição " + a);
        }

"

