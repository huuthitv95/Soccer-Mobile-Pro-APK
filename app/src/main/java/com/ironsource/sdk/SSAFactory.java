package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C11561M9;
import com.ironsource.InterfaceC11737Wd;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class SSAFactory {
    public static InterfaceC11737Wd getPublisherInstance(Activity activity) throws Exception {
        return C11561M9.m26506b((Context) activity);
    }

    public static InterfaceC11737Wd getPublisherTestInstance(Activity activity, int i) throws Exception {
        return C11561M9.m26501a(activity, i);
    }
}
