package com.bytedance.sdk.openadsdk.core.p190aw;

import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.p191ik.C3096ri;
import com.bytedance.sdk.openadsdk.core.p190aw.p192lr.C3099ik;
import com.bytedance.sdk.openadsdk.core.p190aw.p193ri.EnumC3106ri;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3092ik {

    /* JADX INFO: renamed from: co */
    private wjv f9740co;

    /* JADX INFO: renamed from: di */
    protected List<C3099ik> f9741di;

    /* JADX INFO: renamed from: fi */
    protected String f9742fi;

    /* JADX INFO: renamed from: ik */
    protected C3096ri.ri f9743ik;

    /* JADX INFO: renamed from: ka */
    protected C3096ri.lr f9744ka;

    /* JADX INFO: renamed from: lr */
    protected int f9745lr;

    /* JADX INFO: renamed from: mj */
    protected String f9746mj;

    /* JADX INFO: renamed from: qt */
    private String f9747qt;

    /* JADX INFO: renamed from: ri */
    protected int f9748ri;
    protected List<C3099ik> xha;

    /* JADX INFO: renamed from: sf */
    private final AtomicBoolean f9749sf = new AtomicBoolean(false);
    protected String jbs = "endcard_click";

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.ik$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: ri */
        static final /* synthetic */ int[] f9750ri;

        static {
            int[] iArr = new int[C3096ri.lr.values().length];
            f9750ri = iArr;
            try {
                iArr[C3096ri.lr.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9750ri[C3096ri.lr.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9750ri[C3096ri.lr.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C3092ik(int i, int i2, C3096ri.ri riVar, C3096ri.lr lrVar, String str, List<C3099ik> list, List<C3099ik> list2, String str2) {
        this.f9741di = new ArrayList();
        this.xha = new ArrayList();
        this.f9748ri = i;
        this.f9745lr = i2;
        this.f9743ik = riVar;
        this.f9744ka = lrVar;
        this.f9742fi = str;
        this.f9741di = list;
        this.xha = list2;
        this.f9746mj = str2;
    }

    /* JADX INFO: renamed from: lr */
    public static C3092ik m12418lr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("width");
        int iOptInt2 = jSONObject.optInt("height");
        String strOptString = jSONObject.optString("creativeType", C3096ri.ri.NONE.toString());
        String strOptString2 = jSONObject.optString("resourceType", C3096ri.lr.HTML_RESOURCE.toString());
        String strOptString3 = jSONObject.optString("contentUrl");
        String strOptString4 = jSONObject.optString("clickThroughUri");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            arrayList.add(new C3099ik.ri(jSONArrayOptJSONArray.optString(i)).m12510ri());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
            arrayList2.add(new C3099ik.ri(jSONArrayOptJSONArray2.optString(i2)).m12510ri());
        }
        return new C3092ik(iOptInt, iOptInt2, C3096ri.ri.valueOf(strOptString), C3096ri.lr.valueOf(strOptString2), strOptString3, arrayList, arrayList2, strOptString4);
    }

    /* JADX INFO: renamed from: ri */
    public static float m12419ri(int i, int i2, int i3, int i4, C3096ri.lr lrVar, C3096ri.ri riVar) {
        if (i2 == 0 || i4 == 0) {
            return 0.0f;
        }
        float f = i;
        float f2 = i3;
        return m12420ri(lrVar, riVar) / ((Math.abs((f / i2) - (f2 / i4)) + Math.abs((f - f2) / f)) + 1.0f);
    }

    /* JADX INFO: renamed from: ri */
    private static float m12420ri(C3096ri.lr lrVar, C3096ri.ri riVar) {
        int i = AnonymousClass1.f9750ri[lrVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        }
        if (C3096ri.ri.JAVASCRIPT.equals(riVar)) {
            return 1.0f;
        }
        return C3096ri.ri.IMAGE.equals(riVar) ? 0.8f : 0.0f;
    }

    /* JADX INFO: renamed from: fi */
    public String m12421fi() {
        return this.f9742fi;
    }

    /* JADX INFO: renamed from: ik */
    public String m12422ik() {
        int i = AnonymousClass1.f9750ri[this.f9744ka.ordinal()];
        if (i == 1) {
            if (this.f9743ik == C3096ri.ri.IMAGE) {
                return "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.f9742fi + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
            }
            if (this.f9743ik != C3096ri.ri.JAVASCRIPT) {
                return null;
            }
            return "<script src=\"" + this.f9742fi + "\"></script>";
        }
        if (i == 2) {
            return this.f9742fi;
        }
        if (i != 3) {
            return null;
        }
        return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.f9748ri + "\" height=\"" + this.f9745lr + "\" src=\"" + this.f9742fi + "\"></iframe>";
    }

    /* JADX INFO: renamed from: ka */
    public String m12423ka() {
        if (this.f9744ka == C3096ri.lr.STATIC_RESOURCE && this.f9743ik == C3096ri.ri.IMAGE) {
            return this.f9742fi;
        }
        return null;
    }

    /* JADX INFO: renamed from: lr */
    public int m12424lr() {
        return this.f9745lr;
    }

    /* JADX INFO: renamed from: lr */
    public void m12425lr(long j) {
        if (this.f9749sf.compareAndSet(false, true)) {
            C3099ik.m12496lr((wjv) null, this.xha, (EnumC3106ri) null, j, this.f9747qt, (String) null);
        }
    }

    /* JADX INFO: renamed from: ri */
    public int m12426ri() {
        return this.f9748ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m12427ri(long j) {
        C3099ik.m12504ri(null, this.f9741di, null, j, this.f9747qt, new C3099ik.lr(this.jbs, this.f9740co), null);
    }

    /* JADX INFO: renamed from: ri */
    public void m12428ri(wjv wjvVar) {
        this.f9740co = wjvVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m12429ri(String str) {
        this.f9747qt = str;
    }
}
