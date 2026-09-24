package com.bytedance.sdk.component.adexpress.p113di;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.adsdk.p065lr.C2016di;
import com.bytedance.adsdk.p065lr.C2127qt;
import com.bytedance.adsdk.p065lr.InterfaceC2114ka;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.C2531ri;
import com.bytedance.sdk.component.p145fi.InterfaceC2622mj;
import com.bytedance.sdk.component.p145fi.InterfaceC2624qt;
import com.bytedance.sdk.component.p145fi.InterfaceC2630sf;
import com.bytedance.sdk.component.p145fi.slm;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C2382qt extends C2016di {

    /* JADX INFO: renamed from: lr */
    private String f6346lr;

    /* JADX INFO: renamed from: ri */
    private Map<String, Bitmap> f6347ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.qt$ri */
    private static class ri implements slm {

        /* JADX INFO: renamed from: ik */
        private final String f6352ik;

        /* JADX INFO: renamed from: ka */
        private final Map<String, Bitmap> f6353ka;

        /* JADX INFO: renamed from: lr */
        private final C2127qt f6354lr;

        /* JADX INFO: renamed from: ri */
        private final WeakReference<C2382qt> f6355ri;

        public ri(C2382qt c2382qt, C2127qt c2127qt, String str, Map<String, Bitmap> map) {
            this.f6355ri = new WeakReference<>(c2382qt);
            this.f6354lr = c2127qt;
            this.f6352ik = str;
            this.f6353ka = map;
        }

        @Override // com.bytedance.sdk.component.p145fi.slm
        /* JADX INFO: renamed from: ri */
        public void mo8254ri(int i, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.p145fi.slm
        /* JADX INFO: renamed from: ri */
        public void mo8255ri(InterfaceC2630sf interfaceC2630sf) {
            Object objMo9673lr = interfaceC2630sf.mo9673lr();
            if (objMo9673lr instanceof Bitmap) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap((Bitmap) objMo9673lr, this.f6354lr.m7064ri(), this.f6354lr.m7061lr(), false);
                this.f6353ka.put(this.f6352ik, bitmapCreateScaledBitmap);
                C2382qt c2382qt = this.f6355ri.get();
                if (c2382qt != null) {
                    c2382qt.m6526ri(this.f6354lr.m7062mj(), bitmapCreateScaledBitmap);
                }
            }
        }
    }

    public C2382qt(Context context) {
        super(context);
        this.f6347ri = new HashMap();
    }

    /* JADX INFO: renamed from: mj */
    public void m8252mj() {
        if (TextUtils.isEmpty(this.f6346lr)) {
            return;
        }
        setProgress(0.0f);
        m6532ri(true);
        setAnimationFromUrl(this.f6346lr);
        setImageAssetDelegate(new InterfaceC2114ka() { // from class: com.bytedance.sdk.component.adexpress.di.qt.1
            @Override // com.bytedance.adsdk.p065lr.InterfaceC2114ka
            /* JADX INFO: renamed from: ri */
            public Bitmap mo6993ri(final C2127qt c2127qt) {
                final String strM7062mj = c2127qt.m7062mj();
                String strM7063qt = c2127qt.m7063qt();
                String strJbs = c2127qt.jbs();
                if (TextUtils.equals(strM7062mj, "image_0") && TextUtils.equals(strJbs, "Lark20201123-180048_2.png")) {
                    strJbs = "hand.png";
                }
                Bitmap bitmap = (Bitmap) C2382qt.this.f6347ri.get(strM7062mj);
                if (bitmap != null) {
                    return bitmap;
                }
                if (TextUtils.isEmpty(strM7063qt) || !TextUtils.isEmpty(strJbs)) {
                    if (!TextUtils.isEmpty(strJbs) && TextUtils.isEmpty(strM7063qt)) {
                        strM7063qt = strJbs;
                    } else if (TextUtils.isEmpty(strJbs) || TextUtils.isEmpty(strM7063qt)) {
                        strM7063qt = "";
                    } else {
                        strM7063qt = strM7063qt + strJbs;
                    }
                }
                if (TextUtils.isEmpty(strM7063qt)) {
                    return null;
                }
                InterfaceC2624qt interfaceC2624qtMo9663ri = C2531ri.m9163ri().m9165fi().mo9680ri(strM7063qt).mo9652ik(2).mo9663ri(new InterfaceC2622mj() { // from class: com.bytedance.sdk.component.adexpress.di.qt.1.1
                    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2622mj
                    /* JADX INFO: renamed from: ri */
                    public Bitmap mo8253ri(Bitmap bitmap2) {
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, c2127qt.m7064ri(), c2127qt.m7061lr(), false);
                        C2382qt.this.f6347ri.put(strM7062mj, bitmapCreateScaledBitmap);
                        return bitmapCreateScaledBitmap;
                    }
                });
                C2382qt c2382qt = C2382qt.this;
                interfaceC2624qtMo9663ri.mo9658ri(new ri(c2382qt, c2127qt, strM7062mj, c2382qt.f6347ri));
                return (Bitmap) C2382qt.this.f6347ri.get(strM7062mj);
            }
        });
        m6527ri();
    }

    public void setAnimationsLoop(boolean z) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setImageLottieTosPath(String str) {
        this.f6346lr = str;
    }

    public void setLottieAdDescMaxLength(int i) {
    }

    public void setLottieAdTitleMaxLength(int i) {
    }

    public void setLottieAppNameMaxLength(int i) {
    }
}
