package com.bytedance.adsdk.p065lr;

import android.graphics.Bitmap;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C2127qt {

    /* JADX INFO: renamed from: di */
    private final String f5155di;

    /* JADX INFO: renamed from: fi */
    private final String f5156fi;

    /* JADX INFO: renamed from: ik */
    private final String f5157ik;
    private final int[][] jbs;

    /* JADX INFO: renamed from: ka */
    private final String f5158ka;

    /* JADX INFO: renamed from: lr */
    private final int f5159lr;

    /* JADX INFO: renamed from: mj */
    private final String f5160mj;

    /* JADX INFO: renamed from: qt */
    private final JSONArray f5161qt;

    /* JADX INFO: renamed from: ri */
    private final int f5162ri;

    /* JADX INFO: renamed from: sf */
    private Bitmap f5163sf;
    private final List<ri> xha;

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.qt$ri */
    public static class ri {

        /* JADX INFO: renamed from: di */
        public int f5164di;

        /* JADX INFO: renamed from: fi */
        public int f5165fi;

        /* JADX INFO: renamed from: ik */
        public String f5166ik;

        /* JADX INFO: renamed from: ka */
        public String f5167ka;

        /* JADX INFO: renamed from: lr */
        public int f5168lr;

        /* JADX INFO: renamed from: ri */
        public int f5169ri;
        public String xha;
    }

    public C2127qt(int i, int i2, String str, String str2, String str3, String str4, List<ri> list, String str5, int[][] iArr, JSONArray jSONArray) {
        this.f5162ri = i;
        this.f5159lr = i2;
        this.f5157ik = str;
        this.f5158ka = str2;
        this.f5156fi = str3;
        this.f5155di = str4;
        this.xha = list;
        this.f5160mj = str5;
        this.jbs = iArr;
        this.f5161qt = jSONArray;
    }

    /* JADX INFO: renamed from: di */
    public int[][] m7057di() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: fi */
    public String m7058fi() {
        return this.f5160mj;
    }

    /* JADX INFO: renamed from: ik */
    public List<ri> m7059ik() {
        return this.xha;
    }

    public String jbs() {
        return this.f5158ka;
    }

    /* JADX INFO: renamed from: ka */
    public String m7060ka() {
        return this.f5155di;
    }

    /* JADX INFO: renamed from: lr */
    public int m7061lr() {
        return this.f5159lr;
    }

    /* JADX INFO: renamed from: mj */
    public String m7062mj() {
        return this.f5157ik;
    }

    /* JADX INFO: renamed from: qt */
    public String m7063qt() {
        return this.f5156fi;
    }

    /* JADX INFO: renamed from: ri */
    public int m7064ri() {
        return this.f5162ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m7065ri(Bitmap bitmap) {
        this.f5163sf = bitmap;
    }

    /* JADX INFO: renamed from: sf */
    public Bitmap m7066sf() {
        return this.f5163sf;
    }

    public JSONArray xha() {
        return this.f5161qt;
    }
}
