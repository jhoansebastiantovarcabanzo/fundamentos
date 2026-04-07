package codigo_Hospital;

public class Tratamiento {
    private int identificacion;
    private String nombreTratamiento;
    private int duracionDias;
    private String efectosSecundarios;
    
    public Tratamiento(int identificacion, String nombreTratamiento, int duracionDias, String efectosSecundarios) {
    	this.identificacion = identificacion;
    	this.nombreTratamiento = nombreTratamiento;
    	this.duracionDias = duracionDias;
    	this.efectosSecundarios = efectosSecundarios;
    }
    
    public int getIdentificacion() { return identificacion; }
    public void setIdentificacion(int identificacion) { this.identificacion = identificacion; }
    
    public String getnombreTratamiento() { return nombreTratamiento;}
    public void setnombreTratamiento(String nombreTratamiento) {this.nombreTratamiento = nombreTratamiento;}
    
    public int getduracionDias() {return duracionDias;}
    public void setduracionDias(int duracionDias) {this.duracionDias = duracionDias;}
    
    public String getefectosSecundarios() {return efectosSecundarios;}
    public void setefectosSecundarios(String efectosSecundarios) {this.efectosSecundarios = efectosSecundarios;}

    public double calcularEficacia(String tipoCancer) {
        if ("Quimioterapia".equals(nombreTratamiento) && "Leucemia".equals(tipoCancer)) {
            return 85.0;
        } else if ("Radioterapia".equals(nombreTratamiento) && "Sarcoma".equals(tipoCancer)) {
            return 70.0;
        }
        return 50.0;
    }
    
    @Override
    public String toString() {
        return "Tratamiento{" +
                "id=" + identificacion +
                ", nombre='" + nombreTratamiento + '\'' +
                ", días=" + duracionDias +
                ", efectos='" + efectosSecundarios + '\'' +
                '}';
    }
}