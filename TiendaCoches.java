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
    
    public void setPropietario(String nuevoPropietario) {
            propietario = nuevoPropietario;
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
        
        System.out.println("Propietario:" + propietario + " | " + "Estado del depósito de gasolina:" + litrosActualesDeGasolina + " | " + "Motor arrancado:" + motorArrancado);
    
        
    }
    
    public boolean estadoDelVehiculo() {
        return motorArrancado;
    }
    
    public String obtenerDetalles() {
    String detalles = "Propietario: " + propietario + "   Estado del deposito de gasolina: " + litrosActualesDeGasolina + "    Motor arrancado: " + motorArrancado;
    
    return detalles;
    }
    
    
}
