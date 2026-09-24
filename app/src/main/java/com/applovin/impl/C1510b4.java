package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.C1846R;

/* JADX INFO: renamed from: com.applovin.impl.b4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1510b4 extends C1775t2 {

    /* JADX INFO: renamed from: n */
    private final C1559g3 f1141n;

    /* JADX INFO: renamed from: o */
    private final Context f1142o;

    public C1510b4(C1559g3 c1559g3, Context context) {
        super(C1775t2.c.DETAIL);
        this.f1141n = c1559g3;
        this.f1142o = context;
        this.f3279c = m2102t();
        this.f3280d = m2101s();
    }

    /* JADX INFO: renamed from: q */
    private SpannedString m2100q() {
        if (!this.f1141n.m2723z()) {
            return StringUtils.createListItemDetailSpannedString("Adapter Missing", SupportMenu.CATEGORY_MASK);
        }
        if (TextUtils.isEmpty(this.f1141n.m2700c())) {
            return StringUtils.createListItemDetailSpannedString("Adapter Found", ViewCompat.MEASURED_STATE_MASK);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
        spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f1141n.m2700c(), ViewCompat.MEASURED_STATE_MASK));
        if (this.f1141n.m2688A()) {
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("  LATEST  ", this.f1142o.getColor(C1846R.color.applovin_sdk_orangeColor)));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f1141n.m2708k(), ViewCompat.MEASURED_STATE_MASK));
        }
        if (!this.f1141n.m2689B()) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("INCOMPATIBLE WITH MAX SDK VERSION", SupportMenu.CATEGORY_MASK));
        }
        return new SpannedString(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: s */
    private SpannedString m2101s() {
        if (!mo2107o()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) m2103u());
        spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
        spannableStringBuilder.append((CharSequence) m2100q());
        if (this.f1141n.m2714q() == C1559g3.a.INVALID_INTEGRATION) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Invalid Integration", SupportMenu.CATEGORY_MASK));
        } else if (this.f1141n.m2714q() == C1559g3.a.INCOMPLETE_INTEGRATION && this.f1141n.m2692E()) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Mismatched SDK/Adapter Versions", SupportMenu.CATEGORY_MASK));
        }
        return new SpannedString(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: t */
    private SpannedString m2102t() {
        return StringUtils.createSpannedString(this.f1141n.m2704g(), mo2107o() ? ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
    }

    /* JADX INFO: renamed from: u */
    private SpannedString m2103u() {
        if (!this.f1141n.m2693F()) {
            return StringUtils.createListItemDetailSpannedString("SDK Missing", SupportMenu.CATEGORY_MASK);
        }
        if (!StringUtils.isValidString(this.f1141n.m2713p())) {
            return StringUtils.createListItemDetailSpannedString(this.f1141n.m2723z() ? "Retrieving SDK Version..." : "SDK Found", ViewCompat.MEASURED_STATE_MASK);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
        spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f1141n.m2713p(), ViewCompat.MEASURED_STATE_MASK));
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
        return this.f1142o.getColor(C1846R.color.applovin_sdk_disclosureButtonColor);
    }

    @Override // com.applovin.impl.C1775t2
    /* JADX INFO: renamed from: h */
    public int mo2106h() {
        int iM2705h = this.f1141n.m2705h();
        return iM2705h > 0 ? iM2705h : C1846R.drawable.applovin_ic_mediation_placeholder;
    }

    @Override // com.applovin.impl.C1775t2
    /* JADX INFO: renamed from: o */
    public boolean mo2107o() {
        return this.f1141n.m2714q() != C1559g3.a.MISSING;
    }

    /* JADX INFO: renamed from: r */
    public C1559g3 m2108r() {
        return this.f1141n;
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + ((Object) this.f3279c) + ", detailText=" + ((Object) this.f3280d) + ", network=" + this.f1141n + "}";
    }
}
