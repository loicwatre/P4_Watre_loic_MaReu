package com.example.p4_watre_loic.di;

import com.example.p4_watre_loic.api.FakeApiService;
import com.example.p4_watre_loic.repository.Reurepository;

public class Injection {
    public static Reurepository createReuRepository() {
        return new Reurepository(new FakeApiService());
    }

}
