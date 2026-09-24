package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC8493c {

    /* JADX INFO: renamed from: a */
    public static final ByteBuffer f18943a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: renamed from: a */
    ByteBuffer mo20976a();

    /* JADX INFO: renamed from: a */
    void mo20977a(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: a */
    boolean mo20978a(int i, int i2, int i3);

    /* JADX INFO: renamed from: b */
    void mo20979b();

    /* JADX INFO: renamed from: c */
    boolean mo20980c();

    /* JADX INFO: renamed from: d */
    boolean mo20981d();

    /* JADX INFO: renamed from: e */
    int mo20982e();

    /* JADX INFO: renamed from: f */
    void mo20983f();

    void flush();
}
