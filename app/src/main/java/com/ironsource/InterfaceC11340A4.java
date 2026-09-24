package com.ironsource;

import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.A4 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC11340A4 {

    /* JADX INFO: renamed from: com.ironsource.A4$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ String m25266a(InterfaceC11340A4 interfaceC11340A4, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return interfaceC11340A4.mo25263a(str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    String mo25263a(String str, String str2);

    /* JADX INFO: renamed from: a */
    void mo25264a(String str);

    Map<String, ?> allData();

    /* JADX INFO: renamed from: b */
    void mo25265b(String str, String str2);
}
