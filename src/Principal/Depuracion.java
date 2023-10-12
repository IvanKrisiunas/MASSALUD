package Principal;

import AccesoADatos.AfiliadoData;
import AccesoADatos.EspecialidadData;
import AccesoADatos.OrdenData;
import AccesoADatos.PrestadorData;
import java.util.Scanner;

public class Depuracion {

    public static void main(String[] args) {
        int opción;
        //Conexion EXP = new Conexion();
        //Conexion.getConexion();
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
        EspecialidadData ed = new EspecialidadData();
        PrestadorData pd = new PrestadorData();
        OrdenData od = new OrdenData();

        //Afiliado
        if (opción == 2 || opción == 3 || opción == 4) {
            int DNI1, teléfono1;
            String nombre1, apellido1, dirección1;
            boolean estado1;
            System.out.println("Afiliado.");
            System.out.println("DNI:");
            DNI1 = s.nextInt();
            System.out.println("Tel.:");
            teléfono1 = s1.nextInt();
            System.out.println("Nom.:");
            nombre1 = s2.nextLine();
            System.out.println("Ap.:");
            apellido1 = s2.nextLine();
            System.out.println("Dir.:");
            dirección1 = s2.nextLine();
            System.out.println("Est.:");
            estado1 = s3.nextBoolean();
            System.out.println(DNI1 + ", " + teléfono1 + ", " + nombre1 + ", " + apellido1 + ", " + dirección1 + ", " + estado1 + ". ");
            a = new Afiliado(nombre1, apellido1, DNI1, estado1, dirección1, teléfono1);
        }

        //Especialidad
        if (opción == 11 || opción == 12) {
            int idEspecialidad;
            String especialidad;
            System.out.println("Especialidad.");
            System.out.println("Id.: ");
            idEspecialidad = s.nextInt();
            System.out.println("Esp.: ");
            especialidad = s2.nextLine();
            System.out.println(idEspecialidad + ", " + especialidad + ".");
            e = new Especialidad(idEspecialidad, especialidad);
        }

        //Prestador
        if (opción == 7 || opción == 6 || opción == 10) {
            int DNI2, telefono2;
            String nombre2, apellido2, domicilio2;
            boolean estado2;
            String especialidadNombre;
            int idEspecialidad=0;
            System.out.println("Prestador.");
            System.out.println("Nom.: ");
            nombre2 = s1.nextLine();
            System.out.println("Ap.: ");
            apellido2 = s1.nextLine();
            System.out.println("DNI: ");
            DNI2 = s.nextInt();
            System.out.println("Est.: ");
            estado2 = s.nextBoolean();
            System.out.println("nombre de especialidad: ");
            especialidadNombre = s3.nextLine();
            idEspecialidad = ed.especialidadPorId(especialidadNombre);
            System.out.println("Telefono: ");
            telefono2 = s.nextInt();
            System.out.println("Direc: ");
            domicilio2 = s2.nextLine();
            System.out.println(DNI2 + ", " + nombre2 + ", " + apellido2 + ", " + estado2 + ", " + especialidadNombre + "," + telefono2 + "," + domicilio2 + ".");
            p = new Prestador(nombre2, apellido2, DNI2, estado2, idEspecialidad, telefono2, domicilio2);
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
                pd.listarPrestadores();
                break;
            case 6:
                pd.añadirPrestador(p);
                break;
            case 7:
                pd.modificarPrestador(p);
                break;
            case 8:
                pd.eliminarPrestador(p.getDNI());
                break;
            case 9:
                ed.listarEspecialidades();
                break;
            case 10:
                ed.añadirEspecialidad(e);
                break;
            case 11:
                ed.modificarEspecialidad(e);
                break;
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
                + "=== Prestadores ===" + "\n"
                + "5 - Listar prestadores" + "\n"
                + "6 - Agregar prestadores" + "\n"
                + "7 - Modificar prestadores" + "\n"
                + "8 - Quitar prestadores" + "\n"
                + "=== Especialidades ===" + "\n"
                + "9 - Listar especialidades" + "\n"
                + "10 - Agregar especialidades" + "\n"
                + "11 - Modificar especialidades" + "\n"
                + "-- Ingrese un número --");
    }
}
