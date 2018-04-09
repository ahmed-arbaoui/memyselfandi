package com.aar.test;
 
import java.util.Scanner;
 
public class GivingChange {
 
   /**
    * @param args
    */
   public static void main(String[] args) {
       
      final int[] valeursFaciales = 
         { 500, 200, 100, 50, 20, 10, 5, 2, 1 };
       
      Scanner scanner = new Scanner(System.in);
       
      // Saisie du montant
       
      System.out.print("Entrez le montant: ");
      int montant = scanner.nextInt();
       
      // Decoupage 
       
      int[] nombres = decoupage(valeursFaciales, montant);
       
      // Output the result
       
      for (int i=0; i<valeursFaciales.length; i++) {
         if (nombres [i]>0) {
            System.out.println(nombres[i]+" x "+valeursFaciales[i]);
         }
      }
   }
 
   private static int[] decoupage(int[] valeursFaciales, int montant) {
      int[] nombres = new int[valeursFaciales.length];
       
      // On boucle sure les valeurs faciales en partant de la plus grande
       
      for (int i=0; i<valeursFaciales.length; i++) {
          
         while (montant>=valeursFaciales[i]) {
            nombres[i]++;
            montant -= valeursFaciales[i];
         }
      }
 
      return nombres;
   }
 
}
