package com.unity3d.player;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.unity3d.player.g */
/* JADX INFO: loaded from: classes9.dex */
public final class FragmentC14686g extends Fragment {

    /* JADX INFO: renamed from: a */
    private final IPermissionRequestCallbacks f41716a;

    /* JADX INFO: renamed from: b */
    private final Activity f41717b;

    /* JADX INFO: renamed from: c */
    private final Looper f41718c;

    /* JADX INFO: renamed from: com.unity3d.player.g$a */
    /* JADX INFO: loaded from: classes7.dex */
    class a implements Runnable {

        /* JADX INFO: renamed from: b */
        private IPermissionRequestCallbacks f41722b;

        /* JADX INFO: renamed from: c */
        private String f41723c;

        /* JADX INFO: renamed from: d */
        private int f41724d;

        /* JADX INFO: renamed from: e */
        private boolean f41725e;

        a(IPermissionRequestCallbacks iPermissionRequestCallbacks, String str, int i, boolean z) {
            this.f41722b = iPermissionRequestCallbacks;
            this.f41723c = str;
            this.f41724d = i;
            this.f41725e = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.f41724d;
            if (i != -1) {
                if (i == 0) {
                    this.f41722b.onPermissionGranted(this.f41723c);
                }
            } else if (Build.VERSION.SDK_INT >= 30 || this.f41725e) {
                this.f41722b.onPermissionDenied(this.f41723c);
            } else {
                this.f41722b.onPermissionDeniedAndDontAskAgain(this.f41723c);
            }
        }
    }

    public FragmentC14686g() {
        this.f41716a = null;
        this.f41717b = null;
        this.f41718c = null;
    }

    public FragmentC14686g(Activity activity, IPermissionRequestCallbacks iPermissionRequestCallbacks) {
        this.f41716a = iPermissionRequestCallbacks;
        this.f41717b = activity;
        this.f41718c = Looper.myLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m43311a(String[] strArr) {
        for (String str : strArr) {
            this.f41716a.onPermissionDenied(str);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestPermissions(getArguments().getStringArray("PermissionNames"), 96489);
    }

    @Override // android.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 96489) {
            return;
        }
        if (strArr.length != 0) {
            for (int i2 = 0; i2 < strArr.length && i2 < iArr.length; i2++) {
                IPermissionRequestCallbacks iPermissionRequestCallbacks = this.f41716a;
                if (iPermissionRequestCallbacks != null && this.f41717b != null && this.f41718c != null) {
                    if (iPermissionRequestCallbacks instanceof UnityPermissions.ModalWaitForPermissionResponse) {
                        iPermissionRequestCallbacks.onPermissionGranted(strArr[i2]);
                    } else {
                        String str = strArr[i2];
                        if (str == null) {
                            str = "<null>";
                        }
                        String str2 = str;
                        new Handler(this.f41718c).post(new a(this.f41716a, str2, iArr[i2], this.f41717b.shouldShowRequestPermissionRationale(str2)));
                    }
                }
            }
        } else if (this.f41716a != null && this.f41717b != null && this.f41718c != null) {
            final String[] stringArray = getArguments().getStringArray("PermissionNames");
            if (this.f41716a instanceof UnityPermissions.ModalWaitForPermissionResponse) {
                m43311a(stringArray);
            } else {
                new Handler(this.f41718c).post(new Runnable() { // from class: com.unity3d.player.g.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        FragmentC14686g.this.m43311a(stringArray);
                    }
                });
            }
        }
        FragmentTransaction fragmentTransactionBeginTransaction = getActivity().getFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.remove(this);
        fragmentTransactionBeginTransaction.commit();
    }
}
