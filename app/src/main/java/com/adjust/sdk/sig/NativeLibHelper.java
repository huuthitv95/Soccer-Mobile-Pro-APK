package com.adjust.sdk.sig;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
class NativeLibHelper implements InterfaceC1347a {
    static {
        try {
            System.loadLibrary("signer");
        } catch (UnsatisfiedLinkError e) {
            Log.e("NativeLibHelper", "Signer Library could not be loaded: " + e.getMessage());
        }
    }

    private native void nOnResume();

    private native byte[] nSign(Context context, Object obj, byte[] bArr, int i);

    /* JADX INFO: renamed from: a */
    public final void m847a() {
        nOnResume();
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m848a(Context context, Object obj, byte[] bArr, int i) {
        return nSign(context, obj, bArr, i);
    }
}
