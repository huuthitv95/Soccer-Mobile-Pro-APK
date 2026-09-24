package com.bytedance.adsdk.p065lr.p074ri;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.p065lr.p066di.C2018fi;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2142ri extends Paint {
    public C2142ri() {
    }

    public C2142ri(int i) {
        super(i);
    }

    public C2142ri(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C2142ri(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            super.setAlpha(C2018fi.m6564ri(i, 0, 255));
        } else {
            setColor((C2018fi.m6564ri(i, 0, 255) << 24) | (getColor() & ViewCompat.MEASURED_SIZE_MASK));
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }
}
