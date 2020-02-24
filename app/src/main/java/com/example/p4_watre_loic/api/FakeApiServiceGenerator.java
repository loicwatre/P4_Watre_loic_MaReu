package com.example.p4_watre_loic.api;

import com.example.p4_watre_loic.réu.Reu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class FakeApiServiceGenerator {
    static List<Reu> generateReunions() {
        return new ArrayList<>(FAKE_REUNIONS);
    }

    public static List<Reu> FAKE_REUNIONS = Arrays.asList(
            new Reu("Réunion A", "14h", "mario","maxime@lamazone.com,alex@lamazone.com"),
            new Reu("Réunion B", "15h", "peach","paul@lamazone.com,viviane@lamazone.com"),
            new Reu("Réunion C", "16h", "luigi","amandine@lamazone.com,luc@lamazone.com")
    );
}