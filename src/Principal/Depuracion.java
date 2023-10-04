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
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        opción = s.nextInt();

        Afiliado a = new Afiliado();
        Especialidad e = new Especialidad();
        Prestador p = new Prestador();
        Orden o = new Orden();
        AfiliadoData ad = new AfiliadoData();

        //Afiliado
        if (opción == 2 && opción == 3 && opción == 4 && opción == 6 && opción == 7 && opción == 8) {
            int DNI1, teléfono1;
            String nombre1, apellido1, dirección1;
            boolean estado1;
            System.out.println("Afiliado.");
            System.out.println("Ingrese DNI:");
            DNI1 = s.nextInt();
            System.out.println("Ingrese tel.:");
            teléfono1 = s1.nextInt();
            System.out.println("Ingrese nom.:");
            nombre1 = s2.nextLine();
            System.out.println("Ingrese ap.:");
            apellido1 = s2.nextLine();
            System.out.println("Ingrese dir.:");
            dirección1 = s2.nextLine();
            System.out.println("Ingrese est.:");
            estado1 = s3.nextBoolean();
            System.out.println(DNI1 + ", " + teléfono1 + ", " + nombre1 + ", " + apellido1 + ", " + dirección1 + ", " + estado1 + ". ");
            a = new Afiliado(nombre1, apellido1, DNI1, estado1, dirección1, teléfono1);
        }

        //Especialidad
        if (opción == 14 && opción == 15 && opción == 16 && opción == 10 && opción == 11 && opción == 12) {
            int idEspecialidad;
            String especialidad;
            System.out.println("Especialidad.");
            idEspecialidad = s.nextInt();
            especialidad = s2.nextLine();
            System.out.println(idEspecialidad + ", " + especialidad + ".");
            e = new Especialidad(idEspecialidad, especialidad);
        }

        //Prestador
        if (opción == 10 && opción == 11 && opción == 12 && opción == 6 && opción == 7 && opción == 8) {
            int idPrestador, DNI2;
            String nombre2, apellido2;
            boolean estado2;
            Especialidad especialidad;
            nombre2 = s1.nextLine();
            apellido2 = s1.nextLine();
            DNI2 = s.nextInt();
            estado2 = s.nextBoolean();
            especialidad = e;
            System.out.println(DNI2 + ", " + nombre2 + ", " + apellido2 + ", " + estado2 + ", " + especialidad + ".");
            p = new Prestador(nombre2, apellido2,  DNI2, estado2, especialidad);
        }

        //Orden
//        int idOrden, LocalDate fecha, String formaDePago, double importe, Afiliado afiliado, Prestador prestador
        if (opción == 6 && opción == 7 && opción == 8) {
            int idOrden;
            double importe;
            String formaDePago;
            Afiliado afiliado;
            Prestador prestador;
            System.out.println("Ingrese ID de Orden:");
            idOrden = s.nextInt();
            System.out.println("Ingrese fecha:");
            estado1 = s3.nextBoolean();
            System.out.println("Ingrese imp.:");
            teléfono1 = s1.nextInt();
            System.out.println("Ingrese for.:");
            nombre1 = s2.nextLine();
            System.out.println("Ingrese afi.:");
            apellido1 = s2.nextLine();
            System.out.println("Ingrese pres.:");
            dirección1 = s2.nextLine();
            System.out.println(DNI1 + ", " + teléfono1 + ", " + nombre1 + ", " + apellido1 + ", " + dirección1 + ", " + estado1 + ". ");
            a = new Afiliado(nombre1, apellido1, DNI1, estado1, dirección1, teléfono1);
        }

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
                ad.eliminarAfiliado(a.getDNI());
                break;
            case 5:
            //Listar órdenes
            case 6:
            //Agregar órdenes
            case 7:
            //Modificar órdenes
            case 8:
            //Quitar órdenes
            case 9:
            //Listar prestadores
            case 10:
            //Agregar prestadores
            case 11:
            //Modificar prestadores
            case 12:
            //Quitar prestadores
            case 13:
            //Listar especialidades
            case 14:
            //Agregar especialidades
            case 15:
            //Modificar especialidades
            case 16:
            //Quitar especialidades
        }
    }

    public static void textoMenú() {
        System.out.println("==== Menú de depuración ====" + "\n"
                + "=== Afiliados ===" + "\n"
                + "1 - Listar afiliados" + "\n"
                + "2 - Agregar afiliados" + "\n"
                + "3 - Modificar afiliados" + "\n"
                + "4 - Quitar afiliados" + "\n"
                + "=== Órdenes ===" + "\n"
                + "5 - Listar órdenes" + "\n"
                + "6 - Agregar órdenes" + "\n"
                + "7 - Modificar órdenes" + "\n"
                + "8 - Quitar órdenes" + "\n"
                + "=== Prestadores ===" + "\n"
                + "9 - Listar prestadores" + "\n"
                + "10 - Agregar prestadores" + "\n"
                + "11 - Modificar prestadores" + "\n"
                + "12 - Quitar prestadores" + "\n"
                + "=== Especialidades ===" + "\n"
                + "13 - Listar especialidades" + "\n"
                + "14 - Agregar especialidades" + "\n"
                + "15 - Modificar especialidades" + "\n"
                + "16 - Quitar especialiadades" + "\n"
                + "-- Ingrese un número --");
    }
}
