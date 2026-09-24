package com.bytedance.adsdk.p065lr.p073lr;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.p065lr.C2053ik;
import com.bytedance.adsdk.p065lr.p068ik.C2056ik;
import com.bytedance.adsdk.p065lr.p068ik.xha;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2124ri {

    /* JADX INFO: renamed from: fi */
    private C2053ik f5125fi;

    /* JADX INFO: renamed from: ka */
    private final AssetManager f5127ka;

    /* JADX INFO: renamed from: ri */
    private final xha<String> f5129ri = new xha<>();

    /* JADX INFO: renamed from: lr */
    private final Map<xha<String>, Typeface> f5128lr = new HashMap();

    /* JADX INFO: renamed from: ik */
    private final Map<String, Typeface> f5126ik = new HashMap();

    /* JADX INFO: renamed from: di */
    private String f5124di = ".ttf";

    public C2124ri(Drawable.Callback callback, C2053ik c2053ik) {
        this.f5125fi = c2053ik;
        if (callback instanceof View) {
            this.f5127ka = ((View) callback).getContext().getAssets();
        } else {
            this.f5127ka = null;
        }
    }

    /* JADX INFO: renamed from: lr */
    private Typeface m7019lr(C2056ik c2056ik) {
        Typeface typefaceCreateFromAsset;
        String strM6707ri = c2056ik.m6707ri();
        Typeface typeface = this.f5126ik.get(strM6707ri);
        if (typeface != null) {
            return typeface;
        }
        String strM6704ik = c2056ik.m6704ik();
        String strM6706lr = c2056ik.m6706lr();
        C2053ik c2053ik = this.f5125fi;
        if (c2053ik != null) {
            typefaceCreateFromAsset = c2053ik.m6699ri(strM6707ri, strM6704ik, strM6706lr);
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = this.f5125fi.m6698ri(strM6707ri);
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        C2053ik c2053ik2 = this.f5125fi;
        if (c2053ik2 != null && typefaceCreateFromAsset == null) {
            String strM6697lr = c2053ik2.m6697lr(strM6707ri, strM6704ik, strM6706lr);
            if (strM6697lr == null) {
                strM6697lr = this.f5125fi.m6696lr(strM6707ri);
            }
            if (strM6697lr != null) {
                try {
                    typefaceCreateFromAsset = Typeface.createFromAsset(this.f5127ka, strM6697lr);
                } catch (Throwable unused) {
                    typefaceCreateFromAsset = Typeface.DEFAULT;
                }
            }
        }
        if (c2056ik.m6705ka() != null) {
            return c2056ik.m6705ka();
        }
        if (typefaceCreateFromAsset == null) {
            try {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.f5127ka, "fonts/" + strM6707ri + this.f5124di);
            } catch (Throwable unused2) {
                typefaceCreateFromAsset = Typeface.DEFAULT;
            }
        }
        this.f5126ik.put(strM6707ri, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    /* JADX INFO: renamed from: ri */
    private Typeface m7020ri(Typeface typeface, String str) {
        int i;
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        if (zContains && zContains2) {
            i = 3;
        } else if (zContains) {
            i = 2;
        } else {
            i = zContains2 ? 1 : 0;
        }
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }

    /* JADX INFO: renamed from: ri */
    public Typeface m7021ri(C2056ik c2056ik) {
        this.f5129ri.m6918ri(c2056ik.m6707ri(), c2056ik.m6704ik());
        Typeface typeface = this.f5128lr.get(this.f5129ri);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceM7020ri = m7020ri(m7019lr(c2056ik), c2056ik.m6704ik());
        this.f5128lr.put(this.f5129ri, typefaceM7020ri);
        return typefaceM7020ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m7022ri(C2053ik c2053ik) {
        this.f5125fi = c2053ik;
    }

    /* JADX INFO: renamed from: ri */
    public void m7023ri(String str) {
        this.f5124di = str;
    }
}
