package projetdejava;


import java.util.Scanner;


public class Main {
    public static int produit (int a ,int b)
    {
    return a*b;
    }
    public static int somme(int a,int b)
    {
    return a+b;
    }  
    public static int fact(int nb)
    { 
    if(nb==0) return 1;
    else return nb*fact(nb-1);
    }
    
    //***********************************
    
    public static boolean exsiste(char a)
    {   
    if(a>='0' && a<='9') return true;
    else return false;
    } 
    
    //***********************************
    
    public static int  verifier(String chaine)//simple fonction pour verifier que la chaine saisie est un nombre entier
    {
    int i=0;
    while(i<chaine.length())
    {
    
    if(exsiste(chaine.charAt(i))!=true)
    	return 0;
    else 
    	i++;
    }
    return 1; 
    } 
    
   
    
    //***********************************
    
    public static void afficher(int nb)//fonctionpour afficher un motif(carre d'étoiles)
    {
    if(nb>20) {
    	System.out.println("nombre tres grand");
    	
    }
    else {
    for(int i=0;i<nb;i++)
    {
    	for(int j=0;j<nb;j++)
    	{
    		System.out.print("x");
    		try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println("continuons");
			}
    	}
    	System.out.println();
    
    }
    }
    }
    
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    try {
    System.out.println("saisir un entier:");
   String nb=sc.nextLine();
   if(nb=="")
	   System.out.println("valeur vide");
   else 
   afficher(Integer.parseInt(nb));
   if(Integer.parseInt(nb)<15)
   System.out.println("le factorielle de ce nombre est:"+fact(Integer.parseInt(nb)));
   else {
	   System.out.println("le nombre peut causer des problemes");}
    }catch (Exception e) { 
		System.out.println("erreur de saisie "); 
	}
   sc.close();
	System.out.println("fin du programme(java)!!!"); 
	} 
} 