package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3019lr;
import com.bytedance.sdk.openadsdk.core.C3197dw;
import com.bytedance.sdk.openadsdk.core.C3303qd;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p236ka.C3429qt;
import com.bytedance.sdk.openadsdk.p252ri.p253fi.InterfaceC3495ri;
import com.bytedance.sdk.openadsdk.p252ri.p254ik.InterfaceC3496lr;
import com.bytedance.sdk.openadsdk.utils.C3578lr;
import com.bytedance.sdk.openadsdk.utils.C3595vr;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class TTAdActivity extends TTBaseActivity {

    /* JADX INFO: renamed from: ik */
    private int f7953ik = -1;

    /* JADX INFO: renamed from: ka */
    private final AtomicBoolean f7954ka = new AtomicBoolean(false);

    /* JADX INFO: renamed from: lr */
    private boolean f7955lr;

    /* JADX INFO: renamed from: ri */
    private C2858lr f7956ri;

    /* JADX INFO: renamed from: fi */
    private void m10485fi() {
        C2858lr c2858lr = this.f7956ri;
        if (c2858lr == null) {
            super.onBackPressed();
        } else {
            c2858lr.jbs();
        }
    }

    /* JADX INFO: renamed from: ik */
    private void m10486ik() {
        if (this.f7954ka.compareAndSet(false, true)) {
            C2858lr c2858lr = this.f7956ri;
            if (c2858lr != null) {
                c2858lr.m10931fi(this);
            }
            m10487ka();
        }
    }

    /* JADX INFO: renamed from: ka */
    private void m10487ka() {
        if (!this.f7955lr) {
            C3197dw.m13337ri().m13353ri((InterfaceC3495ri) null);
            C3197dw.m13337ri().m13354ri((InterfaceC3496lr) null);
        } else if (!TextUtils.isEmpty(this.f7989qt)) {
            C3197dw.m13337ri().m13357ri(this.f7989qt, isFinishing(), isChangingConfigurations());
        }
        C3595vr.m16668ri();
        C3303qd.m14658ri().m14662ri(String.valueOf(hashCode()));
    }

    /* JADX INFO: renamed from: lr */
    public InterfaceC3496lr m10488lr(String str) {
        if (!this.f7955lr) {
            return C3197dw.m13337ri().m13340ik();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (InterfaceC3496lr) C3197dw.m13337ri().m13351ri(str, InterfaceC3496lr.class);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    /* JADX INFO: renamed from: lr */
    protected void mo10489lr() {
        m10485fi();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2858lr c2858lr = this.f7956ri;
        if (c2858lr != null) {
            c2858lr.m10952ri((Activity) this);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        m10485fi();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0081 A[Catch: all -> 0x008c, TryCatch #0 {all -> 0x008c, blocks: (B:17:0x0061, B:19:0x006f, B:21:0x0075, B:22:0x007a, B:24:0x0081, B:25:0x0088), top: B:30:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        long longExtra;
        InterfaceC3495ri interfaceC3495riM10490ri;
        InterfaceC3496lr interfaceC3496lrM10488lr;
        wjv wjvVarM11950ri;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (bundle == null) {
            if (intent != null) {
                this.f7989qt = intent.getStringExtra("single_process_listener_key");
                this.f7955lr = intent.getBooleanExtra("enable_new_arch", false);
                longExtra = intent.getLongExtra("start_show_time", SystemClock.elapsedRealtime());
                String str = this.f7989qt;
            } else {
                String str2 = this.f7989qt;
            }
            interfaceC3495riM10490ri = m10490ri(this.f7989qt);
            interfaceC3496lrM10488lr = m10488lr(this.f7989qt);
            if (interfaceC3495riM10490ri == null && interfaceC3496lrM10488lr == null) {
                String str3 = this.f7989qt;
            }
            wjvVarM11950ri = C3019lr.m11950ri(getIntent(), bundle, (InterfaceC3118lr) null);
            if (wjvVarM11950ri == null) {
                String str4 = this.f7989qt;
                finish();
                return;
            }
            try {
                wjvVarM11950ri.m14489ri(longExtra);
                this.f7956ri = new C2858lr(this, wjvVarM11950ri, this.f7955lr);
                if (bundle != null && wjvVarM11950ri.m14423jc()) {
                    this.f7956ri.m10946nr();
                }
                this.f7956ri.m10957ri(this, bundle, interfaceC3495riM10490ri, interfaceC3496lrM10488lr);
                if (bundle != null) {
                    C3429qt.m15621ri(wjvVarM11950ri, "activity_recreate", wjvVarM11950ri.m14394fi(), "activity_recreate", null);
                }
                C3578lr.m16536ri(wjvVarM11950ri);
            } catch (Throwable th) {
                C2707ac.m10206ri("BVA", "onCreate: ", th);
                C3429qt.m15620ri(wjvVarM11950ri, "show_ad_fail", wjvVarM11950ri.m14394fi(), "init_view_crash");
                finish();
                return;
            }
        }
        this.f7989qt = bundle.getString("single_process_listener_key");
        this.f7955lr = bundle.getBoolean("enable_new_arch", false);
        String str5 = this.f7989qt;
        longExtra = 0;
        interfaceC3495riM10490ri = m10490ri(this.f7989qt);
        interfaceC3496lrM10488lr = m10488lr(this.f7989qt);
        if (interfaceC3495riM10490ri == null) {
            String str6 = this.f7989qt;
        }
        wjvVarM11950ri = C3019lr.m11950ri(getIntent(), bundle, (InterfaceC3118lr) null);
        if (wjvVarM11950ri == null) {
            String str7 = this.f7989qt;
            finish();
            return;
        }
        wjvVarM11950ri.m14489ri(longExtra);
        this.f7956ri = new C2858lr(this, wjvVarM11950ri, this.f7955lr);
        if (bundle != null) {
            this.f7956ri.m10946nr();
        }
        this.f7956ri.m10957ri(this, bundle, interfaceC3495riM10490ri, interfaceC3496lrM10488lr);
        if (bundle != null) {
            C3429qt.m15621ri(wjvVarM11950ri, "activity_recreate", wjvVarM11950ri.m14394fi(), "activity_recreate", null);
        }
        C3578lr.m16536ri(wjvVarM11950ri);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        m10486ik();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        C2858lr c2858lr = this.f7956ri;
        if (c2858lr != null) {
            c2858lr.m10934ik(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        C2858lr c2858lr = this.f7956ri;
        if (c2858lr != null) {
            c2858lr.m10939lr(this);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        String str = this.f7989qt;
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.f7989qt)) {
            bundle.putString("single_process_listener_key", this.f7989qt);
        }
        bundle.putBoolean("enable_new_arch", this.f7955lr);
        C2858lr c2858lr = this.f7956ri;
        if (c2858lr != null) {
            int iM13348ri = C3197dw.m13337ri().m13348ri(c2858lr.m10949ri());
            this.f7953ik = iM13348ri;
            this.f7956ri.m10956ri(this, bundle, iM13348ri);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.f7953ik >= 0) {
            C3197dw.m13337ri().m13341ik(this.f7953ik);
            this.f7953ik = -1;
        }
        C2858lr c2858lr = this.f7956ri;
        if (c2858lr != null) {
            c2858lr.m10955ri(this);
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        C2858lr c2858lr = this.f7956ri;
        if (c2858lr != null) {
            c2858lr.m10937ka(this);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C2858lr c2858lr = this.f7956ri;
        if (c2858lr != null) {
            c2858lr.m10965ri(z);
        }
    }

    /* JADX INFO: renamed from: ri */
    public InterfaceC3495ri m10490ri(String str) {
        if (!this.f7955lr) {
            return C3197dw.m13337ri().m13345lr();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (InterfaceC3495ri) C3197dw.m13337ri().m13351ri(str, InterfaceC3495ri.class);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    /* JADX INFO: renamed from: ri */
    protected boolean mo10491ri() {
        return true;
    }
}
