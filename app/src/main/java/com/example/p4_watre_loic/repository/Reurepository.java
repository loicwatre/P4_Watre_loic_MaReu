package com.example.p4_watre_loic.repository;

import com.example.p4_watre_loic.api.ApiService;
import com.example.p4_watre_loic.réu.Reu;

import java.util.List;

public class Reurepository {

    private final ApiService apiService;

    public Reurepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<Reu> getReunions() {
        return apiService.getReunions();
    }

    public void deleteReu(Reu reu) {
        apiService.deleteReu(reu);
    }
}

