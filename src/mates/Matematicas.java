
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
      return generarNumeroPiRecursivoAux(pasos, 0);
    }

    /**
     * Método auxiliar recursivo para calcular Pi.
     * @param pasos Número total de iteraciones.
     * @param count Cantidad de puntos dentro del círculo.
     * @return Aproximación de Pi.
     */
    private static double generarNumeroPiRecursivoAux(long pasos, int count) {
        if (pasos == 0) {
            return 4.0 * ((double) count / pasos);
        }

        //usamos el metodo Math.ramdom
        double x = Math.random();
        double y = Math.random();

        if ((x * x) + (y * y) < 1) {
            count++;
        }

        return generarNumeroPiRecursivoAux(pasos - 1, count);
    }
}

//comentarios del codigo:
//
