package MyReuApp;

import android.app.Application;

import androidx.annotation.VisibleForTesting;

import com.example.p4_watre_loic.di.Injection;
import com.example.p4_watre_loic.repository.Reurepository;

public class MaReuApplication extends Application {

    private Reurepository reuRepository;


    public Reurepository getReuRepository() {
        if (reuRepository == null) reuRepository = Injection.createReuRepository();
        return reuRepository;
    }

    @VisibleForTesting
    public void resetReuRepository() {
        reuRepository = null;
    }
}
