package voitures;

public class Garage {
	private Auto The_garage[];
	private int tailleMaxGarage;
	private int nombreAutos;

	Garage(int taille_max_garage)
	{
		this.The_garage = new Auto[taille_max_garage];
		this.nombreAutos = 0;
		this.tailleMaxGarage = taille_max_garage;
	}

	void ajouter(Auto a)
	{
		if (this.nombreAutos < this.tailleMaxGarage) {
			this.The_garage[this.nombreAutos] = a;
			this.nombreAutos++;
		}
		else System.out.println("Garage déjà saturé");
	}

	void afficher()
	{
		System.out.println("Affichage du garage");
		System.out.println();
		for(int i=0; i < this.nombreAutos; i++){
			System.out.println("   Voiture numéro "+i+" :");
			this.The_garage[i].afficher();
			System.out.println();
		}	
	}
	
	//-----------------------------------------------------------------
	
	public int f1(String m)
	{
		if(nombreAutos > 1) {
			int nbVoitures = 0;
			
			for(int i=0; i<nombreAutos; i++) {
				if(The_garage[i].getMarque().equalsIgnoreCase(m)) {
					nbVoitures++ ;
				}
			}
			return nbVoitures;
			
		}
		
		return 0;
	}

	public int f2(String m)
	{
		return 0;
	}

	public int f3()
	{
		return this.nombreAutos;
	}
	
	public boolean f4()
	{
		return true;
	}

	public int f5()
	{
		if(nombreAutos > 0) {
			int indice = 0;
			for(int i=0; i<nombreAutos; i++) {
				if(The_garage[i].getConso() < The_garage[indice].getConso()) {
					indice = i;
				}
				
			}
			return indice;
		}
		return -1;
	}

	public int f6()
	{
		return 0;
	}

	public float f7()
	{
		if(nombreAutos > 0) {
			int indice_plus = 0;
			int indice_moins = 0;
			
			for(int i=0; i<nombreAutos; i++) {
				if(The_garage[i].getPrix() < The_garage[indice_moins].getPrix()) {
					indice_moins = i;
				}
				
				if(The_garage[i].getPrix() > The_garage[indice_plus].getPrix()) {
					indice_plus = i;
				}
			}
			
			return (The_garage[indice_plus].getPrix()-The_garage[indice_moins].getPrix());
		}
		return 0.0f;
	}

	public int f8()
	{
		return 0;
	}

	public int f9()
	{
		if(nombreAutos > 0) {
			int indice = 0;
			boolean trouver = false;
			for(int i=0; i<nombreAutos; i++) {
				if(The_garage[i].getPrix() < The_garage[indice].getPrix() && The_garage[i].getNbPlaces() >= 5 && The_garage[i].getNbPortes() == 5) {
					indice = i;
					trouver = true;
				}
			}
			if(trouver)
				return indice;
			else
				return -1;
			
		}
		return -1;
	}

	public int f10(int n, int k)
	{
		return 0;
	}

}
