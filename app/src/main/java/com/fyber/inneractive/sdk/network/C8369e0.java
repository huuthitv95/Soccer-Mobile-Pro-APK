package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.fyber.inneractive.sdk.cache.C7911m;
import com.fyber.inneractive.sdk.cache.InterfaceC7899a;
import com.fyber.inneractive.sdk.player.cache.C8442d;
import com.fyber.inneractive.sdk.player.cache.C8443e;
import com.fyber.inneractive.sdk.player.cache.C8445g;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.e0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8369e0 extends C8366d0 {

    /* JADX INFO: renamed from: e */
    public static final String f18639e = IAlog.m21942a(C8369e0.class);

    /* JADX INFO: renamed from: d */
    public final C8445g f18640d;

    public C8369e0(Context context, InterfaceC7899a interfaceC7899a, C8445g c8445g) {
        super(context, interfaceC7899a);
        this.f18640d = c8445g;
    }

    @Override // com.fyber.inneractive.sdk.network.C8366d0
    /* JADX INFO: renamed from: a */
    public final C7911m mo20736a() {
        try {
            if (this.f18640d != null && this.f18632b.mo20354d()) {
                C8445g c8445g = this.f18640d;
                String strMo20353c = this.f18632b.mo20353c();
                c8445g.getClass();
                try {
                    if (c8445g.f18795i == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    if (!C8445g.f18785p.matcher(strMo20353c).matches()) {
                        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + strMo20353c + "\"");
                    }
                    C8443e c8443e = (C8443e) c8445g.f18796j.get(strMo20353c);
                    File fileM20817a = c8443e == null ? null : c8443e.m20817a(0);
                    String absolutePath = (fileM20817a == null || !fileM20817a.exists()) ? null : fileM20817a.getAbsolutePath();
                    Uri uri = (Uri) this.f18632b.mo20349a(absolutePath);
                    if (uri == null) {
                        new C8363c0();
                        return new C7911m();
                    }
                    IAlog.m21945a("Get cached file: %s", absolutePath);
                    if (this.f18633c == null) {
                        this.f18633c = this.f18631a.getSharedPreferences("IAConfigurationPreferences", 0);
                    }
                    return new C7911m(uri, this.f18633c.getString(this.f18632b.mo20352b(), null));
                } catch (Exception e) {
                    IAlog.m21950f("%s: failure on filePath: %s", IAlog.m21942a(C8445g.class), e);
                }
            }
            new C8363c0();
            return new C7911m();
        } catch (Exception unused) {
            m20739b();
            return new C7911m();
        }
    }

    @Override // com.fyber.inneractive.sdk.network.C8366d0
    /* JADX INFO: renamed from: a */
    public final boolean mo20738a(String str, String str2) {
        C8445g c8445g;
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            if (bArrDecode != null && (c8445g = this.f18640d) != null) {
                C8442d c8442dM20822a = c8445g.m20822a(str);
                if (c8442dM20822a == null) {
                    IAlog.m21950f("%s: Error getting editor", f18639e);
                    return false;
                }
                c8442dM20822a.m20816a(bArrDecode);
                c8442dM20822a.m20815a();
                return true;
            }
            IAlog.m21950f("%s: Invalid content", f18639e);
            return false;
        } catch (IOException e) {
            e = e;
            IAlog.m21950f("%s: Error writing cache: ", f18639e, e);
            return false;
        } catch (IllegalArgumentException e2) {
            e = e2;
            IAlog.m21950f("%s: Error writing cache: ", f18639e, e);
            return false;
        }
    }
}
