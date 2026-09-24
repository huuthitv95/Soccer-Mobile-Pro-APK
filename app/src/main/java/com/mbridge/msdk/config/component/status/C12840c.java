package com.mbridge.msdk.config.component.status;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.core.content.ContextCompat;
import com.mbridge.msdk.config.component.base.C12710b;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.status.c */
/* JADX INFO: compiled from: MBNetworkEventPublisher.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12840c {

    /* JADX INFO: renamed from: b */
    ConnectivityManager f34406b;

    /* JADX INFO: renamed from: c */
    b f34407c;

    /* JADX INFO: renamed from: d */
    boolean f34408d;

    /* JADX INFO: renamed from: a */
    private final List<InterfaceC12838a> f34405a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e */
    private final ConnectivityManager.NetworkCallback f34409e = new a();

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.status.c$a */
    /* JADX INFO: compiled from: MBNetworkEventPublisher.java */
    class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            super.onCapabilitiesChanged(network, networkCapabilities);
            boolean zHasTransport = networkCapabilities.hasTransport(1);
            boolean zHasTransport2 = networkCapabilities.hasTransport(0);
            int iM35730c = zHasTransport ? 9 : -1;
            if (zHasTransport2) {
                iM35730c = C12840c.this.m35730c();
            }
            C12710b c12710b = new C12710b();
            c12710b.m34843b("916002");
            HashMap map = new HashMap();
            map.put(C12770c.m35209b("networkType"), String.valueOf(iM35730c));
            c12710b.m34841a(map);
            C12840c.this.m35725a(c12710b);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            super.onLost(network);
            C12710b c12710b = new C12710b();
            c12710b.m34843b("916002");
            HashMap map = new HashMap();
            map.put(C12770c.m35209b("networkType"), String.valueOf(C12840c.this.m35730c()));
            c12710b.m34841a(map);
            C12840c.this.m35725a(c12710b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.status.c$b */
    /* JADX INFO: compiled from: MBNetworkEventPublisher.java */
    private final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                int iM35730c = C12840c.this.m35730c();
                C12710b c12710b = new C12710b();
                c12710b.m34843b("916002");
                HashMap map = new HashMap();
                map.put(C12770c.m35209b("networkType"), String.valueOf(iM35730c));
                c12710b.m34841a(map);
                C12840c.this.m35725a(c12710b);
            } catch (Throwable th) {
                C13219q0.m37816b("MBNetworkEventPublisher", th.getMessage());
            }
        }

        /* synthetic */ b(C12840c c12840c, a aVar) {
            this();
        }
    }

    public C12840c() {
        m35724a(C13008c.m36588n().m36542d());
        m35723a();
    }

    /* JADX INFO: renamed from: b */
    public void m35729b(InterfaceC12838a interfaceC12838a) {
        this.f34405a.remove(interfaceC12838a);
    }

    /* JADX INFO: renamed from: c */
    public int m35730c() {
        NetworkInfo activeNetworkInfo;
        int dataNetworkType = 0;
        if (this.f34408d) {
            TelephonyManager telephonyManager = (TelephonyManager) C13008c.m36588n().m36542d().getSystemService("phone");
            if (telephonyManager != null) {
                dataNetworkType = Build.VERSION.SDK_INT >= 24 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType();
            }
            return C13211m0.m37737c(dataNetworkType);
        }
        ConnectivityManager connectivityManager = this.f34406b;
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return 0;
        }
        return C13211m0.m37737c(activeNetworkInfo.getSubtype());
    }

    /* JADX INFO: renamed from: d */
    public void m35731d() {
        if (this.f34405a.isEmpty()) {
            m35728b();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35723a() {
        int iCheckSelfPermission = ContextCompat.checkSelfPermission(C13008c.m36588n().m36542d(), "android.permission.READ_PHONE_STATE");
        boolean z = true;
        if (Build.VERSION.SDK_INT < 33) {
            this.f34408d = iCheckSelfPermission == 0;
            return;
        }
        int iCheckSelfPermission2 = ContextCompat.checkSelfPermission(C13008c.m36588n().m36542d(), "android.permission.READ_BASIC_PHONE_STATE");
        if (iCheckSelfPermission != 0 && iCheckSelfPermission2 != 0) {
            z = false;
        }
        this.f34408d = z;
    }

    /* JADX INFO: renamed from: b */
    public void m35728b() {
        if (this.f34406b == null) {
            this.f34406b = (ConnectivityManager) C13008c.m36588n().m36542d().getSystemService("connectivity");
        }
        this.f34406b.unregisterNetworkCallback(this.f34409e);
        this.f34406b = null;
    }

    /* JADX INFO: renamed from: a */
    public void m35727a(InterfaceC12838a interfaceC12838a) {
        if (interfaceC12838a == null || this.f34405a.contains(interfaceC12838a)) {
            return;
        }
        this.f34405a.add(interfaceC12838a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m35725a(C12710b c12710b) {
        try {
            Iterator<InterfaceC12838a> it = this.f34405a.iterator();
            while (it.hasNext()) {
                it.next().mo35715a(c12710b);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MBNetworkEventPublisher", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35724a(Context context) {
        this.f34406b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f34406b.registerNetworkCallback(new NetworkRequest.Builder().addCapability(11).addCapability(12).build(), this.f34409e);
    }
}
