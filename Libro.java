
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.0
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginasTotales)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginasTotales;
        numeroReferencia = "";
    }

    /**
     * Establece un numero de referencia
     */
    public void setReferencia(String referencia){
        if(referencia.length() < 3){
            System.out.println("¡Parametro no válido! Introdúcelo de nuevo.");
        } else{
            numeroReferencia = referencia;
        }
    }

    /**
     * Devuelve el numero de referencia del libro
     */
    public String getreferencia(){
        return numeroReferencia;
    }

    /**
     * Devuelve el autor
     */
    public String getAutor(){
        return autor;
    }

    /**
     * Devuelve el titulo
     */
    public String getTitulo(){
        return titulo;
    }

    /**
     * Devuelve el numero de paginas
     */
    public int getNumeroPaginas(){
        return numeroPaginas;
    }

    /**
     * Imprime el autor
     */
    public void imprimeAutor(){
        System.out.println(autor);
    }

    /**
     * Imprime el titulo
     */
    public void imprimeTitulo(){
        System.out.println(titulo);
    }

    /**
     * Devuelve detalles del libro
     */
    public String getDetalles(){
        String laReferencia = numeroReferencia;
        if(numeroReferencia == ""){
            laReferencia = "ZZZ"; 
        }
        String aDevolver = "Título: " + titulo + ", autor: " + autor + ", páginas: " + numeroPaginas + ", referencia: " + laReferencia + ".";
        return aDevolver;
    }

    /**
     * Imprime los detalles del libro
     */
    public void imprimeDetalles(){
        System.out.println(getDetalles());
    }

}
