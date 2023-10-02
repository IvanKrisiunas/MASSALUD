/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massalud;

import ClasesData.AfiliadoData;

/**
 *
 * @author Monica
 */
public class MasSalud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Conexion EXP = new Conexion();
        Conexion.getConexion();
        Afiliado a = new Afiliado("Ivan", "Krisiunas", 43986497, true, "Belgrano 234", 1135990317);
        AfiliadoData ad = new AfiliadoData();
        
        ad.guardarAfiliado(a);
    }
    
}
