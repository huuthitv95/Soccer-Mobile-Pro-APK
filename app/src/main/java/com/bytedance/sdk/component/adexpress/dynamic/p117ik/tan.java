package com.bytedance.sdk.component.adexpress.dynamic.p117ik;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi;
import com.bytedance.sdk.component.adexpress.dynamic.p115di.InterfaceC2404ri;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2476qt;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha;
import com.bytedance.sdk.component.adexpress.p113di.C2374fr;
import com.bytedance.sdk.component.adexpress.p123ik.C2489ri;
import com.bytedance.sdk.component.utils.C2729uq;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class tan implements xha<C2374fr> {

    /* JADX INFO: renamed from: di */
    private C2476qt f6680di;

    /* JADX INFO: renamed from: fi */
    private String f6681fi;

    /* JADX INFO: renamed from: ik */
    private AbstractC2412fi f6682ik;

    /* JADX INFO: renamed from: ka */
    private xha f6683ka;

    /* JADX INFO: renamed from: lr */
    private Context f6684lr;

    /* JADX INFO: renamed from: ri */
    private C2374fr f6685ri;

    public tan(Context context, AbstractC2412fi abstractC2412fi, xha xhaVar, String str, C2476qt c2476qt) {
        this.f6684lr = context;
        this.f6682ik = abstractC2412fi;
        this.f6683ka = xhaVar;
        this.f6681fi = str;
        this.f6680di = c2476qt;
        m8456fi();
    }

    /* JADX INFO: renamed from: fi */
    private void m8456fi() {
        int iM8700fe = this.f6683ka.m8700fe();
        final InterfaceC2404ri dynamicClickListener = this.f6682ik.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 2);
        } catch (Throwable unused) {
        }
        if ("18".equals(this.f6681fi)) {
            Context context = this.f6684lr;
            C2374fr c2374fr = new C2374fr(context, C2489ri.jbs(context), this.f6680di);
            this.f6685ri = c2374fr;
            if (c2374fr.getWriggleLayout() != null) {
                this.f6685ri.getWriggleLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
            if (this.f6685ri.getTopTextView() != null) {
                if (TextUtils.isEmpty(this.f6683ka.saa())) {
                    this.f6685ri.getTopTextView().setText(C2729uq.m10307lr(this.f6684lr, "tt_splash_wriggle_top_text_style_17"));
                } else {
                    this.f6685ri.getTopTextView().setText(this.f6683ka.saa());
                }
            }
        } else {
            Context context2 = this.f6684lr;
            this.f6685ri = new C2374fr(context2, C2489ri.jbs(context2), this.f6680di);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        this.f6685ri.setTranslationY(-((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6684lr, iM8700fe)));
        this.f6685ri.setLayoutParams(layoutParams);
        this.f6685ri.setShakeText(this.f6683ka.whw());
        this.f6685ri.setClipChildren(false);
        final View wriggleProgressIv = this.f6685ri.getWriggleProgressIv();
        this.f6685ri.setOnShakeViewListener(new C2374fr.ri() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ik.tan.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ka, reason: merged with bridge method [inline-methods] */
    public C2374fr mo8425ik() {
        return this.f6685ri;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: lr */
    public void mo8427lr() {
        this.f6685ri.clearAnimation();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ri */
    public void mo8428ri() {
        this.f6685ri.m8220ri();
    }
}
