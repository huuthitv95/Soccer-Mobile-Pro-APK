package com.google.ads.mediation.chartboost;

import android.content.Context;
import android.util.Log;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.events.StartError;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class ChartboostInitializer {
    private static ChartboostInitializer instance;
    private boolean isInitializing = false;
    private boolean isInitialized = false;
    private final ArrayList<Listener> initListeners = new ArrayList<>();

    interface Listener {
        void onInitializationFailed(AdError adError);

        void onInitializationSucceeded();
    }

    protected static void clearInstance() {
        instance = null;
    }

    public static ChartboostInitializer getInstance() {
        if (instance == null) {
            instance = new ChartboostInitializer();
        }
        return instance;
    }

    public void initialize(Context context, ChartboostParams chartboostParams, Listener listener) {
        if (this.isInitializing) {
            this.initListeners.add(listener);
            return;
        }
        if (this.isInitialized) {
            listener.onInitializationSucceeded();
            return;
        }
        this.isInitializing = true;
        this.initListeners.add(listener);
        ChartboostAdapterUtils.updateCoppaStatus(context, MobileAds.getRequestConfiguration());
        Chartboost.startWithAppId(context, chartboostParams.getAppId(), chartboostParams.getAppSignature(), new StartCallback() { // from class: com.google.ads.mediation.chartboost.ChartboostInitializer.1
            @Override // com.chartboost.sdk.callbacks.StartCallback
            public void onStartCompleted(StartError startError) {
                ChartboostInitializer.this.isInitializing = false;
                if (startError == null) {
                    ChartboostInitializer.this.isInitialized = true;
                    Log.d(ChartboostMediationAdapter.TAG, "Chartboost SDK initialized.");
                    Iterator it = ChartboostInitializer.this.initListeners.iterator();
                    while (it.hasNext()) {
                        ((Listener) it.next()).onInitializationSucceeded();
                    }
                } else {
                    ChartboostInitializer.this.isInitialized = false;
                    AdError adErrorCreateSDKError = ChartboostConstants.createSDKError(startError);
                    Iterator it2 = ChartboostInitializer.this.initListeners.iterator();
                    while (it2.hasNext()) {
                        ((Listener) it2.next()).onInitializationFailed(adErrorCreateSDKError);
                    }
                }
                ChartboostInitializer.this.initListeners.clear();
            }
        });
    }
}
