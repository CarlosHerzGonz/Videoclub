
import java.util.ArrayList;

public class Principal {
    static final int total = 5;

    static ArrayList rellenar(ArrayList ar, char opc) {
        if (opc == 'S') {
            for (int i = 0; i < total; i++) {
                Series s = new Series();
                    System.out.println("Introduzca los datos de la serie:");
                    s.setTitulo("titulo");
                    s.setCreador("creador");
                    s.setGenero("genero");
                    s.setTemporadas(/*temporadas*/ 1);
                    ar.add(s);
            }
        }
        if (opc == 'V') {
            for (int i = 0; i < total; i++) {
                Videojuego v = new Videojuego();
               System.out.println("Introduzca los datos del videojuego:");
                v.setTitulo("titulo");
                v.setGenero("genero");
                v.setCompañia("compañia");
                v.setHorasE(/*horasE*/ 1);
                ar.add(v);
            }
        }
        return ar;
    }

    static void entregarcodigo(ArrayList a)
    {
        String tit=pedirtit();

        for(int i;i<a.size();i++)
        {
            if(tit.equals(a[i].getTitulo)){a[i].entregar();}
        }
    }
    static void numentregados(ArrayList a)
    {
        int cont=0;

        for(int i;i<a.size();i++)
        {
            if(a[i].isEntregado){cont++;}
        }
    }
    private static String pedirtit() {
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Series> series = new ArrayList<Series>();
        ArrayList<Videojuego> videojuegos = new ArrayList<Videojuego>();
        series=rellenar(series, 'S');
        series=rellenar(videojuegos, 'V');

    }

}
