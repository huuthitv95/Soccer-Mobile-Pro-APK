package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.b1 */
/* JADX INFO: loaded from: classes6.dex */
public class C12105b1 extends C11720Vd {

    /* JADX INFO: renamed from: h */
    private static String f30058h = "type";

    /* JADX INFO: renamed from: i */
    private static String f30059i = "numOfAdUnits";

    /* JADX INFO: renamed from: j */
    private static String f30060j = "firstCampaignCredits";

    /* JADX INFO: renamed from: k */
    private static String f30061k = "totalNumberCredits";

    /* JADX INFO: renamed from: l */
    private static String f30062l = "productType";

    /* JADX INFO: renamed from: b */
    private String f30063b;

    /* JADX INFO: renamed from: c */
    private String f30064c;

    /* JADX INFO: renamed from: d */
    private String f30065d;

    /* JADX INFO: renamed from: e */
    private String f30066e;

    /* JADX INFO: renamed from: f */
    private String f30067f;

    /* JADX INFO: renamed from: g */
    private boolean f30068g;

    public C12105b1(String str) {
        super(str);
        if (m27755a(f30058h)) {
            m31126k(m27759d(f30058h));
        }
        if (m27755a(f30059i)) {
            m31123h(m27759d(f30059i));
            m31115a(true);
        } else {
            m31115a(false);
        }
        if (m27755a(f30060j)) {
            m31121g(m27759d(f30060j));
        }
        if (m27755a(f30061k)) {
            m31125j(m27759d(f30061k));
        }
        if (m27755a(f30062l)) {
            m31124i(m27759d(f30062l));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m31115a(boolean z) {
        this.f30068g = z;
    }

    /* JADX INFO: renamed from: b */
    public String m31116b() {
        return this.f30066e;
    }

    /* JADX INFO: renamed from: c */
    public String m31117c() {
        return this.f30065d;
    }

    /* JADX INFO: renamed from: d */
    public String m31118d() {
        return this.f30064c;
    }

    /* JADX INFO: renamed from: e */
    public String m31119e() {
        return this.f30067f;
    }

    /* JADX INFO: renamed from: f */
    public String m31120f() {
        return this.f30063b;
    }

    /* JADX INFO: renamed from: g */
    public void m31121g(String str) {
        this.f30066e = str;
    }

    /* JADX INFO: renamed from: h */
    public void m31123h(String str) {
        this.f30065d = str;
    }

    /* JADX INFO: renamed from: i */
    public void m31124i(String str) {
        this.f30064c = str;
    }

    /* JADX INFO: renamed from: j */
    public void m31125j(String str) {
        this.f30067f = str;
    }

    /* JADX INFO: renamed from: k */
    public void m31126k(String str) {
        this.f30063b = str;
    }

    /* JADX INFO: renamed from: g */
    public boolean m31122g() {
        return this.f30068g;
    }
}
