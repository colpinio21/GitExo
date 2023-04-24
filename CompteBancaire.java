import java.util.*;

public class CompteBancaire {
	
	public static void main (String args []){
	
	
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	
	 String[][]tabCompte = new String [0][9];
	 String[][]tabAgence = new String [0][3];
	 String[][]tabClient = new String [0][5];
	
	for(;;){
	System.out.println(" -------Menu Principal----- ");
    System.out.println("1- Creer une agence");
    System.out.println("2- Creer un client");
    System.out.println("3- Creer un compte  bancaire");
    System.out.println("4- Recherche de compte");
	System.out.println("5- Recherche de client");
    System.out.println("6- Afficher la liste de comptes d un client");
    System.out.println("7- Imprimer les informations client");
    System.out.println("8- Quitter le programme");
	
	System.out.print("faites votre choix :");
	int choixUtilisateur = sc.nextInt();

	
		if(1==choixUtilisateur){
			
			String [][]tmp = new String[tabAgence.length +1][3];
			for(int i = 0;i < tabAgence.length;i++){
				for (int j = 0; j < tabAgence[i].length; j++){
					tmp[i][j] = tabAgence[i][j];
				}					
			}
			System.out.print("Code Agence :");
			tmp[tmp.length-1][0] = sc.next();
			System.out.println("Nom Agence :");
			tmp[tmp.length-1][1] = sc.next(); 
			System.out.println("Adresse Agence :");
			tmp[tmp.length-1][2] = sc.next(); 
			
			tabAgence = tmp;
			
			System.out.println("Code Agence = "+tmp[tmp.length-1][0]);
			System.out.println("Nom Agence  = "+tmp[tmp.length-1][1]);
			System.out.println("Adresse agence = "+tmp[tmp.length-1][2]);
			
		}

		else if(2==choixUtilisateur){
			String [][]tmp = new String[tabClient.length +1][5];
			for(int i = 0;i < tabClient.length;i++){
				for (int j = 0; j < tabClient[i].length; j++){
					tmp[i][j] = tabClient[i][j];
				}
			}
			System.out.print("Identifiant client :");
			tmp[tmp.length-1][0] = sc.next();
			System.out.print("Nom client :");
			tmp[tmp.length-1][1] = sc.next(); 
			System.out.print("Prenom client :");
			tmp[tmp.length-1][2] = sc.next(); 
			System.out.print("date de naissance client :");
			tmp[tmp.length-1][3] = sc.next(); 
			System.out.print("e mail client :");
			tmp[tmp.length-1][4] = sc.next(); 
			
			tabClient = tmp;
		
			System.out.println("Identifiant client = "+tmp[tmp.length-1][0]);
			System.out.println("Nom client  = "+tmp[tmp.length-1][1]);
			System.out.println("Prenom client  = "+tmp[tmp.length-1][2]);
			System.out.println("Date de naissance client  = "+tmp[tmp.length-1][3]);
			System.out.println("E mail client  = "+tmp[tmp.length-1][4]);
		}
		
		if(3==choixUtilisateur){
			//creer un compte
			
			String [][]tmp = new String[tabCompte.length +1][9];
			for(int i = 0;i < tabCompte.length;i++){
				for (int j = 0; j < tabCompte[i].length; j++){
					tmp[i][j] = tabCompte[i][j];
				}					
			}
		
			System.out.print("Numero de compte :");
			tmp[tmp.length-1][0] = sc.next(); 
			System.out.print("Code Agence :");
			tmp[tmp.length-1][1] = sc.next(); 
			System.out.print("Identifiant client :");
			tmp[tmp.length-1][2] = sc.next(); 
			System.out.print("Nom  client :");
			tmp[tmp.length-1][3] = sc.next(); 
			System.out.print("Prenom client :");
			tmp[tmp.length-1][4] = sc.next(); 
			System.out.print("Date de naissance client :");
			tmp[tmp.length-1][5] = sc.next(); 
			System.out.print("E mail client :");
			tmp[tmp.length-1][6] = sc.next(); 
			System.out.print("solde :");
			tmp[tmp.length-1][7] = sc.next(); 
			System.out.print("Decouvert autorise:");
			tmp[tmp.length-1][8] = sc.next(); 
		
			tabCompte = tmp;
			
			System.out.println("Numero de compte = "+tmp[tmp.length-1][0]);
			System.out.println("Code Agence  = "+tmp[tmp.length-1][1]);
			System.out.println("Identifiant client = "+tmp[tmp.length-1][2]);
			System.out.println("Nom client  = "+tmp[tmp.length-1][3]);
			System.out.println("Prenom client  = "+tmp[tmp.length-1][4]);
			System.out.println("Date de naissance client  = "+tmp[tmp.length-1][5]);
			System.out.println("E mail client  = "+tmp[tmp.length-1][6]);
			System.out.println("solde = "+tmp[tmp.length-1][7]);
			System.out.println("Decouvert autorise = "+tmp[tmp.length-1][8]);
		}
		
		if(4==choixUtilisateur){
				System.out.println("entrer le numero de copmte:");
				String numCompte = sc.next();
				for(int j= 0; j < tabCompte.length ; j++){
				
					if(numCompte==tabAgence[j][0]){
					System.out.println(tabCompte[j][0]);
					}
					else{
					System.out.println("le compte existe");
					}
				}	
		}
		//recherche client
		if(5==choixUtilisateur){}
		
		//Afficher la liste compte
		if(6==choixUtilisateur){}
		
		//Imprimer les infos client
		if(7==choixUtilisateur){}

		//Quitter le programme
		if(8==choixUtilisateur){
				sc.close();
				break;
				
			} 
		else
				{
		//System.out.println("Votre choix n'existe pas");
				}
			
	}
	System.out.println("Meci pour votre visite");
	

		
		
	}
}
	


	
	
	
	
	
	
	
	
	
	
	
	
	

		




