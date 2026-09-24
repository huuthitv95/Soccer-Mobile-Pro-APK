package com.bytedance.sdk.component.adexpress.dynamic.p117ik;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi;
import com.bytedance.sdk.component.adexpress.dynamic.p115di.InterfaceC2404ri;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha;
import com.bytedance.sdk.component.adexpress.p113di.C2381nr;
import com.bytedance.sdk.component.adexpress.p123ik.C2489ri;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ik.vr */
/* JADX INFO: loaded from: classes3.dex */
public class C2468vr implements xha<C2381nr> {

    /* JADX INFO: renamed from: di */
    private int f6689di;

    /* JADX INFO: renamed from: fi */
    private String f6690fi;

    /* JADX INFO: renamed from: ik */
    private AbstractC2412fi f6691ik;
    private JSONObject jbs;

    /* JADX INFO: renamed from: ka */
    private xha f6692ka;

    /* JADX INFO: renamed from: lr */
    private Context f6693lr;

    /* JADX INFO: renamed from: mj */
    private int f6694mj;

    /* JADX INFO: renamed from: ri */
    private C2381nr f6695ri;
    private int xha;

    public C2468vr(Context context, AbstractC2412fi abstractC2412fi, xha xhaVar, String str, int i, int i2, int i3, JSONObject jSONObject) {
        this.f6693lr = context;
        this.f6691ik = abstractC2412fi;
        this.f6692ka = xhaVar;
        this.f6690fi = str;
        this.f6689di = i;
        this.xha = i2;
        this.f6694mj = i3;
        this.jbs = jSONObject;
        m8458fi();
    }

    /* JADX INFO: renamed from: fi */
    private void m8458fi() {
        final InterfaceC2404ri dynamicClickListener = this.f6691ik.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 1);
        } catch (Throwable unused) {
        }
        if ("16".equals(this.f6690fi)) {
            Context context = this.f6693lr;
            C2381nr c2381nr = new C2381nr(context, C2489ri.m8806mj(context), this.f6689di, this.xha, this.f6694mj, this.jbs);
            this.f6695ri = c2381nr;
            if (c2381nr.getShakeLayout() != null) {
                this.f6695ri.getShakeLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
        } else {
            Context context2 = this.f6693lr;
            this.f6695ri = new C2381nr(context2, C2489ri.xha(context2), this.f6689di, this.xha, this.f6694mj, this.jbs);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f6695ri.setGravity(17);
        layoutParams.gravity = 17;
        this.f6695ri.setLayoutParams(layoutParams);
        this.f6695ri.setTranslationY(com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6693lr, this.f6692ka.yjm()));
        this.f6695ri.setShakeText(this.f6692ka.whw());
        this.f6695ri.setClipChildren(false);
        this.f6695ri.setOnShakeViewListener(new C2381nr.ri() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ik.vr.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ka, reason: merged with bridge method [inline-methods] */
    public C2381nr mo8425ik() {
        return this.f6695ri;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: lr */
    public void mo8427lr() {
        this.f6695ri.clearAnimation();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ri */
    public void mo8428ri() {
        this.f6695ri.m8249ri();
    }
}
