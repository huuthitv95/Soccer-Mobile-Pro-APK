package com.mbridge.msdk.thrid.okhttp.internal;

import com.mbridge.msdk.thrid.okhttp.C13708a;
import com.mbridge.msdk.thrid.okhttp.C13709a0;
import com.mbridge.msdk.thrid.okhttp.C13713c0;
import com.mbridge.msdk.thrid.okhttp.C13720i;
import com.mbridge.msdk.thrid.okhttp.C13774j;
import com.mbridge.msdk.thrid.okhttp.C13782r;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13714d;
import com.mbridge.msdk.thrid.okhttp.internal.connection.C13729c;
import com.mbridge.msdk.thrid.okhttp.internal.connection.C13730d;
import com.mbridge.msdk.thrid.okhttp.internal.connection.C13733g;
import java.io.IOException;
import java.net.Socket;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.a */
/* JADX INFO: compiled from: Internal.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13721a {

    /* JADX INFO: renamed from: a */
    public static AbstractC13721a f38769a;

    /* JADX INFO: renamed from: a */
    public abstract int mo40252a(C13709a0.a aVar);

    /* JADX INFO: renamed from: a */
    public abstract C13729c mo40253a(C13720i c13720i, C13708a c13708a, C13733g c13733g, C13713c0 c13713c0);

    /* JADX INFO: renamed from: a */
    public abstract C13730d mo40254a(C13720i c13720i);

    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract IOException mo40255a(InterfaceC13714d interfaceC13714d, @Nullable IOException iOException);

    /* JADX INFO: renamed from: a */
    public abstract Socket mo40256a(C13720i c13720i, C13708a c13708a, C13733g c13733g);

    /* JADX INFO: renamed from: a */
    public abstract void mo40257a(C13774j c13774j, SSLSocket sSLSocket, boolean z);

    /* JADX INFO: renamed from: a */
    public abstract void mo40258a(C13782r.a aVar, String str);

    /* JADX INFO: renamed from: a */
    public abstract void mo40259a(C13782r.a aVar, String str, String str2);

    /* JADX INFO: renamed from: a */
    public abstract boolean mo40260a(C13708a c13708a, C13708a c13708a2);

    /* JADX INFO: renamed from: a */
    public abstract boolean mo40261a(C13720i c13720i, C13729c c13729c);

    /* JADX INFO: renamed from: b */
    public abstract void mo40262b(C13720i c13720i, C13729c c13729c);
}
