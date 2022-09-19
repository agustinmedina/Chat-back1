package com.example.Chatwebsocket.models.service;

import com.example.Chatwebsocket.models.documents.Mensaje;

import java.util.List;

public interface ChatService {

    public List<Mensaje> obtenerUltimos10Mensajes();
    public Mensaje guardar(Mensaje mensaje);
}
