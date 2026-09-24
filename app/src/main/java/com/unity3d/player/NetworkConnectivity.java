package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes7.dex */
public class NetworkConnectivity extends Activity {

    /* JADX INFO: renamed from: a */
    private final int f41527a = 0;

    /* JADX INFO: renamed from: b */
    private final int f41528b = 1;

    /* JADX INFO: renamed from: c */
    private final int f41529c = 2;

    /* JADX INFO: renamed from: d */
    private int f41530d;

    /* JADX INFO: renamed from: e */
    private ConnectivityManager f41531e;

    /* JADX INFO: renamed from: f */
    private final ConnectivityManager.NetworkCallback f41532f;

    public NetworkConnectivity(Context context) {
        this.f41530d = 0;
        ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.unity3d.player.NetworkConnectivity.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                super.onAvailable(network);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                NetworkConnectivity networkConnectivity;
                int i;
                super.onCapabilitiesChanged(network, networkCapabilities);
                if (networkCapabilities.hasTransport(0)) {
                    networkConnectivity = NetworkConnectivity.this;
                    i = 1;
                } else {
                    networkConnectivity = NetworkConnectivity.this;
                    i = 2;
                }
                networkConnectivity.f41530d = i;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                super.onLost(network);
                NetworkConnectivity.this.f41530d = 0;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onUnavailable() {
                super.onUnavailable();
                NetworkConnectivity.this.f41530d = 0;
            }
        };
        this.f41532f = networkCallback;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f41531e = connectivityManager;
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
        NetworkInfo activeNetworkInfo = this.f41531e.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return;
        }
        this.f41530d = activeNetworkInfo.getType() != 0 ? 2 : 1;
    }

    /* JADX INFO: renamed from: a */
    public final int m43215a() {
        return this.f41530d;
    }

    /* JADX INFO: renamed from: b */
    public final void m43216b() {
        this.f41531e.unregisterNetworkCallback(this.f41532f);
    }
}
