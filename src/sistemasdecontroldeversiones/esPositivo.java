/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemasdecontroldeversiones;

/**
 *
 * @author Hogar
 */
public class esPositivo {
    
    private int num;

    public esPositivo(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
//    
    
    public boolean esMultiploDe(int x){
        
        return num%x==0;
    }
}
