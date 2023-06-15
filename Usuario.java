

/**
 * Class Usuario
 */
public class Usuario {

  //
  // Fields
  //

  private String Usuario;
  private String Contraseña;
  private String Estatus_de_Logueo;
  private String Fecha_Registro;
  
  //
  // Constructors
  //
  public Usuario () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Usuario
   * @param newVar the new value of Usuario
   */
  public void setUsuario (String newVar) {
    Usuario = newVar;
  }

  /**
   * Get the value of Usuario
   * @return the value of Usuario
   */
  public String getUsuario () {
    return Usuario;
  }

  /**
   * Set the value of Contraseña
   * @param newVar the new value of Contraseña
   */
  public void setContraseña (String newVar) {
    Contraseña = newVar;
  }

  /**
   * Get the value of Contraseña
   * @return the value of Contraseña
   */
  public String getContraseña () {
    return Contraseña;
  }

  /**
   * Set the value of Estatus_de_Logueo
   * @param newVar the new value of Estatus_de_Logueo
   */
  public void setEstatus_de_Logueo (String newVar) {
    Estatus_de_Logueo = newVar;
  }

  /**
   * Get the value of Estatus_de_Logueo
   * @return the value of Estatus_de_Logueo
   */
  public String getEstatus_de_Logueo () {
    return Estatus_de_Logueo;
  }

  /**
   * Set the value of Fecha_Registro
   * @param newVar the new value of Fecha_Registro
   */
  public void setFecha_Registro (String newVar) {
    Fecha_Registro = newVar;
  }

  /**
   * Get the value of Fecha_Registro
   * @return the value of Fecha_Registro
   */
  public String getFecha_Registro () {
    return Fecha_Registro;
  }

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String ObtenerUsuario()
  {
  }


  /**
   * @return       boolean
   */
  public boolean ValidacionUsuario()
  {
  }


}
