public class Series {

    //Atributos
    private String titulo;
    private int temporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    Series () {


        this.temporadas=3;
        this.entregado=false;
        this.titulo="titulo";
        this.genero="genero";
        this.creador="creador";
    }
    Series (String tit, String c) {
        this.temporadas=3;
        this.entregado=false;
        this.titulo=tit;
        this.genero="genero";
        this.creador=c;
    }
    Series (int temp, String tit, String gen, String c) {
        this.temporadas=temp;
        this.entregado=false;
        this.titulo=tit;
        this.genero=gen;
        this.creador=c;
    }
    public String getGenero() {
        
        return genero;
    }
    public String getCreador() {
        return creador;


    }
    public int getTemporadas() {
        return temporadas;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setCreador(String creador) {
        this.creador = creador;
    }public void setGenero(String genero) {
        this.genero = genero;
    }public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String toString() {
        return super.toString();
    }

}
