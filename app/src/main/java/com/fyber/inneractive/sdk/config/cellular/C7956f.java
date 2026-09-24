package com.fyber.inneractive.sdk.config.cellular;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.fyber.inneractive.sdk.util.AbstractC9162k;
import com.fyber.inneractive.sdk.util.EnumC9134a1;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.cellular.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C7956f extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public InterfaceC7958h f17711a;

    /* JADX INFO: renamed from: b */
    public final ConnectivityManager f17712b;

    public C7956f(ConnectivityManager connectivityManager, InterfaceC7958h interfaceC7958h) {
        this.f17711a = interfaceC7958h;
        this.f17712b = connectivityManager;
    }

    /* JADX INFO: renamed from: a */
    public final void m20391a() {
        this.f17711a = null;
        ConnectivityManager connectivityManager = this.f17712b;
        if (connectivityManager != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this);
            } catch (Throwable th) {
                IAlog.m21944a("failed to unregister network callback", th, new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20392b() {
        ConnectivityManager connectivityManager = this.f17712b;
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(this);
            } catch (Throwable th) {
                IAlog.m21944a("failed to register network callback", th, new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m20393c() {
        ConnectivityManager connectivityManager = this.f17712b;
        if (connectivityManager != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this);
            } catch (Throwable th) {
                IAlog.m21944a("failed to unregister network callback", th, new Object[0]);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003b  */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        EnumC9134a1 enumC9134a1 = EnumC9134a1.UNKNOWN;
        if (networkCapabilities.hasTransport(3)) {
            enumC9134a1 = EnumC9134a1.ETHERNET;
        } else if (networkCapabilities.hasTransport(0)) {
            int iM21975k = AbstractC9162k.m21975k();
            if (iM21975k != 0) {
                if (iM21975k == 3) {
                    enumC9134a1 = EnumC9134a1.MOBILE_3G;
                } else if (iM21975k == 18) {
                    enumC9134a1 = EnumC9134a1.WIFI;
                } else if (iM21975k == 20) {
                    enumC9134a1 = EnumC9134a1.MOBILE_5G;
                } else if (iM21975k != 5 && iM21975k != 6) {
                    switch (iM21975k) {
                        default:
                            switch (iM21975k) {
                                case 12:
                                case 14:
                                case 15:
                                    break;
                                case 13:
                                    enumC9134a1 = EnumC9134a1.MOBILE_4G;
                                    break;
                                default:
                                    enumC9134a1 = EnumC9134a1.CELLULAR;
                                    break;
                            }
                        case 8:
                        case 9:
                        case 10:
                            enumC9134a1 = EnumC9134a1.MOBILE_3G;
                            break;
                    }
                } else {
                    enumC9134a1 = EnumC9134a1.MOBILE_3G;
                }
            }
        } else if (networkCapabilities.hasTransport(1)) {
            enumC9134a1 = EnumC9134a1.WIFI;
        }
        InterfaceC7958h interfaceC7958h = this.f17711a;
        if (interfaceC7958h != null) {
            interfaceC7958h.mo20337a(enumC9134a1);
        }
    }
}
