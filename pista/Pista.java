package pista;

public class Pista {
	
	public void GenerarPista(String carro, String com)
	{
		String[][] pista = new String[5][7]; //definicion de la pista
		String delim = ";";
		String[] temp;
		temp = com.split(delim);
		
		for (int i = 0; i < temp.length; i++)
		{
			System.out.println(temp[i]);
		}
				
		pista[0][0] = carro;
		
		System.out.println(carro + " está en la posición "+ temp[0] +  " verguin");
		
		
	}
	
	public String IngresarComando (String com)
	{
		return com;
	}
	
	/*public void Resultado(int num1, int num2)
	{
		int res;
		
		res = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + res);
	} */

}
