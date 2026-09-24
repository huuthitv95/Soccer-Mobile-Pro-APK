package com.mbridge.msdk.tracker.network.toolbox;

import com.mbridge.msdk.thrid.okhttp.InterfaceC13778n;
import com.mbridge.msdk.tracker.network.C13846p;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.toolbox.j */
/* JADX INFO: compiled from: MBridgeLocalDNSService.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13860j implements InterfaceC13778n {

    /* JADX INFO: renamed from: b */
    private final String f39571b;

    /* JADX INFO: renamed from: c */
    private final String f39572c;

    /* JADX INFO: renamed from: d */
    private final C13846p f39573d;

    public C13860j(String str, String str2, C13846p c13846p) {
        this.f39571b = str;
        this.f39572c = str2;
        this.f39573d = c13846p;
    }

    /* JADX INFO: renamed from: a */
    private List<InetAddress> m41304a(String str, UnknownHostException unknownHostException) throws UnknownHostException {
        C13846p c13846p = this.f39573d;
        if (c13846p != null) {
            c13846p.m41179c("local");
        }
        return C13859i.m41292b().m41298a(str, unknownHostException);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.InterfaceC13778n
    /* JADX INFO: renamed from: a */
    public List<InetAddress> mo40689a(String str) throws UnknownHostException {
        try {
            List<InetAddress> listMo40689a = InterfaceC13778n.f39166a.mo40689a(str);
            return (listMo40689a.isEmpty() && C13859i.m41292b().m41300c(this.f39571b, this.f39572c, str)) ? m41304a(str, new UnknownHostException("DNS result is empty")) : listMo40689a;
        } catch (UnknownHostException e) {
            if (C13859i.m41292b().m41300c(this.f39571b, this.f39572c, str)) {
                return m41304a(str, new UnknownHostException(e.getMessage()));
            }
            throw e;
        }
    }
}
