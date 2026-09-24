package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okio.InterfaceC13795e;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.l */
/* JADX INFO: compiled from: PushObserver.java */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC13758l {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC13758l f39087a = new a();

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.l$a */
    /* JADX INFO: compiled from: PushObserver.java */
    static class a implements InterfaceC13758l {
        a() {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.InterfaceC13758l
        /* JADX INFO: renamed from: a */
        public void mo40581a(int i, EnumC13748b enumC13748b) {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.InterfaceC13758l
        /* JADX INFO: renamed from: a */
        public boolean mo40582a(int i, InterfaceC13795e interfaceC13795e, int i2, boolean z) throws IOException {
            interfaceC13795e.skip(i2);
            return true;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.InterfaceC13758l
        /* JADX INFO: renamed from: a */
        public boolean mo40583a(int i, List<C13749c> list) {
            return true;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.InterfaceC13758l
        /* JADX INFO: renamed from: a */
        public boolean mo40584a(int i, List<C13749c> list, boolean z) {
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo40581a(int i, EnumC13748b enumC13748b);

    /* JADX INFO: renamed from: a */
    boolean mo40582a(int i, InterfaceC13795e interfaceC13795e, int i2, boolean z) throws IOException;

    /* JADX INFO: renamed from: a */
    boolean mo40583a(int i, List<C13749c> list);

    /* JADX INFO: renamed from: a */
    boolean mo40584a(int i, List<C13749c> list, boolean z);
}
