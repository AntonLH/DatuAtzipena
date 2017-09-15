import java.io.IOException;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	public static void main(String[] args) throws IOException {
		char a = 0;
		int cont=0;
		while(a!='\n'){
			a=(char) System.in.read();
			if(a!='\n') cont++;
		}
		System.out.println(cont);
	}

}
