package display;

import test.*;
import annotation.*;
import utilitaire.Util;
public class Main {
    public static void main( String [] args ) throws Exception {
        Util util = new Util();
        System.out.println("Tous les annotations");
        for ( int i = 0; i < util.getAllAnnotation().size(); i++) {
            System.out.println(util.getAllAnnotation().get(i));
        }
    }
}
