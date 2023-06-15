

/**
 * Class Preguntas
 */
public class Preguntas {

  //
  // Fields
  //

  private String Pregunta;
  private Integer Puntuacion;
  private JUEGO new_attribute;
  
  //
  // Constructors
  //
  public Preguntas () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Pregunta
   * @param newVar the new value of Pregunta
   */
  public void setPregunta (String newVar) {
    Pregunta = newVar;
  }

  /**
   * Get the value of Pregunta
   * @return the value of Pregunta
   */
  public String getPregunta () {
    return Pregunta;
  }

  /**
   * Set the value of Puntuacion
   * @param newVar the new value of Puntuacion
   */
  public void setPuntuacion (Integer newVar) {
    Puntuacion = newVar;
  }

  /**
   * Get the value of Puntuacion
   * @return the value of Puntuacion
   */
  public Integer getPuntuacion () {
    return Puntuacion;
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

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String ObtenerRespuesta()
  {
  }


  /**
   * @return       Boolean
   */
  public Boolean VerificaRespuesta()
  {
  }


}
