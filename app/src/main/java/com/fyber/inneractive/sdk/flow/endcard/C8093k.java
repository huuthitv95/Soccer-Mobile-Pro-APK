package com.fyber.inneractive.sdk.flow.endcard;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.C8219t0;
import com.fyber.inneractive.sdk.flow.C8237x0;
import com.fyber.inneractive.sdk.flow.endcard.loaders.C8096b;
import com.fyber.inneractive.sdk.model.vast.EnumC8300i;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.k */
/* JADX INFO: loaded from: classes4.dex */
public final class C8093k {

    /* JADX INFO: renamed from: a */
    public final C8237x0 f18000a;

    /* JADX INFO: renamed from: b */
    public final C8107m f18001b;

    /* JADX INFO: renamed from: c */
    public final boolean f18002c;

    /* JADX INFO: renamed from: d */
    public final C8096b f18003d;

    /* JADX INFO: renamed from: e */
    public final C8090h f18004e;

    /* JADX INFO: renamed from: f */
    public final int f18005f;

    public C8093k(Context context, C8219t0 c8219t0) {
        C8237x0 c8237x0 = new C8237x0(context, c8219t0);
        C8107m c8107m = new C8107m();
        this.f18001b = c8107m;
        this.f18000a = c8237x0;
        this.f18002c = !TextUtils.equals(c8237x0.f18382d.f21292B, "1");
        C8090h c8090h = new C8090h();
        this.f18004e = c8090h;
        this.f18005f = c8090h.f17997b;
        this.f18003d = new C8096b(c8237x0, c8107m);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC8084b m20525a() {
        AbstractC8084b abstractC8084b;
        C8107m c8107m = this.f18001b;
        int size = c8107m.f18036a.size();
        int i = c8107m.f18038c;
        do {
            i++;
            if (i >= size) {
                return null;
            }
            abstractC8084b = (AbstractC8084b) c8107m.f18036a.get(i);
        } while (!abstractC8084b.mo20516l());
        if (abstractC8084b.mo20513i() == EnumC8300i.Default_End_Card) {
            for (int size2 = c8107m.f18037b.size() - 1; size2 >= 0; size2--) {
                if (((AbstractC8084b) c8107m.f18037b.get(size2)) instanceof C8109o) {
                    return null;
                }
            }
            if (c8107m.f18038c >= 0) {
                return null;
            }
        } else if (abstractC8084b instanceof AbstractC8085c) {
            int i2 = i + 1;
            for (int size3 = c8107m.f18036a.size() - 1; size3 >= i2; size3--) {
                AbstractC8084b abstractC8084b2 = (AbstractC8084b) c8107m.f18036a.get(size3);
                if (abstractC8084b2 instanceof AbstractC8085c) {
                    abstractC8084b2.destroy();
                    c8107m.f18036a.remove(size3);
                }
            }
        }
        c8107m.f18038c = i;
        c8107m.f18037b.add(abstractC8084b);
        abstractC8084b.f17986e = c8107m.f18037b.size();
        return abstractC8084b;
    }
}
