package com.applovin.impl;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.applovin.sdk.C1846R;

/* JADX INFO: renamed from: com.applovin.impl.q1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1695q1 extends C1775t2 {

    /* JADX INFO: renamed from: n */
    private final C1705r1 f2593n;

    /* JADX INFO: renamed from: o */
    private final Context f2594o;

    public C1695q1(C1705r1 c1705r1, Context context) {
        super(C1775t2.c.DETAIL);
        this.f2593n = c1705r1;
        this.f2594o = context;
        this.f3279c = m3961r();
        this.f3280d = m3960q();
    }

    /* JADX INFO: renamed from: q */
    private SpannedString m3960q() {
        return new SpannedString("Displayed " + AbstractC1701q7.m4029a(this.f2593n.m4159b(), true));
    }

    /* JADX INFO: renamed from: r */
    private SpannedString m3961r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f2593n.m4161d());
        spannableStringBuilder.append((CharSequence) " - ");
        spannableStringBuilder.append((CharSequence) this.f2593n.m4163f());
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.C1775t2
    /* JADX INFO: renamed from: d */
    public int mo2104d() {
        return mo2107o() ? C1846R.drawable.applovin_ic_disclosure_arrow : super.mo2106h();
    }

    @Override // com.applovin.impl.C1775t2
    /* JADX INFO: renamed from: e */
    public int mo2105e() {
        return this.f2594o.getColor(C1846R.color.applovin_sdk_disclosureButtonColor);
    }

    @Override // com.applovin.impl.C1775t2
    /* JADX INFO: renamed from: o */
    public boolean mo2107o() {
        return true;
    }
}
