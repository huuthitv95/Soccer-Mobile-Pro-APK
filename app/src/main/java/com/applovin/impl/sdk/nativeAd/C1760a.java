package com.applovin.impl.sdk.nativeAd;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.AbstractC1568h2;
import com.applovin.impl.AbstractRunnableC1601k5;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

/* JADX INFO: renamed from: com.applovin.impl.sdk.nativeAd.a */
/* JADX INFO: loaded from: classes3.dex */
public class C1760a extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: g */
    private final AppLovinNativeAdImpl f3132g;

    /* JADX INFO: renamed from: h */
    private final a f3133h;

    /* JADX INFO: renamed from: i */
    private final String f3134i;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.nativeAd.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo5005a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public C1760a(AppLovinNativeAdImpl appLovinNativeAdImpl, C1748l c1748l, a aVar) {
        super("TaskCacheNativeAd", c1748l);
        this.f3134i = UUID.randomUUID().toString();
        this.f3132g = appLovinNativeAdImpl;
        this.f3133h = aVar;
    }

    /* JADX INFO: renamed from: a */
    private float m5003a(Uri uri) {
        File file = new File(uri.getPath());
        if (!file.exists()) {
            return -1.0f;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(fileInputStream, null, options);
                int i = options.outWidth;
                int i2 = options.outHeight;
                if (i <= 0 || i2 <= 0) {
                    fileInputStream.close();
                    return -1.0f;
                }
                float f = i / i2;
                fileInputStream.close();
                return f;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            if (C1768p.m5160a()) {
                this.f1971c.m5172a(this.f1970b, "Failed to calculate aspect ratio", e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private Uri m5004b(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Attempting to cache resource: " + uri);
        }
        String strM4974a = this.f1969a.m4771I().m4974a(m3080a(), uri.toString(), this.f3132g.getCachePrefix(), Collections.EMPTY_LIST, false, false, 1, this.f3134i, AbstractC1568h2.m2789a(this.f3132g));
        if (TextUtils.isEmpty(strM4974a)) {
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Unable to cache resource for uri: " + uri);
            }
            return null;
        }
        File fileM4971a = this.f1969a.m4771I().m4971a(strM4974a, m3080a());
        if (fileM4971a != null) {
            Uri uriFromFile = Uri.fromFile(fileM4971a);
            if (uriFromFile != null) {
                return uriFromFile;
            }
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Unable to extract Uri from image file");
            }
            return null;
        }
        if (C1768p.m5160a()) {
            this.f1971c.m5174b(this.f1970b, "Unable to retrieve File from cached image filename = " + strM4974a);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Begin caching ad #" + this.f3132g.getAdIdNumber() + "...");
        }
        Uri uriM5004b = m5004b(this.f3132g.getIconUri());
        if (uriM5004b != null) {
            this.f3132g.setIconUri(uriM5004b);
        }
        Uri uriM5004b2 = m5004b(this.f3132g.getMainImageUri());
        if (uriM5004b2 != null) {
            this.f3132g.setMainImageUri(uriM5004b2);
            float fM5003a = m5003a(uriM5004b2);
            if (fM5003a > 0.0f) {
                this.f3132g.setMainImageAspectRatio(fM5003a);
            }
        }
        Uri uriM5004b3 = m5004b(this.f3132g.getPrivacyIconUri());
        if (uriM5004b3 != null) {
            this.f3132g.setPrivacyIconUri(uriM5004b3);
        }
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Finished caching ad #" + this.f3132g.getAdIdNumber());
        }
        this.f3133h.mo5005a(this.f3132g);
    }
}
