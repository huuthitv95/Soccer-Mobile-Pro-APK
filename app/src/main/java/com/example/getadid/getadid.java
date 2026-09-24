package com.example.getadid;

import android.app.Activity;
import android.os.AsyncTask;
import com.example.copyasset.PluginCallback;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class getadid {
    public static void getAdid(final Activity activity, final PluginCallback pluginCallback) {
        new AsyncTask<Void, Void, String>() { // from class: com.example.getadid.getadid.1
            Boolean succeed = false;

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public String doInBackground(Void... voidArr) {
                AdvertisingIdClient.Info advertisingIdInfo;
                String id = null;
                try {
                    advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(activity);
                } catch (GooglePlayServicesNotAvailableException e) {
                    e.printStackTrace();
                    advertisingIdInfo = null;
                } catch (GooglePlayServicesRepairableException e2) {
                    e2.printStackTrace();
                    advertisingIdInfo = null;
                } catch (IOException e3) {
                    e3.printStackTrace();
                    advertisingIdInfo = null;
                }
                try {
                    if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                        return null;
                    }
                    id = advertisingIdInfo.getId();
                    this.succeed = true;
                    return id;
                } catch (NullPointerException e4) {
                    e4.printStackTrace();
                    return id;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public void onPostExecute(String str) {
                pluginCallback.OnOperationFinish(this.succeed.booleanValue(), str);
            }
        }.execute(new Void[0]);
    }
}
