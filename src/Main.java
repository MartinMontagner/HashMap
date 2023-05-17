import tp4.Persona;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("a");
        Persona p1 = new Persona("martin", 36,'J',78.5,173.5);
        Persona p2 = new Persona("lucA", 12,'J',78.5,173.5);
        HashMap<String,Persona>mapita=new HashMap<>();
        mapita.put(p1.getDni(),p1);
        mapita.put(p2.getDni(), p2);
        for(Map.Entry<String,Persona>mostrarMapita : mapita.entrySet())
        {
            if(mostrarMapita.getValue().esMayorDeEdad())
                System.out.println("Clave: "+mostrarMapita.getKey() + " Value: "+mostrarMapita.getValue());
        }

    }
}