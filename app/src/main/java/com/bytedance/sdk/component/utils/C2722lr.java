package com.bytedance.sdk.component.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.bytedance.sdk.component.utils.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2722lr {

    /* JADX INFO: renamed from: ri */
    private static ri f7767ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.lr$lr */
    public interface lr {
        /* JADX INFO: renamed from: ri */
        void mo10245ri();

        /* JADX INFO: renamed from: ri */
        void mo10246ri(Throwable th);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.lr$ri */
    public interface ri {
        /* JADX INFO: renamed from: ik */
        ExecutorService mo10247ik();

        /* JADX INFO: renamed from: lr */
        boolean mo10248lr();

        /* JADX INFO: renamed from: ri */
        boolean mo10249ri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public static boolean m10238ik(Context context, Intent intent, lr lrVar) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                if (lrVar == null) {
                    return true;
                }
                lrVar.mo10245ri();
                return true;
            } catch (Throwable th) {
                if (lrVar != null) {
                    lrVar.mo10246ri(th);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ri */
    public static Activity m10240ri(View view) {
        View viewFindViewById;
        Context context;
        if (view == null) {
            return null;
        }
        Context context2 = view.getContext();
        if (context2 instanceof Activity) {
            return (Activity) context2;
        }
        View rootView = view.getRootView();
        if (rootView == null || (viewFindViewById = rootView.findViewById(R.id.content)) == null || (context = viewFindViewById.getContext()) == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public static void m10241ri(final Context context, final Intent intent, final lr lrVar) {
        ExecutorService executorServiceMo10247ik;
        ri riVar = f7767ri;
        if (riVar == null || !riVar.mo10248lr() || (executorServiceMo10247ik = f7767ri.mo10247ik()) == null) {
            m10238ik(context, intent, lrVar);
        } else {
            executorServiceMo10247ik.execute(new Runnable() { // from class: com.bytedance.sdk.component.utils.lr.1
                @Override // java.lang.Runnable
                public void run() {
                    C2722lr.m10238ik(context, intent, lrVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m10242ri(ri riVar) {
        f7767ri = riVar;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m10243ri(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m10244ri(final Context context, final Intent intent, final lr lrVar, boolean z) {
        ri riVar;
        ExecutorService executorServiceMo10247ik;
        if (!z || (riVar = f7767ri) == null || !riVar.mo10249ri() || (executorServiceMo10247ik = f7767ri.mo10247ik()) == null) {
            return m10238ik(context, intent, lrVar);
        }
        executorServiceMo10247ik.execute(new Runnable() { // from class: com.bytedance.sdk.component.utils.lr.2
            @Override // java.lang.Runnable
            public void run() {
                C2722lr.m10238ik(context, intent, lrVar);
            }
        });
        return true;
    }
}
