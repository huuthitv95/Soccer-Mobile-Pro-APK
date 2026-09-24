package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.p116fi.C2440sf;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.bytedance.sdk.component.adexpress.p125lr.C2500aw;
import com.bytedance.sdk.component.utils.C2729uq;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.aw */
/* JADX INFO: loaded from: classes3.dex */
public class C2406aw extends C2410di {
    public C2406aw(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        super(context, dynamicRootView, c2475mj);
        this.f6486vr = new TextView(context);
        this.f6486vr.setTag(Integer.valueOf(getClickArea()));
        addView(this.f6486vr, getWidgetLayoutParams());
    }

    /* JADX INFO: renamed from: ri */
    private boolean m8311ri() {
        if (C2490ka.m8810lr()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.f6475co.f6816lr) && this.f6475co.f6816lr.contains("adx:")) || C2440sf.m8414lr();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi
    /* JADX INFO: renamed from: di */
    public void mo8309di() {
        C2500aw renderRequest = this.bgr.getRenderRequest();
        if (renderRequest == null || !TextUtils.isEmpty(renderRequest.igq())) {
            super.mo8309di();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.xha, this.f6481mj);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0082  */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.InterfaceC2429xd
    public boolean jbs() {
        C2500aw renderRequest;
        super.jbs();
        this.f6486vr.setTextAlignment(this.f6475co.m8709mj());
        ((TextView) this.f6486vr).setTextColor(this.f6475co.xha());
        ((TextView) this.f6486vr).setTextSize(this.f6475co.m8701fi());
        if (!C2490ka.m8810lr()) {
            if (!m8311ri()) {
                ((TextView) this.f6486vr).setText(C2729uq.m10307lr(getContext(), "tt_logo_cn"));
                return true;
            }
            if (C2440sf.m8414lr()) {
                ((TextView) this.f6486vr).setText(C2440sf.m8420ri());
                return true;
            }
            ((TextView) this.f6486vr).setText(C2440sf.m8421ri(this.f6475co.f6816lr));
            return true;
        }
        int i = 0;
        ((TextView) this.f6486vr).setIncludeFontPadding(false);
        ((TextView) this.f6486vr).setTextSize(Math.min(((com.bytedance.sdk.component.adexpress.p124ka.xha.m8832lr(C2490ka.m8811ri(), this.f6481mj) - this.f6475co.m8708lr()) - this.f6475co.m8718ri()) - 0.5f, this.f6475co.m8701fi()));
        if (this.bgr == null || (renderRequest = this.bgr.getRenderRequest()) == null) {
            i = 8;
        } else {
            String strM8894zf = renderRequest.m8894zf();
            if (TextUtils.isEmpty(strM8894zf)) {
                i = 8;
            } else {
                ((TextView) this.f6486vr).setText(strM8894zf);
            }
        }
        ((TextView) this.f6486vr).setVisibility(i);
        return true;
    }
}
