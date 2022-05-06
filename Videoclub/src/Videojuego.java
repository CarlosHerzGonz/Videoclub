public class Videojuego {
    private String titulo,genero,compañia;
    private int horasE;
    private boolean entregado;

    Videojuego(){
        this.horasE =10;
        this.entregado = false;
        this.titulo = "titulo";
        this.genero = "genero";
        this.compañia = "compañia";
    }

    Videojuego(String tit, int hor){
        this.horasE = hor;
        this.entregado = false;
        this.titulo = tit;
        this.genero = "genero";
        this.compañia = "compañia";
    }

    Videojuego(String tit, int hor, String gen, String comp){
        this.horasE = hor;
        this.entregado = false;
        this.titulo = tit;
        this.genero = gen;
        this.compañia = comp;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getHorasE() {
        return horasE;
    }

    public void setHorasE(int horasE) {
        this.horasE = horasE;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

  
    public String toString() {
        return super.toString();
    }
    
}
