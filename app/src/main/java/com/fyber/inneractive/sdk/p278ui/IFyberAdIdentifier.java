package com.fyber.inneractive.sdk.p278ui;

import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.config.global.features.C7974b;
import com.fyber.inneractive.sdk.config.global.features.EnumC7973a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IFyberAdIdentifier {

    /* JADX INFO: renamed from: a */
    public ClickListener f21402a;

    /* JADX INFO: renamed from: b */
    public final int f21403b;

    /* JADX INFO: renamed from: c */
    public final int f21404c;

    /* JADX INFO: renamed from: d */
    public final int f21405d;

    /* JADX INFO: renamed from: e */
    public final int f21406e;

    /* JADX INFO: renamed from: f */
    public final int f21407f;

    /* JADX INFO: renamed from: g */
    public final String f21408g;

    /* JADX INFO: renamed from: h */
    public final String f21409h;

    /* JADX INFO: renamed from: i */
    public final String f21410i;

    /* JADX INFO: renamed from: j */
    public final boolean f21411j;

    /* JADX INFO: renamed from: k */
    public Corner f21412k = Corner.BOTTOM_LEFT;

    /* JADX INFO: renamed from: l */
    public final EnumC7973a f21413l;

    public interface ClickListener {
        /* JADX INFO: renamed from: a */
        void mo20542a();
    }

    public enum Corner {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT
    }

    public IFyberAdIdentifier(C8006r c8006r) {
        this.f21403b = 0;
        this.f21404c = 0;
        this.f21405d = 0;
        this.f21406e = 0;
        this.f21407f = 0;
        this.f21408g = null;
        this.f21409h = "";
        this.f21410i = "";
        this.f21411j = false;
        this.f21413l = C7974b.f17755e;
        if (c8006r != null) {
            C7974b c7974b = (C7974b) c8006r.m20432a(C7974b.class);
            Integer numMo20416a = c7974b.mo20416a("ad_identifier_text_size_w");
            this.f21403b = numMo20416a != null ? numMo20416a.intValue() : 110;
            Integer numMo20416a2 = c7974b.mo20416a("ad_identifier_text_size_h");
            this.f21404c = numMo20416a2 != null ? numMo20416a2.intValue() : 18;
            Integer numMo20416a3 = c7974b.mo20416a("ad_identifier_image_size_w");
            this.f21405d = numMo20416a3 != null ? numMo20416a3.intValue() : 18;
            Integer numMo20416a4 = c7974b.mo20416a("ad_identifier_image_size_h");
            this.f21406e = numMo20416a4 != null ? numMo20416a4.intValue() : 18;
            Integer numMo20416a5 = c7974b.mo20416a("ad_identifier_text_size");
            this.f21407f = numMo20416a5 != null ? numMo20416a5.intValue() : 8;
            this.f21408g = c7974b.mo20417a("ad_identifier_tint_color", "#75DCDCDC");
            this.f21413l = c7974b.m20414c();
            this.f21409h = c7974b.mo20417a("ad_identifier_text", "Tap for more information");
            this.f21410i = c7974b.mo20417a("ad_identifier_icon_url", null);
            this.f21411j = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo21932a(ViewGroup viewGroup);
}
