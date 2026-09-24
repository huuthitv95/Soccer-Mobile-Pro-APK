package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* JADX INFO: renamed from: com.ironsource.lifecycle.a */
/* JADX INFO: loaded from: classes6.dex */
public class FragmentC12310a extends Fragment {

    /* JADX INFO: renamed from: b */
    private static final String f30870b = "com.ironsource.lifecycle.IronsourceLifecycleFragment";

    /* JADX INFO: renamed from: a */
    private a f30871a;

    /* JADX INFO: renamed from: com.ironsource.lifecycle.a$a */
    interface a {
        /* JADX INFO: renamed from: a */
        void mo32094a(Activity activity);

        /* JADX INFO: renamed from: b */
        void mo32095b(Activity activity);

        /* JADX INFO: renamed from: c */
        void mo32096c(Activity activity);
    }

    /* JADX INFO: renamed from: a */
    static FragmentC12310a m32088a(Activity activity) {
        return (FragmentC12310a) activity.getFragmentManager().findFragmentByTag(f30870b);
    }

    /* JADX INFO: renamed from: b */
    static void m32090b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager == null || fragmentManager.findFragmentByTag(f30870b) != null) {
            return;
        }
        fragmentManager.beginTransaction().add(new FragmentC12310a(), f30870b).commit();
        fragmentManager.executePendingTransactions();
    }

    /* JADX INFO: renamed from: c */
    private void m32092c(a aVar) {
        if (aVar != null) {
            aVar.mo32095b(getActivity());
        }
    }

    /* JADX INFO: renamed from: d */
    void m32093d(a aVar) {
        this.f30871a = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m32089a(this.f30871a);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f30871a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m32091b(this.f30871a);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m32092c(this.f30871a);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
    }

    /* JADX INFO: renamed from: a */
    private void m32089a(a aVar) {
        if (aVar != null) {
            aVar.mo32096c(getActivity());
        }
    }

    /* JADX INFO: renamed from: b */
    private void m32091b(a aVar) {
        if (aVar != null) {
            aVar.mo32094a(getActivity());
        }
    }
}
