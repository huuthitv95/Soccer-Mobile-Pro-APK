package com.pgl.ssdk;

import android.content.Context;
import com.pgl.ssdk.ces.C14271a;
import com.pgl.ssdk.ces.C14272b;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.pgl.ssdk.ap */
/* JADX INFO: loaded from: classes7.dex */
public class C14258ap extends AbstractC14255am {

    /* JADX INFO: renamed from: n */
    private Context f41273n;

    /* JADX INFO: renamed from: o */
    private final int f41274o;

    public C14258ap(Context context, int i) {
        super(context);
        this.f41273n = context;
        this.f41274o = i;
    }

    @Override // com.pgl.ssdk.AbstractC14255am
    /* JADX INFO: renamed from: a */
    public String mo42980a() {
        int i = this.f41274o;
        if (i == 222) {
            return "/ssdk/v2/r?os=0&ver=7.9.0.0.overseas-rc.2&mode=1&app_ver=" + C14244ab.m42819h(this.f41273n) + "&region=" + C14246ad.m42924a() + "&did=" + C14272b.m43039b() + "&aid=" + C14272b.m43035a();
        }
        if (i != 301) {
            return null;
        }
        return "/ssdk/sd/token?os=android&app_id=" + C14272b.m43035a() + "&did=" + C14272b.m43039b() + "&app_ver=" + C14244ab.m42819h(this.f41273n) + "&platform=android&ver=7.9.0.0.overseas-rc.2&mode=1";
    }

    @Override // com.pgl.ssdk.AbstractC14255am
    /* JADX INFO: renamed from: a */
    public void mo42982a(int i, byte[] bArr) {
        try {
            if (i != 200) {
                C14256an.m42988b(this.f41273n);
                return;
            }
            int i2 = this.f41274o;
            if (i2 == 222) {
                ((Integer) C14271a.meta(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, null, bArr)).intValue();
                return;
            }
            if (i2 == 301) {
                Object objM42796a = C14242a5.m42796a(bArr);
                C14263au.m43008b("write token result = ".concat(String.valueOf(objM42796a)));
                if ((objM42796a instanceof Integer) && ((Integer) objM42796a).intValue() == 0) {
                    C14263au.m43008b("write token succ");
                    C14242a5.f41206a = 200;
                } else if (objM42796a instanceof String) {
                    C14242a5.f41208c = (String) objM42796a;
                    C14242a5.f41206a = 200;
                }
            }
        } catch (Throwable unused) {
        }
    }
}
