package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.p116fi.C2440sf;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.bytedance.sdk.component.adexpress.p113di.C2383ri;
import com.bytedance.sdk.component.utils.C2729uq;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fr */
/* JADX INFO: loaded from: classes3.dex */
public class C2413fr extends C2410di {
    public C2413fr(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        super(context, dynamicRootView, c2475mj);
        this.f6481mj += 6;
        if (this.f6475co.m8715qd()) {
            this.f6486vr = new C2383ri(context, this.f6475co.xha(), this.f6475co.m8701fi(), 1, this.f6475co.m8709mj());
            ((C2383ri) this.f6486vr).setMaxLines(1);
        } else {
            this.f6486vr = new TextView(context);
            ((TextView) this.f6486vr).setIncludeFontPadding(false);
        }
        this.f6486vr.setTag(Integer.valueOf(getClickArea()));
        addView(this.f6486vr, getWidgetLayoutParams());
    }

    /* JADX INFO: renamed from: qt */
    private void m8336qt() {
        int iM8833ri;
        if (TextUtils.equals(this.f6473aw.m8627qt().m8596lr(), "source") || TextUtils.equals(this.f6473aw.m8627qt().m8596lr(), "title") || TextUtils.equals(this.f6473aw.m8627qt().m8596lr(), "text_star")) {
            int[] iArrM8415lr = C2440sf.m8415lr(this.f6475co.m8698di(), this.f6475co.m8701fi(), true);
            int iM8833ri2 = (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(getContext(), this.f6475co.m8708lr());
            int iM8833ri3 = (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(getContext(), this.f6475co.m8704ik());
            int iM8833ri4 = (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(getContext(), this.f6475co.m8706ka());
            int iM8833ri5 = (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(getContext(), this.f6475co.m8718ri());
            int iMin = Math.min(iM8833ri2, iM8833ri5);
            if (TextUtils.equals(this.f6473aw.m8627qt().m8596lr(), "source") && (iM8833ri = ((this.f6481mj - ((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(getContext(), this.f6475co.m8701fi()))) - iM8833ri2) - iM8833ri5) > 1 && iM8833ri <= iMin * 2) {
                int i = iM8833ri / 2;
                this.f6486vr.setPadding(iM8833ri3, iM8833ri2 - i, iM8833ri4, iM8833ri5 - (iM8833ri - i));
                return;
            }
            int i2 = (((iArrM8415lr[1] + iM8833ri2) + iM8833ri5) - this.f6481mj) - 2;
            if (i2 <= 1) {
                return;
            }
            if (i2 <= iMin * 2) {
                int i3 = i2 / 2;
                this.f6486vr.setPadding(iM8833ri3, iM8833ri2 - i3, iM8833ri4, iM8833ri5 - (i2 - i3));
            } else if (i2 > iM8833ri2 + iM8833ri5) {
                final int i4 = (i2 - iM8833ri2) - iM8833ri5;
                this.f6486vr.setPadding(iM8833ri3, 0, iM8833ri4, 0);
                if (i4 <= ((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(getContext(), 1.0f)) + 1) {
                    ((TextView) this.f6486vr).setTextSize(this.f6475co.m8701fi() - 1.0f);
                } else if (i4 <= (((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(getContext(), 1.0f)) + 1) * 2) {
                    ((TextView) this.f6486vr).setTextSize(this.f6475co.m8701fi() - 2.0f);
                } else {
                    post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fr.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                ViewGroup.LayoutParams layoutParams = C2413fr.this.f6486vr.getLayoutParams();
                                layoutParams.height = C2413fr.this.f6481mj + i4;
                                C2413fr.this.f6486vr.setLayoutParams(layoutParams);
                                C2413fr.this.f6486vr.setTranslationY(-i4);
                                ViewGroup viewGroup = (ViewGroup) C2413fr.this.f6486vr.getParent();
                                viewGroup.setClipChildren(false);
                                ViewGroup viewGroup2 = (ViewGroup) C2413fr.this.f6486vr.getParent().getParent();
                                viewGroup2.setClipChildren(false);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
            } else if (iM8833ri2 > iM8833ri5) {
                this.f6486vr.setPadding(iM8833ri3, iM8833ri2 - (i2 - iMin), iM8833ri4, iM8833ri5 - iMin);
            } else {
                this.f6486vr.setPadding(iM8833ri3, iM8833ri2 - iMin, iM8833ri4, iM8833ri5 - (i2 - iMin));
            }
        }
        if (TextUtils.equals(this.f6473aw.m8627qt().m8596lr(), "fillButton")) {
            this.f6486vr.setTextAlignment(2);
            ((TextView) this.f6486vr).setGravity(17);
        }
    }

    /* JADX INFO: renamed from: ri */
    private boolean m8337ri() {
        return (this.bgr == null || this.bgr.getRenderRequest() == null || this.bgr.getRenderRequest().m8888qt() == 4) ? false : true;
    }

    /* JADX INFO: renamed from: sf */
    private void m8338sf() {
        if (this.f6486vr instanceof C2383ri) {
            String text = getText();
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(text);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.optString(i));
                }
            } catch (JSONException unused) {
                arrayList.add(text);
            }
            ((C2383ri) this.f6486vr).setMaxLines(1);
            ((C2383ri) this.f6486vr).setTextColor(this.f6475co.xha());
            ((C2383ri) this.f6486vr).setTextSize(this.f6475co.m8701fi());
            ((C2383ri) this.f6486vr).setAnimationText(arrayList);
            ((C2383ri) this.f6486vr).setAnimationType(this.f6475co.m8705jc());
            ((C2383ri) this.f6486vr).setAnimationDuration(this.f6475co.srn() * 1000);
            ((C2383ri) this.f6486vr).m8259ri();
        }
    }

    public String getText() {
        String strM8698di = this.f6475co.m8698di();
        if (TextUtils.isEmpty(strM8698di)) {
            if (!C2490ka.m8810lr() && TextUtils.equals(this.f6473aw.m8627qt().m8596lr(), "text_star")) {
                strM8698di = CampaignEx.CLICKMODE_ON;
            }
            if (!C2490ka.m8810lr() && TextUtils.equals(this.f6473aw.m8627qt().m8596lr(), "score-count")) {
                strM8698di = "6870";
            }
        }
        return (TextUtils.equals(this.f6473aw.m8627qt().m8596lr(), "title") || TextUtils.equals(this.f6473aw.m8627qt().m8596lr(), MessengerShareContentUtility.SUBTITLE)) ? strM8698di.replace("\n", "") : strM8698di;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.InterfaceC2429xd
    public boolean jbs() {
        int i;
        double d;
        super.jbs();
        if (TextUtils.isEmpty(getText())) {
            this.f6486vr.setVisibility(4);
            return true;
        }
        if (this.f6475co.m8715qd()) {
            m8338sf();
            return true;
        }
        ((TextView) this.f6486vr).setText(this.f6475co.m8698di());
        ((TextView) this.f6486vr).setTextDirection(5);
        this.f6486vr.setTextAlignment(this.f6475co.m8709mj());
        ((TextView) this.f6486vr).setTextColor(this.f6475co.xha());
        ((TextView) this.f6486vr).setTextSize(this.f6475co.m8701fi());
        if (this.f6475co.m8726uq()) {
            int iWjv = this.f6475co.wjv();
            if (iWjv > 0) {
                ((TextView) this.f6486vr).setLines(iWjv);
                ((TextView) this.f6486vr).setEllipsize(TextUtils.TruncateAt.END);
            }
        } else {
            ((TextView) this.f6486vr).setMaxLines(1);
            ((TextView) this.f6486vr).setGravity(17);
            ((TextView) this.f6486vr).setEllipsize(TextUtils.TruncateAt.END);
        }
        if (this.f6473aw != null && this.f6473aw.m8627qt() != null) {
            if (C2490ka.m8810lr() && m8337ri() && (TextUtils.equals(this.f6473aw.m8627qt().m8596lr(), "text_star") || TextUtils.equals(this.f6473aw.m8627qt().m8596lr(), "score-count") || TextUtils.equals(this.f6473aw.m8627qt().m8596lr(), "score-count-type-1") || TextUtils.equals(this.f6473aw.m8627qt().m8596lr(), "score-count-type-2"))) {
                setVisibility(8);
                return true;
            }
            if (TextUtils.equals(this.f6473aw.m8627qt().m8596lr(), "score-count") || TextUtils.equals(this.f6473aw.m8627qt().m8596lr(), "score-count-type-2")) {
                try {
                    try {
                        i = Integer.parseInt(getText());
                    } catch (NumberFormatException unused) {
                        i = -1;
                    }
                    if (i < 0) {
                        if (C2490ka.m8810lr()) {
                            setVisibility(8);
                            return true;
                        }
                        this.f6486vr.setVisibility(0);
                    }
                    if (TextUtils.equals(this.f6473aw.m8627qt().m8596lr(), "score-count-type-2")) {
                        ((TextView) this.f6486vr).setText(String.format(new DecimalFormat("(###,###,###)").format(i), Integer.valueOf(i)));
                        ((TextView) this.f6486vr).setGravity(17);
                        return true;
                    }
                    m8339ri((TextView) this.f6486vr, i, getContext(), "tt_comment_num");
                } catch (Exception unused2) {
                }
            } else if (TextUtils.equals(this.f6473aw.m8627qt().m8596lr(), "text_star")) {
                try {
                    d = Double.parseDouble(getText());
                } catch (Exception unused3) {
                    d = -1.0d;
                }
                if (d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d > 5.0d) {
                    if (C2490ka.m8810lr()) {
                        setVisibility(8);
                        return true;
                    }
                    this.f6486vr.setVisibility(0);
                }
                ((TextView) this.f6486vr).setIncludeFontPadding(false);
                ((TextView) this.f6486vr).setText(String.format("%.1f", Double.valueOf(d)));
            } else if (TextUtils.equals("privacy-detail", this.f6473aw.m8627qt().m8596lr())) {
                ((TextView) this.f6486vr).setText("Permission list | Privacy policy");
            } else if (TextUtils.equals(this.f6473aw.m8627qt().m8596lr(), "development-name")) {
                ((TextView) this.f6486vr).setText(C2729uq.m10311ri(C2490ka.m8811ri(), "tt_text_privacy_development") + getText());
            } else if (TextUtils.equals(this.f6473aw.m8627qt().m8596lr(), "app-version")) {
                ((TextView) this.f6486vr).setText(C2729uq.m10311ri(C2490ka.m8811ri(), "tt_text_privacy_app_version") + getText());
            } else {
                ((TextView) this.f6486vr).setText(getText());
            }
            this.f6486vr.setTextAlignment(this.f6475co.m8709mj());
            ((TextView) this.f6486vr).setGravity(this.f6475co.jbs());
            if (C2490ka.m8810lr()) {
                m8336qt();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ri */
    public void m8339ri(TextView textView, int i, Context context, String str) {
        textView.setText("(" + String.format(C2729uq.m10311ri(context, str), Integer.valueOf(i)) + ")");
        if (i == -1) {
            textView.setVisibility(8);
        }
    }
}
