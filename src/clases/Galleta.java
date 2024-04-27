package clases;

public class Galleta {
    private final int idGalleta;
    private static int contadorGalletas;

    public Galleta() {
        System.out.println("Ejecución del constructor");
    }

    // bloque anonimo de tipo estático
    static {
        System.out.println("Ejecución del bloque estático");
        ++Galleta.contadorGalletas;
    }

    // bloque anónimo dinamico o normal
    {
        System.out.println("Ejecución del bloque anónimo normal");
        this.idGalleta = Galleta.contadorGalletas++;
    }

    public int getIdGalleta() {
        return idGalleta;
    }
}
