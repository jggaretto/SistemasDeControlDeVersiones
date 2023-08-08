/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasdecontroldeversiones;

/**
 *
 * @author wbasa
 */
public class Mostrar {

    private String prueba = "Sistemas de Control de Versiones";

    public Mostrar() {
    }

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }



    public void mostrar() {
        System.out.println( prueba);

    }

}
