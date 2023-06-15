

/**
 * Class Administrador
 */
public class Administrador extends Usuario {

  //
  // Fields
  //

  private String NombreAdministrador;
  private String Correo;
  private String Contraseña;
  
  //
  // Constructors
  //
  public Administrador () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of NombreAdministrador
   * @param newVar the new value of NombreAdministrador
   */
  public void setNombreAdministrador (String newVar) {
    NombreAdministrador = newVar;
  }

  /**
   * Get the value of NombreAdministrador
   * @return the value of NombreAdministrador
   */
  public String getNombreAdministrador () {
    return NombreAdministrador;
  }

  /**
   * Set the value of Correo
   * @param newVar the new value of Correo
   */
  public void setCorreo (String newVar) {
    Correo = newVar;
  }

  /**
   * Get the value of Correo
   * @return the value of Correo
   */
  public String getCorreo () {
    return Correo;
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

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String ObtenernombreAdministrador()
  {
  }


  /**
   * @return       Boolean
   */
  public Boolean VerificarContraseña()
  {
  }


  /**
   * @return       String
   */
  public String AgregarUsuario()
  {
  }


  /**
   * @return       String
   */
  public String EliminarUsuario()
  {
  }


  /**
   */
  public void AgregarPregunta()
  {
  }


  /**
   */
  public void EliminaPregunta()
  {
  }


  /**
   */
  public void ModificaPregunta()
  {
  }


  /**
   * @return       Integer
   */
  public Integer ModificaPuntuacion()
  {
  }


}
