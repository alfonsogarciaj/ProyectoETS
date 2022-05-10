package es.iespuerto.pharmaguardia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Gestion {
    HashMap<Integer, Farmacia> farmacias;
    ArrayList<Farmacia> listaFarmacias;
    private List<Farmacia> collect;

    /**
     * Constructor por defecto
     */
    public Gestion(){
        farmacias = new HashMap<>();
        listaFarmacias = new ArrayList<>();
    }
    
    /**
     * Metodo que añade una farmacia al listado de farmacias
     * @param farmacia farmacia que desea añadir
     * @return Devuelve un mensaje si la farmacia se ha añadido correctamente o si ha habido un error
     */
    public String addFarmacia(Farmacia farmacia){
        String respuesta = "";
        if(!farmacias.containsKey(farmacia.getCodigo())){
            farmacias.put(farmacia.getCodigo(), farmacia);
            listaFarmacias.add(farmacia);
            respuesta = "Se ha añadido la farmacia correctamente";
        }else{
            respuesta = "No puede añadir la farmacia, el código está duplicado";
        }

        return respuesta;
    }

    /**
     * Metodo que elimina una farmacia del listado dado su codigo
     * @param codigo codigo de la farmacia que desea eliminar
     * @return Devuelve un mensaje si la farmacia se ha eliminado correctamente o si ha habido un error
     */
    public String eliminarFarmacia(int codigo){
        String respuesta = "";
        if(farmacias.containsKey(codigo)){
            listaFarmacias.remove(farmacias.get(codigo));
            farmacias.remove(codigo);
            respuesta = "Se ha eliminado la farmacia correctamente";
        }else{
            respuesta = "El código de la farmacia que desea eliminar no existe";
        }
        return respuesta;
    }

    /**
     * Metodo que elimina una farmacia del listado
     * @param farmacia farmacia que desea eliminar
     * @return Devuelve un mensaje si la farmacia se ha eliminado correctamente o si ha habido un error
     */
    public String eliminarFarmacia(Farmacia farmacia){
        return eliminarFarmacia(farmacia.getCodigo());
    }

    /**
     * Metodo que devuelve una farmacia dado su codigo
     * @param codigo codigo de la farmacia
     * @return Devuelve la farmacia
     */
    public Farmacia buscarFarmacia(int codigo){
        return farmacias.get(codigo);
    }

    /**
     * Metodo que devuelve una lista de las Farmacias que pertenecen a un codigo postal
     * @param codigoPostal codigo postal de las farmacias que desea buscar 
     * @return Devuelve la lista de farmacias
     */
    public List<Farmacia> buscarFarmaciaPorCodigoPostal(int codigoPostal){
        return listaFarmacias.stream()
                        .filter(f -> f.getDireccion().getCodigoPostal() == codigoPostal)
                        .collect(Collectors.toList());

    }

     
}
