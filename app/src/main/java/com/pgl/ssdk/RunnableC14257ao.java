package com.pgl.ssdk;

import android.content.Context;
import com.pgl.ssdk.ces.C14271a;

/* JADX INFO: renamed from: com.pgl.ssdk.ao */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC14257ao implements Runnable {

    /* JADX INFO: renamed from: a */
    private Context f41270a;

    /* JADX INFO: renamed from: b */
    private int f41271b;

    /* JADX INFO: renamed from: c */
    private Object[] f41272c;

    public RunnableC14257ao(Context context, int i, Object[] objArr) {
        this.f41270a = context;
        this.f41271b = i;
        this.f41272c = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f41271b == 222) {
                C14253ak.m42952a(this.f41270a).m42959a();
            }
            byte[] bArr = (byte[]) C14271a.meta(this.f41271b, this.f41270a, this.f41272c);
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            new C14258ap(this.f41270a, this.f41271b).m42981a(1, 2, bArr);
        } catch (Throwable unused) {
        }
    }
}
