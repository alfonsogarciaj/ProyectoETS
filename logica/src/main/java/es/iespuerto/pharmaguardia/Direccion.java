package es.iespuerto.pharmaguardia;

public class Direccion {

    private String codigoPostal;
    private String calle;
    private String numero;
    private String piso;
    private Provincia provincia;
    private Isla isla;

    private enum Provincia {LAS_PALMAS_DE_GRAN_CANARIA, SANTA_CRUZ_DE_TENERIFE};
    private enum Isla{EL_HIERRO, FUERTEVENTURA, GRAN_CANARIA, LA_GOMERA, LANZAROTE, LA_PALMA, TENERIFE};

    /**
     * Constructor por defecto
     */
    public Direccion(){
    }

    /**
     * Constructor con cinco parametros
     * @param codigoPostal de la clase
     * @param calle de la clase
     * @param numero de la clase
     * @param provincia de la clase
     * @param isla de la clase
     */
    public Direccion(String codigoPostal, String calle, String numero, Provincia provincia, Isla isla){
        this(codigoPostal, calle, numero, null, provincia, isla);
    }

    /**
     * Constructor con seis parametros
     * @param codigoPostal de la clase
     * @param calle de la clase
     * @param numero de la clase
     * @param piso de la clase
     * @param provincia de la clase
     * @param isla de la clase
     */
    public Direccion(String codigoPostal, String calle, String numero, String piso, Provincia provincia, Isla isla) {
        this.codigoPostal = codigoPostal;
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.provincia = provincia;
        this.isla = isla;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public Isla getIsla() {
        return isla;
    }

    public void setIsla(Isla isla) {
        this.isla = isla;
    }
}
