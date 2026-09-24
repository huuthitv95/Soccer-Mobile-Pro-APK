package com.chartboost.sdk.impl;

import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.b3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3654b3 {

    /* JADX INFO: renamed from: j */
    public static final a f13512j = new a(null);

    /* JADX INFO: renamed from: a */
    public final c f13513a;

    /* JADX INFO: renamed from: b */
    public String f13514b;

    /* JADX INFO: renamed from: c */
    public final EnumC4095ue f13515c;

    /* JADX INFO: renamed from: d */
    public final File f13516d;

    /* JADX INFO: renamed from: e */
    public final AtomicReference f13517e;

    /* JADX INFO: renamed from: f */
    public long f13518f;

    /* JADX INFO: renamed from: g */
    public long f13519g;

    /* JADX INFO: renamed from: h */
    public long f13520h;

    /* JADX INFO: renamed from: i */
    public b f13521i;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.b3$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.b3$b */
    public enum b {
        UI,
        ASYNC;


        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ EnumEntries f13525e = EnumEntriesKt.enumEntries(m16896a());
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.b3$c */
    /* JADX INFO: loaded from: classes9.dex */
    public enum c {
        GET,
        POST;


        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ EnumEntries f13529e = EnumEntriesKt.enumEntries(m16897a());
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.b3$d */
    public enum d {
        CANCELED,
        QUEUED,
        PROCESSING;


        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ EnumEntries f13534f = EnumEntriesKt.enumEntries(m16898a());
    }

    public AbstractC3654b3(c method, String uri, EnumC4095ue priority, File file) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(priority, "priority");
        this.f13513a = method;
        this.f13514b = uri;
        this.f13515c = priority;
        this.f13516d = file;
        this.f13517e = new AtomicReference(d.QUEUED);
        this.f13521i = b.UI;
    }

    /* JADX INFO: renamed from: a */
    public C3677c3 mo16887a() {
        return new C3677c3(null, null, null);
    }

    /* JADX INFO: renamed from: a */
    public C3700d3 mo16888a(C3723e3 c3723e3) {
        return C3700d3.f13797c.m17258a((Object) null);
    }

    /* JADX INFO: renamed from: a */
    public void mo16889a(CBError cBError, C3723e3 c3723e3) {
    }

    /* JADX INFO: renamed from: a */
    public void mo16890a(Object obj, C3723e3 c3723e3) {
    }

    /* JADX INFO: renamed from: a */
    public void mo16891a(String uri, long j) {
        Intrinsics.checkNotNullParameter(uri, "uri");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m16892b() {
        return LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m280m(this.f13517e, d.QUEUED, d.CANCELED);
    }

    /* JADX INFO: renamed from: c */
    public final c m16893c() {
        return this.f13513a;
    }

    /* JADX INFO: renamed from: d */
    public final EnumC4095ue m16894d() {
        return this.f13515c;
    }

    /* JADX INFO: renamed from: e */
    public final String m16895e() {
        return this.f13514b;
    }
}
