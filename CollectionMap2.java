package com.company;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CollectionMap2 {
    public static void main(String args[]) {

        // Decalaracion
        LinkedHashMap<Integer, String> cliente = new LinkedHashMap<Integer, String>();

        //Añadir elementos

        cliente.put(22, "Juan");
        cliente.put(33, "Enrique");
        cliente.put(1, "Laura");
        cliente.put(2, "Sara");
        cliente.put(100, "Javier");

        //Generating a Set of entries
        Set set = cliente.entrySet();

        // Displaying elements of LinkedHashMap

        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry me = (Map.Entry) iterator.next();
            System.out.println("La clave es: " + me.getKey() + " y Valor es: " + me.getValue());

        }
    }
}
