package Principal;

import AccesoADatos.AfiliadoData;
import java.util.Scanner;

public class Depuracion {

    public static void main(String[] args) {
        int opción;
        Conexion EXP = new Conexion();
        Conexion.getConexion();
        textoMenú();
        Scanner s = new Scanner(System.in);
        opción = s.nextInt();
        int dni1;
        dni1 = s.nextInt();
        Afiliado a = new Afiliado("carlitos", "tevez", 115555677, true, "Calle 123", 1112345678);
        AfiliadoData ad = new AfiliadoData();

        switch (opción) {
            case 1:
                ad.listarAfiliados();
                break;
            case 2:
                ad.añadirAfiliado(a);
                break;
            case 3:
                ad.modificarAfiliado(a);
                break;
            case 4:

                ad.eliminarAfiliado(dni1);
                break;
            case 5:
            //Añadir órdenes
            case 6:
            //Quitar órdenes
            case 7:
            //Listar prestadores
            case 8:
            //Añadir prestadores
            case 9:
            //Quitar prestadores
            case 10:
            //Listar especialidades
            case 11:
            //Añadir especialidades
            case 12:
            //Quitar especialidades
        }
    }

    public static void textoMenú() {
        System.out.println("==== Menú de depuración ====" + "\n"
                + "=== Afiliados ===" + "\n"
                + "1 - Listar afiliados" + "\n"
                + "2 - Agregar afiliados" + "\n"
                + "3 - Quitar afiliados" + "\n"
                + "=== Órdenes ===" + "\n"
                + "4 - Listar órdenes" + "\n"
                + "5 - Agregar órdenes" + "\n"
                + "6 - Quitar órdenes" + "\n"
                + "=== Prestadores ===" + "\n"
                + "7 - Listar prestadores" + "\n"
                + "8 - Agregar prestadores" + "\n"
                + "9 - Quitar prestadores" + "\n"
                + "=== Especialidades ===" + "\n"
                + "10 - Listar especialidades" + "\n"
                + "11 - Agregar especialidades" + "\n"
                + "12 - Quitar especialiadades" + "\n"
                + "-- Ingrese un número --");
    }
}
