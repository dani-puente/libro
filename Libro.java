
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

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginasTotales)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginasTotales;
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
     * Devuelve detalles del libro
     */
    public String getDetalles(){
        String aDevolver = "Título: " + titulo + ", autor: " + autor + ", páginas: " + numeroPaginas + ".";
        return aDevolver;
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
     * Imprime los detalles del libro
     */
    public void imprimeDetalles(){
        System.out.println(getDetalles());
    }
    

}
