package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.ironsource.C11794a2;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13219q0;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.info.provider.subprovider.b */
/* JADX INFO: compiled from: NetworkStatusProvider.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12780b {

    /* JADX INFO: renamed from: f */
    private static volatile C12780b f34044f;

    /* JADX INFO: renamed from: a */
    private ConnectivityManager f34045a;

    /* JADX INFO: renamed from: b */
    private TelephonyManager f34046b;

    /* JADX INFO: renamed from: c */
    public int f34047c = 0;

    /* JADX INFO: renamed from: d */
    public String f34048d = "UNKNOWN";

    /* JADX INFO: renamed from: e */
    public int f34049e = 0;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.info.provider.subprovider.b$a */
    /* JADX INFO: compiled from: NetworkStatusProvider.java */
    public final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
        public a() {
        }

        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            if (overrideNetworkType == 1 || overrideNetworkType == 2) {
                C12780b.this.f34047c = 4;
                return;
            }
            if (overrideNetworkType == 3) {
                C12780b c12780b = C12780b.this;
                c12780b.f34047c = 5;
                c12780b.f34048d = "5G NSA";
            } else {
                if (overrideNetworkType != 5) {
                    return;
                }
                C12780b c12780b2 = C12780b.this;
                c12780b2.f34047c = 5;
                c12780b2.f34048d = "5G+";
            }
        }
    }

    private C12780b() {
        m35262a();
    }

    /* JADX INFO: renamed from: a */
    private int m35261a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
            case 19:
                return 4;
            case 20:
                return 5;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35262a() {
        Context contextM36542d = C13008c.m36588n().m36542d();
        if (contextM36542d == null) {
            this.f34047c = 0;
            this.f34048d = "UNKNOWN";
            this.f34049e = 0;
            return;
        }
        ConnectivityManager connectivityManager = this.f34045a;
        if (connectivityManager == null || this.f34046b == null) {
            if (connectivityManager == null) {
                this.f34045a = (ConnectivityManager) contextM36542d.getSystemService("connectivity");
            }
            if (this.f34046b == null) {
                TelephonyManager telephonyManager = (TelephonyManager) contextM36542d.getSystemService("phone");
                this.f34046b = telephonyManager;
                if (Build.VERSION.SDK_INT < 31 || telephonyManager == null) {
                    return;
                }
                this.f34046b.registerTelephonyCallback(C13167a.m37545d(), new a());
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static C12780b m35263e() {
        if (f34044f == null) {
            synchronized (C12780b.class) {
                if (f34044f == null) {
                    f34044f = new C12780b();
                }
            }
        }
        return f34044f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m35264f() {
        int i = Build.VERSION.SDK_INT;
        NetworkCapabilities networkCapabilities = this.f34045a.getNetworkCapabilities(this.f34045a.getActiveNetwork());
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(1)) {
                this.f34047c = 9;
                this.f34048d = "WIFI";
            }
            if (networkCapabilities.hasTransport(0)) {
                if (i >= 24) {
                    this.f34047c = m35266c();
                } else {
                    this.f34047c = m35267d();
                }
            }
            this.f34049e = networkCapabilities.hasTransport(4) ? 1 : m35268g();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m35265b() {
        m35262a();
        C13167a.m37545d().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.b$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m35264f();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public int m35266c() {
        try {
            TelephonyManager telephonyManager = this.f34046b;
            if (telephonyManager == null) {
                return 0;
            }
            int dataNetworkType = telephonyManager.getDataNetworkType();
            this.f34048d = String.valueOf(dataNetworkType);
            return m35261a(dataNetworkType);
        } catch (Throwable th) {
            C13219q0.m37816b("NetworkStatusProvider", th.getMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public int m35267d() {
        try {
            TelephonyManager telephonyManager = this.f34046b;
            if (telephonyManager == null) {
                return 0;
            }
            int networkType = telephonyManager.getNetworkType();
            this.f34048d = String.valueOf(networkType);
            return m35261a(networkType);
        } catch (Throwable th) {
            C13219q0.m37816b("NetworkStatusProvider", th.getMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public int m35268g() {
        try {
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (TextUtils.isEmpty(property2)) {
                property2 = C11794a2.f26725f;
            }
            return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? 0 : 2;
        } catch (Throwable th) {
            C13219q0.m37816b("NetworkStatusProvider", th.getMessage());
            return 0;
        }
    }
}
