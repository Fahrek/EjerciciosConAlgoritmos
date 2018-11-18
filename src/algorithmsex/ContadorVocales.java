package algorithmsex;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ContadorVocales 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un número de lineas: ");
        String lineas     = bf.readLine(); // Leemos el # de lineas
        int lines         = Integer.parseInt(lineas);
        char c            = ' ';
        int vocales       = 0;
        
        for (int i = 0; i < lines; i++) // Ciclo para procesar los n casos
        {
            String linea = bf.readLine(); // Leemos la linea actual
            linea = linea.toUpperCase();
            
            for (int j = 0; j < linea.length(); j++) // Ciclo para procesar la linea actual
            {
                c = linea.charAt(j); // Obtenemos un caracter
                if(esVocal(c)) // Invocamos el método que nos dice si el caracter es vocal
                {
                    vocales++;
                } // Fin condicional
            } // Fin del for interno
            System.out.print(vocales + " ");
            vocales = 0;
        } // Fin del for externo
    }
    
    public static boolean esVocal(char c)
    {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y';
    }
}
