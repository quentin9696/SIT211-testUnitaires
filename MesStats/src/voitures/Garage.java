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
		return 0;
	}

	public int f2(String m)
	{
		return 0;
	}

	public int f3()
	{
		return 0;
	}
	
	public boolean f4()
	{
		return true;
	}

	public int f5()
	{
		return 0;
	}

	public int f6()
	{
		return 0;
	}

	public float f7()
	{
		return 0;
	}

	public int f8()
	{
		return 0;
	}

	public int f9()
	{
		return 0;
	}

	public int f10(int n, int k)
	{
		return 0;
	}

}
