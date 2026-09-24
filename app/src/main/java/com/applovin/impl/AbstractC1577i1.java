package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.C1749m;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: renamed from: com.applovin.impl.i1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1577i1 {

    /* JADX INFO: renamed from: com.applovin.impl.i1$a */
    class a implements OnSuccessListener {
        a() {
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(AppSetIdInfo appSetIdInfo) {
            C1749m.m4898a(new C1749m.b(appSetIdInfo.getId(), appSetIdInfo.getScope()));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2856a(final Context context) {
        new Thread(new Runnable() { // from class: com.applovin.impl.i1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1577i1.m2857b(context);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2857b(Context context) {
        C1749m.m4899a(AbstractC1790v.m5321b(context));
        if (AbstractC1701q7.m4066a("com.google.android.gms.appset.AppSet")) {
            try {
                AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new a());
            } catch (Throwable unused) {
            }
        }
    }
}
