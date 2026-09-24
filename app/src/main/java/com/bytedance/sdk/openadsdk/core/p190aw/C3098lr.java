package com.bytedance.sdk.openadsdk.core.p190aw;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.core.p190aw.p191ik.C3096ri;
import com.bytedance.sdk.openadsdk.core.p190aw.p192lr.C3099ik;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3098lr extends C3092ik {

    /* JADX INFO: renamed from: qt */
    private long f9813qt;

    /* JADX INFO: renamed from: sf */
    private long f9814sf;

    public C3098lr(int i, int i2, long j, long j2, C3096ri.ri riVar, C3096ri.lr lrVar, String str, List<C3099ik> list, List<C3099ik> list2, String str2) {
        super(i, i2, riVar, lrVar, str, list, list2, str2);
        this.f9813qt = j;
        this.f9814sf = j2;
        this.jbs = "icon_click";
    }

    /* JADX INFO: renamed from: ri */
    public static C3098lr m12491ri(JSONObject jSONObject) {
        C3092ik c3092ikM12418lr = C3092ik.m12418lr(jSONObject);
        if (c3092ikM12418lr == null) {
            return null;
        }
        return new C3098lr(c3092ikM12418lr.f9748ri, c3092ikM12418lr.f9745lr, jSONObject.optLong(TypedValues.CycleType.S_WAVE_OFFSET, -1L), jSONObject.optLong("duration", -1L), c3092ikM12418lr.f9743ik, c3092ikM12418lr.f9744ka, c3092ikM12418lr.f9742fi, c3092ikM12418lr.f9741di, c3092ikM12418lr.xha, c3092ikM12418lr.f9746mj);
    }
}
