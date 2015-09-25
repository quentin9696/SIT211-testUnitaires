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
		if (nombreAutos == 0)
			return 0;
		int compteur = 0;
		for(int i=0; i<nombreAutos; i++) {
			auto a = The_garage[i];
			if (a.getMarque.equalsIgnoreCase(m))
				compteur++;

		}	
		return compteur;
	}

	public int f3()
	{
		return this.nombreAutos;
	}
	
	public boolean f4()
	{
		return this.nombreAutos == 0;
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
		float max = 0;
		int indice = 0;
		int indice_saved = -1;
		if (nombreAutos == 0)
			return -1;
		for (int i =0; i < nombreAutos; i++) {
			auto a = The_garage[i];
			float temp = a.getPrix();
			if (a > max)
			{
				a = max;
				indice_saved = indice;
			}
			indice++;

		}
		return indice_saved;
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
		if (nombreAutos == 0)
			return 0;
		int km = 0;
			for(int i=0; i<nombreAutos; i++) {
			auto a = The_garage[i];
			km += a.getKilometrage;

		}

		return (km / this.nombreAutos);
	
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
float min = this.The_garage[0].getKilometrage();
		int indice = 0, indice_saved = -1;
		if (nombreAutos == 0)
			return -1;
			for(int i=0; i<nombreAutos; i++) {
			auto a = The_garage[i];
			if a.getNbPortes() >= n && a.getKilometrage() < k
					{
				if (a.getKilometrage() < min)
				{
					min = a.getKilometrage();
					indice_saved = indice;
					
				}
				
					}
			indice++;
		}
		return indice_saved;	
		
		}

}
