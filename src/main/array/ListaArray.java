package array;

import list.EstruturaElementar;

public class ListaArray implements EstruturaElementar{

    private int[] array;
    private int indice_fim;

    public ListaArray() {
    }
    @Override
    public boolean buscaElemento(int valor) {

        if (this.array!= null) {
            for(int i= 0; i<= this.indice_fim; i++) {
                if (this.array[i]== valor) {
                    return true; 
            }
      }
     }
        return false; 
    }
    @Override
    public int buscaIndice(int valor) {
       return array [valor];
    }
    @Override
    public int minimo() {
        int min = Integer.MAX_VALUE;
        for( int i = 0; i <array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    @Override
    public int maximo() {
       if(array.length== 0){
         return Integer.MIN_VALUE;
       }
         int max = array[0];
       for (int i= 0; i< array.length; i++){
         if(array[i] > max){
            max= array[i];
         }
       }
       return max;
    }
    @Override
    public int predecessor(int valor) {
       if(array.length == 0){
        return Integer.MIN_VALUE;
       } int predecessor = Integer.MIN_VALUE;
       for(int i = 0; i < array.length; i++){
         if(array[i] == valor){
            return predecessor;
         }
         predecessor = array[i];
       }
       return predecessor;
    }
    @Override
    public int sucessor(int valor) {
        for(int i= 0; i < array.length -1 ; i ++){
            if (array[i]== valor){
                return array[i + 1];
            }
        }
        return valor;
    }
    @Override
    public void insereElemento(int valor) {
       if (this.array!= null) {
            int[] espaco= new int[this.array.length + 1];

            for (int i= 0; i < this.array.length; i++) {
                espaco[i]= this.array[i];
        }
            espaco[this.array.length]= valor;
            this.array= espaco;
            indice_fim= this.array.length - 1;
        } else {
            array = new int[1];
            array[0] = valor;
            indice_fim = 0;
        }
    }
    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        if(this.array != null && buscaIndice >= 0 && buscaIndice <= this.indice_fim+1){
            int tamanhoT = this.array.length + 1;
            int[] array = new int[tamanhoT];

            for(int i = 0; i < buscaIndice; i++){
                array[i] = this.array[i];
            }
            array[buscaIndice]= valor;
        
            for(int i= buscaIndice + 1; i < tamanhoT; i++){
                array[i] = this.array[i -1];
            }
            this.array= array;
            this.indice_fim= tamanhoT -1;   
        }   
    }
    @Override
    public void insereInicio(int valor) {
        if(this.array!= null){
            int[] espaco= new int[this.array.length+1];
            for (int i= 0; i< this.array.length ; i++){
                espaco[i+1]= this.array[i];
            }
            espaco[0]= valor;
            this.array= espaco;
            this.indice_fim= this.array.length-1;
        }   else{
          array = new int[1];
          array[0] = valor;
          indice_fim = 0;
        }
    }
    @Override
    public void insereFim(int valor) {
        if (this.array!= null) {
            int[] espaco= new int[this.array.length + 1];
            for (int i= 0; i< this.array.length; i++){
                espaco[i] = this.array[i];
            }
            espaco[this.array.length]= valor;
            this.array = espaco;
            this.indice_fim = this.array.length - 1;
        } else {
            this.array= new int[1];
            this.array[0]= valor;
            this.indice_fim= 0;
        }
    }
    @Override
    public void remove(int valor) {
        if (this.array != null && valor >=0 && valor <= this.indice_fim){
        int tamanhoT = this.indice_fim;
        int[] array = new int[tamanhoT];

        for (int i= 0, j= 0; i< this.indice_fim; i++){
            if(i != valor){
                array[j++]= this.array[i];
            }
        }
        this.array = array;
        indice_fim = tamanhoT - 1;
      }     
    }
    @Override
   public void removeIndice(int indice) {
    if (this.array != null && indice >= 0 && indice <= this.indice_fim) {
        int espaco= this.indice_fim;
        int[] array= new int[espaco];

        for (int i= 0, j= 0; i<= this.indice_fim; i++) {
            if (i != indice) {
                array[j++] = this.array[i];
            }
        }
        this.array= array;
        indice_fim= espaco - 1;
    }
}
    @Override
    public void removeInicio() {
        if (this.array != null && this.indice_fim >= 0) {

            int[] array1= new int[this.array.length - 1];
            for (int i= 0; i< this.indice_fim; i++) {
                array1[i]= this.array[i + 1];
            }
            this.array= array1;
            this.indice_fim= this.array.length-1;
        }
    }
    @Override
    public void removeFim() {
        if (this.array != null && this.indice_fim >= 0) { 
            int espaco = this.array.length - 1;
            int[] array = new int[espaco];

            for (int i = 0; i < espaco; i++){
                array[i] = this.array[i];
            }
            this.array = array;
            this.indice_fim = espaco -1;
        }
    }
}
          
    