package com.monopatin.monopatinservice.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(value = "parada")
@Getter
@Setter
@NoArgsConstructor
public class Parada {

    @Id
    private ObjectId idParada;
    private String nombre;
    private String ubicacion;
    private String estado;
    private List<Monopatin> monopatin = new ArrayList<>();

    public void addMonopatin(Monopatin m){
        monopatin.add(m);
    }
}
