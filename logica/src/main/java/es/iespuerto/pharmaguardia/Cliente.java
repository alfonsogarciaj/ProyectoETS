package es.iespuerto.pharmaguardia;

public class Cliente {
    private String nombre;
    private int telefono;
    private String correoElectronico;
    private Direccion direccionActual;
    private Farmacia farmaciaDeConfianza;

    /**
     * Constructor por defecto
     */
    public Cliente(){
    }

    /**
     * Constructor con tres parametros
     * @param nombre nombre del cliente
     * @param telefono telefono del cliente
     * @param correoElectronico correo electronico del cliente
     */
    public Cliente(String nombre, int telefono, String correoElectronico){
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    /**
     * Constructor con cinco parametros
     * @param nombre nombre del cliente
     * @param telefono telefono del cliente
     * @param correoElectronico correo electronico del cliente
     * @param direccionActual direccion actual del cliente
     * @param farmaciaDeConfianza farmacia de confianza del cliente
     */
    public Cliente(String nombre, int telefono, String correoElectronico, Direccion direccionActual, Farmacia farmaciaDeConfianza) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.direccionActual = direccionActual;
        this.farmaciaDeConfianza = farmaciaDeConfianza;
    }

    private void setFarmaciaDeConfianza(Farmacia farmacia) {
        this.farmaciaDeConfianza = farmacia;
    }

    /**
     * Metodo que añade una farmacia de confianza
     * @param farmacia farmacia de confianza del cliente
     * @return devuelve un mensaje si la farmacia se ha añadido correctamente y si no
     */
    public String addFarmaciaDeConfianza(Farmacia farmacia){
        String respuesta = "";
        if(farmaciaDeConfianza == null){
            setFarmaciaDeConfianza(farmacia);
            respuesta = "Se ha añadido la farmacia de confianza correctamente";
        }else{
            respuesta = "Ya tiene una farmacia de confianza asignada, elimínela antes de añadir una nueva";
        }
        return respuesta;
    }



    /**
     * Metodo que elimina una farmacia de confianza
     * @return devuelve un mensaje si la farmacia se ha eliminado correctamente y si no
     */
    public String eliminarFarmaciaDeConfianza(){
        String respuesta = "";
        if(farmaciaDeConfianza != null){
            farmaciaDeConfianza = null;
            respuesta = "Se ha eliminado la farmacia de confianza correctamente";
        }else{
            respuesta = "No tiene ninguna farmacia de confianza asignada";
        }
        return respuesta;
    }

    /**
     * Metodo que cambia de una farmacia de confianza a otra
     * @param farmacia nueva farmacia de confianza
     * @return devueve un mensaje si la farmacia se ha modificado correctamente y si no
     */
    public String modificarFarmaciaDeConfianza(Farmacia farmacia){
        String respuesta = "";
        if(farmaciaDeConfianza != null){
            this.farmaciaDeConfianza = farmacia;
            respuesta = "Su farmacia de confianza se ha modificado correctamente";
        }else{
            respuesta = "No tiene ninguna farmacia de confianza asignada";
        }
        return respuesta;
    }

}
