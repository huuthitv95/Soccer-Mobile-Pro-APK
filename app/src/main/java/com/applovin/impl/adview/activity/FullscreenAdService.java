package com.applovin.impl.adview.activity;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.AbstractC1793v2;
import com.applovin.impl.C1679p2;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;

/* JADX INFO: loaded from: classes3.dex */
public class FullscreenAdService extends Service {
    public static final String DATA_KEY_RAW_FULL_AD_RESPONSE = "raw_full_ad_response";
    private static final String TAG = "FullscreenAdService";

    /* JADX INFO: renamed from: com.applovin.impl.adview.activity.FullscreenAdService$b */
    private static class HandlerC1490b extends Handler {
        private HandlerC1490b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                C1679p2 c1679p2 = AppLovinFullscreenActivity.parentInterstitialWrapper;
                if (c1679p2 == null) {
                    if (!AbstractC1701q7.m4061a(1.0d)) {
                        super.handleMessage(message);
                        return;
                    } else {
                        throw new RuntimeException("parentWrapper is null for " + message.what);
                    }
                }
                AbstractC1736b abstractC1736bM3866f = c1679p2.m3866f();
                int i = message.what;
                EnumC1491c enumC1491c = EnumC1491c.AD;
                if (i == enumC1491c.m1983b()) {
                    Bundle bundle = new Bundle();
                    bundle.putString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE, abstractC1736bM3866f.getRawFullResponse());
                    Message messageObtain = Message.obtain((Handler) null, enumC1491c.m1983b());
                    messageObtain.setData(bundle);
                    try {
                        message.replyTo.send(messageObtain);
                        return;
                    } catch (RemoteException e) {
                        C1768p.m5164c(FullscreenAdService.TAG, "Failed to respond to Fullscreen Activity in another process with ad", e);
                        return;
                    }
                }
                if (message.what == EnumC1491c.AD_DISPLAYED.m1983b()) {
                    AbstractC1793v2.m5388a(c1679p2.m3864c(), abstractC1736bM3866f);
                    return;
                }
                if (message.what == EnumC1491c.AD_CLICKED.m1983b()) {
                    AbstractC1793v2.m5387a(c1679p2.m3863b(), abstractC1736bM3866f);
                    return;
                }
                if (message.what == EnumC1491c.AD_VIDEO_STARTED.m1983b()) {
                    AbstractC1793v2.m5392a(c1679p2.m3865d(), abstractC1736bM3866f);
                    return;
                }
                if (message.what == EnumC1491c.AD_VIDEO_ENDED.m1983b()) {
                    Bundle data = message.getData();
                    AbstractC1793v2.m5393a(c1679p2.m3865d(), abstractC1736bM3866f, data.getDouble("percent_viewed"), data.getBoolean("fully_watched"));
                    return;
                }
                if (message.what == EnumC1491c.AD_HIDDEN.m1983b()) {
                    AbstractC1793v2.m5419b(c1679p2.m3864c(), abstractC1736bM3866f);
                } else {
                    super.handleMessage(message);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.adview.activity.FullscreenAdService$c */
    public enum EnumC1491c {
        AD(0),
        AD_DISPLAYED(1),
        AD_CLICKED(2),
        AD_VIDEO_STARTED(3),
        AD_VIDEO_ENDED(4),
        AD_HIDDEN(5);


        /* JADX INFO: renamed from: a */
        private final int f1069a;

        EnumC1491c(int i) {
            this.f1069a = i;
        }

        /* JADX INFO: renamed from: b */
        public int m1983b() {
            return this.f1069a;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new Messenger(new HandlerC1490b()).getBinder();
    }
}
