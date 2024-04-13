package Version_Oficial.CodigoDelitos.src.prueba2delitosconlista;

class Expediente<Demandante> {
    private Demandado demandado;
    private Demandante demandante;
    private Ofendido ofendido;

    // Constructor
    public Expediente(Demandado demandado, Demandante demandante, Ofendido ofendido) {
        this.demandado = demandado;
        this.demandante = demandante;
        this.ofendido = ofendido;
    }

    // Métodos getter para demandado y demandante
    public Demandado getDemandado() {
        return demandado;
    }

    public Demandante getDemandante() {
        return demandante;
    }
    
    public Ofendido getOfendido(){
        return this.ofendido;
    }
}