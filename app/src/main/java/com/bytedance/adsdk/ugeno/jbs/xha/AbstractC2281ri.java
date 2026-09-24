package com.bytedance.adsdk.ugeno.jbs.xha;

import android.content.Context;
import com.bytedance.adsdk.ugeno.jbs.p099lr.C2279ri;
import com.bytedance.adsdk.ugeno.p106lr.C2320ri;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.jbs.xha.ri */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2281ri extends C2320ri<C2279ri> {
    public AbstractC2281ri(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri, com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: lr */
    public void mo7550lr() {
        super.mo7550lr();
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ri */
    public void mo7553ri(String str, String str2) {
        super.mo7553ri(str, str2);
        str.hashCode();
        switch (str) {
            case "onVideoProgress":
            case "onVideoFinish":
            case "onVideoPlay":
            case "onVideoResume":
            case "onVideoPause":
                m7851lr(str, str2);
                break;
        }
    }
}
