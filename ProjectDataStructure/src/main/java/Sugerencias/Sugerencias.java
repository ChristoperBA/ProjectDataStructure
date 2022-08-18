
package Sugerencias;


public class Sugerencias {
    private NodeSugerencia root;
    private int altura;
    
    public void inserta(String value){
        if(root==null){
            root= new NodeSugerencia(value);
            
        }else{
            insertar(root,value);
        }
    }
    public void insertar(NodeSugerencia nodo,String value){
    
    if((nodo.getChildLeft()==null)){
        if(nodo.getChildLeft()==null){
        nodo.setChildLeft(new NodeSugerencia(value));
        }
        else{
        insertar(nodo.getChildLeft(),value);
        
        }
    }
    else{
        if(nodo.getChildRigth()==null){
            nodo.setChildRigth(new NodeSugerencia(value));
            }else{
            insertar(nodo.getChildRigth(),value);

            }
    
    }   
    }
    public void InOrden(){
        if (root!=null){
            inOrdenRecorrer(root);
            

        }else{
            System.out.print("Arbol esta vacio");
        }
    }
    private void inOrdenRecorrer(NodeSugerencia nodo){
     if(nodo!=null){
         inOrdenRecorrer(nodo.getChildLeft());
         System.out.print(nodo.getSugerencia()+"\n");
         
         inOrdenRecorrer(nodo.getChildRigth());
     }
    }
}
