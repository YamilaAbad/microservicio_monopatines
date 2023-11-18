package com.monopatin.monopatinservice.Service;

import com.monopatin.monopatinservice.DTO.MonopatinDTO;
import com.monopatin.monopatinservice.DTO.PausaDTO;
import com.monopatin.monopatinservice.DTO.ViajeDTO;
import com.monopatin.monopatinservice.Model.Monopatin;
import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;

import java.util.Optional;
import java.util.List;
public interface MonopatinService {
    void guardarMonopatin(MonopatinDTO monopatin);

    String eliminarMonopatin(ObjectId id);

    //actualiza todos los datos del monopatin
    Optional<Monopatin> actulizarMonopatin(int km, String ubicacion, String estado, ObjectId id);

    Optional<Monopatin> obtenerMonopatin(ObjectId id);

    List<Monopatin> listaMonopatines();

    List<Monopatin> reporteMonopatinesPorKmR(int km);

    String cantidadDeMonopatinesEstados();

    List<MonopatinDTO> monopatinesCercanos(String ubicacion);

    void iniciarViaje(String viaje, ViajeDTO viajeDTO, ObjectId idMon, String token);
    //void iniciarViaje(String viaje, ViajeDTO viajeDTO, ObjectId idMon);
    void finalizarViaje(String viaje, ViajeDTO viajeDTO, int idViaje, String token);

    void pausarViaje(String s, PausaDTO pausaDTO, int viajeId);

    void cancelarPausaEnViaje(String viaje, PausaDTO pausaDTO, int idPausa);


    List<ViajeDTO> consultarViajesPorAño(String s, int anio, String token);

    List<Monopatin> obtenerMonopatinConMasViajesEnAnio(int anio, String token, int x);

    List<ViajeDTO>obtenerTodosLosViajes(String viaje, String token);

    List<ViajeDTO> obtenerTodosLosViajesConPausas(String viaje, String token);

    List<ViajeDTO> obtenerTodosLosViajesSinPausas(String s, String token);

    ResponseEntity<String> generarInformeUsoMonopatines(String viaje, int kmParaMantenimiento, boolean incluirPausas, java.lang.String token);

}


