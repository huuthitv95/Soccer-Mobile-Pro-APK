package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import java.net.URL;
import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.bk */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3671bk {
    /* JADX INFO: renamed from: a */
    long mo16957a();

    /* JADX INFO: renamed from: a */
    View mo16958a(Context context);

    /* JADX INFO: renamed from: a */
    Object mo16959a(Context context, URL url, InterfaceC4153x6 interfaceC4153x6, Continuation continuation);

    /* JADX INFO: renamed from: a */
    void mo16960a(InterfaceC3694ck interfaceC3694ck);

    /* JADX INFO: renamed from: a */
    void mo16961a(EnumC3737eh enumC3737eh);

    /* JADX INFO: renamed from: b */
    long mo16962b();

    float getVolume();

    void pause();

    void play();

    void release();

    void setVolume(float f);
}
