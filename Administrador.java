

/**
 * Class Administrador
 */
public class Administrador extends Usuario {

  //
  // Fields
  //

  private String NombreAdministrador;
  private String Correo;
  private String Contrase�a;
  
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
   * Set the value of Contrase�a
   * @param newVar the new value of Contrase�a
   */
  public void setContrase�a (String newVar) {
    Contrase�a = newVar;
  }

  /**
   * Get the value of Contrase�a
   * @return the value of Contrase�a
   */
  public String getContrase�a () {
    return Contrase�a;
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
  public Boolean VerificarContrase�a()
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
