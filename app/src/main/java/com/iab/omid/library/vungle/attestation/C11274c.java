package com.iab.omid.library.vungle.attestation;

import android.content.Context;
import com.iab.omid.library.vungle.utils.C11313d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.attestation.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C11274c {

    /* JADX INFO: renamed from: d */
    private static final Map<String, InterfaceC11282k> f23625d = new HashMap();

    /* JADX INFO: renamed from: e */
    private static volatile C11274c f23626e;

    /* JADX INFO: renamed from: a */
    private final C11275d f23627a = new C11275d();

    /* JADX INFO: renamed from: b */
    private final Context f23628b;

    /* JADX INFO: renamed from: c */
    private volatile List<InterfaceC11273b> f23629c;

    private C11274c(Context context) {
        this.f23628b = context != null ? context.getApplicationContext() : null;
        m24952c();
    }

    /* JADX INFO: renamed from: a */
    public static C11274c m24951a(Context context) {
        if (f23626e == null) {
            synchronized (C11274c.class) {
                if (f23626e == null) {
                    f23626e = new C11274c(context);
                }
            }
        }
        return f23626e;
    }

    /* JADX INFO: renamed from: c */
    private void m24952c() {
        f23625d.put("FireTVFOSDAT", C11281j.m24964a(this.f23628b));
    }

    /* JADX INFO: renamed from: a */
    public List<InterfaceC11273b> m24953a() {
        List<InterfaceC11273b> list;
        InterfaceC11273b interfaceC11273bM24956a;
        if (this.f23629c != null) {
            return this.f23629c;
        }
        synchronized (this) {
            try {
                if (this.f23629c != null) {
                    list = this.f23629c;
                } else {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry<String, InterfaceC11282k> entry : f23625d.entrySet()) {
                            if (entry.getValue().mo24965a() && (interfaceC11273bM24956a = this.f23627a.m24956a(entry.getKey(), this.f23628b)) != null) {
                                arrayList.add(interfaceC11273bM24956a);
                            }
                        }
                        this.f23629c = arrayList;
                        list = this.f23629c;
                    } catch (Exception e) {
                        C11313d.m25147a("Error getting supported attestation mechanisms", e);
                        this.f23629c = new ArrayList();
                        return this.f23629c;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: a */
    public boolean m24954a(String str) {
        InterfaceC11282k interfaceC11282k = f23625d.get(str);
        if (interfaceC11282k != null) {
            return interfaceC11282k.mo24965a();
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean m24955b() {
        return m24953a().size() > 0;
    }
}
