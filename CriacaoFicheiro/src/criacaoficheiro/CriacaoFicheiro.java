/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criacaoficheiro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author CarlosMuca
 * salvadormuca7@gmail.com
 */
public class CriacaoFicheiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programa para criar, escrever e ler um ficheiro do tipo Texto(.txt)
        
           
     //---------Criar----------------------//
    try {
      File myObj = new File("Texto.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("Ficheiro ja existente.");
      }
    } catch (IOException e) {
      System.out.println("Ocorreu um Erro.");
    }
    
    //-------------Escrever----------//
      try {  
      FileWriter myWriter = new FileWriter("Texto.txt");
      myWriter.write("Documento criado em Linguagem JAVA :-)");
      myWriter.close();
      System.out.println("Linha escrita com sucesso.");
    } catch (IOException e) {
      System.out.println("Ocorreu um Erro.");
    } 
      
      //------------------Ler------------------//
      try {
      File myObj = new File("Texto.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("Ocorreu um Erro.");
      e.printStackTrace();
    }
    }
    
}
