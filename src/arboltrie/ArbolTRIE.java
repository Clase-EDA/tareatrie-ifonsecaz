/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arboltrie;

import java.util.ArrayList;

/**
 *
 * @author hca
 */
public class ArbolTRIE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ATrie a=new ATrie();
        ArrayList<String> res;
        
        a.insertaRe("anti");
        a.insertaRe("abs");
        a.insertaRe("abbs");
        a.insertaRe("fer");
        /*System.out.println(a.borra("ab"));
        System.out.println(a.buscaRe("abs"));
        System.out.println(a.buscaRe("fer"));
        System.out.println(a.buscaRe("anti"));
        System.out.println(a.borra("abs"));
        System.out.println(a.buscaRe("abs"));
        System.out.println(a.buscaRe("abbs"));
        System.out.println(a.borra("fer"));
        System.out.println(a.buscaRe("fer"));
*/
        res=a.ordenamientoLexicografico();
        
        System.out.println(res);
    }
}
