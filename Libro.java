
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
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginasTotales, boolean esDeTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginasTotales;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = esDeTexto;
    }

    /**
     * Devuelve si es de texto
     */
    public boolean getEsDeTexto(){
        return esLibroDeTexto;
    }

    /**
     * Presta el libro
     */
    public void prestar(){
        vecesPrestado ++;
    }

    /**
     * Devuelve el numero de veces que se ha prestado el libro
     */
    public int getVecesPrestado(){
        return vecesPrestado;
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
        String siONo;
        if(esLibroDeTexto == true){
            siONo = "si";
        } else{
            siONo = "no";
        }
        if(numeroReferencia == ""){
            laReferencia = "ZZZ"; 
        }
        String aDevolver = "Título: " + titulo + "; autor: " + autor + "; páginas: " + numeroPaginas + "; referencia: " + laReferencia + "; veces que ha sido prestado: " + vecesPrestado + "; es libro de texto?: " + siONo + ".";
        return aDevolver;
    }

    /**
     * Imprime los detalles del libro
     */
    public void imprimeDetalles(){
        System.out.println(getDetalles());
    }

}
