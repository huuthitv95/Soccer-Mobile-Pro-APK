package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.s2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4039s2 extends C3952o3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4039s2(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m19378a(C4185yg c4185yg, View view, MotionEvent motionEvent) {
        if (c4185yg != null) {
            Intrinsics.checkNotNull(motionEvent);
            c4185yg.m20062a(motionEvent);
        }
        return motionEvent.getAction() == 2;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        super.setWebViewClient(client);
        final C4185yg c4185ygM19451a = client instanceof C4061t2 ? ((C4061t2) client).m19451a() : null;
        setOnTouchListener(new View.OnTouchListener() { // from class: com.chartboost.sdk.impl.s2$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C4039s2.m19378a(c4185ygM19451a, view, motionEvent);
            }
        });
    }
}
