package com.bytedance.sdk.component.adexpress.dynamic.p117ik;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha;
import com.bytedance.sdk.component.adexpress.p113di.C2372di;
import com.bytedance.sdk.component.adexpress.p113di.C2381nr;
import com.bytedance.sdk.component.adexpress.p113di.tan;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ik.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2446di extends C2444bu<C2372di> {
    public C2446di(Context context, AbstractC2412fi abstractC2412fi, xha xhaVar, int i, int i2, int i3, JSONObject jSONObject) {
        super(context, abstractC2412fi, xhaVar);
        this.f6594lr = context;
        this.f6593ka = xhaVar;
        this.f6592ik = abstractC2412fi;
        m8432ri(i, i2, i3, jSONObject, xhaVar);
    }

    /* JADX INFO: renamed from: ri */
    private void m8432ri(int i, int i2, int i3, JSONObject jSONObject, xha xhaVar) {
        int iM8700fe;
        this.f6595ri = new C2372di(this.f6594lr, i, i2, i3, jSONObject);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6594lr, 300.0f));
        layoutParams.gravity = 81;
        Context context = this.f6594lr;
        if (xhaVar.m8700fe() > 0) {
            iM8700fe = xhaVar.m8700fe();
        } else {
            iM8700fe = C2490ka.m8810lr() ? 0 : 120;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(context, iM8700fe);
        this.f6595ri.setLayoutParams(layoutParams);
        this.f6595ri.setClipChildren(false);
        this.f6595ri.setSlideText(this.f6593ka.whw());
        if (this.f6595ri instanceof C2372di) {
            ((C2372di) this.f6595ri).setShakeText(this.f6593ka.rzk());
            final tan shakeView = ((C2372di) this.f6595ri).getShakeView();
            if (shakeView != null) {
                shakeView.setOnShakeViewListener(new C2381nr.ri() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ik.di.1
                });
                shakeView.setOnClickListener((View.OnClickListener) this.f6592ik.getDynamicClickListener());
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.C2444bu
    /* JADX INFO: renamed from: ka */
    protected void mo8431ka() {
    }
}
