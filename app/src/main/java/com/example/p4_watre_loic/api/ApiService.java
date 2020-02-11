package com.example.p4_watre_loic.api;

import com.example.p4_watre_loic.réu.Reu;

import java.util.List;

public interface ApiService {
    List<Reu> getReunions();
    void deleteReu(Reu Reuname);
}
