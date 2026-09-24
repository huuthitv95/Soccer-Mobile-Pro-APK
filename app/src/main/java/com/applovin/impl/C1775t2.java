package com.applovin.impl;

import android.R;
import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.sdk.C1846R;

/* JADX INFO: renamed from: com.applovin.impl.t2 */
/* JADX INFO: loaded from: classes3.dex */
public class C1775t2 {

    /* JADX INFO: renamed from: a */
    protected c f3277a;

    /* JADX INFO: renamed from: b */
    protected boolean f3278b;

    /* JADX INFO: renamed from: c */
    protected SpannedString f3279c;

    /* JADX INFO: renamed from: d */
    protected SpannedString f3280d;

    /* JADX INFO: renamed from: e */
    protected String f3281e;

    /* JADX INFO: renamed from: f */
    protected String f3282f;

    /* JADX INFO: renamed from: g */
    protected int f3283g;

    /* JADX INFO: renamed from: h */
    protected int f3284h;

    /* JADX INFO: renamed from: i */
    protected int f3285i;

    /* JADX INFO: renamed from: j */
    protected int f3286j;

    /* JADX INFO: renamed from: k */
    protected int f3287k;

    /* JADX INFO: renamed from: l */
    protected int f3288l;

    /* JADX INFO: renamed from: m */
    protected boolean f3289m;

    /* JADX INFO: renamed from: com.applovin.impl.t2$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        final c f3290a;

        /* JADX INFO: renamed from: b */
        boolean f3291b;

        /* JADX INFO: renamed from: c */
        SpannedString f3292c;

        /* JADX INFO: renamed from: d */
        SpannedString f3293d;

        /* JADX INFO: renamed from: e */
        String f3294e;

        /* JADX INFO: renamed from: f */
        String f3295f;

        /* JADX INFO: renamed from: g */
        int f3296g = 0;

        /* JADX INFO: renamed from: h */
        int f3297h = 0;

        /* JADX INFO: renamed from: i */
        int f3298i = ViewCompat.MEASURED_STATE_MASK;

        /* JADX INFO: renamed from: j */
        int f3299j = ViewCompat.MEASURED_STATE_MASK;

        /* JADX INFO: renamed from: k */
        int f3300k = 0;

        /* JADX INFO: renamed from: l */
        int f3301l = 0;

        /* JADX INFO: renamed from: m */
        boolean f3302m;

        public b(c cVar) {
            this.f3290a = cVar;
        }

        /* JADX INFO: renamed from: a */
        public b m5221a(int i) {
            this.f3297h = i;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m5222a(Context context) {
            this.f3297h = C1846R.drawable.applovin_ic_disclosure_arrow;
            this.f3301l = context.getColor(C1846R.color.applovin_sdk_disclosureButtonColor);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m5223a(SpannedString spannedString) {
            this.f3293d = spannedString;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m5224a(String str) {
            this.f3295f = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m5225a(boolean z) {
            this.f3291b = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C1775t2 m5226a() {
            int i;
            if (this.f3291b && (i = this.f3297h) != 0 && i != C1846R.drawable.applovin_ic_disclosure_arrow) {
                this.f3298i = -16776961;
            }
            return new C1775t2(this);
        }

        /* JADX INFO: renamed from: b */
        public b m5227b(int i) {
            this.f3301l = i;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public b m5228b(SpannedString spannedString) {
            this.f3292c = spannedString;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public b m5229b(String str) {
            this.f3294e = str;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public b m5230b(boolean z) {
            this.f3302m = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m5231c(int i) {
            this.f3299j = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m5232c(String str) {
            return m5223a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        /* JADX INFO: renamed from: d */
        public b m5233d(int i) {
            this.f3298i = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m5234d(String str) {
            return m5228b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.t2$c */
    public enum c {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);


        /* JADX INFO: renamed from: a */
        private final int f3310a;

        c(int i) {
            this.f3310a = i;
        }

        /* JADX INFO: renamed from: b */
        public int m5236b() {
            if (this == SECTION) {
                return C1846R.layout.mediation_debugger_list_section;
            }
            if (this == SECTION_CENTERED) {
                return C1846R.layout.mediation_debugger_list_section_centered;
            }
            if (this == SIMPLE) {
                return R.layout.simple_list_item_1;
            }
            return this == DETAIL ? C1846R.layout.applovin_debugger_list_item_detail : C1846R.layout.mediation_debugger_list_item_right_detail;
        }

        /* JADX INFO: renamed from: c */
        public int m5237c() {
            return this.f3310a;
        }
    }

    private C1775t2(b bVar) {
        this.f3283g = 0;
        this.f3284h = 0;
        this.f3285i = ViewCompat.MEASURED_STATE_MASK;
        this.f3286j = ViewCompat.MEASURED_STATE_MASK;
        this.f3287k = 0;
        this.f3288l = 0;
        this.f3277a = bVar.f3290a;
        this.f3278b = bVar.f3291b;
        this.f3279c = bVar.f3292c;
        this.f3280d = bVar.f3293d;
        this.f3281e = bVar.f3294e;
        this.f3282f = bVar.f3295f;
        this.f3283g = bVar.f3296g;
        this.f3284h = bVar.f3297h;
        this.f3285i = bVar.f3298i;
        this.f3286j = bVar.f3299j;
        this.f3287k = bVar.f3300k;
        this.f3288l = bVar.f3301l;
        this.f3289m = bVar.f3302m;
    }

    protected C1775t2(c cVar) {
        this.f3283g = 0;
        this.f3284h = 0;
        this.f3285i = ViewCompat.MEASURED_STATE_MASK;
        this.f3286j = ViewCompat.MEASURED_STATE_MASK;
        this.f3287k = 0;
        this.f3288l = 0;
        this.f3277a = cVar;
    }

    /* JADX INFO: renamed from: a */
    public static b m5210a() {
        return m5211a(c.RIGHT_DETAIL);
    }

    /* JADX INFO: renamed from: a */
    public static b m5211a(c cVar) {
        return new b(cVar);
    }

    /* JADX INFO: renamed from: n */
    public static int m5212n() {
        return c.COUNT.m5237c();
    }

    /* JADX INFO: renamed from: b */
    public String m5213b() {
        return this.f3282f;
    }

    /* JADX INFO: renamed from: c */
    public String m5214c() {
        return this.f3281e;
    }

    /* JADX INFO: renamed from: d */
    public int mo2104d() {
        return this.f3284h;
    }

    /* JADX INFO: renamed from: e */
    public int mo2105e() {
        return this.f3288l;
    }

    /* JADX INFO: renamed from: f */
    public SpannedString mo5215f() {
        return this.f3280d;
    }

    /* JADX INFO: renamed from: g */
    public int mo3165g() {
        return this.f3286j;
    }

    /* JADX INFO: renamed from: h */
    public int mo2106h() {
        return this.f3283g;
    }

    /* JADX INFO: renamed from: i */
    public int m5216i() {
        return this.f3287k;
    }

    /* JADX INFO: renamed from: j */
    public int m5217j() {
        return this.f3277a.m5236b();
    }

    /* JADX INFO: renamed from: k */
    public SpannedString mo2748k() {
        return this.f3279c;
    }

    /* JADX INFO: renamed from: l */
    public int m5218l() {
        return this.f3285i;
    }

    /* JADX INFO: renamed from: m */
    public int m5219m() {
        return this.f3277a.m5237c();
    }

    /* JADX INFO: renamed from: o */
    public boolean mo2107o() {
        return this.f3278b;
    }

    /* JADX INFO: renamed from: p */
    public boolean mo5220p() {
        return this.f3289m;
    }
}
