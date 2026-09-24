package com.bytedance.adsdk.p065lr.p073lr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.adsdk.p065lr.C2127qt;
import com.bytedance.adsdk.p065lr.InterfaceC2114ka;
import com.bytedance.adsdk.p065lr.p066di.C2017di;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2123lr {

    /* JADX INFO: renamed from: ri */
    private static final Object f5119ri = new Object();

    /* JADX INFO: renamed from: fi */
    private final Map<String, C2127qt> f5120fi;

    /* JADX INFO: renamed from: ik */
    private final String f5121ik;

    /* JADX INFO: renamed from: ka */
    private InterfaceC2114ka f5122ka;

    /* JADX INFO: renamed from: lr */
    private final Context f5123lr;

    public C2123lr(Drawable.Callback callback, String str, InterfaceC2114ka interfaceC2114ka, Map<String, C2127qt> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f5121ik = str;
        } else {
            this.f5121ik = str + '/';
        }
        this.f5120fi = map;
        m7017ri(interfaceC2114ka);
        if (callback instanceof View) {
            this.f5123lr = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f5123lr = null;
        }
    }

    /* JADX INFO: renamed from: lr */
    private Bitmap m7014lr(String str, Bitmap bitmap) {
        synchronized (f5119ri) {
            this.f5120fi.get(str).m7065ri(bitmap);
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: ri */
    public Bitmap m7015ri(String str) {
        C2127qt c2127qt = this.f5120fi.get(str);
        if (c2127qt == null) {
            return null;
        }
        Bitmap bitmapM7066sf = c2127qt.m7066sf();
        if (bitmapM7066sf != null) {
            return bitmapM7066sf;
        }
        InterfaceC2114ka interfaceC2114ka = this.f5122ka;
        if (interfaceC2114ka != null) {
            return interfaceC2114ka.mo6993ri(c2127qt);
        }
        Context context = this.f5123lr;
        if (context == null) {
            return null;
        }
        String strJbs = c2127qt.jbs();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strJbs.startsWith("data:") && strJbs.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strJbs.substring(strJbs.indexOf(44) + 1), 0);
                return m7014lr(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f5121ik)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.f5121ik + strJbs), null, options);
                if (bitmapDecodeStream == null) {
                    return null;
                }
                return m7014lr(str, C2017di.m6544ri(bitmapDecodeStream, c2127qt.m7064ri(), c2127qt.m7061lr()));
            } catch (IllegalArgumentException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public Bitmap m7016ri(String str, Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmapM7066sf = this.f5120fi.get(str).m7066sf();
            m7014lr(str, bitmap);
            return bitmapM7066sf;
        }
        C2127qt c2127qt = this.f5120fi.get(str);
        Bitmap bitmapM7066sf2 = c2127qt.m7066sf();
        c2127qt.m7065ri(null);
        return bitmapM7066sf2;
    }

    /* JADX INFO: renamed from: ri */
    public void m7017ri(InterfaceC2114ka interfaceC2114ka) {
        this.f5122ka = interfaceC2114ka;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m7018ri(Context context) {
        return (context == null && this.f5123lr == null) || this.f5123lr.equals(context);
    }
}
