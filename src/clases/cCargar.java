
package clases;
import javax.swing.JProgressBar;

public class cCargar extends Thread {
     JProgressBar progreso;

    public cCargar(JProgressBar progreso) {
        super();
        this.progreso = progreso;
    }
    @Override
    public void run(){
        for(int i = 0; i <= 100; i++){
            progreso.setValue(i);
            pausa(30);
        }
    }
    
    public void pausa(int mlSeg){
        try{
            Thread.sleep(mlSeg);
        }
        catch (Exception e){
            
        }
    }
    
}
