package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.CreativeType;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.response.e */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9087e {

    /* JADX INFO: renamed from: B */
    public String f21292B;

    /* JADX INFO: renamed from: C */
    public String f21293C;

    /* JADX INFO: renamed from: D */
    public String f21294D;

    /* JADX INFO: renamed from: F */
    public String f21296F;

    /* JADX INFO: renamed from: J */
    public CreativeType f21300J;

    /* JADX INFO: renamed from: a */
    public long f21301a;

    /* JADX INFO: renamed from: b */
    public long f21302b;

    /* JADX INFO: renamed from: c */
    public long f21303c;

    /* JADX INFO: renamed from: d */
    public String f21304d;

    /* JADX INFO: renamed from: e */
    public int f21305e;

    /* JADX INFO: renamed from: f */
    public int f21306f;

    /* JADX INFO: renamed from: g */
    public int f21307g;

    /* JADX INFO: renamed from: h */
    public String f21308h;

    /* JADX INFO: renamed from: i */
    public String f21309i;

    /* JADX INFO: renamed from: j */
    public String f21310j;

    /* JADX INFO: renamed from: k */
    public String f21311k;

    /* JADX INFO: renamed from: l */
    public String f21312l;

    /* JADX INFO: renamed from: m */
    public String f21313m;

    /* JADX INFO: renamed from: n */
    public UnitDisplayType f21314n;

    /* JADX INFO: renamed from: o */
    public String f21315o;

    /* JADX INFO: renamed from: p */
    public Map f21316p;

    /* JADX INFO: renamed from: q */
    public String f21317q;

    /* JADX INFO: renamed from: r */
    public ImpressionData f21318r;

    /* JADX INFO: renamed from: u */
    public String f21321u;

    /* JADX INFO: renamed from: w */
    public Exception f21323w;

    /* JADX INFO: renamed from: x */
    public String f21324x;

    /* JADX INFO: renamed from: y */
    public String f21325y;

    /* JADX INFO: renamed from: z */
    public String f21326z;

    /* JADX INFO: renamed from: s */
    public int f21319s = 0;

    /* JADX INFO: renamed from: t */
    public float f21320t = -1.0f;

    /* JADX INFO: renamed from: v */
    public int f21322v = -1;

    /* JADX INFO: renamed from: A */
    public boolean f21291A = false;

    /* JADX INFO: renamed from: E */
    public EnumC8253m f21295E = EnumC8253m.NONE;

    /* JADX INFO: renamed from: G */
    public boolean f21297G = false;

    /* JADX INFO: renamed from: H */
    public long f21298H = 0;

    /* JADX INFO: renamed from: I */
    public boolean f21299I = false;

    /* JADX INFO: renamed from: a */
    public abstract InneractiveErrorCode mo21891a(InneractiveAdRequest inneractiveAdRequest, C8006r c8006r);

    /* JADX INFO: renamed from: a */
    public final void m21892a(String str) {
        long j;
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException unused) {
            j = 20;
        }
        this.f21302b = j;
        this.f21301a = TimeUnit.MINUTES.toMillis(j) + this.f21303c;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21893a() {
        return (this.f21295E == EnumC8253m.NONE || TextUtils.isEmpty(this.f21324x) || TextUtils.isEmpty(this.f21294D) || TextUtils.isEmpty(this.f21296F)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public abstract InneractiveErrorCode mo21894b();
}
