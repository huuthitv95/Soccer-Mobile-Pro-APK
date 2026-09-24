package com.applovin.impl.adview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.applovin.impl.adview.e */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1496e extends View {

    /* JADX INFO: renamed from: a */
    protected float f1098a;

    /* JADX INFO: renamed from: b */
    protected final Context f1099b;

    /* JADX INFO: renamed from: com.applovin.impl.adview.e$a */
    public enum a {
        WHITE_ON_BLACK(0),
        WHITE_ON_TRANSPARENT(1),
        INVISIBLE(2),
        TRANSPARENT_SKIP(3);


        /* JADX INFO: renamed from: a */
        private final int f1105a;

        a(int i) {
            this.f1105a = i;
        }

        /* JADX INFO: renamed from: b */
        public int m2018b() {
            return this.f1105a;
        }
    }

    protected AbstractC1496e(Context context) {
        super(context);
        this.f1098a = 1.0f;
        this.f1099b = context;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1496e m2015a(a aVar, Context context) {
        if (aVar.equals(a.INVISIBLE)) {
            return new C1499h(context);
        }
        if (aVar.equals(a.WHITE_ON_TRANSPARENT)) {
            return new C1500i(context);
        }
        return aVar.equals(a.TRANSPARENT_SKIP) ? new C1501j(context) : new C1504m(context);
    }

    /* JADX INFO: renamed from: a */
    public void mo2016a(int i) {
        setViewScale(i / 30.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) getSize();
            layoutParams.height = (int) getSize();
        }
    }

    public float getSize() {
        return this.f1098a * 30.0f;
    }

    public abstract a getStyle();

    public void setViewScale(float f) {
        this.f1098a = f;
    }
}
