import java.util.ArrayList;

public class asdad {

	public static void main(String[] args) 
{
		
		ArrayList<Autor> autori = new ArrayList<Autor>();
		autori.add(new Autor("autor1"));
		
		Sectiune sectiunea1 = new Sectiune("Sectiunea1");
		
		sectiunea1.add(new ImageProxy("imagine"));
		sectiunea1.add(new Tabel("tabel"));
		sectiunea1.add(new Paragraf("paragraf"));
		
		Carte carte = new Carte("Carte",new Cuprins("cuprins"),autori);
		
		carte.addElement(sectiunea1);
		carte.print();
	}

}
