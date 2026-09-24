package com.bytedance.sdk.openadsdk.component.reward.p188ri;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3371ka;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.InterfaceC3370ik;
import com.bytedance.sdk.openadsdk.utils.slm;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri.ka */
/* JADX INFO: loaded from: classes9.dex */
public class C3018ka {

    /* JADX INFO: renamed from: fi */
    private final C3022ri f9350fi;

    /* JADX INFO: renamed from: ik */
    private final String f9351ik;

    /* JADX INFO: renamed from: ka */
    private boolean f9352ka;

    /* JADX INFO: renamed from: lr */
    private final wjv f9353lr;

    /* JADX INFO: renamed from: ri */
    InterfaceC3370ik f9354ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri.ka$ri */
    /* JADX INFO: loaded from: classes3.dex */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        void mo11948ri(View view, float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, int i, int i2, int i3);

        /* JADX INFO: renamed from: ri */
        void mo11949ri(String str, JSONObject jSONObject);
    }

    public C3018ka(C3022ri c3022ri) {
        this.f9350fi = c3022ri;
        this.f9353lr = c3022ri.f9389lr;
        this.f9351ik = c3022ri.f9381fi;
    }

    /* JADX INFO: renamed from: ka */
    private void m11943ka() {
        if (this.f9353lr.adz() == 4) {
            this.f9354ri = C3371ka.m15240ri(this.f9350fi.srn, this.f9351ik);
        }
        if (this.f9354ri == null) {
            this.f9354ri = C3371ka.m15240ri(this.f9350fi.f9384ig, this.f9351ik);
        }
    }

    /* JADX INFO: renamed from: ik */
    public InterfaceC3370ik m11944ik() {
        return this.f9354ri;
    }

    /* JADX INFO: renamed from: lr */
    public void m11945lr() {
        InterfaceC3370ik interfaceC3370ik = this.f9354ri;
        if (interfaceC3370ik != null) {
            interfaceC3370ik.mo15239ri(this.f9353lr);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11946ri() {
        if (this.f9352ka) {
            return;
        }
        this.f9352ka = true;
        m11943ka();
    }

    /* JADX INFO: renamed from: ri */
    public void m11947ri(View view, float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, int i, int i2, int i3, ri riVar) {
        if (this.f9354ri == null) {
            riVar.mo11948ri(view, f, f2, f3, f4, sparseArray, i, i2, i3);
            return;
        }
        int id = view.getId();
        if (id == slm.xha) {
            riVar.mo11949ri("click_play_star_level", null);
            return;
        }
        if (id == slm.f13261di) {
            riVar.mo11949ri("click_play_star_nums", null);
        } else if (id == slm.f13268fi) {
            riVar.mo11949ri("click_play_source", null);
        } else if (id == slm.f13282ka) {
            riVar.mo11949ri("click_play_logo", null);
        }
    }
}
