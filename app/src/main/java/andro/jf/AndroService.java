package andro.jf;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.widget.Toast;

public class AndroService extends Service {

    public void onCreate() {
    }
    public void onDestroy() {
    }
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Démarrage du service
        boolean b = true;
        while (b)
            ;
        return START_STICKY;
    }
    public IBinder onBind(Intent arg0) {
        return null;
    }
}