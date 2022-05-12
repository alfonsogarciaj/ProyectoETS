package es.iespuerto.pharmaguardia;

public class Farmacia {

    private int codigo;
    private String nombre;
    private int telefono;
    private Direccion direccion;
    private boolean guardia;

    /**
     * Constructor por defecto
     */
    public Farmacia(){
    }

    /**
     * Constructor con cinco parametross
     * @param codigo codigo de la farmacia
     * @param nombre nombre de la farmacia
     * @param telefono telefono de la farmacia
     * @param direccion direccion de la farmacia
     * @param guardia true si la farmacia está de guardia y false si no
     */
    public Farmacia(int codigo, String nombre, int telefono, Direccion direccion, boolean guardia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.guardia = guardia;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public int getCodigo() {
        return codigo;
    }
/**
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public boolean isGuardia() {
        return guardia;
    }

    public void setGuardia(boolean guardia) {
        this.guardia = guardia;
    }
 */
}
