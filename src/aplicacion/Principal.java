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
package aplicacion;

import mates.Matematicas;
/**
		 * Inicializa el metodo de matematicas con el parametro que le pasamos
		 * @param args El numero de pasos que va a dar
		 */

public class Principal{
    public static void main(String[] args){
        System.out.println("El número PI es " +
                Matematicas.generarNumeroPiRecursivo(Integer.parseInt(args[0])));
    }
}


//PARA VER EL NUMER PI POR PANTALLA HAGO:
//javac -d bin src/aplicacion/Principal.java src/mates/Matematicas.java

