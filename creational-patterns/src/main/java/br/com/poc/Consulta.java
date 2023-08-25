package br.com.poc;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Consulta {

    public static void main(String[] args) {
        Map<String, String> params = new HashMap<>();
        params.put("idCliente", UUID.randomUUID().toString());

    }

}
