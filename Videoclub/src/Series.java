public class Series implements Entregable {

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

    public void entregar() {
        
    entregado=true;

    }

    public void devolver () {
        entregado=false;
    }
    
    public boolean isEntregado() {

        return entregado;
    }

    public boolean compareTo(Object obj) {
        
       //Object object = new Series();
        
        if (this.temporadas>=((Series) obj).getTemporadas()){
            return true;
        } else {return false;}
        
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

        String txt;
        if (this.entregado=true) {
            txt="DISPONIBLE";
        } else {txt="NO DISPONIBLE";}

        return ("La serie de título "+this.titulo+" es del género "+this.genero+". El creador es "+this.creador
        +". Tiene "+this.temporadas+" y en estos momentos está "+txt);
    }

}
