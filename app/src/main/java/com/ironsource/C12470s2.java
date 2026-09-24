package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.s2 */
/* JADX INFO: loaded from: classes6.dex */
public class C12470s2 {

    /* JADX INFO: renamed from: a */
    private boolean f31864a;

    /* JADX INFO: renamed from: b */
    private String f31865b;

    /* JADX INFO: renamed from: c */
    private String f31866c;

    /* JADX INFO: renamed from: d */
    private String f31867d;

    /* JADX INFO: renamed from: e */
    private int f31868e;

    /* JADX INFO: renamed from: f */
    private int f31869f;

    /* JADX INFO: renamed from: g */
    private int f31870g;

    /* JADX INFO: renamed from: h */
    private long f31871h;

    /* JADX INFO: renamed from: i */
    private long f31872i;

    /* JADX INFO: renamed from: j */
    private long f31873j;

    /* JADX INFO: renamed from: k */
    private long f31874k;

    /* JADX INFO: renamed from: l */
    private long f31875l;

    /* JADX INFO: renamed from: m */
    private boolean f31876m;

    /* JADX INFO: renamed from: n */
    private ArrayList<String> f31877n;

    /* JADX INFO: renamed from: o */
    private boolean f31878o;

    /* JADX INFO: renamed from: p */
    private boolean f31879p;

    /* JADX INFO: renamed from: q */
    private int f31880q;

    /* JADX INFO: renamed from: r */
    private boolean f31881r;

    /* JADX INFO: renamed from: s */
    private boolean f31882s;

    /* JADX INFO: renamed from: t */
    private boolean f31883t;

    public C12470s2() {
        this.f31865b = "";
        this.f31866c = "";
        this.f31867d = "";
        this.f31872i = 0L;
        this.f31873j = 0L;
        this.f31874k = 0L;
        this.f31875l = 0L;
        this.f31876m = true;
        this.f31877n = new ArrayList<>();
        this.f31870g = 0;
        this.f31878o = false;
        this.f31879p = false;
        this.f31880q = 1;
    }

    /* JADX INFO: renamed from: a */
    public String m33273a() {
        return this.f31865b;
    }

    /* JADX INFO: renamed from: b */
    public long m33276b() {
        return this.f31873j;
    }

    /* JADX INFO: renamed from: c */
    public int m33277c() {
        return this.f31869f;
    }

    /* JADX INFO: renamed from: d */
    public int m33278d() {
        return this.f31880q;
    }

    /* JADX INFO: renamed from: e */
    public boolean m33279e() {
        return this.f31876m;
    }

    /* JADX INFO: renamed from: f */
    public ArrayList<String> m33280f() {
        return this.f31877n;
    }

    /* JADX INFO: renamed from: g */
    public int m33281g() {
        return this.f31868e;
    }

    /* JADX INFO: renamed from: h */
    public boolean m33282h() {
        return this.f31864a;
    }

    /* JADX INFO: renamed from: i */
    public int m33283i() {
        return this.f31870g;
    }

    /* JADX INFO: renamed from: j */
    public long m33284j() {
        return this.f31874k;
    }

    /* JADX INFO: renamed from: k */
    public long m33285k() {
        return this.f31872i;
    }

    /* JADX INFO: renamed from: l */
    public long m33286l() {
        return this.f31875l;
    }

    /* JADX INFO: renamed from: m */
    public long m33287m() {
        return this.f31871h;
    }

    /* JADX INFO: renamed from: n */
    public boolean m33288n() {
        return this.f31883t;
    }

    /* JADX INFO: renamed from: o */
    public boolean m33289o() {
        return this.f31878o;
    }

    /* JADX INFO: renamed from: p */
    public boolean m33290p() {
        return this.f31879p;
    }

    /* JADX INFO: renamed from: q */
    public boolean m33291q() {
        return this.f31882s;
    }

    /* JADX INFO: renamed from: r */
    public boolean m33292r() {
        return this.f31881r;
    }

    /* JADX INFO: renamed from: a */
    public String m33274a(boolean z) {
        return z ? this.f31867d : this.f31866c;
    }

    /* JADX INFO: renamed from: a */
    public void m33275a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f31877n.add(str);
    }

    C12470s2(String str, String str2, String str3, int i, int i2, long j, long j2, long j3, long j4, long j5, boolean z, int i3, boolean z2, boolean z3, boolean z4, int i4, boolean z5, boolean z6, boolean z7) {
        this.f31865b = str;
        this.f31866c = str2;
        this.f31867d = str3;
        this.f31868e = i;
        this.f31869f = i2;
        this.f31871h = j;
        this.f31864a = z4;
        this.f31872i = j2;
        this.f31873j = j3;
        this.f31874k = j4;
        this.f31875l = j5;
        this.f31876m = z;
        this.f31870g = i3;
        this.f31877n = new ArrayList<>();
        this.f31878o = z2;
        this.f31879p = z3;
        this.f31880q = i4;
        this.f31881r = z5;
        this.f31882s = z6;
        this.f31883t = z7;
    }
}
