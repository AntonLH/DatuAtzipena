import java.util.StringTokenizer;


public class anton_larrazabal_adibidea5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//String Tokenizer erabiliz nire izena alde batetik eta abizenak bestetik
		String izena="Antón Larrazabal Hidalgo";
		StringTokenizer tokens=new StringTokenizer(izena);
		while(tokens.hasMoreTokens()){
            System.out.println(tokens.nextToken());
        }
		
		//Split erabiliz berdina
		String izenabizena="Antón, Larrazabal Hidalgo";
		String[] izenabizenak = izenabizena.split(",");
		String izena2 = izenabizenak[0];
		String abizenak = izenabizenak[1];
		System.out.println("Izena:"+izena2+"\nAbizenak:"+abizenak);
		
		//IndexOf erabiliz ikusi zein karakterean hasten den lehenengo abizena
		System.out.println(izenabizena.indexOf("Larrazabal"));
		
		//IndexOf eta subString erabiliz bakarrik abizenak atera pantailatik
		System.out.println(izenabizena.substring(izenabizena.indexOf("Larrazabal")));
		
		//Trim erabiliz hasierako eta amaierako espazioak kendu
		String trimproba="     Antón      ";
		System.out.println(trimproba.trim());
	}
}
