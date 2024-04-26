package CodigoJAVA.PostgreSQL_Conexion.dependencias.codigo;

import java.util.Arrays;

public class persona extends direccion {

    // propiedades de personoa
    private String PrimerNombre;
    private String SegundoNombre;
    private String PrimerAellido;
    private String SegundoApellido;
    private int edad;
    private String ID; // identidad de la persona
    private String Genero;
    private String genero[] = new String[3];

    // para el caso de genero se planea tener un arrego que permita seleccionar
    // genero[0]="Masculino";genero[1]="Femenino";genero[2]="Otro";

    // Construnctor
    /*
     * public persona(String primerNombre, String segundoNombre, String
     * primerAellido, String segundoApellido, int edad,
     * double iD, String genero) {
     * this.PrimerNombre = primerNombre;
     * this.SegundoNombre = segundoNombre;
     * this.PrimerAellido = primerAellido;
     * this.SegundoApellido = segundoApellido;
     * this.edad = edad;
     * this.ID = iD;
     * this.Genero = genero;
     * 
     * }
     */

    // Constructor que implementa concepto de composicion con la direccion de cada
    // persona

    public persona(String departamneto, String municipio, String colonia, String bloque, String codigoPostal,
            String numeroCasa, String primerNombre, String segundoNombre, String primerAellido, String segundoApellido,
            int edad, String iD, String genero) {
        super(departamneto, municipio, colonia, bloque, codigoPostal, numeroCasa);
        this.PrimerNombre = primerNombre;
        this.SegundoNombre = segundoNombre;
        this.PrimerAellido = primerAellido;
        this.SegundoApellido = segundoApellido;
        this.edad = edad;
        this.ID = iD;
        this.Genero = genero;
        direccion objDirecion = new direccion(departamneto, municipio, colonia, bloque, codigoPostal, numeroCasa);
    }

    // metodo para recorrer el arreglo
    // public void mostrarOpcionesGenero() {

    // }

    // getters
    public String getPrimerNombre() {
        return PrimerNombre;
    }

    public String getSegundoNombre() {
        return SegundoNombre;
    }

    public String getPrimerAellido() {
        return PrimerAellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getID() {
        return ID;
    }

    public String getGenero() {
        return Genero;
    }

    // setters
    public void setPrimerNombre(String primerNombre) {
        PrimerNombre = primerNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        SegundoNombre = segundoNombre;
    }

    public void setPrimerAellido(String primerAellido) {
        PrimerAellido = primerAellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        SegundoApellido = segundoApellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public void setGenero(String[] genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "persona [PrimerNombre=" + PrimerNombre + ", SegundoNombre=" + SegundoNombre + ", PrimerAellido="
                + PrimerAellido + ", SegundoApellido=" + SegundoApellido + ", edad=" + edad + ", ID=" + ID + ", Genero="
                + Genero + ", genero=" + Arrays.toString(genero) + ", getDepartamneto()=" + getDepartamneto()
                + ", getMunicipio()=" + getMunicipio() + ", getColonia()=" + getColonia() + ", getBloque()="
                + getBloque() + ", getCodigoPostal()=" + getCodigoPostal() + ", getNumeroCasa()=" + getNumeroCasa()
                + ", getClass()=" + getClass() + ", toString()=" + super.toString() + ", getPrimerNombre()="
                + getPrimerNombre() + ", getSegundoNombre()=" + getSegundoNombre() + ", getPrimerAellido()="
                + getPrimerAellido() + ", getSegundoApellido()=" + getSegundoApellido() + ", getEdad()=" + getEdad()
                + ", getID()=" + getID() + ", getGenero()=" + getGenero() + ", hashCode()=" + hashCode() + "]";
    }

}
