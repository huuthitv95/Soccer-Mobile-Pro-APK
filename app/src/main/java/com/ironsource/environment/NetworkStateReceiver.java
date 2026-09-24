package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ironsource.C12317m4;
import com.ironsource.InterfaceC12605xc;
import com.ironsource.environment.thread.IronSourceThreadManager;

/* JADX INFO: loaded from: classes6.dex */
public class NetworkStateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private ConnectivityManager f30335a;

    /* JADX INFO: renamed from: b */
    private InterfaceC12605xc f30336b;

    /* JADX INFO: renamed from: c */
    private boolean f30337c = false;

    /* JADX INFO: renamed from: com.ironsource.environment.NetworkStateReceiver$a */
    class RunnableC12175a implements Runnable {
        RunnableC12175a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NetworkStateReceiver networkStateReceiver = NetworkStateReceiver.this;
            InterfaceC12605xc interfaceC12605xc = networkStateReceiver.f30336b;
            if (interfaceC12605xc != null) {
                interfaceC12605xc.mo31712a(networkStateReceiver.f30337c);
            }
        }
    }

    public NetworkStateReceiver(Context context, InterfaceC12605xc interfaceC12605xc) {
        this.f30336b = interfaceC12605xc;
        if (context != null) {
            this.f30335a = (ConnectivityManager) context.getSystemService("connectivity");
        }
        m31380a();
    }

    /* JADX INFO: renamed from: a */
    private boolean m31380a() {
        boolean z = this.f30337c;
        ConnectivityManager connectivityManager = this.f30335a;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                this.f30337c = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                this.f30337c = false;
            }
        } else {
            this.f30337c = false;
        }
        return z != this.f30337c;
    }

    /* JADX INFO: renamed from: b */
    private void m31381b() {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new RunnableC12175a());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getExtras() == null || !m31380a()) {
            return;
        }
        m31381b();
    }
}
