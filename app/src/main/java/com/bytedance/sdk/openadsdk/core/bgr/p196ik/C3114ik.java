package com.bytedance.sdk.openadsdk.core.bgr.p196ik;

import com.bytedance.sdk.component.utils.xha;
import com.bytedance.sdk.openadsdk.p244lr.C3472lr;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bgr.ik.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3114ik extends C3472lr {
    public C3114ik(int i, int i2) {
        super(i, i2);
    }

    public C3114ik(int i, int i2, boolean z) {
        super(i, i2);
        this.f12547ri = z;
    }

    @Override // com.bytedance.sdk.openadsdk.p244lr.C3472lr, com.bytedance.sdk.openadsdk.p244lr.AbstractC3473ri
    /* JADX INFO: renamed from: ri */
    protected void mo12657ri(List<File> list) {
        int size = list.size();
        if (mo15728ri(0L, size)) {
            return;
        }
        for (File file : list) {
            xha.m10326ik(file);
            size--;
            if (mo15729ri(file, 0L, size)) {
                return;
            }
        }
    }
}
