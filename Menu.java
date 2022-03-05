package com.mycompany.javamenu;

import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        
        Scanner sn=new Scanner(System.in);
        boolean salir = false;
        int opcion;         
        
        
        while(!salir){
            
            System.out.println("1. Cita Medica 1");
            System.out.println("2. Paciente 2");
            System.out.println("3. Doctores 3");
            System.out.println("4 Salir");
            
            
            
            System.out.println("Escriba una de las opciones");
            opcion=sn.nextInt();
            
            
            switch(opcion){
                
               case 1:
                  System.out.println("Crear una cita medica 1");
                  break;
               case 2:       
                  System.out.println("Ha selecionado la opcion 2");
                  break;   
               case 3:
                  System.out.println("Ha selecionado la opcion 3");
                  break;
               case 4:       
                  System.out.println("Ha selecionado la opcion 4");
                  break;
               default:
                 System.out.println("Solo ingresa una opcion del 1 al 4");      
                
            }
              //catch (ImputMismatchException e){
                //  System.out.println("Debe insertar un numero");
                  //2    sn.next();
                      
                      }
            
     
                    
            
            
            
            
        }
        
        
                                                            
    }
   
    
    
    
    
}
