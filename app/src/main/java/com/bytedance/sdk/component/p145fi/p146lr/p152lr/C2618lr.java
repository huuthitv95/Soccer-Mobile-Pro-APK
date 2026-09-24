package com.bytedance.sdk.component.p145fi.p146lr.p152lr;

import android.text.TextUtils;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.C2600ik;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.C2605ri;
import com.bytedance.sdk.component.p145fi.tan;
import com.bytedance.sdk.component.utils.slm;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2618lr implements InterfaceC2614di {
    /* JADX INFO: renamed from: ri */
    private String m9732ri(C2600ik c2600ik) {
        return slm.m10282ri(c2600ik.mo9571ri());
    }

    @Override // com.bytedance.sdk.component.p145fi.p146lr.p152lr.InterfaceC2614di
    /* JADX INFO: renamed from: ri */
    public String mo9721ri() {
        return "generate_key";
    }

    @Override // com.bytedance.sdk.component.p145fi.p146lr.p152lr.InterfaceC2614di
    /* JADX INFO: renamed from: ri */
    public boolean mo9722ri(C2600ik c2600ik, tan tanVar, C2605ri c2605ri) {
        if (TextUtils.isEmpty(c2600ik.m9626mj())) {
            String strM9732ri = m9732ri(c2600ik);
            c2600ik.m9625lr(strM9732ri);
            c2600ik.m9630ri(strM9732ri);
        }
        c2600ik.mo9571ri();
        return true;
    }
}
