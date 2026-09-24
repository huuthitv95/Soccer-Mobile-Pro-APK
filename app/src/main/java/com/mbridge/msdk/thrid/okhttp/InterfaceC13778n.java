package com.mbridge.msdk.thrid.okhttp;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.n */
/* JADX INFO: compiled from: Dns.java */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC13778n {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC13778n f39166a = new a();

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.n$a */
    /* JADX INFO: compiled from: Dns.java */
    static class a implements InterfaceC13778n {
        a() {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.InterfaceC13778n
        /* JADX INFO: renamed from: a */
        public List<InetAddress> mo40689a(String str) throws UnknownHostException {
            if (str == null) {
                throw new UnknownHostException("hostname == null");
            }
            try {
                return Arrays.asList(InetAddress.getAllByName(str));
            } catch (NullPointerException e) {
                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    List<InetAddress> mo40689a(String str) throws UnknownHostException;
}
