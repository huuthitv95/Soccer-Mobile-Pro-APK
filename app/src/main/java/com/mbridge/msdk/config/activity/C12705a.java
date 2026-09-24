package com.mbridge.msdk.config.activity;

import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import com.mbridge.msdk.config.activity.lifecycle.InterfaceC12708a;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;

/* JADX INFO: renamed from: com.mbridge.msdk.config.activity.a */
/* JADX INFO: compiled from: ActivityPresenter.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12705a {

    /* JADX INFO: renamed from: a */
    private final String f33798a = "ActivityPresenter";

    /* JADX INFO: renamed from: b */
    private InterfaceC12708a f33799b;

    /* JADX INFO: renamed from: c */
    private ViewGroup f33800c;

    /* JADX INFO: renamed from: d */
    private int f33801d;

    public C12705a(MBRewardVideoActivity mBRewardVideoActivity, ViewGroup viewGroup) {
        this.f33800c = viewGroup;
        m34812a(mBRewardVideoActivity);
        if (mBRewardVideoActivity != null && mBRewardVideoActivity.getIntent() != null) {
            this.f33799b = (InterfaceC12708a) mBRewardVideoActivity.getIntent().getSerializableExtra("lifecycleCallbackByActivity");
            int intExtra = mBRewardVideoActivity.getIntent().getIntExtra("156", 1);
            this.f33801d = intExtra;
            mBRewardVideoActivity.setRequestedOrientation(intExtra);
        }
        m34813a("onCreate");
    }

    /* JADX INFO: renamed from: a */
    public void m34813a(String str) {
        if (this.f33799b == null) {
            return;
        }
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "onDestroy":
                this.f33799b.mo34821f();
                break;
            case "onPause":
                this.f33799b.mo34820e();
                break;
            case "onStart":
                this.f33799b.onStart();
                break;
            case "onBackPressed":
                this.f33799b.mo34819c();
                break;
            case "onStop":
                this.f33799b.mo34816a();
                break;
            case "onCreate":
                this.f33799b.mo34817a(this.f33800c);
                break;
            case "onResume":
                this.f33799b.mo34818b();
                break;
        }
        C13219q0.m37816b("ActivityPresenter", "life " + str);
    }

    /* JADX INFO: renamed from: a */
    private void m34812a(MBRewardVideoActivity mBRewardVideoActivity) {
        int iM37876a;
        int iM37876a2;
        int iM35196a;
        if (mBRewardVideoActivity == null || mBRewardVideoActivity.isFinishing() || mBRewardVideoActivity.getIntent() == null) {
            return;
        }
        Intent intent = mBRewardVideoActivity.getIntent();
        if (intent.getIntExtra("154", 0) != 1) {
            return;
        }
        try {
            int intExtra = mBRewardVideoActivity.getIntent().getIntExtra("157", 0);
            int intExtra2 = mBRewardVideoActivity.getIntent().getIntExtra("158", 0);
            int iM37930g = C13229v0.m37930g(mBRewardVideoActivity);
            int iM37927f = C13229v0.m37927f(mBRewardVideoActivity);
            if (intent.getIntExtra("155", 0) == 0 && (iM35196a = C12770c.m35196a((Context) mBRewardVideoActivity)) > 0) {
                iM37927f -= iM35196a;
            }
            if (intExtra <= 0 || intExtra2 <= 0) {
                iM37876a = iM37930g;
                iM37876a2 = iM37927f;
            } else {
                iM37876a = C13229v0.m37876a(mBRewardVideoActivity, intExtra);
                iM37876a2 = C13229v0.m37876a(mBRewardVideoActivity, intExtra2);
            }
            int iMin = Math.min(iM37876a, iM37930g);
            int iMin2 = Math.min(iM37876a2, iM37927f);
            ViewGroup.LayoutParams layoutParams = this.f33800c.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iMin, iMin2);
            } else {
                layoutParams.width = iMin;
                layoutParams.height = iMin2;
            }
            this.f33800c.setLayoutParams(layoutParams);
            this.f33800c.setX((iM37930g - iMin) / 2.0f);
            this.f33800c.setY((iM37927f - iMin2) / 2.0f);
        } catch (Exception e) {
            C13219q0.m37816b("ActivityPresenter", e.getMessage());
        }
    }
}
