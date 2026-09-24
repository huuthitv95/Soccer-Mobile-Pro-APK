package com.fyber.inneractive.sdk.network;

import android.util.Base64;
import androidx.media3.common.MimeTypes;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.c1 */
/* JADX INFO: loaded from: classes4.dex */
public class C8364c1 extends AbstractC8416t0 {

    /* JADX INFO: renamed from: p */
    public final String f18629p;

    public C8364c1(InterfaceC8374f0 interfaceC8374f0, String str, C8006r c8006r) {
        super(interfaceC8374f0, C8377g0.f18655c.m20755a(), c8006r);
        this.f18629p = str;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: a */
    public C8401o0 mo20620a(C8391l c8391l, Map map, int i) {
        C8401o0 c8401o0 = new C8401o0();
        try {
            InputStream inputStream = c8391l.f18668c;
            List list = map != null ? (List) map.get("Content-Type") : null;
            String str = list != null ? (String) list.get(0) : null;
            String strEncodeToString = Base64.encodeToString(AbstractC9195v.m22031a(inputStream), 0);
            if (str == null) {
                str = MimeTypes.IMAGE_PNG;
            }
            c8401o0.f18690a = "data:" + str + ";base64, " + strEncodeToString;
            return c8401o0;
        } catch (Exception unused) {
            IAlog.m21945a("failed to fetch and encode the image.", new Object[0]);
            return c8401o0;
        }
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: g */
    public final int mo20728g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: m */
    public final EnumC8395m0 mo20729m() {
        return EnumC8395m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: o */
    public final EnumC8378g1 mo20731o() {
        return EnumC8378g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: r */
    public final String mo20732r() {
        return this.f18629p;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: u */
    public final boolean mo20733u() {
        return false;
    }
}
