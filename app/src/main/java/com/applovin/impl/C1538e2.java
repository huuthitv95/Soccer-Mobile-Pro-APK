package com.applovin.impl;

import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinExtras;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.e2 */
/* JADX INFO: loaded from: classes3.dex */
public class C1538e2 {

    /* JADX INFO: renamed from: a */
    private final Map f1407a;

    /* JADX INFO: renamed from: b */
    private final C1748l f1408b;

    public C1538e2(Map map, C1748l c1748l) {
        this.f1407a = map == null ? Collections.EMPTY_MAP : map;
        this.f1408b = c1748l;
    }

    /* JADX INFO: renamed from: a */
    private boolean m2461a(Object obj) {
        return (obj instanceof String) && StringUtils.isValidString((String) obj);
    }

    /* JADX INFO: renamed from: a */
    public Drawable m2462a() {
        Object obj = this.f1407a.get(AppLovinExtras.Keys.KEY_WATERMARK);
        if (!m2461a(obj)) {
            this.f1408b.m4782Q();
            if (C1768p.m5160a()) {
                this.f1408b.m4782Q().m5174b("GoogleWatermarkGenerator", "Unable to render invalid watermark: " + obj);
            }
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode((String) obj, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(C1748l.m4756p().getResources(), BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            return bitmapDrawable;
        } catch (Throwable th) {
            this.f1408b.m4782Q();
            if (C1768p.m5160a()) {
                this.f1408b.m4782Q().m5172a("GoogleWatermarkGenerator", "Failed to render watermark", th);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m2463b() {
        return "google watermark";
    }

    /* JADX INFO: renamed from: c */
    public boolean m2464c() {
        return m2461a(this.f1407a.get(AppLovinExtras.Keys.KEY_WATERMARK));
    }
}
