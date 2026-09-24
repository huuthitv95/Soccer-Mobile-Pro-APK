package com.fyber.inneractive.sdk.serverapi.extradata;

import com.fyber.inneractive.sdk.bidder.C7858c0;
import com.fyber.inneractive.sdk.bidder.C7873k;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.serverapi.extradata.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C9116a implements InterfaceC9118c {
    @Override // com.fyber.inneractive.sdk.serverapi.extradata.InterfaceC9118c
    /* JADX INFO: renamed from: a */
    public final void mo21924a(String str, String str2, Object obj) {
        C7873k c7873k = (C7873k) obj;
        C7858c0 c7858c0NewBuilder = TokenParametersOuterClass$TokenParameters.PubExtraData.newBuilder();
        c7858c0NewBuilder.m21753c();
        ((TokenParametersOuterClass$TokenParameters.PubExtraData) c7858c0NewBuilder.f21118b).setKey(str);
        c7858c0NewBuilder.m21753c();
        ((TokenParametersOuterClass$TokenParameters.PubExtraData) c7858c0NewBuilder.f21118b).setValue(str2);
        TokenParametersOuterClass$TokenParameters.PubExtraData pubExtraData = (TokenParametersOuterClass$TokenParameters.PubExtraData) c7858c0NewBuilder.m21751a();
        c7873k.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k.f21118b).addPubExtraData(pubExtraData);
    }

    @Override // com.fyber.inneractive.sdk.serverapi.extradata.InterfaceC9118c
    /* JADX INFO: renamed from: a */
    public final boolean mo21925a(Object obj) {
        return ((TokenParametersOuterClass$TokenParameters) ((C7873k) obj).f21118b).getPubExtraDataCount() == 0;
    }
}
