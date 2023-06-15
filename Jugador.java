

/**
 * Class Jugador
 */
public class Jugador extends Usuario {

  //
  // Fields
  //

  private String Alias;
  private Integer Puntaje;
  private String Avatar;
  private JUEGO new_attribute;
  private JUEGO* new_attribute_1;
  private JUEGO* new_attribute_2;
  private JUEGO* new_attribute_3;
  
  //
  // Constructors
  //
  public Jugador () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Alias
   * @param newVar the new value of Alias
   */
  public void setAlias (String newVar) {
    Alias = newVar;
  }

  /**
   * Get the value of Alias
   * @return the value of Alias
   */
  public String getAlias () {
    return Alias;
  }

  /**
   * Set the value of Puntaje
   * @param newVar the new value of Puntaje
   */
  public void setPuntaje (Integer newVar) {
    Puntaje = newVar;
  }

  /**
   * Get the value of Puntaje
   * @return the value of Puntaje
   */
  public Integer getPuntaje () {
    return Puntaje;
  }

  /**
   * Set the value of Avatar
   * @param newVar the new value of Avatar
   */
  public void setAvatar (String newVar) {
    Avatar = newVar;
  }

  /**
   * Get the value of Avatar
   * @return the value of Avatar
   */
  public String getAvatar () {
    return Avatar;
  }

  /**
   * Set the value of new_attribute
   * @param newVar the new value of new_attribute
   */
  public void setNew_attribute (JUEGO newVar) {
    new_attribute = newVar;
  }

  /**
   * Get the value of new_attribute
   * @return the value of new_attribute
   */
  public JUEGO getNew_attribute () {
    return new_attribute;
  }

  /**
   * Set the value of new_attribute_1
   * @param newVar the new value of new_attribute_1
   */
  public void setNew_attribute_1 (JUEGO* newVar) {
    new_attribute_1 = newVar;
  }

  /**
   * Get the value of new_attribute_1
   * @return the value of new_attribute_1
   */
  public JUEGO* getNew_attribute_1 () {
    return new_attribute_1;
  }

  /**
   * Set the value of new_attribute_2
   * @param newVar the new value of new_attribute_2
   */
  public void setNew_attribute_2 (JUEGO* newVar) {
    new_attribute_2 = newVar;
  }

  /**
   * Get the value of new_attribute_2
   * @return the value of new_attribute_2
   */
  public JUEGO* getNew_attribute_2 () {
    return new_attribute_2;
  }

  /**
   * Set the value of new_attribute_3
   * @param newVar the new value of new_attribute_3
   */
  public void setNew_attribute_3 (JUEGO* newVar) {
    new_attribute_3 = newVar;
  }

  /**
   * Get the value of new_attribute_3
   * @return the value of new_attribute_3
   */
  public JUEGO* getNew_attribute_3 () {
    return new_attribute_3;
  }

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String ObtenerNombre()
  {
  }


  /**
   * @return       Integer
   */
  public Integer ObtenerPuntuacion()
  {
  }


  /**
   * @return       Integer
   */
  public Integer IncremPuntos()
  {
  }


  /**
   * @return       Integer
   */
  public Integer resetPuntos()
  {
  }


}
