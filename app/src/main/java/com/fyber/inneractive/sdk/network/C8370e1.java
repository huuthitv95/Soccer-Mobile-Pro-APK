package com.fyber.inneractive.sdk.network;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.flow.endcard.loaders.companion.C8100d;
import com.fyber.inneractive.sdk.util.C9196v0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.e1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8370e1 extends AbstractC8416t0 {

    /* JADX INFO: renamed from: p */
    public final String f18641p;

    public C8370e1(C8100d c8100d, String str, C8006r c8006r) {
        super(c8100d, C8377g0.f18655c.m20755a(), c8006r);
        this.f18641p = str;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: a */
    public final C8401o0 mo20620a(C8391l c8391l, Map map, int i) {
        C8401o0 c8401o0 = new C8401o0();
        C8367d1 c8367d1 = new C8367d1();
        try {
            InputStream inputStream = c8391l.f18668c;
            if (inputStream != null) {
                int iM20786a = AbstractC8416t0.m20786a(map);
                AtomicInteger atomicInteger = new AtomicInteger(0);
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new C9196v0(inputStream, atomicInteger));
                if (atomicInteger.get() != iM20786a) {
                    bitmapDecodeStream = null;
                }
                Bitmap bitmap = bitmapDecodeStream;
                if (bitmap != null) {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    int i2 = width * height;
                    int[] iArr = new int[i2];
                    bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
                    int i3 = -1;
                    for (int i4 = 0; i4 < i2; i4++) {
                        int i5 = iArr[i4];
                        if (i4 == 0) {
                            i3 = i5;
                        } else if (i5 != i3) {
                            c8367d1.f18634a = bitmap;
                            IAlog.m21945a("SimpleImageLoader: Got a valid bitmap %s", this.f18641p);
                        }
                    }
                    IAlog.m21945a("SimpleImageLoader: Got an invalid bitmap", new Object[0]);
                    c8367d1.f18635b = "Got an invalid bitmap";
                } else {
                    IAlog.m21945a("SimpleImageLoader: Got an invalid bitmap", new Object[0]);
                    c8367d1.f18635b = "Got an invalid bitmap";
                }
            }
        } catch (Exception e) {
            IAlog.m21947c("SimpleImageLoader: Exception on load image %s %s", e.getMessage(), e.toString());
            c8367d1.f18635b = e.getMessage();
        } catch (OutOfMemoryError e2) {
            IAlog.m21947c("SimpleImageLoader: OutOfMemoryError on load image %s", e2.getMessage());
            Bitmap bitmap2 = c8367d1.f18634a;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            c8367d1.f18635b = e2.getMessage();
        }
        c8401o0.f18690a = c8367d1;
        return c8401o0;
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
        return this.f18641p;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: u */
    public final boolean mo20733u() {
        return false;
    }
}
