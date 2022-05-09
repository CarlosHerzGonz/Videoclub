public class Videojuego implements Entregable{
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
        String ent;
        if(this.entregado == true){
            ent = "ENTREGADO: ";
        }else{
            ent = "NO ENTREGADO: ";
        }
        return "El videojuego con titulo: " + this.titulo + " del genero: " + this.genero + " de la compañía: " + this.compañia + " tiene una duración de: " + horasE + " horas y se encuentra " +ent;
    }

    public void entregar(){
        this.entregado = true;
    }

    public void devolver(){ 
        this.entregado = false;
    }

    public boolean isEntregado(){
        return entregado;
    }
    public boolean compareTo(Object obj){

         Videojuego v = (Videojuego)obj;

        if(this.horasE >= v.getHorasE() ){
            return true;
        }else
            return false;
    }
    
}
