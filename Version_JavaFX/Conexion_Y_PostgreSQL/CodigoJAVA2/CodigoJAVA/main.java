package CodigoJAVA;

import java.util.ArrayList;
import java.util.List;

public class main {

  public static void main(String[] args) {

    int numExpediente = 1;

    // instancia de los objetos que son pasados al constructor de expediente
    // cumpliendo con el concepto de agregacion

    // instancia de objeto denunciante
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    List<denunciante> Arraydenunciante = new ArrayList<>();

    // denunciante[] Arraydenunciante = new denunciante[3];
    Arraydenunciante.add(new denunciante("Comayagua", "El Rosario", "nuevacapital", "k", "3456", "casa34",
        "Lester", "Jhoan", "Dominguez", "Chavez", 21, "0311200200502", "Masculino"));

    // instancia de objeto denunciado en posiciones de un arreglo
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    List<denunciado> Arraydenunciado = new ArrayList<>();
    // denunciado[] Arraydenunciado = new denunciado[2];

    Arraydenunciado.add(new denunciado("Fm", "Tegucigalpa", "hato", "h", "1234", "casa39", "Marco", "Juan",
        "Perez", "Chavez", 21, "0311200200782", "Masculino"));

    Arraydenunciado.add(new denunciado("Atlantida", "El Rosario", "nuevacapital", "k", "3456", "casa34", "Lester",
        "Jhoan", "Dominguez", "Chavez", 21, "0311200200692", "Masculino"));

    // instancia de objeto ofendido definicando las posiciones dentro de un arreglo
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    List<ofendido> Arrayofendido = new ArrayList<>();
    // ofendido[] Arrayofendido = new ofendido[2];

    Arrayofendido.add(new ofendido("Atlantida", "El Rosario", "nuevacapital", "k", "3456", "casa34", "Lester",
        "Jhoan", "Dominguez", "Chavez", 21, "0311200200692", "Masculino"));


    // instancia de objeto expediente
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    expediente objexpediente = new expediente(numExpediente, Arraydenunciante,
        Arraydenunciado, Arrayofendido, "FM", "tegus", "bella oriente", "A",
        "principal", "homicidio", "mato");



        
    System.out.println(objexpediente.getObjDenunciado().get(0).toString());
    System.out.println(
        "    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
    System.out.println(objexpediente.getObjDenunciante().get(0).toString());
    // System.out.println(objexpediente.getObjDenunciante()[1].toString());
    // System.out.println(objdenunciante.toString());

    // System.out.println(objdenunciado.toString());

    // System.out.println(objofendido.toString());

  }
}
