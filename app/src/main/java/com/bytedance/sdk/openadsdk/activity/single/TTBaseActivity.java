package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedCallback;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.utils.C3562ay;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public class TTBaseActivity extends Activity {
    protected boolean jbs = false;

    /* JADX INFO: renamed from: qt */
    protected String f7989qt;

    /* JADX INFO: renamed from: ri */
    private OnBackInvokedCallback f7990ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity$ri */
    private static class C2762ri implements OnBackInvokedCallback {

        /* JADX INFO: renamed from: ri */
        private final WeakReference<TTBaseActivity> f7991ri;

        C2762ri(TTBaseActivity tTBaseActivity) {
            this.f7991ri = new WeakReference<>(tTBaseActivity);
        }

        public void onBackInvoked() {
            TTBaseActivity tTBaseActivity = this.f7991ri.get();
            if (tTBaseActivity != null) {
                tTBaseActivity.mo10489lr();
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ik */
    public void m10549ik(boolean z) {
        this.jbs = z;
    }

    /* JADX INFO: renamed from: lr */
    protected void mo10489lr() {
        onBackPressed();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (mo10491ri() && C3562ay.m16368ri()) {
            this.f7990ri = new C2762ri(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f7990ri);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (!C3562ay.m16368ri() || this.f7990ri == null) {
            return;
        }
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f7990ri);
        this.f7990ri = null;
    }

    @Override // android.app.Activity
    protected void onPause() {
        if (Build.VERSION.SDK_INT < 33) {
            super.onPause();
            return;
        }
        try {
            try {
                super.onPause();
            } catch (Exception unused) {
            }
        } catch (IllegalArgumentException unused2) {
            Field declaredField = Activity.class.getDeclaredField("mCalled");
            declaredField.setAccessible(true);
            declaredField.set(this, Boolean.TRUE);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        if (Build.VERSION.SDK_INT > 28 || Build.VERSION.SDK_INT < 24) {
            super.onResume();
            return;
        }
        try {
            super.onResume();
        } catch (IllegalArgumentException e) {
            C2707ac.m10206ri("TTBaseActivity", "super.onResume() run fail", e);
            try {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            } catch (Exception e2) {
                C2707ac.m10206ri("TTBaseActivity", "onResume set mCalled fail", e2);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    protected boolean mo10491ri() {
        return false;
    }
}
