package com.applovin.impl.adview.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.AbstractC1568h2;
import com.applovin.impl.AbstractC1819y1;
import com.applovin.impl.C1548f2;
import com.applovin.impl.C1562g6;
import com.applovin.impl.C1679p2;
import com.applovin.impl.C1781u;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.adview.activity.a */
/* JADX INFO: loaded from: classes3.dex */
public class ServiceConnectionC1492a implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private final C1748l f1070a;

    /* JADX INFO: renamed from: b */
    private final C1768p f1071b;

    /* JADX INFO: renamed from: c */
    private final WeakReference f1072c;

    /* JADX INFO: renamed from: d */
    private final AtomicBoolean f1073d = new AtomicBoolean();

    /* JADX INFO: renamed from: e */
    private Messenger f1074e;

    /* JADX INFO: renamed from: com.applovin.impl.adview.activity.a$a */
    class a implements AppLovinAdLoadListener {

        /* JADX INFO: renamed from: com.applovin.impl.adview.activity.a$a$a, reason: collision with other inner class name */
        class C15433a implements AbstractC1819y1.g {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ AppLovinFullscreenActivity f1076a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ AppLovinAd f1077b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ b f1078c;

            C15433a(AppLovinFullscreenActivity appLovinFullscreenActivity, AppLovinAd appLovinAd, b bVar) {
                this.f1076a = appLovinFullscreenActivity;
                this.f1077b = appLovinAd;
                this.f1078c = bVar;
            }

            @Override // com.applovin.impl.AbstractC1819y1.g
            /* JADX INFO: renamed from: a */
            public void mo1754a(AbstractC1819y1 abstractC1819y1) {
                this.f1076a.setPresenter(abstractC1819y1);
                abstractC1819y1.mo2091w();
            }

            @Override // com.applovin.impl.AbstractC1819y1.g
            /* JADX INFO: renamed from: a */
            public void mo1755a(String str, Throwable th) {
                C1679p2.m3847a((AbstractC1736b) this.f1077b, this.f1078c, str, th, this.f1076a);
                Map mapM2787a = AbstractC1568h2.m2787a((AppLovinAdImpl) this.f1077b);
                CollectionUtils.putStringIfValid("source", "processAdResponse", mapM2787a);
                CollectionUtils.putStringIfValid("error_message", str, mapM2787a);
                CollectionUtils.putStringIfValid("top_main_method", th.toString(), mapM2787a);
                ServiceConnectionC1492a.this.f1070a.m4830g().m2682d(C1548f2.f1474F, mapM2787a);
            }
        }

        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) ServiceConnectionC1492a.this.f1072c.get();
            if (appLovinFullscreenActivity != null) {
                C1768p unused = ServiceConnectionC1492a.this.f1071b;
                if (C1768p.m5160a()) {
                    ServiceConnectionC1492a.this.f1071b.m5171a("AppLovinFullscreenActivity", "Presenting ad...");
                }
                b bVar = new b(ServiceConnectionC1492a.this, null);
                AbstractC1819y1.m5621a((AbstractC1736b) appLovinAd, bVar, bVar, bVar, null, ServiceConnectionC1492a.this.f1070a, appLovinFullscreenActivity, new C15433a(appLovinFullscreenActivity, appLovinAd, bVar));
                return;
            }
            C1768p unused2 = ServiceConnectionC1492a.this.f1071b;
            if (C1768p.m5160a()) {
                ServiceConnectionC1492a.this.f1071b.m5174b("AppLovinFullscreenActivity", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            ServiceConnectionC1492a.this.m1986a("failed_to_receive_ad");
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.adview.activity.a$b */
    private class b implements AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
        private b() {
        }

        /* synthetic */ b(ServiceConnectionC1492a serviceConnectionC1492a, a aVar) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private void m1992a(Bundle bundle, FullscreenAdService.EnumC1491c enumC1491c) {
            Message messageObtain = Message.obtain((Handler) null, enumC1491c.m1983b());
            if (bundle != null) {
                messageObtain.setData(bundle);
            }
            try {
                ServiceConnectionC1492a.this.f1074e.send(messageObtain);
            } catch (RemoteException e) {
                C1768p unused = ServiceConnectionC1492a.this.f1071b;
                if (C1768p.m5160a()) {
                    ServiceConnectionC1492a.this.f1071b.m5172a("AppLovinFullscreenActivity", "Failed to forward callback (" + enumC1491c.m1983b() + ")", e);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        private void m1993a(FullscreenAdService.EnumC1491c enumC1491c) {
            m1992a(null, enumC1491c);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            m1993a(FullscreenAdService.EnumC1491c.AD_CLICKED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            m1993a(FullscreenAdService.EnumC1491c.AD_DISPLAYED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            m1993a(FullscreenAdService.EnumC1491c.AD_HIDDEN);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            m1993a(FullscreenAdService.EnumC1491c.AD_VIDEO_STARTED);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putDouble("percent_viewed", d);
            bundle.putBoolean("fully_watched", z);
            m1992a(bundle, FullscreenAdService.EnumC1491c.AD_VIDEO_ENDED);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.adview.activity.a$c */
    private static class c extends Handler {

        /* JADX INFO: renamed from: a */
        private final WeakReference f1081a;

        private c(ServiceConnectionC1492a serviceConnectionC1492a) {
            this.f1081a = new WeakReference(serviceConnectionC1492a);
        }

        /* synthetic */ c(ServiceConnectionC1492a serviceConnectionC1492a, a aVar) {
            this(serviceConnectionC1492a);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ServiceConnectionC1492a serviceConnectionC1492a;
            if (message.what != FullscreenAdService.EnumC1491c.AD.m1983b() || (serviceConnectionC1492a = (ServiceConnectionC1492a) this.f1081a.get()) == null) {
                super.handleMessage(message);
            } else {
                serviceConnectionC1492a.m1989b(message.getData().getString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE));
            }
        }
    }

    public ServiceConnectionC1492a(AppLovinFullscreenActivity appLovinFullscreenActivity, C1748l c1748l) {
        this.f1070a = c1748l;
        this.f1071b = c1748l.m4782Q();
        this.f1072c = new WeakReference(appLovinFullscreenActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m1986a(String str) {
        AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) this.f1072c.get();
        if (appLovinFullscreenActivity != null) {
            if (C1768p.m5160a()) {
                this.f1071b.m5171a("AppLovinFullscreenActivity", "Dismissing...");
            }
            appLovinFullscreenActivity.dismiss(str);
        } else if (C1768p.m5160a()) {
            this.f1071b.m5174b("AppLovinFullscreenActivity", "Unable to dismiss parent Activity");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m1989b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = JsonUtils.getString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, "");
            if (!TextUtils.isEmpty(string)) {
                this.f1070a.m4853s0().m2603a(new C1562g6(jSONObject, C1781u.m5252a(string), true, new a(), this.f1070a));
            } else {
                throw new IllegalStateException("No zone identifier found in ad response: " + jSONObject);
            }
        } catch (JSONException e) {
            if (C1768p.m5160a()) {
                this.f1071b.m5172a("AppLovinFullscreenActivity", "Unable to process ad: " + str, e);
            }
            m1986a("failed_to_process_ad");
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f1073d.compareAndSet(false, true)) {
            if (C1768p.m5160a()) {
                this.f1071b.m5171a("AppLovinFullscreenActivity", "Fullscreen ad service connected to " + componentName);
            }
            this.f1074e = new Messenger(iBinder);
            Message messageObtain = Message.obtain((Handler) null, FullscreenAdService.EnumC1491c.AD.m1983b());
            messageObtain.replyTo = new Messenger(new c(this, null));
            try {
                if (C1768p.m5160a()) {
                    this.f1071b.m5171a("AppLovinFullscreenActivity", "Requesting ad from FullscreenAdService...");
                }
                this.f1074e.send(messageObtain);
            } catch (RemoteException e) {
                if (C1768p.m5160a()) {
                    this.f1071b.m5172a("AppLovinFullscreenActivity", "Failed to send ad request message to FullscreenAdService", e);
                }
                m1986a("failed_to_send_ad_request");
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f1073d.compareAndSet(true, false) && C1768p.m5160a()) {
            this.f1071b.m5171a("AppLovinFullscreenActivity", "FullscreenAdService disconnected from " + componentName);
        }
    }
}
