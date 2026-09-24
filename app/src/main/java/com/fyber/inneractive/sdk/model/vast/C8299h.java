package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.vast.C8225b;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.model.vast.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C8299h {

    /* JADX INFO: renamed from: a */
    public Integer f18539a;

    /* JADX INFO: renamed from: b */
    public Integer f18540b;

    /* JADX INFO: renamed from: c */
    public String f18541c;

    /* JADX INFO: renamed from: d */
    public C8303l f18542d;

    /* JADX INFO: renamed from: e */
    public String f18543e;

    /* JADX INFO: renamed from: f */
    public String f18544f;

    /* JADX INFO: renamed from: g */
    public String f18545g;

    /* JADX INFO: renamed from: i */
    public C8225b f18547i;

    /* JADX INFO: renamed from: h */
    public final ArrayList f18546h = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final ArrayList f18548j = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final boolean m20705a() {
        return (TextUtils.isEmpty(this.f18544f) && TextUtils.isEmpty(this.f18543e) && this.f18542d == null) ? false : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Companion:  w:");
        sb.append(this.f18539a);
        sb.append(" h:");
        sb.append(this.f18540b);
        sb.append(" ctr:");
        sb.append(this.f18545g);
        sb.append(" clt:");
        sb.append(this.f18546h);
        if (!TextUtils.isEmpty(this.f18544f)) {
            sb.append(" html:");
            sb.append(this.f18544f);
        }
        if (this.f18542d != null) {
            sb.append(" static:");
            sb.append(this.f18542d.f18551b);
            sb.append("creative:");
            sb.append(this.f18542d.f18550a);
        }
        if (!TextUtils.isEmpty(this.f18543e)) {
            sb.append(" iframe:");
            sb.append(this.f18543e);
        }
        sb.append(" events:");
        sb.append(this.f18548j);
        if (this.f18547i != null) {
            sb.append(" reason:");
            sb.append(this.f18547i.f18334a);
            sb.append(" exception:");
            sb.append(this.f18547i.getMessage());
        }
        return sb.toString();
    }
}
