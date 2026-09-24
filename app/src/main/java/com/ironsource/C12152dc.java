package com.ironsource;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.dc */
/* JADX INFO: loaded from: classes6.dex */
public class C12152dc implements InterfaceC12439q7 {

    /* JADX INFO: renamed from: a */
    private String f30247a = "dc";

    /* JADX INFO: renamed from: b */
    private int f30248b = 23;

    /* JADX INFO: renamed from: c */
    private final InterfaceC12457r7 f30249c;

    /* JADX INFO: renamed from: d */
    private ConnectivityManager.NetworkCallback f30250d;

    /* JADX INFO: renamed from: com.ironsource.dc$a */
    class a extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f30251a;

        a(Context context) {
            this.f30251a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network != null) {
                C12152dc.this.f30249c.mo27321a(C11693U3.m27574a(network, this.f30251a), C11693U3.m27575a(this.f30251a, network));
                return;
            }
            InterfaceC12457r7 interfaceC12457r7 = C12152dc.this.f30249c;
            String strM27576b = C11693U3.m27576b(this.f30251a);
            Context context = this.f30251a;
            interfaceC12457r7.mo27321a(strM27576b, C11693U3.m27575a(context, C11693U3.m27571a(context)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                C12152dc.this.f30249c.mo27324b(C11693U3.m27574a(network, this.f30251a), C11693U3.m27575a(this.f30251a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                C12152dc.this.f30249c.mo27324b(C11693U3.m27574a(network, this.f30251a), C11693U3.m27575a(this.f30251a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (C11693U3.m27576b(this.f30251a).equals("none")) {
                C12152dc.this.f30249c.mo27320a();
            }
        }
    }

    public C12152dc(InterfaceC12457r7 interfaceC12457r7) {
        this.f30249c = interfaceC12457r7;
    }

    @Override // com.ironsource.InterfaceC12439q7
    /* JADX INFO: renamed from: a */
    public void mo31314a(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.f30248b || this.f30250d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.f30250d);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            Log.e(this.f30247a, "NetworkCallback for was not registered or already unregistered");
        }
    }

    @Override // com.ironsource.InterfaceC12439q7
    /* JADX INFO: renamed from: b */
    public void mo31315b(Context context) {
        if (Build.VERSION.SDK_INT >= this.f30248b) {
            mo31314a(context);
            if (C11693U3.m27576b(context).equals("none")) {
                this.f30249c.mo27320a();
            }
            if (this.f30250d == null) {
                this.f30250d = new a(context);
            }
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(networkRequestBuild, this.f30250d);
                }
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                Log.e(this.f30247a, "NetworkCallback was not able to register");
            }
        }
    }

    @Override // com.ironsource.InterfaceC12439q7
    /* JADX INFO: renamed from: c */
    public JSONObject mo31316c(Context context) {
        return C11693U3.m27575a(context, C11693U3.m27571a(context));
    }

    @Override // com.ironsource.InterfaceC12439q7
    /* JADX INFO: renamed from: a */
    public void mo31313a() {
        this.f30250d = null;
    }
}
