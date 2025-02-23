
/*Copyright [2025] [Rita Barragan]
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

	/**
	 * Esta clase contiene un metodo para generar el numero pi 
	 * @author Rita
	 * @version 1.0 23/02/2025
	 */
package mates;

public class Matematicas{
    /**
     * * Genera una aproximación al número Pi mediante el método de
     * * Montecarlo. El parámetro `pasos` indica el número de puntos
     * * generado.
     * */
    public static double generarNumeroPiRecursivo(long pasos){
      if (pasos <= 0) {
        throw new IllegalArgumentException("El número de pasos debe ser mayor que cero.");
    }
    return generarNumeroPiRecursivoAux(pasos, 0, pasos);
  }

    /**
     * Método auxiliar recursivo para calcular Pi.
     * @param pasos Número total de iteraciones.
     * @param count Cantidad de puntos dentro del círculo.
     * @return Aproximación de Pi.
     */
    private static double generarNumeroPiRecursivoAux(long pasos, long count, long total_pasos) {
        if (pasos == 0) {
            return 4.0 * ((double) count / total_pasos); //usar 1 en vez de 0
        }

        //usamos el metodo Math.ramdom
        //genera dos nums aleatorios entre 0 y 1 para simular un punto en el plano (x, y).
        double x = Math.random();
        double y = Math.random();

        if ((x * x) + (y * y) < 1) {
            count++;
        }

        return generarNumeroPiRecursivoAux(pasos - 1, count, total_pasos);
    }
}

//comentarios del codigo:
//Si pasos es 0 o menor q 0, lanza un error porque no tiene sentido hacer el cálculo.
//hago metodo auxiliar que hará el calculo real, iniciando con count = 0 y guardando total_pasos
//Metodo auxiliar recursivo que hace el cálculo de Pi
//si pasos llega a 0, calcula Pi usando la fórmula: 4*(puntos dentro circulo/total puntos)
//genera dos nums aleatorios entre 0 y 1 para simular un punto en el plano (x, y).
//Verifica si el punto generado está dentro del círculo unitario:
//si x² + y² < 1, el punto está dentro, así que suma 1 a count
//hago llamada recursiva (metodo aux)
//la llamada hace: reduce pasos en 1, sigue contando cuando puntos hay dentro circulo, se repite hasta q pasos llegue a 0


//RESUMEN:
//genero puntos aleatorios (x, y) dentro de un cuadrado.
//uenta cuántos caen dentro de un círculo inscrito.
//usa la proporción puntos en el círculo / total de puntos para aproximar Pi.
//lo hace recursivamente hasta que pasos llega a 0

