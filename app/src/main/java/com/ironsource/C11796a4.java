package com.ironsource;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* JADX INFO: renamed from: com.ironsource.a4 */
/* JADX INFO: loaded from: classes6.dex */
public class C11796a4 {

    /* JADX INFO: renamed from: a */
    MutableContextWrapper f26741a;

    /* JADX INFO: renamed from: a */
    public synchronized void m28106a(Activity activity) {
        if (this.f26741a == null) {
            this.f26741a = new MutableContextWrapper(activity);
        }
        this.f26741a.setBaseContext(activity);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m28107b() {
        this.f26741a = null;
    }

    /* JADX INFO: renamed from: a */
    public Activity m28105a() {
        return (Activity) this.f26741a.getBaseContext();
    }
}
