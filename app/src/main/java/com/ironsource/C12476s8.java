package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.s8 */
/* JADX INFO: loaded from: classes6.dex */
public class C12476s8 implements InterfaceC12299l7 {

    /* JADX INFO: renamed from: a */
    private static Map<String, Object> f31887a = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.s8$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        String f31888a;

        /* JADX INFO: renamed from: b */
        String f31889b;

        /* JADX INFO: renamed from: c */
        String f31890c;

        /* JADX INFO: renamed from: d */
        Context f31891d;

        /* JADX INFO: renamed from: e */
        String f31892e;

        /* JADX INFO: renamed from: f */
        String f31893f;

        /* JADX INFO: renamed from: a */
        a m33299a(String str) {
            this.f31889b = str;
            return this;
        }

        /* JADX INFO: renamed from: b */
        a m33301b(String str) {
            this.f31893f = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        a m33302c(String str) {
            this.f31890c = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        a m33303d(String str) {
            this.f31888a = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        a m33304e(String str) {
            this.f31892e = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        a m33298a(Context context) {
            this.f31891d = context;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C12476s8 m33300a() {
            return new C12476s8(this);
        }
    }

    private C12476s8(a aVar) {
        m33295a(aVar);
        m33294a(aVar.f31891d);
    }

    /* JADX INFO: renamed from: a */
    private void m33294a(Context context) {
        f31887a.put(C11341A5.f23814e, C11693U3.m27576b(context));
        f31887a.put(C11341A5.f23815f, C11693U3.m27579d(context));
    }

    /* JADX INFO: renamed from: b */
    public static void m33297b(String str) {
        f31887a.put(C11341A5.f23815f, SDKUtils.encodeString(str));
    }

    /* JADX INFO: renamed from: a */
    private void m33295a(a aVar) {
        Context context = aVar.f31891d;
        C11728W4 c11728w4M27793b = C11728W4.m27793b(context);
        f31887a.put(C11341A5.f23819j, SDKUtils.encodeString(c11728w4M27793b.m27800e()));
        f31887a.put(C11341A5.f23820k, SDKUtils.encodeString(c11728w4M27793b.m27801f()));
        f31887a.put(C11341A5.f23821l, Integer.valueOf(c11728w4M27793b.m27796a()));
        f31887a.put(C11341A5.f23822m, SDKUtils.encodeString(c11728w4M27793b.m27799d()));
        f31887a.put(C11341A5.f23823n, SDKUtils.encodeString(c11728w4M27793b.m27798c()));
        f31887a.put(C11341A5.f23813d, SDKUtils.encodeString(context.getPackageName()));
        f31887a.put(C11341A5.f23816g, SDKUtils.encodeString(aVar.f31889b));
        f31887a.put("sessionid", SDKUtils.encodeString(aVar.f31888a));
        f31887a.put(C11341A5.f23811b, SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        f31887a.put(C11341A5.f23824o, C11341A5.f23829t);
        f31887a.put("origin", C11341A5.f23826q);
        if (!TextUtils.isEmpty(aVar.f31892e)) {
            f31887a.put(C11341A5.f23818i, SDKUtils.encodeString(aVar.f31892e));
        }
        if (TextUtils.isEmpty(aVar.f31893f)) {
            return;
        }
        f31887a.put(C11341A5.f23798K, aVar.f31893f);
    }

    @Override // com.ironsource.InterfaceC12299l7
    /* JADX INFO: renamed from: a */
    public Map<String, Object> mo32058a() {
        return f31887a;
    }

    /* JADX INFO: renamed from: a */
    public static void m33296a(String str) {
        f31887a.put(C11341A5.f23814e, SDKUtils.encodeString(str));
    }
}
