package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import com.fyber.inneractive.sdk.util.EnumC9134a1;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.cellular.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C7951a implements InterfaceC7958h {

    /* JADX INFO: renamed from: a */
    public final AbstractC7954d f17701a;

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f17703c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b */
    public EnumC9134a1 f17702b = EnumC9134a1.UNKNOWN;

    public C7951a(Context context) {
        this.f17701a = AbstractC7955e.m20390a(context);
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.InterfaceC7958h
    /* JADX INFO: renamed from: a */
    public final void mo20337a(EnumC9134a1 enumC9134a1) {
        this.f17702b = enumC9134a1;
        for (InterfaceC7958h interfaceC7958h : this.f17703c) {
            if (interfaceC7958h != null) {
                interfaceC7958h.mo20337a(this.f17702b);
            }
        }
    }
}
