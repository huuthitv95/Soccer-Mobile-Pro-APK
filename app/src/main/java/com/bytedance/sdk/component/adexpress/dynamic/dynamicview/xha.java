package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.C2402ri;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;

/* JADX INFO: loaded from: classes3.dex */
public class xha extends C2410di {
    public xha(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        super(context, dynamicRootView, c2475mj);
        this.f6486vr = new C2402ri(context);
        this.f6486vr.setTag(Integer.valueOf(getClickArea()));
        addView(this.f6486vr, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (!C2490ka.m8810lr() || !"fillButton".equals(this.f6473aw.m8627qt().m8596lr())) {
            return super.getWidgetLayoutParams();
        }
        ((TextView) this.f6486vr).setEllipsize(TextUtils.TruncateAt.END);
        ((TextView) this.f6486vr).setMaxLines(1);
        FrameLayout.LayoutParams widgetLayoutParams = super.getWidgetLayoutParams();
        widgetLayoutParams.width -= this.f6475co.m8711nr() * 2;
        widgetLayoutParams.height -= this.f6475co.m8711nr() * 2;
        widgetLayoutParams.topMargin += this.f6475co.m8711nr();
        widgetLayoutParams.leftMargin += this.f6475co.m8711nr();
        widgetLayoutParams.setMarginStart(widgetLayoutParams.leftMargin);
        widgetLayoutParams.setMarginEnd(widgetLayoutParams.rightMargin);
        return widgetLayoutParams;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.InterfaceC2429xd
    public boolean jbs() {
        super.jbs();
        if (TextUtils.equals("download-progress-button", this.f6473aw.m8627qt().m8596lr()) && TextUtils.isEmpty(this.f6475co.m8717qt())) {
            this.f6486vr.setVisibility(4);
            return true;
        }
        this.f6486vr.setTextAlignment(this.f6475co.m8709mj());
        ((TextView) this.f6486vr).setText(this.f6475co.m8717qt());
        ((TextView) this.f6486vr).setTextColor(this.f6475co.xha());
        ((TextView) this.f6486vr).setTextSize(this.f6475co.m8701fi());
        ((TextView) this.f6486vr).setGravity(17);
        ((TextView) this.f6486vr).setIncludeFontPadding(false);
        if ("fillButton".equals(this.f6473aw.m8627qt().m8596lr())) {
            this.f6486vr.setPadding(0, 0, 0, 0);
        } else {
            this.f6486vr.setPadding(this.f6475co.m8704ik(), this.f6475co.m8708lr(), this.f6475co.m8706ka(), this.f6475co.m8718ri());
        }
        return true;
    }
}
