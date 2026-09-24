package com.mbridge.msdk.dycreator.binding;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.mbridge.msdk.dycreator.binding.base.BaseStrategy;
import com.mbridge.msdk.dycreator.binding.strategy.C12961a;
import com.mbridge.msdk.dycreator.binding.strategy.C12962b;
import com.mbridge.msdk.dycreator.binding.strategy.C12963c;
import com.mbridge.msdk.dycreator.binding.strategy.C12964d;
import com.mbridge.msdk.dycreator.binding.strategy.C12965e;
import com.mbridge.msdk.dycreator.binding.strategy.C12966f;
import com.mbridge.msdk.dycreator.binding.strategy.C12967g;
import com.vungle.ads.internal.presenter.NativeAdPresenter;

/* JADX INFO: renamed from: com.mbridge.msdk.dycreator.binding.c */
/* JADX INFO: compiled from: ViewDataFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public final class C12960c {

    /* JADX INFO: renamed from: a */
    private static volatile C12960c f35216a;

    private C12960c() {
    }

    /* JADX INFO: renamed from: a */
    public static C12960c m36325a() {
        if (f35216a == null) {
            synchronized (C12960c.class) {
                if (f35216a == null) {
                    f35216a = new C12960c();
                }
            }
        }
        return f35216a;
    }

    /* JADX INFO: renamed from: a */
    public <T extends BaseStrategy> T m36326a(String str) {
        T c12961a = null;
        if (!TextUtils.isEmpty(str)) {
            if (str.equals("close")) {
                c12961a = new C12963c();
            } else if (str.equals(NativeAdPresenter.DOWNLOAD)) {
                c12961a = new C12962b();
            } else if (!str.equals(Constants.DEEPLINK) && str.equals("activity")) {
                c12961a = new C12961a();
            }
            if (str.equals("feedback")) {
                c12961a = new C12964d();
            }
            if (str.equals("notice")) {
                c12961a = new C12965e();
            }
            if (str.equals("permissionInfo")) {
                c12961a = new C12966f();
            }
            if (str.equals("privateAddress")) {
                return new C12967g();
            }
        }
        return c12961a;
    }
}
