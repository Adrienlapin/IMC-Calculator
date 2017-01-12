package IMC;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	public static void main(String[] args){
Personne p1 = new Personne();
p1.poids = 88;
p1.taille = 1.85;
p1.sexe = true;

System.out.println(p1.IMC());
System.out.println(p1.diagnostic());
System.out.println(p1.poidsMax());
System.out.println(p1.poidsMin());
System.out.println(p1.poidsIdeal());


	}
	
}
