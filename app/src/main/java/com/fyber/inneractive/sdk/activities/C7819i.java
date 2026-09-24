package com.fyber.inneractive.sdk.activities;

import com.fyber.inneractive.sdk.click.C7928b;
import com.fyber.inneractive.sdk.click.EnumC7943q;
import com.fyber.inneractive.sdk.click.InterfaceC7941o;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.activities.i */
/* JADX INFO: loaded from: classes4.dex */
public final class C7819i implements InterfaceC7941o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f17493a;

    public C7819i(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f17493a = inneractiveInternalBrowserActivity;
    }

    @Override // com.fyber.inneractive.sdk.click.InterfaceC7941o
    /* JADX INFO: renamed from: a */
    public final void mo20328a(C7928b c7928b) {
        if (c7928b.f17607a != EnumC7943q.FAILED) {
            InneractiveInternalBrowserActivity.m20324a(this.f17493a, c7928b);
            this.f17493a.finish();
        }
    }
}
