public class TiendaCoches {

    private String propietario;
    private int litrosActualesDeGasolina;
    private boolean motorArrancado;
   


    public TiendaCoches(String nombrePropietario, int litros, boolean arrancado) {
        propietario = nombrePropietario;
        litrosActualesDeGasolina = litros;
        motorArrancado = arrancado;
    }

   
   public String getnombrePropietario() {
       return propietario; 
    }

    public int getlitros() {
        return litrosActualesDeGasolina;
    }
   
    public boolean motorArrancado() {
        if(motorArrancado == true) {
            System.out.println("Coche arrancado");
            
        }
        else {
            System.out.println("Coche apagado");
        }
    return motorArrancado;
    }
    
    public String setpropietario() {
            return propietario;
    }
    
    public void repostarGasolina(int litrosRepostados) {
        litrosActualesDeGasolina = litrosActualesDeGasolina + litrosRepostados; 
    }
    
    public void girarLlave() {
        if(motorArrancado == true) {
            motorArrancado = false;
        }
        else {
            motorArrancado = true;
        }
    }
    
    public void imprimeDetalles() {
        System.out.println("Propietario:" + propietario + " | " + "Estado del dep�sito de gasolina:" + litrosActualesDeGasolina + " | " + "Motor arrancado:" + motorArrancado);
    }
    
    public boolean estadoDelVeh�culo() {
        return motorArrancado;
    }
}