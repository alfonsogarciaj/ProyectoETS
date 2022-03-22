package es.iespuerto.pharmaguardia;

public class Cliente {
    private String nombre;
    private String telefono;
    private String correoElectronico;
    private Direccion direccionActual;
    private Farmacia farmaciaDeConfianza;

    /**
     * Constructor por defecto
     */
    public Cliente(){
    }

    /**
     * Constructor con cinco parametros
     * @param nombre del cliente
     * @param telefono del cliente
     * @param correoElectronico del cliente
     * @param direccionActual del cliente
     * @param farmaciaDeConfianza del cliente
     */
    public Cliente(String nombre, String telefono, String correoElectronico, Direccion direccionActual, Farmacia farmaciaDeConfianza) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.direccionActual = direccionActual;
        this.farmaciaDeConfianza = farmaciaDeConfianza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Direccion getDireccionActual() {
        return direccionActual;
    }

    public void setDireccionActual(Direccion direccionActual) {
        this.direccionActual = direccionActual;
    }

    public Farmacia getFarmaciaDeConfianza() {
        return farmaciaDeConfianza;
    }

    public void setFarmaciaDeConfianza(Farmacia farmaciaDeConfianza) {
        this.farmaciaDeConfianza = farmaciaDeConfianza;
    }
}
