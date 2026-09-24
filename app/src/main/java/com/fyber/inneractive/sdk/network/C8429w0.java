package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.fyber.inneractive.sdk.cache.C7900b;
import com.fyber.inneractive.sdk.p278ui.C9120a;
import com.fyber.inneractive.sdk.util.AbstractC9202w0;
import com.fyber.inneractive.sdk.util.C9196v0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.w0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8429w0 extends C8427v0 {
    public C8429w0(C9120a c9120a, Context context, C7900b c7900b) {
        super(c9120a, context, c7900b);
    }

    @Override // com.fyber.inneractive.sdk.network.C8427v0, com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: a */
    public final C8401o0 mo20620a(C8391l c8391l, Map map, int i) throws C8398n0 {
        C8401o0 c8401o0 = new C8401o0();
        try {
            InputStream inputStream = c8391l.f18668c;
            int iM20786a = AbstractC8416t0.m20786a(map);
            AtomicInteger atomicInteger = new AtomicInteger(0);
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new C9196v0(inputStream, atomicInteger));
            if (atomicInteger.get() != iM20786a) {
                bitmapDecodeStream = null;
            }
            if (bitmapDecodeStream != null) {
                String strM22038a = AbstractC9202w0.m22038a(bitmapDecodeStream);
                c8401o0.f18690a = bitmapDecodeStream;
                c8401o0.f18691b = strM22038a;
            }
            return c8401o0;
        } catch (Exception e) {
            IAlog.m21944a("failed parse cacheable network request", e, new Object[0]);
            throw new C8398n0(e);
        }
    }
}
