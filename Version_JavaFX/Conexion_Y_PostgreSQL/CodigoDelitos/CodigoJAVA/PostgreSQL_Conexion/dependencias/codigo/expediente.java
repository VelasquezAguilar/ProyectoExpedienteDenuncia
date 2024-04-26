package CodigoJAVA.PostgreSQL_Conexion.dependencias.codigo;

import java.util.ArrayList;
import java.util.List;

public class expediente {

    // con arraylist no evitmao el uso de arreglos limitados o de listas enlasadas,
    // las cuales implementaremos solo en los expedientes creados
    private List<denunciante> objDenunciante;
    private List<denunciado> objDenunciado;
    private List<ofendido> objOfendido;
    private int NumExpediente;

    // Para los objetos denunciante, denunciado y ofendido se implementa concepto de
    // agregacion
    // y para el objeto delito se implementa concepto de composicion.

    public expediente(int numExpediente, List<denunciante> Arraydenunciante, List<denunciado> Arraydenunciado,
            List<ofendido> Arrayofendido,
            String departamneto, String municipio, String colonia, String bloque, String Calle, String TipoDelito,
            String Descripcion) {
        NumExpediente = numExpediente;
        this.objDenunciado = Arraydenunciado;
        this.objDenunciante = Arraydenunciante;
        this.objOfendido = Arrayofendido;
        delito objdelito = new delito(departamneto, municipio, colonia, bloque, Calle, TipoDelito, Descripcion);
    }

    // metodos para poder acceder a los objetos y sus propiedases desde el main
    public List<denunciante> getObjDenunciante() {
        return objDenunciante;
    }

    public List<denunciado> getObjDenunciado() {
        return objDenunciado;
    }

    public void setObjDenunciado(List<denunciado> Arraydenunciado) {
        this.objDenunciado = Arraydenunciado;
    }

    public List<ofendido> getObjOfendido() {
        return objOfendido;
    }

    public int getNumExpediente() {
        return NumExpediente;
    }

    public void setNumExpediente(int numExpediente) {
        NumExpediente = numExpediente;
    }

    public expediente(int numExpediente) {
        NumExpediente = numExpediente;
    }

}
