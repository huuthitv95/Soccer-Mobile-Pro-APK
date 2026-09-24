package com.mbridge.msdk.tracker.network.toolbox;

import com.mbridge.msdk.tracker.network.C13837g;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.toolbox.g */
/* JADX INFO: compiled from: HttpResponse.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13857g {

    /* JADX INFO: renamed from: a */
    private final int f39554a;

    /* JADX INFO: renamed from: b */
    private final List<C13837g> f39555b;

    /* JADX INFO: renamed from: c */
    private final int f39556c;

    /* JADX INFO: renamed from: d */
    private final InputStream f39557d;

    /* JADX INFO: renamed from: e */
    private final byte[] f39558e;

    public C13857g(int i, List<C13837g> list) {
        this(i, list, -1, null);
    }

    public C13857g(int i, List<C13837g> list, int i2, InputStream inputStream) {
        this.f39554a = i;
        this.f39555b = list;
        this.f39556c = i2;
        this.f39557d = inputStream;
        this.f39558e = null;
    }

    /* JADX INFO: renamed from: a */
    public final InputStream m41272a() {
        InputStream inputStream = this.f39557d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f39558e != null) {
            return new ByteArrayInputStream(this.f39558e);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final int m41273b() {
        return this.f39556c;
    }

    /* JADX INFO: renamed from: c */
    public final List<C13837g> m41274c() {
        return Collections.unmodifiableList(this.f39555b);
    }

    /* JADX INFO: renamed from: d */
    public final int m41275d() {
        return this.f39554a;
    }
}
