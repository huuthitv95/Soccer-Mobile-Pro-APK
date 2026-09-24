package com.mbridge.msdk.video.signal.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.video.signal.InterfaceC14180i;

/* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.g */
/* JADX INFO: compiled from: DefaultJSRewardVideoV1.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14187g implements InterfaceC14180i {
    @Override // com.mbridge.msdk.video.signal.InterfaceC14180i
    /* JADX INFO: renamed from: a */
    public void mo42349a(String str) {
        C13219q0.m37813a("js", "setOrientation,landscape=" + str);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14180i
    /* JADX INFO: renamed from: b */
    public String mo42350b() {
        C13219q0.m37813a("js", "getEndScreenInfo");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14180i
    public void handlerPlayableException(String str) {
        C13219q0.m37813a("js", "handlerPlayableException，msg=" + str);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14179h
    public void notifyCloseBtn(int i) {
        C13219q0.m37813a("js", "notifyCloseBtn,state=" + i);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14179h
    public void toggleCloseBtn(int i) {
        C13219q0.m37813a("js", "toggleCloseBtn,state=" + i);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14180i
    public void triggerCloseBtn(String str) {
        C13219q0.m37813a("js", "triggerCloseBtn,state=" + str);
    }
}
