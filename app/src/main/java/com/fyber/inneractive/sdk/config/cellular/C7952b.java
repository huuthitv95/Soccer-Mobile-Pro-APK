package com.fyber.inneractive.sdk.config.cellular;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import com.fyber.inneractive.sdk.util.EnumC9134a1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.cellular.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C7952b extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f17704a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b */
    public InterfaceC7958h f17705b;

    /* JADX INFO: renamed from: c */
    public final TelephonyManager f17706c;

    public C7952b(TelephonyManager telephonyManager, InterfaceC7958h interfaceC7958h) {
        this.f17706c = telephonyManager;
        this.f17705b = interfaceC7958h;
    }

    /* JADX INFO: renamed from: a */
    public final void m20384a() {
        this.f17705b = null;
        TelephonyManager telephonyManager = this.f17706c;
        if (telephonyManager != null) {
            telephonyManager.unregisterTelephonyCallback(this);
        }
        this.f17704a.shutdownNow();
    }

    /* JADX INFO: renamed from: b */
    public final void m20385b() {
        TelephonyManager telephonyManager = this.f17706c;
        if (telephonyManager != null) {
            telephonyManager.registerTelephonyCallback(this.f17704a, this);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m20386c() {
        TelephonyManager telephonyManager = this.f17706c;
        if (telephonyManager != null) {
            telephonyManager.unregisterTelephonyCallback(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0034  */
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        EnumC9134a1 enumC9134a1;
        int networkType = telephonyDisplayInfo.getNetworkType();
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        if (overrideNetworkType == 2 || overrideNetworkType == 3 || overrideNetworkType == 5) {
            enumC9134a1 = EnumC9134a1.MOBILE_5G;
        } else if (networkType == 0) {
            enumC9134a1 = EnumC9134a1.UNKNOWN;
        } else if (networkType == 3) {
            enumC9134a1 = EnumC9134a1.MOBILE_3G;
        } else if (networkType == 18) {
            enumC9134a1 = EnumC9134a1.WIFI;
        } else if (networkType == 20) {
            enumC9134a1 = EnumC9134a1.MOBILE_5G;
        } else if (networkType != 5 && networkType != 6) {
            switch (networkType) {
                default:
                    switch (networkType) {
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
        InterfaceC7958h interfaceC7958h = this.f17705b;
        if (interfaceC7958h != null) {
            interfaceC7958h.mo20337a(enumC9134a1);
        }
    }
}
