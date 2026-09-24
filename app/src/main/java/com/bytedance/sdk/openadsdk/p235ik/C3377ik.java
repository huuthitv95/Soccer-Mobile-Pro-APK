package com.bytedance.sdk.openadsdk.p235ik;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.ory;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ik.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3377ik implements ory {

    /* JADX INFO: renamed from: fi */
    private ory.InterfaceC3301ri f12008fi;

    /* JADX INFO: renamed from: ik */
    private DialogC3383ka f12009ik;

    /* JADX INFO: renamed from: ka */
    private boolean f12010ka;

    /* JADX INFO: renamed from: lr */
    private final Context f12011lr;

    /* JADX INFO: renamed from: ri */
    public DialogC3374co f12012ri;

    public C3377ik(Context context, String str, List<FilterWord> list, wjv wjvVar) {
        this.f12011lr = context;
        m15287ri(str, list, wjvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ka */
    public void m15284ka() {
        Context context = this.f12011lr;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || this.f12012ri.isShowing()) {
            return;
        }
        this.f12012ri.show();
    }

    /* JADX INFO: renamed from: ri */
    private void m15287ri(String str, List<FilterWord> list, wjv wjvVar) {
        this.f12009ik = new DialogC3383ka(this.f12011lr, str, list);
        DialogC3374co dialogC3374co = new DialogC3374co(this.f12011lr, this.f12009ik.getDislikeManager());
        this.f12012ri = dialogC3374co;
        dialogC3374co.m15273ri(wjvVar);
        this.f12012ri.m15274ri(new DialogC3374co.ri() { // from class: com.bytedance.sdk.openadsdk.ik.ik.1
            @Override // com.bytedance.sdk.openadsdk.p235ik.DialogC3374co.ri
            /* JADX INFO: renamed from: ik */
            public void mo11276ik() {
                C3377ik.this.mo14648ri();
            }

            @Override // com.bytedance.sdk.openadsdk.p235ik.DialogC3374co.ri
            /* JADX INFO: renamed from: lr */
            public void mo11277lr() {
                C3377ik.this.mo14648ri();
            }

            @Override // com.bytedance.sdk.openadsdk.p235ik.DialogC3374co.ri
            /* JADX INFO: renamed from: ri */
            public void mo11278ri() {
            }

            @Override // com.bytedance.sdk.openadsdk.p235ik.DialogC3374co.ri
            /* JADX INFO: renamed from: ri */
            public void mo11279ri(int i, FilterWord filterWord, String str2) {
                C3377ik.this.f12009ik.onSuggestionSubmit(str2);
                C3377ik.this.mo14648ri();
            }
        });
        this.f12009ik.m15308ri(new DialogC3383ka.ri() { // from class: com.bytedance.sdk.openadsdk.ik.ik.2
            @Override // com.bytedance.sdk.openadsdk.p235ik.DialogC3383ka.ri
            /* JADX INFO: renamed from: lr */
            public void mo15290lr() {
                try {
                    if (C3377ik.this.f12008fi != null) {
                        C3377ik.this.f12008fi.mo10603ri();
                    }
                } catch (Throwable th) {
                    C2707ac.m10206ri("TTAdDislikeImpl", "dislike callback cancel error: ", th);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.p235ik.DialogC3383ka.ri
            /* JADX INFO: renamed from: ri */
            public void mo15291ri() {
                C3377ik.this.m15289ri(true);
                if (C3377ik.this.f12009ik != null && C3377ik.this.f12009ik.isShowing()) {
                    C3377ik.this.f12009ik.hide();
                }
                C3377ik.this.m15284ka();
            }

            @Override // com.bytedance.sdk.openadsdk.p235ik.DialogC3383ka.ri
            /* JADX INFO: renamed from: ri */
            public void mo15292ri(int i, FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && C3377ik.this.f12008fi != null) {
                        C3377ik.this.f12008fi.mo10604ri(i, filterWord.getName());
                    }
                    filterWord.getName();
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: renamed from: ik */
    public boolean m15288ik() {
        return this.f12010ka;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ory
    /* JADX INFO: renamed from: lr */
    public void mo14647lr() {
        DialogC3383ka dialogC3383ka = this.f12009ik;
        if (dialogC3383ka != null) {
            dialogC3383ka.destroy();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ory
    /* JADX INFO: renamed from: ri */
    public void mo14648ri() {
        Context context = this.f12011lr;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || this.f12009ik.isShowing()) {
            return;
        }
        this.f12009ik.show();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ory
    /* JADX INFO: renamed from: ri */
    public void mo14649ri(ory.InterfaceC3301ri interfaceC3301ri) {
        this.f12008fi = interfaceC3301ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m15289ri(boolean z) {
        this.f12010ka = z;
    }
}
