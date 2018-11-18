package algorithmsex;

public class AlgorithmsEx 
{
    public static void main(String[] args) 
    {
        int sumaImpares=0, sumaPares=0;
	for (int n=1; n<=100; n++) 
        {
            if ((n % 2 == 0)) 
            {
                sumaPares = sumaPares + n;
            } else {
                sumaImpares = sumaImpares + n;
            } 
	}
	System.out.println("La suma de pares es: " + sumaPares);
	System.out.println("La suma de impares es: " + sumaImpares);
    }
}
