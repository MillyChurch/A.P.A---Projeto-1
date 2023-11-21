
package projeto.pkg1.apda;

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Collections;

/**
 *
 * @author aluno
 */
public class Armazem {

    public static ArrayList<Produto> sortProdutos(ArrayList<Produto> listaDeProdutos){
    
       try{
            File listaDeProdutosFonte = new File("produtos.txt");
            Scanner scanFile = new Scanner(listaDeProdutosFonte);
   
            while(scanFile.hasNextLine()){
                    
                String obj = scanFile.nextLine();
                String[] arrayDeStrings = obj.split(";", 2);
                Produto produto = new Produto(arrayDeStrings[0], Integer.parseInt(arrayDeStrings[1]));
                listaDeProdutos.add(produto);
                
                }
                if(listaDeProdutos.size() > 1 ){
                
                    for(int i = 0; i<listaDeProdutos.size(); i++){
                    
                        for(int j = i+1 ; j < listaDeProdutos.size(); j++ ){

                            if (listaDeProdutos.get(i).nome.compareTo(listaDeProdutos.get(j).nome) > 0){
                               listaDeProdutos.add(i, listaDeProdutos.get(j));
                               listaDeProdutos.remove(j+1); 
                               
                               //Alternativamente: Collections.swap(listaDeProdutos, i, j); 
                            } 
                        } 
                    }
                }    
        }
        
        catch(FileNotFoundException e) {
            System.out.println("An error occurred. aaa");
        }
       
       return listaDeProdutos;
    }
    
    public static int binarySearch(ArrayList<Produto> listaDeProdutos, String nomeBuscado, int arrayStart, int arrayFinish){
        
        int meio = (arrayStart + arrayFinish)/2;                                                                                                                                    
        
        if(nomeBuscado.compareTo(listaDeProdutos.get(meio).nome) == 0){  
            return meio;
        }
        else if(arrayStart >= arrayFinish){
            System.out.println(meio);
            return -1;
        }
        
        //> 0: segunda é maior que a primeira -------- < 0: primeira é maior que a segunda
        
        //Nome buscado > lista(meio)
        else if (nomeBuscado.compareTo(listaDeProdutos.get(meio).nome) > 0){ 
            return binarySearch(listaDeProdutos, nomeBuscado, meio+1, arrayFinish);
        }
        
        //Nome buscado < lista(meio)
        else if (nomeBuscado.compareTo(listaDeProdutos.get(meio).nome) < 0){
            return binarySearch(listaDeProdutos, nomeBuscado, arrayStart, meio-1);
        }
        
        return -1;
    }
    
    
    
    
    public static void main(String[] args) {
        
        ArrayList<Produto> listaDeProdutos = new ArrayList();
        listaDeProdutos = sortProdutos(listaDeProdutos);
        
        
        for(int k =0; k<8;k++){
            System.out.println( listaDeProdutos.get(k).nome + " " + listaDeProdutos.get(k).codigo  );
        }
        
         int a = binarySearch(listaDeProdutos, "zinco", 0, listaDeProdutos.size()-1);
        
        /*
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
        */

        if(a<0){
            System.out.println("elemento não encontrado");
        }
        else{
            System.out.println("cobalto está na posição " + a);
        }
        
    }
    
}
