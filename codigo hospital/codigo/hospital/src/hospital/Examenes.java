package hospital;
import java.time.LocalDate;

public class Examenes {
	private int Identifiacion;
	private LocalDate FechaExamen;
	private String TipoExamen;
	private String Resultado;
	
	public Examenes(int Identifiacion, LocalDate FechaExamen, String TipoExamen, String Resultado) {
		this.Identifiacion = Identifiacion;
		this.FechaExamen = FechaExamen;
		this.TipoExamen = TipoExamen;
		this.Resultado = Resultado;
	}
	
	public int getIdentifiacion() { return Identifiacion;}
	public void setIdentifiacion(int Identifiacion) {this.Identifiacion = Identifiacion;}
	
	public LocalDate getFechaExamen() {return FechaExamen;}
	public void setFechaExamen(LocalDate FechaExamen) {this.FechaExamen = FechaExamen;}
	
	public String getTipoExamen() {return TipoExamen;}
	public void setTipoExamen(String TipoExamen) {this.TipoExamen = TipoExamen;}
	
	public String getResultado() {return Resultado;}
	public void setResultado(String Resultado) {this.Resultado = Resultado;}
	
	@Override
	public String toString() {
	    return "Examenes{" +
	            "identificacion=" + Identifiacion +
	            ", fechaExamen=" + FechaExamen +
	            ", tipoExamen='" + TipoExamen + '\'' +
	            ", resultado='" + Resultado + '\'' +
	            '}';
	}
}
