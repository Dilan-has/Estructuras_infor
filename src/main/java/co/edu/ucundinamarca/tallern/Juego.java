
package co.edu.ucundinamarca.tallern;
import static co.edu.ucundinamarca.tallern.Main.log;
import org.apache.log4j.Logger;
/**
 *
 * @author dhper
 */
public class Juego {
    
    private int vidasini, record, vidas;
    static Logger log = Logger.getLogger(Main.class.getName());
    
    
      public void Vidasini(){
          vidasini=5;
          vidas=vidasini;
      }
      
      public void MuestrasVidasRestantes(){
          log.debug("Las vidas restantes son: " + vidas);
      }
      
      public void QuitaVida(){
          vidas=vidas-1;   
          if (vidas<0){
              log.debug("Juego terminado");
          }
      }
      
      public void ReiniciarPartida(){
          vidas=vidasini;
      }
      
      public void ActualizarRecord(){
          if (vidas==record){
              log.debug("record alcanzado");
          }
          if (vidas>record){
              log.debug("Se ha superado el record \n"+ "nievo redord: " + vidas);
          }
      }
}
